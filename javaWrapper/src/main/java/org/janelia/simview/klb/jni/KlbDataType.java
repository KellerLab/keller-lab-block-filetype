/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.janelia.simview.klb.jni;

public enum KlbDataType {
  UINT8_TYPE(KlbJNI.UINT8_TYPE_get()),
  UINT16_TYPE(KlbJNI.UINT16_TYPE_get()),
  UINT32_TYPE(KlbJNI.UINT32_TYPE_get()),
  UINT64_TYPE(KlbJNI.UINT64_TYPE_get()),
  INT8_TYPE(KlbJNI.INT8_TYPE_get()),
  INT16_TYPE(KlbJNI.INT16_TYPE_get()),
  INT32_TYPE(KlbJNI.INT32_TYPE_get()),
  INT64_TYPE(KlbJNI.INT64_TYPE_get()),
  FLOAT32_TYPE(KlbJNI.FLOAT32_TYPE_get()),
  FLOAT64_TYPE(KlbJNI.FLOAT64_TYPE_get());

  public final int swigValue() {
    return swigValue;
  }

  public static KlbDataType swigToEnum(int swigValue) {
    KlbDataType[] swigValues = KlbDataType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (KlbDataType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + KlbDataType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private KlbDataType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private KlbDataType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private KlbDataType(KlbDataType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
