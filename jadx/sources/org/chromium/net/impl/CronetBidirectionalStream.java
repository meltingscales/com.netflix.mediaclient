package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.impl.UrlResponseInfoImpl;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes6.dex */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final VersionSafeCallbacks.BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private CronetException mException;
    private final Executor mExecutor;
    private final String mInitialMethod;
    private final int mInitialPriority;
    private final String mInitialUrl;
    private RequestFinishedInfo.Metrics mMetrics;
    private long mNativeStream;
    private final long mNetworkHandle;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final String[] mRequestHeaders;
    private boolean mRequestHeadersSent;
    private UrlResponseInfoImpl mResponseInfo;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final Object mNativeStreamLock = new Object();
    private int mReadState = 0;
    private int mWriteState = 0;
    private LinkedList<ByteBuffer> mPendingData = new LinkedList<>();
    private LinkedList<ByteBuffer> mFlushData = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        long createBidirectionalStream(CronetBidirectionalStream cronetBidirectionalStream, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2);

        void destroy(long j, CronetBidirectionalStream cronetBidirectionalStream, boolean z);

        boolean readData(long j, CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, int i, int i2);

        void sendRequestHeaders(long j, CronetBidirectionalStream cronetBidirectionalStream);

        int start(long j, CronetBidirectionalStream cronetBidirectionalStream, String str, int i, String str2, String[] strArr, boolean z);

        boolean writevData(long j, CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mReadState != 0 && this.mNativeStream == 0;
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    /* loaded from: classes6.dex */
    final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        private OnReadCompletedRunnable() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: Exception -> 0x0050, TRY_LEAVE, TryCatch #2 {Exception -> 0x0050, blocks: (B:2:0x0000, B:3:0x000b, B:16:0x0034, B:18:0x0047, B:4:0x000c, B:6:0x0014, B:8:0x0016, B:10:0x001a, B:15:0x0033, B:13:0x002c), top: B:26:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch: java.lang.Exception -> L50
                r1 = 0
                r6.mByteBuffer = r1     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L50
                java.lang.Object r1 = org.chromium.net.impl.CronetBidirectionalStream.m3325$$Nest$fgetmNativeStreamLock(r1)     // Catch: java.lang.Exception -> L50
                monitor-enter(r1)     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L4d
                boolean r2 = org.chromium.net.impl.CronetBidirectionalStream.m3334$$Nest$misDoneLocked(r2)     // Catch: java.lang.Throwable -> L4d
                if (r2 == 0) goto L16
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
                return
            L16:
                boolean r2 = r6.mEndOfStream     // Catch: java.lang.Throwable -> L4d
                if (r2 == 0) goto L2c
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L4d
                r3 = 4
                org.chromium.net.impl.CronetBidirectionalStream.m3330$$Nest$fputmReadState(r2, r3)     // Catch: java.lang.Throwable -> L4d
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L4d
                int r2 = org.chromium.net.impl.CronetBidirectionalStream.m3329$$Nest$fgetmWriteState(r2)     // Catch: java.lang.Throwable -> L4d
                r3 = 10
                if (r2 != r3) goto L32
                r2 = 1
                goto L33
            L2c:
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L4d
                r3 = 2
                org.chromium.net.impl.CronetBidirectionalStream.m3330$$Nest$fputmReadState(r2, r3)     // Catch: java.lang.Throwable -> L4d
            L32:
                r2 = 0
            L33:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = org.chromium.net.impl.CronetBidirectionalStream.m3323$$Nest$fgetmCallback(r1)     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.CronetBidirectionalStream r3 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.UrlResponseInfoImpl r4 = org.chromium.net.impl.CronetBidirectionalStream.m3328$$Nest$fgetmResponseInfo(r3)     // Catch: java.lang.Exception -> L50
                boolean r5 = r6.mEndOfStream     // Catch: java.lang.Exception -> L50
                r1.onReadCompleted(r3, r4, r0, r5)     // Catch: java.lang.Exception -> L50
                if (r2 == 0) goto L56
                org.chromium.net.impl.CronetBidirectionalStream r0 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L50
                org.chromium.net.impl.CronetBidirectionalStream.m3335$$Nest$mmaybeOnSucceededOnExecutor(r0)     // Catch: java.lang.Exception -> L50
                goto L56
            L4d:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
                throw r0     // Catch: java.lang.Exception -> L50
            L50:
                r0 = move-exception
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this
                org.chromium.net.impl.CronetBidirectionalStream.m3336$$Nest$monCallbackException(r1, r0)
            L56:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable.run():void");
        }
    }

    /* loaded from: classes6.dex */
    final class OnWriteCompletedRunnable implements Runnable {
        private ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        OnWriteCompletedRunnable(ByteBuffer byteBuffer, boolean z) {
            this.mByteBuffer = byteBuffer;
            this.mEndOfStream = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #2 {Exception -> 0x004a, blocks: (B:2:0x0000, B:3:0x000b, B:15:0x002e, B:17:0x0041, B:4:0x000c, B:6:0x0014, B:8:0x0016, B:10:0x001a, B:14:0x002d), top: B:25:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch: java.lang.Exception -> L4a
                r1 = 0
                r6.mByteBuffer = r1     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L4a
                java.lang.Object r1 = org.chromium.net.impl.CronetBidirectionalStream.m3325$$Nest$fgetmNativeStreamLock(r1)     // Catch: java.lang.Exception -> L4a
                monitor-enter(r1)     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L47
                boolean r2 = org.chromium.net.impl.CronetBidirectionalStream.m3334$$Nest$misDoneLocked(r2)     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L16
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
                return
            L16:
                boolean r2 = r6.mEndOfStream     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L2c
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L47
                r3 = 10
                org.chromium.net.impl.CronetBidirectionalStream.m3332$$Nest$fputmWriteState(r2, r3)     // Catch: java.lang.Throwable -> L47
                org.chromium.net.impl.CronetBidirectionalStream r2 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Throwable -> L47
                int r2 = org.chromium.net.impl.CronetBidirectionalStream.m3326$$Nest$fgetmReadState(r2)     // Catch: java.lang.Throwable -> L47
                r3 = 4
                if (r2 != r3) goto L2c
                r2 = 1
                goto L2d
            L2c:
                r2 = 0
            L2d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = org.chromium.net.impl.CronetBidirectionalStream.m3323$$Nest$fgetmCallback(r1)     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.CronetBidirectionalStream r3 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.UrlResponseInfoImpl r4 = org.chromium.net.impl.CronetBidirectionalStream.m3328$$Nest$fgetmResponseInfo(r3)     // Catch: java.lang.Exception -> L4a
                boolean r5 = r6.mEndOfStream     // Catch: java.lang.Exception -> L4a
                r1.onWriteCompleted(r3, r4, r0, r5)     // Catch: java.lang.Exception -> L4a
                if (r2 == 0) goto L50
                org.chromium.net.impl.CronetBidirectionalStream r0 = org.chromium.net.impl.CronetBidirectionalStream.this     // Catch: java.lang.Exception -> L4a
                org.chromium.net.impl.CronetBidirectionalStream.m3335$$Nest$mmaybeOnSucceededOnExecutor(r0)     // Catch: java.lang.Exception -> L4a
                goto L50
            L47:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
                throw r0     // Catch: java.lang.Exception -> L4a
            L4a:
                r0 = move-exception
                org.chromium.net.impl.CronetBidirectionalStream r1 = org.chromium.net.impl.CronetBidirectionalStream.this
                org.chromium.net.impl.CronetBidirectionalStream.m3336$$Nest$monCallbackException(r1, r0)
            L50:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3, long j) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        this.mInitialPriority = convertStreamPriority(i);
        this.mCallback = new VersionSafeCallbacks.BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = str2;
        this.mRequestHeaders = stringsFromHeaderList(list);
        this.mDelayRequestHeadersUntilFirstFlush = z;
        this.mRequestAnnotations = collection;
        this.mTrafficStatsTagSet = z2;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z3;
        this.mTrafficStatsUid = i3;
        this.mNetworkHandle = j;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        synchronized (this.mNativeStreamLock) {
            if (this.mReadState != 0) {
                throw new IllegalStateException("Stream is already started.");
            }
            try {
                this.mNativeStream = CronetBidirectionalStreamJni.get().createBidirectionalStream(this, this.mRequestContext.getUrlRequestContextAdapter(), !this.mDelayRequestHeadersUntilFirstFlush, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
                this.mRequestContext.onRequestStarted();
                Natives natives = CronetBidirectionalStreamJni.get();
                long j = this.mNativeStream;
                String str = this.mInitialUrl;
                int i = this.mInitialPriority;
                String str2 = this.mInitialMethod;
                int start = natives.start(j, this, str, i, str2, this.mRequestHeaders, !doesMethodAllowWriteData(str2));
                if (start == -1) {
                    String str3 = this.mInitialMethod;
                    throw new IllegalArgumentException("Invalid http method " + str3);
                } else if (start > 0) {
                    String[] strArr = this.mRequestHeaders;
                    String str4 = strArr[start - 1];
                    String str5 = strArr[start];
                    throw new IllegalArgumentException("Invalid header " + str4 + "=" + str5);
                } else {
                    this.mWriteState = 1;
                    this.mReadState = 1;
                }
            } catch (RuntimeException e) {
                destroyNativeStreamLocked(false);
                throw e;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(ByteBuffer byteBuffer) {
        synchronized (this.mNativeStreamLock) {
            Preconditions.checkHasRemaining(byteBuffer);
            Preconditions.checkDirect(byteBuffer);
            if (this.mReadState != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            if (isDoneLocked()) {
                return;
            }
            if (this.mOnReadCompletedTask == null) {
                this.mOnReadCompletedTask = new OnReadCompletedRunnable();
            }
            this.mReadState = 3;
            if (CronetBidirectionalStreamJni.get().readData(this.mNativeStream, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.mReadState = 2;
            throw new IllegalArgumentException("Unable to call native read");
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(ByteBuffer byteBuffer, boolean z) {
        synchronized (this.mNativeStreamLock) {
            Preconditions.checkDirect(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z) {
                throw new IllegalArgumentException("Empty buffer before end of stream.");
            }
            if (this.mEndOfStreamWritten) {
                throw new IllegalArgumentException("Write after writing end of stream.");
            }
            if (isDoneLocked()) {
                return;
            }
            this.mPendingData.add(byteBuffer);
            if (z) {
                this.mEndOfStreamWritten = true;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        int i;
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked() && ((i = this.mWriteState) == 8 || i == 9)) {
                if (this.mPendingData.isEmpty() && this.mFlushData.isEmpty()) {
                    if (!this.mRequestHeadersSent) {
                        this.mRequestHeadersSent = true;
                        CronetBidirectionalStreamJni.get().sendRequestHeaders(this.mNativeStream, this);
                        if (!doesMethodAllowWriteData(this.mInitialMethod)) {
                            this.mWriteState = 10;
                        }
                    }
                    return;
                }
                if (!this.mPendingData.isEmpty()) {
                    this.mFlushData.addAll(this.mPendingData);
                    this.mPendingData.clear();
                }
                if (this.mWriteState == 9) {
                    return;
                }
                sendFlushDataLocked();
            }
        }
    }

    private void sendFlushDataLocked() {
        int size = this.mFlushData.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer poll = this.mFlushData.poll();
            byteBufferArr[i] = poll;
            iArr[i] = poll.position();
            iArr2[i] = poll.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        if (CronetBidirectionalStreamJni.get().writevData(this.mNativeStream, this, byteBufferArr, iArr, iArr2, this.mEndOfStreamWritten && this.mPendingData.isEmpty())) {
            return;
        }
        this.mWriteState = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    public List<ByteBuffer> getPendingDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator<ByteBuffer> it = this.mPendingData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public List<ByteBuffer> getFlushDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator<ByteBuffer> it = this.mFlushData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked() && this.mReadState != 0) {
                this.mWriteState = 5;
                this.mReadState = 5;
                destroyNativeStreamLocked(true);
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeOnSucceededOnExecutor() {
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            if (this.mWriteState == 10 && this.mReadState == 4) {
                this.mWriteState = 7;
                this.mReadState = 7;
                destroyNativeStreamLocked(false);
                try {
                    this.mCallback.onSucceeded(this, this.mResponseInfo);
                } catch (Exception e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", (Throwable) e);
                }
            }
        }
    }

    @CalledByNative
    private void onStreamReady(final boolean z) {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    CronetBidirectionalStream.this.mRequestHeadersSent = z;
                    CronetBidirectionalStream.this.mReadState = 2;
                    if (!CronetBidirectionalStream.doesMethodAllowWriteData(CronetBidirectionalStream.this.mInitialMethod) && CronetBidirectionalStream.this.mRequestHeadersSent) {
                        CronetBidirectionalStream.this.mWriteState = 10;
                    } else {
                        CronetBidirectionalStream.this.mWriteState = 8;
                    }
                    try {
                        CronetBidirectionalStream.this.mCallback.onStreamReady(CronetBidirectionalStream.this);
                    } catch (Exception e) {
                        CronetBidirectionalStream.this.onCallbackException(e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, j);
            postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                        if (CronetBidirectionalStream.this.isDoneLocked()) {
                            return;
                        }
                        CronetBidirectionalStream.this.mReadState = 2;
                        try {
                            VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                            CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                            bidirectionalStreamCallback.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                        } catch (Exception e) {
                            CronetBidirectionalStream.this.onCallbackException(e);
                        }
                    }
                }
            });
        } catch (Exception unused) {
            failWithException(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
        } else if (i < 0 || (i4 = i2 + i) > i3) {
            failWithException(new CronetExceptionImpl("Invalid number of bytes read", null));
        } else {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i4);
            OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
            onReadCompletedRunnable.mByteBuffer = byteBuffer;
            onReadCompletedRunnable.mEndOfStream = i == 0;
            postTaskToExecutor(onReadCompletedRunnable);
        }
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 8;
            if (!this.mFlushData.isEmpty()) {
                sendFlushDataLocked();
            }
            for (int i = 0; i < byteBufferArr.length; i++) {
                ByteBuffer byteBuffer = byteBufferArr[i];
                if (byteBuffer.position() != iArr[i] || byteBuffer.limit() != iArr2[i]) {
                    failWithException(new CronetExceptionImpl("ByteBuffer modified externally during write", null));
                    return;
                }
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(byteBuffer.limit());
                if (z) {
                    z2 = true;
                    if (i == byteBufferArr.length - 1) {
                        postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z2));
                    }
                }
                z2 = false;
                postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z2));
            }
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        final UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = new UrlResponseInfoImpl.HeaderBlockImpl(headersListFromStrings(strArr));
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    try {
                        VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                        CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                        bidirectionalStreamCallback.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, headerBlockImpl);
                    } catch (Exception e) {
                        CronetBidirectionalStream.this.onCallbackException(e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j);
        }
        if (i == 10 || i == 3) {
            failWithException(new QuicExceptionImpl("Exception in BidirectionalStream: " + str, i, i2, i3));
            return;
        }
        failWithException(new BidirectionalStreamNetworkException("Exception in BidirectionalStream: " + str, i, i2));
    }

    @CalledByNative
    private void onCanceled() {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                } catch (Exception e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", (Throwable) e);
                }
            }
        });
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.mNativeStreamLock) {
            if (this.mMetrics != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            CronetMetrics cronetMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            this.mMetrics = cronetMetrics;
            int i = this.mReadState;
            this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, cronetMetrics, i == 7 ? 0 : i == 5 ? 2 : 1, this.mResponseInfo, this.mException));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doesMethodAllowWriteData(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList<Map.Entry<String, String>> headersListFromStrings(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private static String[] stringsFromHeaderList(List<Map.Entry<String, String>> list) {
        String[] strArr = new String[list.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : list) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr;
    }

    private static int convertStreamPriority(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Invalid stream priority.");
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
            synchronized (this.mNativeStreamLock) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
            }
        }
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, long j) {
        return new UrlResponseInfoImpl(Arrays.asList(this.mInitialUrl), i, "", headersListFromStrings(strArr), false, str, null, j);
    }

    private void destroyNativeStreamLocked(boolean z) {
        String str = CronetUrlRequestContext.LOG_TAG;
        String obj = toString();
        Log.i(str, "destroyNativeStreamLocked " + obj);
        if (this.mNativeStream == 0) {
            return;
        }
        CronetBidirectionalStreamJni.get().destroy(this.mNativeStream, this, z);
        this.mRequestContext.onRequestDestroyed();
        this.mNativeStream = 0L;
        Runnable runnable = this.mOnDestroyedCallbackForTesting;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failWithExceptionOnExecutor(CronetException cronetException) {
        this.mException = cronetException;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 6;
            this.mReadState = 6;
            destroyNativeStreamLocked(false);
            try {
                this.mCallback.onFailed(this, this.mResponseInfo, cronetException);
            } catch (Exception e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception notifying of failed request", (Throwable) e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) exc);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    private void failWithException(final CronetException cronetException) {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.5
            @Override // java.lang.Runnable
            public void run() {
                CronetBidirectionalStream.this.failWithExceptionOnExecutor(cronetException);
            }
        });
    }
}
