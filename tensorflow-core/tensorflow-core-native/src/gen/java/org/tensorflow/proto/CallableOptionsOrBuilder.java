// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.proto;

public interface CallableOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CallableOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tensors to be fed in the callable. Each feed is the name of a tensor.
   * </pre>
   *
   * <code>repeated string feed = 1;</code>
   * @return A list containing the feed.
   */
  java.util.List<java.lang.String>
      getFeedList();
  /**
   * <pre>
   * Tensors to be fed in the callable. Each feed is the name of a tensor.
   * </pre>
   *
   * <code>repeated string feed = 1;</code>
   * @return The count of feed.
   */
  int getFeedCount();
  /**
   * <pre>
   * Tensors to be fed in the callable. Each feed is the name of a tensor.
   * </pre>
   *
   * <code>repeated string feed = 1;</code>
   * @param index The index of the element to return.
   * @return The feed at the given index.
   */
  java.lang.String getFeed(int index);
  /**
   * <pre>
   * Tensors to be fed in the callable. Each feed is the name of a tensor.
   * </pre>
   *
   * <code>repeated string feed = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the feed at the given index.
   */
  com.google.protobuf.ByteString
      getFeedBytes(int index);

  /**
   * <pre>
   * Fetches. A list of tensor names. The caller of the callable expects a
   * tensor to be returned for each fetch[i] (see RunStepResponse.tensor). The
   * order of specified fetches does not change the execution order.
   * </pre>
   *
   * <code>repeated string fetch = 2;</code>
   * @return A list containing the fetch.
   */
  java.util.List<java.lang.String>
      getFetchList();
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller of the callable expects a
   * tensor to be returned for each fetch[i] (see RunStepResponse.tensor). The
   * order of specified fetches does not change the execution order.
   * </pre>
   *
   * <code>repeated string fetch = 2;</code>
   * @return The count of fetch.
   */
  int getFetchCount();
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller of the callable expects a
   * tensor to be returned for each fetch[i] (see RunStepResponse.tensor). The
   * order of specified fetches does not change the execution order.
   * </pre>
   *
   * <code>repeated string fetch = 2;</code>
   * @param index The index of the element to return.
   * @return The fetch at the given index.
   */
  java.lang.String getFetch(int index);
  /**
   * <pre>
   * Fetches. A list of tensor names. The caller of the callable expects a
   * tensor to be returned for each fetch[i] (see RunStepResponse.tensor). The
   * order of specified fetches does not change the execution order.
   * </pre>
   *
   * <code>repeated string fetch = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fetch at the given index.
   */
  com.google.protobuf.ByteString
      getFetchBytes(int index);

  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run by the
   * callable but their outputs will not be returned.
   * </pre>
   *
   * <code>repeated string target = 3;</code>
   * @return A list containing the target.
   */
  java.util.List<java.lang.String>
      getTargetList();
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run by the
   * callable but their outputs will not be returned.
   * </pre>
   *
   * <code>repeated string target = 3;</code>
   * @return The count of target.
   */
  int getTargetCount();
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run by the
   * callable but their outputs will not be returned.
   * </pre>
   *
   * <code>repeated string target = 3;</code>
   * @param index The index of the element to return.
   * @return The target at the given index.
   */
  java.lang.String getTarget(int index);
  /**
   * <pre>
   * Target Nodes. A list of node names. The named nodes will be run by the
   * callable but their outputs will not be returned.
   * </pre>
   *
   * <code>repeated string target = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the target at the given index.
   */
  com.google.protobuf.ByteString
      getTargetBytes(int index);

  /**
   * <pre>
   * Options that will be applied to each run.
   * </pre>
   *
   * <code>.tensorflow.RunOptions run_options = 4;</code>
   * @return Whether the runOptions field is set.
   */
  boolean hasRunOptions();
  /**
   * <pre>
   * Options that will be applied to each run.
   * </pre>
   *
   * <code>.tensorflow.RunOptions run_options = 4;</code>
   * @return The runOptions.
   */
  org.tensorflow.proto.RunOptions getRunOptions();
  /**
   * <pre>
   * Options that will be applied to each run.
   * </pre>
   *
   * <code>.tensorflow.RunOptions run_options = 4;</code>
   */
  org.tensorflow.proto.RunOptionsOrBuilder getRunOptionsOrBuilder();

  /**
   * <pre>
   * Tensors to be connected in the callable. Each TensorConnection denotes
   * a pair of tensors in the graph, between which an edge will be created
   * in the callable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorConnection tensor_connection = 5;</code>
   */
  java.util.List<org.tensorflow.proto.TensorConnection> 
      getTensorConnectionList();
  /**
   * <pre>
   * Tensors to be connected in the callable. Each TensorConnection denotes
   * a pair of tensors in the graph, between which an edge will be created
   * in the callable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorConnection tensor_connection = 5;</code>
   */
  org.tensorflow.proto.TensorConnection getTensorConnection(int index);
  /**
   * <pre>
   * Tensors to be connected in the callable. Each TensorConnection denotes
   * a pair of tensors in the graph, between which an edge will be created
   * in the callable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorConnection tensor_connection = 5;</code>
   */
  int getTensorConnectionCount();
  /**
   * <pre>
   * Tensors to be connected in the callable. Each TensorConnection denotes
   * a pair of tensors in the graph, between which an edge will be created
   * in the callable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorConnection tensor_connection = 5;</code>
   */
  java.util.List<? extends org.tensorflow.proto.TensorConnectionOrBuilder> 
      getTensorConnectionOrBuilderList();
  /**
   * <pre>
   * Tensors to be connected in the callable. Each TensorConnection denotes
   * a pair of tensors in the graph, between which an edge will be created
   * in the callable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorConnection tensor_connection = 5;</code>
   */
  org.tensorflow.proto.TensorConnectionOrBuilder getTensorConnectionOrBuilder(
      int index);

  /**
   * <pre>
   * The Tensor objects fed in the callable and fetched from the callable
   * are expected to be backed by host (CPU) memory by default.
   * The options below allow changing that - feeding tensors backed by
   * device memory, or returning tensors that are backed by device memory.
   * The maps below map the name of a feed/fetch tensor (which appears in
   * 'feed' or 'fetch' fields above), to the fully qualified name of the device
   * owning the memory backing the contents of the tensor.
   * For example, creating a callable with the following options:
   * CallableOptions {
   *   feed: "a:0"
   *   feed: "b:0"
   *   fetch: "x:0"
   *   fetch: "y:0"
   *   feed_devices: {
   *     "a:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *   }
   *   fetch_devices: {
   *     "y:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *  }
   * }
   * means that the Callable expects:
   * - The first argument ("a:0") is a Tensor backed by GPU memory.
   * - The second argument ("b:0") is a Tensor backed by host memory.
   * and of its return values:
   * - The first output ("x:0") will be backed by host memory.
   * - The second output ("y:0") will be backed by GPU memory.
   * FEEDS:
   * It is the responsibility of the caller to ensure that the memory of the fed
   * tensors will be correctly initialized and synchronized before it is
   * accessed by operations executed during the call to Session::RunCallable().
   * This is typically ensured by using the TensorFlow memory allocators
   * (Device::GetAllocator()) to create the Tensor to be fed.
   * Alternatively, for CUDA-enabled GPU devices, this typically means that the
   * operation that produced the contents of the tensor has completed, i.e., the
   * CUDA stream has been synchronized (e.g., via cuCtxSynchronize() or
   * cuStreamSynchronize()).
   * </pre>
   *
   * <code>map&lt;string, string&gt; feed_devices = 6;</code>
   */
  int getFeedDevicesCount();
  /**
   * <pre>
   * The Tensor objects fed in the callable and fetched from the callable
   * are expected to be backed by host (CPU) memory by default.
   * The options below allow changing that - feeding tensors backed by
   * device memory, or returning tensors that are backed by device memory.
   * The maps below map the name of a feed/fetch tensor (which appears in
   * 'feed' or 'fetch' fields above), to the fully qualified name of the device
   * owning the memory backing the contents of the tensor.
   * For example, creating a callable with the following options:
   * CallableOptions {
   *   feed: "a:0"
   *   feed: "b:0"
   *   fetch: "x:0"
   *   fetch: "y:0"
   *   feed_devices: {
   *     "a:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *   }
   *   fetch_devices: {
   *     "y:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *  }
   * }
   * means that the Callable expects:
   * - The first argument ("a:0") is a Tensor backed by GPU memory.
   * - The second argument ("b:0") is a Tensor backed by host memory.
   * and of its return values:
   * - The first output ("x:0") will be backed by host memory.
   * - The second output ("y:0") will be backed by GPU memory.
   * FEEDS:
   * It is the responsibility of the caller to ensure that the memory of the fed
   * tensors will be correctly initialized and synchronized before it is
   * accessed by operations executed during the call to Session::RunCallable().
   * This is typically ensured by using the TensorFlow memory allocators
   * (Device::GetAllocator()) to create the Tensor to be fed.
   * Alternatively, for CUDA-enabled GPU devices, this typically means that the
   * operation that produced the contents of the tensor has completed, i.e., the
   * CUDA stream has been synchronized (e.g., via cuCtxSynchronize() or
   * cuStreamSynchronize()).
   * </pre>
   *
   * <code>map&lt;string, string&gt; feed_devices = 6;</code>
   */
  boolean containsFeedDevices(
      java.lang.String key);
  /**
   * Use {@link #getFeedDevicesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFeedDevices();
  /**
   * <pre>
   * The Tensor objects fed in the callable and fetched from the callable
   * are expected to be backed by host (CPU) memory by default.
   * The options below allow changing that - feeding tensors backed by
   * device memory, or returning tensors that are backed by device memory.
   * The maps below map the name of a feed/fetch tensor (which appears in
   * 'feed' or 'fetch' fields above), to the fully qualified name of the device
   * owning the memory backing the contents of the tensor.
   * For example, creating a callable with the following options:
   * CallableOptions {
   *   feed: "a:0"
   *   feed: "b:0"
   *   fetch: "x:0"
   *   fetch: "y:0"
   *   feed_devices: {
   *     "a:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *   }
   *   fetch_devices: {
   *     "y:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *  }
   * }
   * means that the Callable expects:
   * - The first argument ("a:0") is a Tensor backed by GPU memory.
   * - The second argument ("b:0") is a Tensor backed by host memory.
   * and of its return values:
   * - The first output ("x:0") will be backed by host memory.
   * - The second output ("y:0") will be backed by GPU memory.
   * FEEDS:
   * It is the responsibility of the caller to ensure that the memory of the fed
   * tensors will be correctly initialized and synchronized before it is
   * accessed by operations executed during the call to Session::RunCallable().
   * This is typically ensured by using the TensorFlow memory allocators
   * (Device::GetAllocator()) to create the Tensor to be fed.
   * Alternatively, for CUDA-enabled GPU devices, this typically means that the
   * operation that produced the contents of the tensor has completed, i.e., the
   * CUDA stream has been synchronized (e.g., via cuCtxSynchronize() or
   * cuStreamSynchronize()).
   * </pre>
   *
   * <code>map&lt;string, string&gt; feed_devices = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFeedDevicesMap();
  /**
   * <pre>
   * The Tensor objects fed in the callable and fetched from the callable
   * are expected to be backed by host (CPU) memory by default.
   * The options below allow changing that - feeding tensors backed by
   * device memory, or returning tensors that are backed by device memory.
   * The maps below map the name of a feed/fetch tensor (which appears in
   * 'feed' or 'fetch' fields above), to the fully qualified name of the device
   * owning the memory backing the contents of the tensor.
   * For example, creating a callable with the following options:
   * CallableOptions {
   *   feed: "a:0"
   *   feed: "b:0"
   *   fetch: "x:0"
   *   fetch: "y:0"
   *   feed_devices: {
   *     "a:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *   }
   *   fetch_devices: {
   *     "y:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *  }
   * }
   * means that the Callable expects:
   * - The first argument ("a:0") is a Tensor backed by GPU memory.
   * - The second argument ("b:0") is a Tensor backed by host memory.
   * and of its return values:
   * - The first output ("x:0") will be backed by host memory.
   * - The second output ("y:0") will be backed by GPU memory.
   * FEEDS:
   * It is the responsibility of the caller to ensure that the memory of the fed
   * tensors will be correctly initialized and synchronized before it is
   * accessed by operations executed during the call to Session::RunCallable().
   * This is typically ensured by using the TensorFlow memory allocators
   * (Device::GetAllocator()) to create the Tensor to be fed.
   * Alternatively, for CUDA-enabled GPU devices, this typically means that the
   * operation that produced the contents of the tensor has completed, i.e., the
   * CUDA stream has been synchronized (e.g., via cuCtxSynchronize() or
   * cuStreamSynchronize()).
   * </pre>
   *
   * <code>map&lt;string, string&gt; feed_devices = 6;</code>
   */

  /* nullable */
