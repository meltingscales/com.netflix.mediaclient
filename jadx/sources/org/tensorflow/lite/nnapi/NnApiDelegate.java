package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.InterpreterFactoryApi;
import org.tensorflow.lite.TensorFlowLite;

/* loaded from: classes6.dex */
public class NnApiDelegate implements Delegate, AutoCloseable {
    private PrivateInterface impl;
    private boolean initialized;
    private Options options;

    /* loaded from: classes6.dex */
    public interface PrivateInterface extends Delegate, AutoCloseable {
        @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    /* loaded from: classes6.dex */
    public static final class Options {
        private int executionPreference = -1;
        private String acceleratorName = null;
        private String cacheDir = null;
        private String modelToken = null;
        private Integer maxDelegatedPartitions = null;
        private Boolean useNnapiCpu = null;
        private Boolean allowFp16 = null;
        private long nnApiSupportLibraryHandle = 0;

        public String getAcceleratorName() {
            return this.acceleratorName;
        }

        public String getCacheDir() {
            return this.cacheDir;
        }

        public int getExecutionPreference() {
            return this.executionPreference;
        }

        public String getModelToken() {
            return this.modelToken;
        }

        public long getNnApiSupportLibraryHandle() {
            return this.nnApiSupportLibraryHandle;
        }

        public Boolean getUseNnapiCpu() {
            return this.useNnapiCpu;
        }

        public int getMaxNumberOfDelegatedPartitions() {
            Integer num = this.maxDelegatedPartitions;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public boolean getAllowFp16() {
            Boolean bool = this.allowFp16;
            return bool != null && bool.booleanValue();
        }
    }

    public NnApiDelegate(Options options) {
        TensorFlowLite.init();
        this.options = options;
    }

    public NnApiDelegate() {
        this(new Options());
    }

    public void initWithInterpreterFactoryApi(InterpreterFactoryApi interpreterFactoryApi) {
        this.impl = interpreterFactoryApi.createNnApiDelegateImpl(this.options);
        this.initialized = true;
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        checkNotClosed();
        return this.impl.getNativeHandle();
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PrivateInterface privateInterface = this.impl;
        if (privateInterface != null) {
            privateInterface.close();
            this.impl = null;
        }
    }

    private void checkNotClosed() {
        if (this.impl == null) {
            throw new IllegalStateException(this.initialized ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }
}
