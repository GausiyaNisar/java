// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/log_memory.proto

package org.tensorflow.proto;

/**
 * Protobuf type {@code tensorflow.MemoryLogTensorAllocation}
 */
public final class MemoryLogTensorAllocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemoryLogTensorAllocation)
    MemoryLogTensorAllocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemoryLogTensorAllocation.newBuilder() to construct.
  private MemoryLogTensorAllocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryLogTensorAllocation() {
    kernelName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemoryLogTensorAllocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.MemoryLogTensorAllocation.class, org.tensorflow.proto.MemoryLogTensorAllocation.Builder.class);
  }

  public static final int STEP_ID_FIELD_NUMBER = 1;
  private long stepId_;
  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   * @return The stepId.
   */
  @java.lang.Override
  public long getStepId() {
    return stepId_;
  }

  public static final int KERNEL_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object kernelName_;
  /**
   * <pre>
   * Name of the kernel making the allocation as set in GraphDef,
   * e.g., "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   * @return The kernelName.
   */
  @java.lang.Override
  public java.lang.String getKernelName() {
    java.lang.Object ref = kernelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kernelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the kernel making the allocation as set in GraphDef,
   * e.g., "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   * @return The bytes for kernelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKernelNameBytes() {
    java.lang.Object ref = kernelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kernelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENSOR_FIELD_NUMBER = 3;
  private org.tensorflow.proto.TensorDescription tensor_;
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   * @return Whether the tensor field is set.
   */
  @java.lang.Override
  public boolean hasTensor() {
    return tensor_ != null;
  }
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   * @return The tensor.
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorDescription getTensor() {
    return tensor_ == null ? org.tensorflow.proto.TensorDescription.getDefaultInstance() : tensor_;
  }
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorDescriptionOrBuilder getTensorOrBuilder() {
    return getTensor();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stepId_ != 0L) {
      output.writeInt64(1, stepId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kernelName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kernelName_);
    }
    if (tensor_ != null) {
      output.writeMessage(3, getTensor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stepId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, stepId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kernelName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kernelName_);
    }
    if (tensor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTensor());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.MemoryLogTensorAllocation)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.MemoryLogTensorAllocation other = (org.tensorflow.proto.MemoryLogTensorAllocation) obj;

    if (getStepId()
        != other.getStepId()) return false;
    if (!getKernelName()
        .equals(other.getKernelName())) return false;
    if (hasTensor() != other.hasTensor()) return false;
    if (hasTensor()) {
      if (!getTensor()
          .equals(other.getTensor())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STEP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStepId());
    hash = (37 * hash) + KERNEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKernelName().hashCode();
    if (hasTensor()) {
      hash = (37 * hash) + TENSOR_FIELD_NUMBER;
      hash = (53 * hash) + getTensor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.proto.MemoryLogTensorAllocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.MemoryLogTensorAllocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemoryLogTensorAllocation)
      org.tensorflow.proto.MemoryLogTensorAllocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.MemoryLogTensorAllocation.class, org.tensorflow.proto.MemoryLogTensorAllocation.Builder.class);
    }

    // Construct using org.tensorflow.proto.MemoryLogTensorAllocation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stepId_ = 0L;

      kernelName_ = "";

      if (tensorBuilder_ == null) {
        tensor_ = null;
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.MemoryLogTensorAllocation getDefaultInstanceForType() {
      return org.tensorflow.proto.MemoryLogTensorAllocation.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.MemoryLogTensorAllocation build() {
      org.tensorflow.proto.MemoryLogTensorAllocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.MemoryLogTensorAllocation buildPartial() {
      org.tensorflow.proto.MemoryLogTensorAllocation result = new org.tensorflow.proto.MemoryLogTensorAllocation(this);
      result.stepId_ = stepId_;
      result.kernelName_ = kernelName_;
      if (tensorBuilder_ == null) {
        result.tensor_ = tensor_;
      } else {
        result.tensor_ = tensorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.MemoryLogTensorAllocation) {
        return mergeFrom((org.tensorflow.proto.MemoryLogTensorAllocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.MemoryLogTensorAllocation other) {
      if (other == org.tensorflow.proto.MemoryLogTensorAllocation.getDefaultInstance()) return this;
      if (other.getStepId() != 0L) {
        setStepId(other.getStepId());
      }
      if (!other.getKernelName().isEmpty()) {
        kernelName_ = other.kernelName_;
        onChanged();
      }
      if (other.hasTensor()) {
        mergeTensor(other.getTensor());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              stepId_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              kernelName_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTensorFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long stepId_ ;
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     * @return The stepId.
     */
    @java.lang.Override
    public long getStepId() {
      return stepId_;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     * @param value The stepId to set.
     * @return This builder for chaining.
     */
    public Builder setStepId(long value) {
      
      stepId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStepId() {
      
      stepId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object kernelName_ = "";
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     * @return The kernelName.
     */
    public java.lang.String getKernelName() {
      java.lang.Object ref = kernelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kernelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     * @return The bytes for kernelName.
     */
    public com.google.protobuf.ByteString
        getKernelNameBytes() {
      java.lang.Object ref = kernelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kernelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     * @param value The kernelName to set.
     * @return This builder for chaining.
     */
    public Builder setKernelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kernelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKernelName() {
      
      kernelName_ = getDefaultInstance().getKernelName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     * @param value The bytes for kernelName to set.
     * @return This builder for chaining.
     */
    public Builder setKernelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kernelName_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.TensorDescription tensor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorDescription, org.tensorflow.proto.TensorDescription.Builder, org.tensorflow.proto.TensorDescriptionOrBuilder> tensorBuilder_;
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     * @return Whether the tensor field is set.
     */
    public boolean hasTensor() {
      return tensorBuilder_ != null || tensor_ != null;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     * @return The tensor.
     */
    public org.tensorflow.proto.TensorDescription getTensor() {
      if (tensorBuilder_ == null) {
        return tensor_ == null ? org.tensorflow.proto.TensorDescription.getDefaultInstance() : tensor_;
      } else {
        return tensorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder setTensor(org.tensorflow.proto.TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensor_ = value;
        onChanged();
      } else {
        tensorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder setTensor(
        org.tensorflow.proto.TensorDescription.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        tensor_ = builderForValue.build();
        onChanged();
      } else {
        tensorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder mergeTensor(org.tensorflow.proto.TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (tensor_ != null) {
          tensor_ =
            org.tensorflow.proto.TensorDescription.newBuilder(tensor_).mergeFrom(value).buildPartial();
        } else {
          tensor_ = value;
        }
        onChanged();
      } else {
        tensorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder clearTensor() {
      if (tensorBuilder_ == null) {
        tensor_ = null;
        onChanged();
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public org.tensorflow.proto.TensorDescription.Builder getTensorBuilder() {
      
      onChanged();
      return getTensorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public org.tensorflow.proto.TensorDescriptionOrBuilder getTensorOrBuilder() {
      if (tensorBuilder_ != null) {
        return tensorBuilder_.getMessageOrBuilder();
      } else {
        return tensor_ == null ?
            org.tensorflow.proto.TensorDescription.getDefaultInstance() : tensor_;
      }
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorDescription, org.tensorflow.proto.TensorDescription.Builder, org.tensorflow.proto.TensorDescriptionOrBuilder> 
        getTensorFieldBuilder() {
      if (tensorBuilder_ == null) {
        tensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.TensorDescription, org.tensorflow.proto.TensorDescription.Builder, org.tensorflow.proto.TensorDescriptionOrBuilder>(
                getTensor(),
                getParentForChildren(),
                isClean());
        tensor_ = null;
      }
      return tensorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.MemoryLogTensorAllocation)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemoryLogTensorAllocation)
  private static final org.tensorflow.proto.MemoryLogTensorAllocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.MemoryLogTensorAllocation();
  }

  public static org.tensorflow.proto.MemoryLogTensorAllocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryLogTensorAllocation>
      PARSER = new com.google.protobuf.AbstractParser<MemoryLogTensorAllocation>() {
    @java.lang.Override
    public MemoryLogTensorAllocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MemoryLogTensorAllocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemoryLogTensorAllocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.MemoryLogTensorAllocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

