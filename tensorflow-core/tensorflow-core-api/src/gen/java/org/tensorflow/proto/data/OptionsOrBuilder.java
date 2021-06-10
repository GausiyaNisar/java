// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

public interface OptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.data.Options)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool deterministic = 1;</code>
   */
  boolean getDeterministic();

  /**
   * <pre>
   * The distribution strategy options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.DistributeOptions distribute_options = 2;</code>
   */
  boolean hasDistributeOptions();
  /**
   * <pre>
   * The distribution strategy options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.DistributeOptions distribute_options = 2;</code>
   */
  org.tensorflow.proto.data.DistributeOptions getDistributeOptions();
  /**
   * <pre>
   * The distribution strategy options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.DistributeOptions distribute_options = 2;</code>
   */
  org.tensorflow.proto.data.DistributeOptionsOrBuilder getDistributeOptionsOrBuilder();

  /**
   * <pre>
   * The optimization options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.OptimizationOptions optimization_options = 3;</code>
   */
  boolean hasOptimizationOptions();
  /**
   * <pre>
   * The optimization options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.OptimizationOptions optimization_options = 3;</code>
   */
  org.tensorflow.proto.data.OptimizationOptions getOptimizationOptions();
  /**
   * <pre>
   * The optimization options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.OptimizationOptions optimization_options = 3;</code>
   */
  org.tensorflow.proto.data.OptimizationOptionsOrBuilder getOptimizationOptionsOrBuilder();

  /**
   * <code>bool slack = 4;</code>
   */
  boolean getSlack();

  /**
   * <pre>
   * The threading options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.ThreadingOptions threading_options = 5;</code>
   */
  boolean hasThreadingOptions();
  /**
   * <pre>
   * The threading options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.ThreadingOptions threading_options = 5;</code>
   */
  org.tensorflow.proto.data.ThreadingOptions getThreadingOptions();
  /**
   * <pre>
   * The threading options associated with the dataset.
   * </pre>
   *
   * <code>.tensorflow.data.ThreadingOptions threading_options = 5;</code>
   */
  org.tensorflow.proto.data.ThreadingOptionsOrBuilder getThreadingOptionsOrBuilder();

  /**
   * <code>.tensorflow.data.ExternalStatePolicy external_state_policy = 6;</code>
   */
  int getExternalStatePolicyValue();
  /**
   * <code>.tensorflow.data.ExternalStatePolicy external_state_policy = 6;</code>
   */
  org.tensorflow.proto.data.ExternalStatePolicy getExternalStatePolicy();

  public org.tensorflow.proto.data.Options.OptionalDeterministicCase getOptionalDeterministicCase();

  public org.tensorflow.proto.data.Options.OptionalSlackCase getOptionalSlackCase();

  public org.tensorflow.proto.data.Options.OptionalExternalStatePolicyCase getOptionalExternalStatePolicyCase();
}
