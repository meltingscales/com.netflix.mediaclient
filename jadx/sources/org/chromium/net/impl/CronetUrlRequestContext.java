package org.chromium.net.impl;

import android.os.ConditionVariable;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Log;
import org.chromium.base.ObserverList;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.build.annotations.UsedByReflection;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestContextConfigOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetEngineBuilderImpl;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.net.urlconnection.CronetHttpURLConnection;
import org.chromium.net.urlconnection.CronetURLStreamHandlerFactory;

@UsedByReflection
/* loaded from: classes5.dex */
public class CronetUrlRequestContext extends CronetEngineBase {
    private static final int LOG_DEBUG = -1;
    private static final int LOG_NONE = 3;
    static final String LOG_TAG = "CronetUrlRequestContext";
    private static final int LOG_VERBOSE = -2;
    private static final HashSet<String> sInUseStoragePaths = new HashSet<>();
    private final AtomicInteger mActiveRequestCount;
    private final int mCronetEngineId;
    private int mDownstreamThroughputKbps;
    private int mEffectiveConnectionType;
    private final boolean mEnableTelemetry;
    private final Object mFinishedListenerLock;
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap;
    private int mHttpRttMs;
    private final String mInUseStoragePath;
    private final ConditionVariable mInitCompleted;
    private boolean mIsLogging;
    private boolean mIsStoppingNetLog;
    private final Object mLock;
    private final CronetLogger mLogger;
    private long mNetworkHandle;
    private final boolean mNetworkQualityEstimatorEnabled;
    private final Object mNetworkQualityLock;
    private Thread mNetworkThread;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> mRttListenerList;
    private final ConditionVariable mStopNetLogCompleted;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> mThroughputListenerList;
    private int mTransportRttMs;
    private long mUrlRequestContextAdapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        void addPkp(long j, String str, byte[][] bArr, boolean z, long j2);

        void addQuicHint(long j, String str, int i, int i2);

        void configureNetworkQualityEstimatorForTesting(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z, boolean z2, boolean z3);

        long createRequestContextAdapter(long j);

        long createRequestContextConfig(byte[] bArr);

        void destroy(long j, CronetUrlRequestContext cronetUrlRequestContext);

        boolean getEnableTelemetry(long j, CronetUrlRequestContext cronetUrlRequestContext);

        byte[] getHistogramDeltas();

        void initRequestContextOnInitThread(long j, CronetUrlRequestContext cronetUrlRequestContext);

        void provideRTTObservations(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z);

        void provideThroughputObservations(long j, CronetUrlRequestContext cronetUrlRequestContext, boolean z);

        int setMinLogLevel(int i);

        void startNetLogToDisk(long j, CronetUrlRequestContext cronetUrlRequestContext, String str, boolean z, int i);

        boolean startNetLogToFile(long j, CronetUrlRequestContext cronetUrlRequestContext, String str, boolean z);