java.lang.String getFeedDevicesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The Tensor objects fed in the callable and fetched from the callable
   * are expected to be backed by host (CPU) memory by default.
   * The options below allow changing that - feeding tensors backed by
   * device memory, or returning tensors that are backed by device memory.
   * The maps below map the name of a feed/fetch tensor (which appears in
   * 'feed' or 'fetch' fields above), to the fully qualified name of the device
   * owning the memory backing the contents of the tensor.
   * For example, creating a callable with the following options:
   * CallableOptions {
   *   feed: "a:0"
   *   feed: "b:0"
   *   fetch: "x:0"
   *   fetch: "y:0"
   *   feed_devices: {
   *     "a:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *   }
   *   fetch_devices: {
   *     "y:0": "/job:localhost/replica:0/task:0/device:GPU:0"
   *  }
   * }
   * means that the Callable expects:
   * - The first argument ("a:0") is a Tensor backed by GPU memory.
   * - The second argument ("b:0") is a Tensor backed by host memory.
   * and of its return values:
   * - The first output ("x:0") will be backed by host memory.
   * - The second output ("y:0") will be backed by GPU memory.
   * FEEDS:
   * It is the responsibility of the caller to ensure that the memory of the fed
   * tensors will be correctly initialized and synchronized before it is
   * accessed by operations executed during the call to Session::RunCallable().
   * This is typically ensured by using the TensorFlow memory allocators
   * (Device::GetAllocator()) to create the Tensor to be fed.
   * Alternatively, for CUDA-enabled GPU devices, this typically means that the
   * operation that produced the contents of the tensor has completed, i.e., the
   * CUDA stream has been synchronized (e.g., via cuCtxSynchronize() or
   * cuStreamSynchronize()).
   * </pre>
   *
   * <code>map&lt;string, string&gt; feed_devices = 6;</code>
   */

  java.lang.String getFeedDevicesOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, string&gt; fetch_devices = 7;</code>
   */
  int getFetchDevicesCount();
  /**
   * <code>map&lt;string, string&gt; fetch_devices = 7;</code>
   */
  boolean containsFetchDevices(
      java.lang.String key);
  /**
   * Use {@link #getFetchDevicesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFetchDevices();
  /**
   * <code>map&lt;string, string&gt; fetch_devices = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFetchDevicesMap();
  /**
   * <code>map&lt;string, string&gt; fetch_devices = 7;</code>
   */

  /* nullable */
java.lang.String getFetchDevicesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; fetch_devices = 7;</code>
   */

  java.lang.String getFetchDevicesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * By default, RunCallable() will synchronize the GPU stream before returning
   * fetched tensors on a GPU device, to ensure that the values in those tensors
   * have been produced. This simplifies interacting with the tensors, but
   * potentially incurs a performance hit.
   * If this options is set to true, the caller is responsible for ensuring
   * that the values in the fetched tensors have been produced before they are
   * used. The caller can do this by invoking `Device::Sync()` on the underlying
   * device(s), or by feeding the tensors back to the same Session using
   * `feed_devices` with the same corresponding device name.
   * </pre>
   *
   * <code>bool fetch_skip_sync = 8;</code>
   * @return The fetchSkipSync.
   */
  boolean getFetchSkipSync();
}
