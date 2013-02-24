/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.bridge;

public class ObfSection {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ObfSection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ObfSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoreOsmAndJNI.delete_ObfSection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_name(SWIGTYPE_p_QString value) {
    CoreOsmAndJNI.ObfSection__name_set(swigCPtr, this, SWIGTYPE_p_QString.getCPtr(value));
  }

  public SWIGTYPE_p_QString get_name() {
    return new SWIGTYPE_p_QString(CoreOsmAndJNI.ObfSection__name_get(swigCPtr, this), true);
  }

  public void set_length(SWIGTYPE_p_uint32_t value) {
    CoreOsmAndJNI.ObfSection__length_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t get_length() {
    return new SWIGTYPE_p_uint32_t(CoreOsmAndJNI.ObfSection__length_get(swigCPtr, this), true);
  }

  public void set_offset(SWIGTYPE_p_uint32_t value) {
    CoreOsmAndJNI.ObfSection__offset_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t get_offset() {
    return new SWIGTYPE_p_uint32_t(CoreOsmAndJNI.ObfSection__offset_get(swigCPtr, this), true);
  }

}
