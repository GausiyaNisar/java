// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

public interface MapVectorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.data.MapVectorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enabled = 1;</code>
   */
  boolean getEnabled();

  /**
   * <code>bool use_choose_fastest = 2;</code>
   */
  boolean getUseChooseFastest();

  public org.tensorflow.proto.data.MapVectorization.OptionalEnabledCase getOptionalEnabledCase();

  public org.tensorflow.proto.data.MapVectorization.OptionalUseChooseFastestCase getOptionalUseChooseFastestCase();
}
