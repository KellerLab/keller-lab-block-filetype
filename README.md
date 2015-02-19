# Keller Lab Block file type (.klb) source C++11 code and API  #

The KLB is a file format developed at the Keller Lab at Janelia Research Campus to efficiently store and retrieve large 5D images (>4GB) using lossless compression. The format tries to combine the JPEG2000 lossless compression levels with the block flexibility offered by HDF5 to access arbitrary regions of interest. Inspired by Paralle BZIP2, a common Linux command, we partition images into blocks and each block is compressed in parallel using the Bzip2. Both reading and writing are parallelized and scale linearly with the number of cores making it much faster than JPEG2000 and HDF5 in common multi-core machines. 

All the code has been developed using standard C++11 which makes it easy to compile across platforms. Moreover, a simple API allows to wrap the open-source C++ code with other languages such as Python, Java, Fiji or Matlab. The KLB format also allows future extensions, such as new compression formats. At the time of writing of this readme file, compressionType supports two file formats, ‘no compression’ and ‘pbzip2’. Thus, if the user wishes to use other types of compression algorithms for different data sets, it is straight-forward to include support for additional algorithms. This modification simply requires an extra line in the source code to indicate the location of the code for the new compression library.


## KLB installation and compilation ##

This software package contains all the source-code in C++11 for the KLB format implementation as well as wrappers for Matlab. The folder *bin* contains the precompiled static and shared (dll) libraries for Windows 7 64-bit as well as a simple executable test_KLBIO.exe to test read/write operations. The source code of this executable is a good example on how to use the API for KLB files. For Windows 7 64-bit we also provide precompiled mex files in the *matlabWrapper* folder.

The code has been tested in different Unix systems. However, Linux and Mac OS users need to compile both the source code and the Matlab wrappers to obtain libraries and executables. For the first part a CMake file is setup in the *src* folder. For the second, the folder *matlabWrapper* contains a *compileMex.m* script to generate the mex files. You need to compile the C++11 libraries in Relase mode before compiling the mex files.


## Java Native Interface (JNI) ##

The KLB API is exposed on the Java-side through a JNI wrapper, included in the *javaWrapper* subfolder. It can be build with Maven, includes compiled native libraries for Windows and Linux (both 64-bit) and will eventually be available as an artifact on a Maven repository. ImageJ users on supported platforms can simply install KLB support by following the update site at http://sites.imagej.net/SiMView/. Follow these [instructions](http://wiki.imagej.net/How_to_follow_a_3rd_party_update_site) on how to follow an update site. Users on other platforms have to build the native libraries first.


## KLB header format ##

The KLB header contains the following items stored in binary format:



- uint8		headerVersion: indicates header version in case it is modified in the future

- uint32	xyzct[5]: image dimensions (x, y, z, channels, time points)

- float32 pixelSize[5]: sampling of each dimension (in µm, a.u., seconds)

- uint8 dataType: look-up-table for data type (uint8, uint16, etc.)

- uint8 compressionType: look-up-table for compression type (none, pbzip2, etc.)

- char	metadata[256]: wildcard to store any extra information needed for different applications

- uint32	blockSize[5]: block size used to partition the data in each dimension

- uint64	blockOffset[Nb]: offset (in bytes) of each block in the file


Note: the offset information stored here allows us to retrieve individual blocks in order to read arbitrary regions of interest efficiently.

The KLB file format is implemented for up to five-dimensional data (three spatial dimensions, one channel dimension, one time dimension). All items listed above have a fixed length in bytes, except for the last item (blockOffset), which is data-dependent. The number of blocks, Nb, is equal to the product of ceil (xyzct[i]/blockSize[i] ) for i = 1...5. The API has a function call to retrieve this number.