        void stopNetLog(long j, CronetUrlRequestContext cronetUrlRequestContext);
    }

    private boolean haveRequestContextAdapter() {
        return this.mUrlRequestContextAdapter != 0;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public void bindToNetwork(long j) {
        this.mNetworkHandle = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCronetEngineId() {
        return this.mCronetEngineId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetLogger getCronetLogger() {
        return this.mLogger;
    }

    public boolean getEnableTelemetryForTesting() {
        return this.mEnableTelemetry;
    }

    public boolean isNetworkThread(Thread thread) {
        return thread == this.mNetworkThread;
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    @UsedByReflection
    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        boolean enableTelemetry;
        Object obj = new Object();
        this.mLock = obj;
        this.mInitCompleted = new ConditionVariable(false);
        this.mActiveRequestCount = new AtomicInteger(0);
        this.mNetworkQualityLock = new Object();
        this.mFinishedListenerLock = new Object();
        this.mEffectiveConnectionType = 0;
        this.mHttpRttMs = -1;
        this.mTransportRttMs = -1;
        this.mDownstreamThroughputKbps = -1;
        ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> observerList = new ObserverList<>();
        this.mRttListenerList = observerList;
        ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> observerList2 = new ObserverList<>();
        this.mThroughputListenerList = observerList2;
        this.mFinishedListenerMap = new HashMap();
        this.mStopNetLogCompleted = new ConditionVariable();
        this.mNetworkHandle = -1L;
        this.mCronetEngineId = hashCode();
        observerList.disableThreadAsserts();
        observerList2.disableThreadAsserts();
        this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
        CronetLibraryLoader.ensureInitialized(cronetEngineBuilderImpl.getContext(), cronetEngineBuilderImpl);
        CronetUrlRequestContextJni.get().setMinLogLevel(getLoggingLevel());
        if (cronetEngineBuilderImpl.httpCacheMode() == 1) {
            String storagePath = cronetEngineBuilderImpl.storagePath();
            this.mInUseStoragePath = storagePath;
            HashSet<String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                if (!hashSet.add(storagePath)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.mInUseStoragePath = null;
        }
        synchronized (obj) {
            long createRequestContextAdapter = CronetUrlRequestContextJni.get().createRequestContextAdapter(createNativeUrlRequestContextConfig(cronetEngineBuilderImpl));
            this.mUrlRequestContextAdapter = createRequestContextAdapter;
            if (createRequestContextAdapter == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
            enableTelemetry = CronetUrlRequestContextJni.get().getEnableTelemetry(this.mUrlRequestContextAdapter, this);
            this.mEnableTelemetry = enableTelemetry;
        }
        if (enableTelemetry) {
            this.mLogger = CronetLoggerFactory.createLogger(cronetEngineBuilderImpl.getContext(), getCronetSource());
        } else {
            this.mLogger = CronetLoggerFactory.createNoOpLogger();
        }
        try {
            this.mLogger.logCronetEngineCreation(getCronetEngineId(), new CronetLogger.CronetEngineBuilderInfo(cronetEngineBuilderImpl), buildCronetVersion(), getCronetSource());
        } catch (RuntimeException e) {
            Log.e(LOG_TAG, "Error while trying to log CronetEngine creation: ", (Throwable) e);
        }
        CronetLibraryLoader.postToInitThread(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.1
            @Override // java.lang.Runnable
            public void run() {
                CronetLibraryLoader.ensureInitializedOnInitThread();
                synchronized (CronetUrlRequestContext.this.mLock) {
                    CronetUrlRequestContextJni.get().initRequestContextOnInitThread(CronetUrlRequestContext.this.mUrlRequestContextAdapter, CronetUrlRequestContext.this);
                }
            }
        });
    }

    static CronetLogger.CronetSource getCronetSource() {
        return CronetEngine.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader()) ? CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED : CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
    }

    public static long createNativeUrlRequestContextConfig(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        long createRequestContextConfig = CronetUrlRequestContextJni.get().createRequestContextConfig(createRequestContextConfigOptions(cronetEngineBuilderImpl).toByteArray());
        if (createRequestContextConfig == 0) {
            throw new IllegalArgumentException("Experimental options parsing failed.");
        }
        for (CronetEngineBuilderImpl.QuicHint quicHint : cronetEngineBuilderImpl.quicHints()) {
            CronetUrlRequestContextJni.get().addQuicHint(createRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (CronetEngineBuilderImpl.Pkp pkp : cronetEngineBuilderImpl.publicKeyPins()) {
            CronetUrlRequestContextJni.get().addPkp(createRequestContextConfig, pkp.mHost, pkp.mHashes, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        return createRequestContextConfig;
    }

    private static RequestContextConfigOptions createRequestContextConfigOptions(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        RequestContextConfigOptions.Builder networkThreadPriority = RequestContextConfigOptions.newBuilder().setQuicEnabled(cronetEngineBuilderImpl.quicEnabled()).setHttp2Enabled(cronetEngineBuilderImpl.http2Enabled()).setBrotliEnabled(cronetEngineBuilderImpl.brotliEnabled()).setDisableCache(cronetEngineBuilderImpl.cacheDisabled()).setHttpCacheMode(cronetEngineBuilderImpl.httpCacheMode()).setHttpCacheMaxSize(cronetEngineBuilderImpl.httpCacheMaxSize()).setMockCertVerifier(cronetEngineBuilderImpl.mockCertVerifier()).setEnableNetworkQualityEstimator(cronetEngineBuilderImpl.networkQualityEstimatorEnabled()).setBypassPublicKeyPinningForLocalTrustAnchors(cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled()).setNetworkThreadPriority(cronetEngineBuilderImpl.threadPriority(10));
        if (cronetEngineBuilderImpl.getUserAgent() != null) {
            networkThreadPriority.setUserAgent(cronetEngineBuilderImpl.getUserAgent());
        }
        if (cronetEngineBuilderImpl.storagePath() != null) {
            networkThreadPriority.setStoragePath(cronetEngineBuilderImpl.storagePath());
        }
        if (cronetEngineBuilderImpl.getDefaultQuicUserAgentId() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(cronetEngineBuilderImpl.getDefaultQuicUserAgentId());
        }
        if (cronetEngineBuilderImpl.experimentalOptions() != null) {
            networkThreadPriority.setExperimentalOptions(cronetEngineBuilderImpl.experimentalOptions());
        }
        return networkThreadPriority.build();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j) {
        long j2 = j == -1 ? this.mNetworkHandle : j;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3, long j) {
        long j2 = j == -1 ? this.mNetworkHandle : j;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3, j2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        String cronetVersionWithLastChange = ImplVersion.getCronetVersionWithLastChange();
        return "Cronet/" + cronetVersionWithLastChange;
    }

    @Override // org.chromium.net.CronetEngine
    public int getActiveRequestCount() {
        return this.mActiveRequestCount.get();
    }

    private CronetLogger.CronetVersion buildCronetVersion() {
        return new CronetLogger.CronetVersion(getVersionString().split("/")[1].split("@")[0]);
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        if (this.mInUseStoragePath != null) {
            HashSet<String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                hashSet.remove(this.mInUseStoragePath);
            }
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mActiveRequestCount.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            }
            if (Thread.currentThread() == this.mNetworkThread) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.mInitCompleted.block();
        stopNetLog();
        synchronized (this.mLock) {
            if (haveRequestContextAdapter()) {
                CronetUrlRequestContextJni.get().destroy(this.mUrlRequestContextAdapter, this);
                this.mUrlRequestContextAdapter = 0L;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            if (!CronetUrlRequestContextJni.get().startNetLogToFile(this.mUrlRequestContextAdapter, this, str, z)) {
                throw new RuntimeException("Unable to start NetLog");
            }
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            CronetUrlRequestContextJni.get().startNetLogToDisk(this.mUrlRequestContextAdapter, this, str, z, i);
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging && !this.mIsStoppingNetLog) {
                CronetUrlRequestContextJni.get().stopNetLog(this.mUrlRequestContextAdapter, this);
                this.mIsStoppingNetLog = true;
                this.mStopNetLogCompleted.block();
                this.mStopNetLogCompleted.close();
                synchronized (this.mLock) {
                    this.mIsStoppingNetLog = false;
                    this.mIsLogging = false;
                }
            }
        }
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.mStopNetLogCompleted.open();
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return CronetUrlRequestContextJni.get().getHistogramDeltas();
    }

    @Override // org.chromium.net.CronetEngine
    public int getEffectiveConnectionType() {
        int convertConnectionTypeToApiValue;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            convertConnectionTypeToApiValue = convertConnectionTypeToApiValue(this.mEffectiveConnectionType);
        }
        return convertConnectionTypeToApiValue;
    }

    @Override // org.chromium.net.CronetEngine
    public int getHttpRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mHttpRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public int getTransportRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mTransportRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public int getDownstreamThroughputKbps() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mDownstreamThroughputKbps;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            CronetUrlRequestContextJni.get().configureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, this, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, this, true);
                }
            }
            this.mRttListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener)) && this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, this, true);
                }
            }
            this.mThroughputListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener)) && this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    boolean hasRequestFinishedListener() {
        boolean isEmpty;
        synchronized (this.mFinishedListenerLock) {
            isEmpty = this.mFinishedListenerMap.isEmpty();
        }
        return !isEmpty;
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new CronetHttpURLConnection(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new CronetURLStreamHandlerFactory(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onRequestDestroyed() {
        this.mActiveRequestCount.decrementAndGet();
    }

    public long getUrlRequestContextAdapter() {
        long j;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j = this.mUrlRequestContextAdapter;
        }
        return j;
    }

    private void checkHaveAdapter() {
        if (!haveRequestContextAdapter()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private int getLoggingLevel() {
        String str = LOG_TAG;
        if (Log.isLoggable(str, 2)) {
            return -2;
        }
        return Log.isLoggable(str, 3) ? -1 : 3;
    }

    private static int convertConnectionTypeToApiValue(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            if (i == 5) {
                                return 5;
                            }
                            throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i);
                        }
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    @CalledByNative
    private void initNetworkThread() {
        this.mNetworkThread = Thread.currentThread();
        this.mInitCompleted.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = i;
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = i;
            this.mTransportRttMs = i2;
            this.mDownstreamThroughputKbps = i3;
        }
    }

    @CalledByNative
    private void onRttObservation(final int i, final long j, final int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> it = this.mRttListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityRttListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.2
                    @Override // java.lang.Runnable
                    public void run() {
                        next.onRttObservation(i, j, i2);
                    }
                });
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(final int i, final long j, final int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> it = this.mThroughputListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.3
                    @Override // java.lang.Runnable
                    public void run() {
                        next.onThroughputObservation(i, j, i2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reportRequestFinished(final RequestFinishedInfo requestFinishedInfo) {
        synchronized (this.mFinishedListenerLock) {
            if (this.mFinishedListenerMap.isEmpty()) {
                return;
            }
            Iterator it = new ArrayList(this.mFinishedListenerMap.values()).iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = (VersionSafeCallbacks.RequestFinishedInfoListener) it.next();
                postObservationTaskToExecutor(requestFinishedInfoListener.getExecutor(), new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.4
                    @Override // java.lang.Runnable
                    public void run() {
                        requestFinishedInfoListener.onRequestFinished(requestFinishedInfo);
                    }
                });
            }
        }
    }

    private static void postObservationTaskToExecutor(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e(LOG_TAG, "Exception posting task to executor", (Throwable) e);
        }
    }
}
