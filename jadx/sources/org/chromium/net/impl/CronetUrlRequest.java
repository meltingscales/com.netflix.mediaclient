package org.chromium.net.impl;

import android.os.Build;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes5.dex */
public final class CronetUrlRequest extends UrlRequestBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    private final VersionSafeCallbacks.UrlRequestCallback mCallback;
    private final int mCronetEngineId;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private int mFinishedReason;
    private final int mIdempotency;
    private String mInitialMethod;
    private final String mInitialUrl;
    private final CronetLogger mLogger;
    private CronetMetrics mMetrics;
    private final long mNetworkHandle;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedListener;
    private final HeadersList mRequestHeaders;
    private UrlResponseInfoImpl mResponseInfo;
    private boolean mStarted;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private CronetUploadDataStream mUploadDataStream;
    private final List<String> mUrlChain;
    private long mUrlRequestAdapter;
    private final Object mUrlRequestAdapterLock = new Object();
    private boolean mWaitingOnRead;
    private boolean mWaitingOnRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        boolean addRequestHeader(long j, CronetUrlRequest cronetUrlRequest, String str, String str2);

        long createRequestAdapter(CronetUrlRequest cronetUrlRequest, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, long j2);

        void destroy(long j, CronetUrlRequest cronetUrlRequest, boolean z);

        void followDeferredRedirect(long j, CronetUrlRequest cronetUrlRequest);

        void getStatus(long j, CronetUrlRequest cronetUrlRequest, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

        boolean readData(long j, CronetUrlRequest cronetUrlRequest, ByteBuffer byteBuffer, int i, int i2);

        boolean setHttpMethod(long j, CronetUrlRequest cronetUrlRequest, String str);

        void start(long j, CronetUrlRequest cronetUrlRequest);
    }

    private static int convertIdempotency(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    private static int convertRequestPriority(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return i != 4 ? 4 : 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mStarted && this.mUrlRequestAdapter == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
        HeadersList() {
        }
    }

    /* loaded from: classes6.dex */
    final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;

        private OnReadCompletedRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.checkCallingThread();
            ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.mWaitingOnRead = true;
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onReadCompleted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, byteBuffer);
                }
            } catch (Exception e) {
                CronetUrlRequest.this.onCallbackException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, UrlRequest.Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j) {
        ArrayList arrayList = new ArrayList();
        this.mUrlChain = arrayList;
        this.mRequestHeaders = new HeadersList();
        if (str == null) {
            throw new NullPointerException("URL is required");
        }
        if (callback == null) {
            throw new NullPointerException("Listener is required");
        }
        if (executor == null) {
            throw new NullPointerException("Executor is required");
        }
        this.mAllowDirectExecutor = z3;
        this.mRequestContext = cronetUrlRequestContext;
        this.mCronetEngineId = cronetUrlRequestContext.getCronetEngineId();
        this.mLogger = cronetUrlRequestContext.getCronetLogger();
        this.mInitialUrl = str;
        arrayList.add(str);
        this.mPriority = convertRequestPriority(i);
        this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
        this.mExecutor = executor;
        this.mRequestAnnotations = collection;
        this.mDisableCache = z;
        this.mDisableConnectionMigration = z2;
        this.mTrafficStatsTagSet = z4;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z5;
        this.mTrafficStatsUid = i3;
        this.mRequestFinishedListener = listener != null ? new VersionSafeCallbacks.RequestFinishedInfoListener(listener) : null;
        this.mIdempotency = convertIdempotency(i4);
        this.mNetworkHandle = j;
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void setHttpMethod(String str) {
        checkNotStarted();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.mInitialMethod = str;
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void addHeader(String str, String str2) {
        checkNotStarted();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        }
        this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (this.mInitialMethod == null) {
            this.mInitialMethod = "POST";
        }
        this.mUploadDataStream = new CronetUploadDataStream(uploadDataProvider, executor, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
        r0 = r7.mUploadDataStream;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
        if (r13 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
        r7.mStarted = true;
        r0.postTaskToExecutor(new org.chromium.net.impl.CronetUrlRequest.AnonymousClass1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
        monitor-exit(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
        throw new java.lang.IllegalArgumentException("Requests with upload data must have a Content-Type.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0100, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0103, code lost:
        r7.mStarted = true;
        startInternalLocked();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
        monitor-exit(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // org.chromium.net.UrlRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.start():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternalLocked() {
        CronetUrlRequestJni.get().start(this.mUrlRequestAdapter, this);
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!this.mWaitingOnRedirect) {
                throw new IllegalStateException("No redirect to follow.");
            }
            this.mWaitingOnRedirect = false;
            if (isDoneLocked()) {
                return;
            }
            CronetUrlRequestJni.get().followDeferredRedirect(this.mUrlRequestAdapter, this);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void read(ByteBuffer byteBuffer) {
        Preconditions.checkHasRemaining(byteBuffer);
        Preconditions.checkDirect(byteBuffer);
        synchronized (this.mUrlRequestAdapterLock) {
            if (!this.mWaitingOnRead) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            this.mWaitingOnRead = false;
            if (isDoneLocked()) {
                return;
            }
            if (CronetUrlRequestJni.get().readData(this.mUrlRequestAdapter, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.mWaitingOnRead = true;
            throw new IllegalArgumentException("Unable to call native read");
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked() && this.mStarted) {
                destroyRequestAdapterLocked(2);
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener statusListener) {
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(statusListener);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                CronetUrlRequestJni.get().getStatus(this.mUrlRequestAdapter, this, urlRequestStatusListener);
            } else {
                postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.2
                    @Override // java.lang.Runnable
                    public void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = runnable;
        }
    }

    public void setOnDestroyedUploadCallbackForTesting(Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    public long getUrlRequestAdapterForTesting() {
        long j;
        synchronized (this.mUrlRequestAdapterLock) {
            j = this.mUrlRequestAdapter;
        }
        return j;
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
            failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    static long estimateHeadersSizeInBytes(Map<String, List<String>> map) {
        long j = 0;
        if (map == null) {
            return 0L;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                j += key.length();
            }
            if (entry.getValue() != null) {
                for (String str : entry.getValue()) {
                    j += str.length();
                }
            }
        }
        return j;
    }

    static long estimateHeadersSizeInBytes(HeadersList headersList) {
        long j = 0;
        if (headersList == null) {
            return 0L;
        }
        Iterator<Map.Entry<String, String>> it = headersList.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (key != null) {
                j += key.length();
            }
            if (next.getValue() != null) {
                j += next.getValue().length();
            }
        }
        return j;
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), i, str, headersList, z, str2, str3, j);
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mStarted || isDoneLocked()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRequestAdapterLocked(int i) {
        this.mFinishedReason = i;
        if (this.mUrlRequestAdapter == 0) {
            return;
        }
        this.mRequestContext.onRequestDestroyed();
        CronetUrlRequestJni.get().destroy(this.mUrlRequestAdapter, this, i == 2);
        this.mUrlRequestAdapter = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) exc);
        failWithException(callbackExceptionImpl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onUploadException(Throwable th) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UploadDataProvider", th);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th);
        failWithException(callbackExceptionImpl);
    }

    private void failWithException(CronetException cronetException) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mException = cronetException;
            destroyRequestAdapterLocked(1);
        }
    }

    @CalledByNative
    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i, str2, strArr, z, str3, str4, j);
        this.mUrlChain.add(str);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.3
            @Override // java.lang.Runnable
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.mWaitingOnRedirect = true;
                    try {
                        CronetUrlRequest.this.mCallback.onRedirectReceived(CronetUrlRequest.this, prepareResponseInfoOnNetworkThread, str);
                    } catch (Exception e) {
                        CronetUrlRequest.this.onCallbackException(e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, z, str2, str3, j);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.4
            @Override // java.lang.Runnable
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.mWaitingOnRead = true;
                    try {
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onResponseStarted(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    } catch (Exception e) {
                        CronetUrlRequest.this.onCallbackException(e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.mOnReadCompletedTask == null) {
            this.mOnReadCompletedTask = new OnReadCompletedRunnable();
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i2 + i);
        OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
        onReadCompletedRunnable.mByteBuffer = byteBuffer;
        postTaskToExecutor(onReadCompletedRunnable);
    }

    @CalledByNative
    private void onSucceeded(long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    CronetUrlRequest.this.destroyRequestAdapterLocked(0);
                    try {
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onSucceeded(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                        CronetUrlRequest.this.maybeReportMetrics();
                    } catch (Exception e) {
                        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", (Throwable) e);
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
            failWithException(new QuicExceptionImpl("Exception in CronetUrlRequest: " + str, i, i2, i3));
            return;
        }
        int mapUrlRequestErrorToApiErrorCode = mapUrlRequestErrorToApiErrorCode(i);
        failWithException(new NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, mapUrlRequestErrorToApiErrorCode, i2));
    }

    @CalledByNative
    private void onCanceled() {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onCanceled(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    CronetUrlRequest.this.maybeReportMetrics();
                } catch (Exception e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", (Throwable) e);
                }
            }
        });
    }

    @CalledByNative
    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i) {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.7
            @Override // java.lang.Runnable
            public void run() {
                urlRequestStatusListener.onStatus(UrlRequestBase.convertLoadState(i));
            }
        });
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mMetrics != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.mMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            this.mQuicConnectionMigrationAttempted = z2;
            this.mQuicConnectionMigrationSuccessful = z3;
        }
    }

    @CalledByNative
    private void onNativeAdapterDestroyed() {
        synchronized (this.mUrlRequestAdapterLock) {
            Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            if (this.mException == null) {
                return;
            }
            try {
                this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            urlRequestCallback.onFailed(cronetUrlRequest, cronetUrlRequest.mResponseInfo, CronetUrlRequest.this.mException);
                            CronetUrlRequest.this.maybeReportMetrics();
                        } catch (Exception e) {
                            Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in onFailed method", (Throwable) e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(Thread.currentThread())) {
            throw new InlineExecutionProhibitedException();
        }
    }

    private int mapUrlRequestErrorToApiErrorCode(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                String str = CronetUrlRequestContext.LOG_TAG;
                Log.e(str, "Unknown error code: " + i);
                return i;
        }
    }

    private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo() {
        Map<String, List<String>> emptyMap;
        String str;
        boolean z;
        int i;
        long estimateHeadersSizeInBytes;
        long max;
        long estimateHeadersSizeInBytes2;
        long max2;
        Duration b;
        Duration b2;
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            emptyMap = urlResponseInfoImpl.getAllHeaders();
            String negotiatedProtocol = this.mResponseInfo.getNegotiatedProtocol();
            int httpStatusCode = this.mResponseInfo.getHttpStatusCode();
            z = this.mResponseInfo.wasCached();
            str = negotiatedProtocol;
            i = httpStatusCode;
        } else {
            emptyMap = Collections.emptyMap();
            str = "";
            z = false;
            i = 0;
        }
        long longValue = this.mMetrics.getSentByteCount().longValue();
        if (z && longValue == 0) {
            estimateHeadersSizeInBytes = 0;
            max = 0;
        } else {
            estimateHeadersSizeInBytes = estimateHeadersSizeInBytes(this.mRequestHeaders);
            max = Math.max(0L, longValue - estimateHeadersSizeInBytes);
        }
        long longValue2 = this.mMetrics.getReceivedByteCount().longValue();
        if (z && longValue2 == 0) {
            estimateHeadersSizeInBytes2 = 0;
            max2 = 0;
        } else {
            estimateHeadersSizeInBytes2 = estimateHeadersSizeInBytes(emptyMap);
            max2 = Math.max(0L, longValue2 - estimateHeadersSizeInBytes2);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getResponseStart() != null) {
            b = Duration.a(this.mMetrics.getResponseStart().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            b = Duration.b(0L);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getRequestEnd() != null) {
            b2 = Duration.a(this.mMetrics.getRequestEnd().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            b2 = Duration.b(0L);
        }
        return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i, b, b2, str, this.mQuicConnectionMigrationAttempted, this.mQuicConnectionMigrationSuccessful);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportMetrics() {
        if (this.mMetrics != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.mLogger.logCronetTrafficInfo(this.mCronetEngineId, buildCronetTrafficInfo());
                } catch (RuntimeException e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Error while trying to log CronetTrafficInfo: ", (Throwable) e);
                }
            }
            final RequestFinishedInfoImpl requestFinishedInfoImpl = new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
            this.mRequestContext.reportRequestFinished(requestFinishedInfoImpl);
            VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = this.mRequestFinishedListener;
            if (requestFinishedInfoListener != null) {
                try {
                    requestFinishedInfoListener.getExecutor().execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.9
                        @Override // java.lang.Runnable
                        public void run() {
                            CronetUrlRequest.this.mRequestFinishedListener.onRequestFinished(requestFinishedInfoImpl);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e2);
                }
            }
        }
    }
}
