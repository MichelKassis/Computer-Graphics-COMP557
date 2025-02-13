/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 04:57:25 CEST 2015 ----! */

package com.jogamp.opencl.llb;

import com.jogamp.opencl.llb.impl.CLEventCallback;
import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import java.nio.*;

 /**
  * Java bindings to OpenCL events.
  * @author Michael Bien, GlueGen, et al.
  */
public interface CLEventBinding {

  /** CType: int */
  public static final int CL_EVENT_COMMAND_EXECUTION_STATUS = 0x11d3;
  /** CType: int */
  public static final int CL_EVENT_REFERENCE_COUNT = 0x11d2;
  /** CType: int */
  public static final int CL_EVENT_CONTEXT = 0x11d4;
  /** CType: int */
  public static final int CL_EVENT_COMMAND_TYPE = 0x11d1;
  /** CType: int */
  public static final int CL_EVENT_COMMAND_QUEUE = 0x11d0;

  /** Interface to C language function: <br> <code>cl_int {@native clWaitForEvents}(cl_uint num_events, const cl_event *  event_list)</code><br>
      @param event_list a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clWaitForEvents(int num_events, PointerBuffer event_list);

  /** Interface to C language function: <br> <code>cl_int {@native clGetEventInfo}(cl_event event, cl_event_info param_name, size_t param_value_size, void *  param_value, size_t *  param_value_size_ret)</code><br>
      @param param_value a direct only {@link java.nio.Buffer}
      @param param_value_size_ret a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clGetEventInfo(long event, int param_name, long param_value_size, Buffer param_value, PointerBuffer param_value_size_ret);

  /** Interface to C language function: <br> <code>cl_event {@native clCreateUserEvent}(cl_context context, cl_int *  errcode_ret)</code><br>
      @param errcode_ret a direct or array-backed {@link java.nio.IntBuffer}   */
  public long clCreateUserEvent(long context, IntBuffer errcode_ret);

  /** Interface to C language function: <br> <code>cl_event {@native clCreateUserEvent}(cl_context context, cl_int *  errcode_ret)</code><br>   */
  public long clCreateUserEvent(long context, int[] errcode_ret, int errcode_ret_offset);

  /** Interface to C language function: <br> <code>cl_int {@native clRetainEvent}(cl_event event)</code><br>   */
  public int clRetainEvent(long event);

  /** Interface to C language function: <br> <code>cl_int {@native clReleaseEvent}(cl_event event)</code><br>   */
  public int clReleaseEvent(long event);

  /** Interface to C language function: <br> <code>cl_int {@native clSetUserEventStatus}(cl_event event, cl_int execution_status)</code><br>   */
  public int clSetUserEventStatus(long event, int execution_status);

  /** Interface to C language function: <br> <code>cl_int {@native clGetEventProfilingInfo}(cl_event event, cl_profiling_info param_name, size_t param_value_size, void *  param_value, size_t *  param_value_size_ret)</code><br>
      @param param_value a direct only {@link java.nio.Buffer}
      @param param_value_size_ret a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clGetEventProfilingInfo(long event, int param_name, long param_value_size, Buffer param_value, PointerBuffer param_value_size_ret);


  // --- Begin CustomJavaCode .cfg declarations

  /** Interface to C language function: <br> <code> int32_t {@native clSetEventCallback}(cl_event event, cl_int command_exec_callback_type, void (CL_CALLBACK  *pfn_event_notify) (cl_event event, cl_int event_command_exec_status, void *user_data), void *user_data); </code>    */
  public int clSetEventCallback(long event, int type, CLEventCallback cb);
  // ---- End CustomJavaCode .cfg declarations

} // end of class CLEventBinding
