/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.janelia.simview.klb.jni;

public class KlbImageHeader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected KlbImageHeader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KlbImageHeader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        KlbJNI.delete_KlbImageHeader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHeaderVersion(short value) {
    KlbJNI.KlbImageHeader_headerVersion_set(swigCPtr, this, value);
  }

  public short getHeaderVersion() {
    return KlbJNI.KlbImageHeader_headerVersion_get(swigCPtr, this);
  }

  public void setXyzct(long[] value) {
    KlbJNI.KlbImageHeader_xyzct_set(swigCPtr, this, value);
  }

  public long[] getXyzct() {
    return KlbJNI.KlbImageHeader_xyzct_get(swigCPtr, this);
  }

  public void setPixelSize(float[] value) {
    KlbJNI.KlbImageHeader_pixelSize_set(swigCPtr, this, value);
  }

  public float[] getPixelSize() {
    return KlbJNI.KlbImageHeader_pixelSize_get(swigCPtr, this);
  }

  public void setDataType(KlbDataType value) {
    KlbJNI.KlbImageHeader_dataType_set(swigCPtr, this, value.swigValue());
  }

  public KlbDataType getDataType() {
    return KlbDataType.swigToEnum(KlbJNI.KlbImageHeader_dataType_get(swigCPtr, this));
  }

  public void setCompressionType(KlbCompressionType value) {
    KlbJNI.KlbImageHeader_compressionType_set(swigCPtr, this, value.swigValue());
  }

  public KlbCompressionType getCompressionType() {
    return KlbCompressionType.swigToEnum(KlbJNI.KlbImageHeader_compressionType_get(swigCPtr, this));
  }

  public void setBlockSize(long[] value) {
    KlbJNI.KlbImageHeader_blockSize_set(swigCPtr, this, value);
  }

  public long[] getBlockSize() {
    return KlbJNI.KlbImageHeader_blockSize_get(swigCPtr, this);
  }

  public KlbImageHeader(KlbImageHeader p) {
    this(KlbJNI.new_KlbImageHeader__SWIG_0(KlbImageHeader.getCPtr(p), p), true);
  }

  public KlbImageHeader() {
    this(KlbJNI.new_KlbImageHeader__SWIG_1(), true);
  }

  public int readHeader(String filename) {
    return KlbJNI.KlbImageHeader_readHeader(swigCPtr, this, filename);
  }

  public long getNumBlocks() {
    return KlbJNI.KlbImageHeader_getNumBlocks(swigCPtr, this);
  }

  public int getMetadataSizeInBytes() {
    return KlbJNI.KlbImageHeader_getMetadataSizeInBytes(swigCPtr, this);
  }

  public long calculateNumBlocks() {
    return KlbJNI.KlbImageHeader_calculateNumBlocks(swigCPtr, this);
  }

  public long getBytesPerPixel() {
    return KlbJNI.KlbImageHeader_getBytesPerPixel(swigCPtr, this);
  }

  public long getBlockSizeBytes() {
    return KlbJNI.KlbImageHeader_getBlockSizeBytes(swigCPtr, this);
  }

  public java.math.BigInteger getImageSizeBytes() {
    return KlbJNI.KlbImageHeader_getImageSizeBytes(swigCPtr, this);
  }

  public java.math.BigInteger getImageSizePixels() {
    return KlbJNI.KlbImageHeader_getImageSizePixels(swigCPtr, this);
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_, float[] pixelSize_, long[] blockSize_, KlbCompressionType compressionType_, String metadata_, short headerVersion_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_0(swigCPtr, this, xyzct_, dataType_.swigValue(), pixelSize_, blockSize_, compressionType_.swigValue(), metadata_, headerVersion_);
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_, float[] pixelSize_, long[] blockSize_, KlbCompressionType compressionType_, String metadata_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_1(swigCPtr, this, xyzct_, dataType_.swigValue(), pixelSize_, blockSize_, compressionType_.swigValue(), metadata_);
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_, float[] pixelSize_, long[] blockSize_, KlbCompressionType compressionType_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_2(swigCPtr, this, xyzct_, dataType_.swigValue(), pixelSize_, blockSize_, compressionType_.swigValue());
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_, float[] pixelSize_, long[] blockSize_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_3(swigCPtr, this, xyzct_, dataType_.swigValue(), pixelSize_, blockSize_);
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_, float[] pixelSize_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_4(swigCPtr, this, xyzct_, dataType_.swigValue(), pixelSize_);
  }

  public void setHeader(long[] xyzct_, KlbDataType dataType_) {
    KlbJNI.KlbImageHeader_setHeader__SWIG_5(swigCPtr, this, xyzct_, dataType_.swigValue());
  }

}