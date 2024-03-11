package org.chromium.net.impl;

import android.annotation.SuppressLint;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes5.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    private static final String TAG = "CronetUploadDataStream";
    private ByteBuffer mByteBuffer;
    private long mByteBufferLimit;
    private final VersionSafeCallbacks.UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed;
    private final Executor mExecutor;
    private long mLength;
    private Runnable mOnDestroyedCallbackForTesting;
    private long mRemainingLength;
    private final CronetUrlRequest mRequest;
    private long mUploadDataStreamAdapter;
    private final Runnable mReadTask = new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (CronetUploadDataStream.this.mLock) {
                if (CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                    return;
                }
                CronetUploadDataStream.this.checkState(3);
                if (CronetUploadDataStream.this.mByteBuffer == null) {
                    throw new IllegalStateException("Unexpected readData call. Buffer is null");
                }
                CronetUploadDataStream.this.mInWhichUserCallback = 0;
                try {
                    CronetUploadDataStream.this.checkCallingThread();
                    VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = CronetUploadDataStream.this.mDataProvider;
                    CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
                    uploadDataProviderWrapper.read(cronetUploadDataStream, cronetUploadDataStream.mByteBuffer);
                } catch (Exception e) {
                    CronetUploadDataStream.this.onError(e);
                }
            }
        }
    };
    private final Object mLock = new Object();
    private int mInWhichUserCallback = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        long attachUploadDataToRequest(CronetUploadDataStream cronetUploadDataStream, long j, long j2);

        long createAdapterForTesting(CronetUploadDataStream cronetUploadDataStream);

        long createUploadDataStreamForTesting(CronetUploadDataStream cronetUploadDataStream, long j, long j2);

        void destroy(long j);

        void onReadSucceeded(long j, CronetUploadDataStream cronetUploadDataStream, int i, boolean z);

        void onRewindSucceeded(long j, CronetUploadDataStream cronetUploadDataStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.mExecutor = executor;
        this.mDataProvider = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
        this.mRequest = cronetUrlRequest;
    }

    @CalledByNative
    void readData(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        this.mByteBufferLimit = byteBuffer.limit();
        postTaskToExecutor(this.mReadTask);
    }

    @CalledByNative
    void rewind() {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetUploadDataStream.this.mLock) {
                    if (CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                        return;
                    }
                    CronetUploadDataStream.this.checkState(3);
                    CronetUploadDataStream.this.mInWhichUserCallback = 1;
                    try {
                        CronetUploadDataStream.this.checkCallingThread();
                        CronetUploadDataStream.this.mDataProvider.rewind(CronetUploadDataStream.this);
                    } catch (Exception e) {
                        CronetUploadDataStream.this.onError(e);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCallingThread() {
        this.mRequest.checkCallingThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkState(int i) {
        int i2 = this.mInWhichUserCallback;
        if (i2 == i) {
            return;
        }
        throw new IllegalStateException("Expected " + i + ", but was " + i2);
    }

    @CalledByNative
    void onUploadDataStreamDestroyed() {
        destroyAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(Throwable th) {
        boolean z;
        synchronized (this.mLock) {
            int i = this.mInWhichUserCallback;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            z = i == 2;
            this.mInWhichUserCallback = 3;
            this.mByteBuffer = null;
            destroyAdapterIfPostponed();
        }
        if (z) {
            try {
                this.mDataProvider.close();
            } catch (Exception e) {
                Log.e(TAG, "Failure closing data provider", (Throwable) e);
            }
        }
        this.mRequest.onUploadException(th);
    }

    @Override // org.chromium.net.UploadDataSink
    @SuppressLint({"DefaultLocale"})
    public void onReadSucceeded(boolean z) {
        synchronized (this.mLock) {
            checkState(0);
            if (this.mByteBufferLimit != this.mByteBuffer.limit()) {
                throw new IllegalStateException("ByteBuffer limit changed");
            }
            if (z && this.mLength >= 0) {
                throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int position = this.mByteBuffer.position();
            long j = this.mRemainingLength - position;
            this.mRemainingLength = j;
            if (j < 0 && this.mLength >= 0) {
                throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.mLength - this.mRemainingLength), Long.valueOf(this.mLength)));
            }
            ByteBuffer byteBuffer = (ByteBuffer) this.mByteBuffer.position(0);
            this.mByteBuffer = null;
            this.mInWhichUserCallback = 3;
            destroyAdapterIfPostponed();
            if (this.mUploadDataStreamAdapter == 0) {
                return;
            }
            CronetUploadDataStreamJni.get().onReadSucceeded(this.mUploadDataStreamAdapter, this, position, z);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(Exception exc) {
        synchronized (this.mLock) {
            checkState(0);
            onError(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        synchronized (this.mLock) {
            checkState(1);
            this.mInWhichUserCallback = 3;
            this.mRemainingLength = this.mLength;
            if (this.mUploadDataStreamAdapter == 0) {
                return;
            }
            CronetUploadDataStreamJni.get().onRewindSucceeded(this.mUploadDataStreamAdapter, this);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(Exception exc) {
        synchronized (this.mLock) {
            checkState(1);
            onError(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (Throwable th) {
            this.mRequest.onUploadException(th);
        }
    }

    private void destroyAdapter() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                this.mDestroyAdapterPostponed = true;
            } else if (this.mUploadDataStreamAdapter == 0) {
            } else {
                CronetUploadDataStreamJni.get().destroy(this.mUploadDataStreamAdapter);
                this.mUploadDataStreamAdapter = 0L;
                Runnable runnable = this.mOnDestroyedCallbackForTesting;
                if (runnable != null) {
                    runnable.run();
                }
                postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.close();
                        } catch (Exception e) {
                            Log.e(CronetUploadDataStream.TAG, "Exception thrown when closing", (Throwable) e);
                        }
                    }
                });
            }
        }
    }

    private void destroyAdapterIfPostponed() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.mDestroyAdapterPostponed) {
                destroyAdapter();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initializeWithRequest() {
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 2;
        }
        try {
            this.mRequest.checkCallingThread();
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
        } catch (Throwable th) {
            onError(th);
        }
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void attachNativeAdapterToRequest(long j) {
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = CronetUploadDataStreamJni.get().attachUploadDataToRequest(this, j, this.mLength);
        }
    }

    public long createUploadDataStreamForTesting() {
        long createUploadDataStreamForTesting;
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = CronetUploadDataStreamJni.get().createAdapterForTesting(this);
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
            createUploadDataStreamForTesting = CronetUploadDataStreamJni.get().createUploadDataStreamForTesting(this, this.mLength, this.mUploadDataStreamAdapter);
        }
        return createUploadDataStreamForTesting;
    }
}
