// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.proto;

public interface DebugEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DebugEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp in seconds (with microsecond precision).
   * </pre>
   *
   * <code>double wall_time = 1;</code>
   * @return The wallTime.
   */
  double getWallTime();

  /**
   * <pre>
   * Step of training (if available).
   * </pre>
   *
   * <code>int64 step = 2;</code>
   * @return The step.
   */
  long getStep();

  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   * @return Whether the debugMetadata field is set.
   */
  boolean hasDebugMetadata();
  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   * @return The debugMetadata.
   */
  org.tensorflow.proto.DebugMetadata getDebugMetadata();
  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   */
  org.tensorflow.proto.DebugMetadataOrBuilder getDebugMetadataOrBuilder();

  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   * @return Whether the sourceFile field is set.
   */
  boolean hasSourceFile();
  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   * @return The sourceFile.
   */
  org.tensorflow.proto.SourceFile getSourceFile();
  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   */
  org.tensorflow.proto.SourceFileOrBuilder getSourceFileOrBuilder();

  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   * @return Whether the stackFrameWithId field is set.
   */
  boolean hasStackFrameWithId();
  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   * @return The stackFrameWithId.
   */
  org.tensorflow.proto.StackFrameWithId getStackFrameWithId();
  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   */
  org.tensorflow.proto.StackFrameWithIdOrBuilder getStackFrameWithIdOrBuilder();

  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   * @return Whether the graphOpCreation field is set.
   */
  boolean hasGraphOpCreation();
  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   * @return The graphOpCreation.
   */
  org.tensorflow.proto.GraphOpCreation getGraphOpCreation();
  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   */
  org.tensorflow.proto.GraphOpCreationOrBuilder getGraphOpCreationOrBuilder();

  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   * @return Whether the debuggedGraph field is set.
   */
  boolean hasDebuggedGraph();
  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   * @return The debuggedGraph.
   */
  org.tensorflow.proto.DebuggedGraph getDebuggedGraph();
  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   */
  org.tensorflow.proto.DebuggedGraphOrBuilder getDebuggedGraphOrBuilder();

  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   * @return The execution.
   */
  org.tensorflow.proto.Execution getExecution();
  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   */
  org.tensorflow.proto.ExecutionOrBuilder getExecutionOrBuilder();

  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   * @return Whether the graphExecutionTrace field is set.
   */
  boolean hasGraphExecutionTrace();
  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   * @return The graphExecutionTrace.
   */
  org.tensorflow.proto.GraphExecutionTrace getGraphExecutionTrace();
  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   */
  org.tensorflow.proto.GraphExecutionTraceOrBuilder getGraphExecutionTraceOrBuilder();

  /**
   * <pre>
   * The ID of the graph (i.e., FuncGraph) executed here: applicable only
   * to the execution of a FuncGraph.
   * </pre>
   *
   * <code>string graph_id = 11;</code>
   * @return Whether the graphId field is set.
   */
  boolean hasGraphId();
  /**
   * <pre>
   * The ID of the graph (i.e., FuncGraph) executed here: applicable only
   * to the execution of a FuncGraph.
   * </pre>
   *
   * <code>string graph_id = 11;</code>
   * @return The graphId.
   */
  java.lang.String getGraphId();
  /**
   * <pre>
   * The ID of the graph (i.e., FuncGraph) executed here: applicable only
   * to the execution of a FuncGraph.
   * </pre>
   *
   * <code>string graph_id = 11;</code>
   * @return The bytes for graphId.
   */
  com.google.protobuf.ByteString
      getGraphIdBytes();

  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   * @return Whether the debuggedDevice field is set.
   */
  boolean hasDebuggedDevice();
  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   * @return The debuggedDevice.
   */
  org.tensorflow.proto.DebuggedDevice getDebuggedDevice();
  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   */
  org.tensorflow.proto.DebuggedDeviceOrBuilder getDebuggedDeviceOrBuilder();

  public org.tensorflow.proto.DebugEvent.WhatCase getWhatCase();
}
