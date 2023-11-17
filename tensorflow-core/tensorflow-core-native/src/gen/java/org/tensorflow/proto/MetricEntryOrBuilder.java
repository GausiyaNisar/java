// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/tsl/protobuf/test_log.proto

package org.tensorflow.proto;

public interface MetricEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MetricEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metric name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Metric name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Metric value
   * </pre>
   *
   * <code>double value = 2;</code>
   * @return The value.
   */
  double getValue();

  /**
   * <pre>
   * The minimum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 3;</code>
   * @return Whether the minValue field is set.
   */
  boolean hasMinValue();
  /**
   * <pre>
   * The minimum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 3;</code>
   * @return The minValue.
   */
  com.google.protobuf.DoubleValue getMinValue();
  /**
   * <pre>
   * The minimum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMinValueOrBuilder();

  /**
   * <pre>
   * The maximum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 4;</code>
   * @return Whether the maxValue field is set.
   */
  boolean hasMaxValue();
  /**
   * <pre>
   * The maximum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 4;</code>
   * @return The maxValue.
   */
  com.google.protobuf.DoubleValue getMaxValue();
  /**
   * <pre>
   * The maximum acceptable value for the metric if specified
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 4;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMaxValueOrBuilder();
}
