// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/variable.proto

package org.tensorflow.proto;

/**
 * <pre>
 * Indicates when a distributed variable will be synced.
 * </pre>
 *
 * Protobuf enum {@code tensorflow.VariableSynchronization}
 */
public enum VariableSynchronization
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * `AUTO`: Indicates that the synchronization will be determined by the
   * current `DistributionStrategy` (eg. With `MirroredStrategy` this would be
   * `ON_WRITE`).
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_AUTO = 0;</code>
   */
  VARIABLE_SYNCHRONIZATION_AUTO(0),
  /**
   * <pre>
   * `NONE`: Indicates that there will only be one copy of the variable, so
   * there is no need to sync.
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_NONE = 1;</code>
   */
  VARIABLE_SYNCHRONIZATION_NONE(1),
  /**
   * <pre>
   * `ON_WRITE`: Indicates that the variable will be updated across devices
   * every time it is written.
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_ON_WRITE = 2;</code>
   */
  VARIABLE_SYNCHRONIZATION_ON_WRITE(2),
  /**
   * <pre>
   * `ON_READ`: Indicates that the variable will be aggregated across devices
   * when it is read (eg. when checkpointing or when evaluating an op that uses
   * the variable).
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_ON_READ = 3;</code>
   */
  VARIABLE_SYNCHRONIZATION_ON_READ(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * `AUTO`: Indicates that the synchronization will be determined by the
   * current `DistributionStrategy` (eg. With `MirroredStrategy` this would be
   * `ON_WRITE`).
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_AUTO = 0;</code>
   */
  public static final int VARIABLE_SYNCHRONIZATION_AUTO_VALUE = 0;
  /**
   * <pre>
   * `NONE`: Indicates that there will only be one copy of the variable, so
   * there is no need to sync.
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_NONE = 1;</code>
   */
  public static final int VARIABLE_SYNCHRONIZATION_NONE_VALUE = 1;
  /**
   * <pre>
   * `ON_WRITE`: Indicates that the variable will be updated across devices
   * every time it is written.
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_ON_WRITE = 2;</code>
   */
  public static final int VARIABLE_SYNCHRONIZATION_ON_WRITE_VALUE = 2;
  /**
   * <pre>
   * `ON_READ`: Indicates that the variable will be aggregated across devices
   * when it is read (eg. when checkpointing or when evaluating an op that uses
   * the variable).
   * </pre>
   *
   * <code>VARIABLE_SYNCHRONIZATION_ON_READ = 3;</code>
   */
  public static final int VARIABLE_SYNCHRONIZATION_ON_READ_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VariableSynchronization valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariableSynchronization forNumber(int value) {
    switch (value) {
      case 0: return VARIABLE_SYNCHRONIZATION_AUTO;
      case 1: return VARIABLE_SYNCHRONIZATION_NONE;
      case 2: return VARIABLE_SYNCHRONIZATION_ON_WRITE;
      case 3: return VARIABLE_SYNCHRONIZATION_ON_READ;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariableSynchronization>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariableSynchronization> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariableSynchronization>() {
          public VariableSynchronization findValueByNumber(int number) {
            return VariableSynchronization.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.tensorflow.proto.VariableProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final VariableSynchronization[] VALUES = values();

  public static VariableSynchronization valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VariableSynchronization(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tensorflow.VariableSynchronization)
}

