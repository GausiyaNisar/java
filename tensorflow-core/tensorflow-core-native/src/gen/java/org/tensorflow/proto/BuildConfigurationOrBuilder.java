// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/tsl/protobuf/test_log.proto

package org.tensorflow.proto;

public interface BuildConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.BuildConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * opt, dbg, etc
   * </pre>
   *
   * <code>string mode = 1;</code>
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   * <pre>
   * opt, dbg, etc
   * </pre>
   *
   * <code>string mode = 1;</code>
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString
      getModeBytes();

  /**
   * <pre>
   * CC compiler flags, if known
   * </pre>
   *
   * <code>repeated string cc_flags = 2;</code>
   * @return A list containing the ccFlags.
   */
  java.util.List<java.lang.String>
      getCcFlagsList();
  /**
   * <pre>
   * CC compiler flags, if known
   * </pre>
   *
   * <code>repeated string cc_flags = 2;</code>
   * @return The count of ccFlags.
   */
  int getCcFlagsCount();
  /**
   * <pre>
   * CC compiler flags, if known
   * </pre>
   *
   * <code>repeated string cc_flags = 2;</code>
   * @param index The index of the element to return.
   * @return The ccFlags at the given index.
   */
  java.lang.String getCcFlags(int index);
  /**
   * <pre>
   * CC compiler flags, if known
   * </pre>
   *
   * <code>repeated string cc_flags = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ccFlags at the given index.
   */
  com.google.protobuf.ByteString
      getCcFlagsBytes(int index);

  /**
   * <pre>
   * Bazel compilation options, if known
   * </pre>
   *
   * <code>repeated string opts = 3;</code>
   * @return A list containing the opts.
   */
  java.util.List<java.lang.String>
      getOptsList();
  /**
   * <pre>
   * Bazel compilation options, if known
   * </pre>
   *
   * <code>repeated string opts = 3;</code>
   * @return The count of opts.
   */
  int getOptsCount();
  /**
   * <pre>
   * Bazel compilation options, if known
   * </pre>
   *
   * <code>repeated string opts = 3;</code>
   * @param index The index of the element to return.
   * @return The opts at the given index.
   */
  java.lang.String getOpts(int index);
  /**
   * <pre>
   * Bazel compilation options, if known
   * </pre>
   *
   * <code>repeated string opts = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the opts at the given index.
   */
  com.google.protobuf.ByteString
      getOptsBytes(int index);
}
