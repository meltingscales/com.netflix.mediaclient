package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.acceleration.ValidatedAccelerationConfig;

/* loaded from: classes6.dex */
public interface InterpreterApi extends AutoCloseable {
    Tensor getInputTensor(int i);

    int getInputTensorCount();

    Tensor getOutputTensor(int i);

    int getOutputTensorCount();

    void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map);

    /* loaded from: classes6.dex */
    public static class Options {
        Boolean allowCancellation;
        private final List<DelegateFactory> delegateFactories;
        final List<Delegate> delegates;
        int numThreads;
        TfLiteRuntime runtime;
        Boolean useNNAPI;
        Boolean useXNNPACK;
        ValidatedAccelerationConfig validatedAccelerationConfig;

        /* loaded from: classes6.dex */
        public enum TfLiteRuntime {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public ValidatedAccelerationConfig getAccelerationConfig() {
            return this.validatedAccelerationConfig;
        }

        public int getNumThreads() {
            return this.numThreads;
        }

        public TfLiteRuntime getRuntime() {
            return this.runtime;
        }

        public Options setRuntime(TfLiteRuntime tfLiteRuntime) {
            this.runtime = tfLiteRuntime;
            return this;
        }

        public Options() {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.delegates = new ArrayList();
            this.delegateFactories = new ArrayList();
        }

        public Options(Options options) {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.numThreads = options.numThreads;
            this.useNNAPI = options.useNNAPI;
            this.allowCancellation = options.allowCancellation;
            this.delegates = new ArrayList(options.delegates);
            this.delegateFactories = new ArrayList(options.delegateFactories);
            this.runtime = options.runtime;
            this.validatedAccelerationConfig = options.validatedAccelerationConfig;
            this.useXNNPACK = options.useXNNPACK;
        }

        public boolean getUseNNAPI() {
            Boolean bool = this.useNNAPI;
            return bool != null && bool.booleanValue();
        }

        public boolean isCancellable() {
            Boolean bool = this.allowCancellation;
            return bool != null && bool.booleanValue();
        }

        public List<Delegate> getDelegates() {
            return Collections.unmodifiableList(this.delegates);
        }

        public List<DelegateFactory> getDelegateFactories() {
            return Collections.unmodifiableList(this.delegateFactories);
        }

        public boolean getUseXNNPACK() {
            Boolean bool = this.useXNNPACK;
            return bool == null || bool.booleanValue();
        }
    }

    static InterpreterApi create(ByteBuffer byteBuffer, Options options) {
        return TensorFlowLite.getFactory(options == null ? null : options.getRuntime()).create(byteBuffer, options);
    }
}
