package org.chromium.net.impl;

import j$.time.Duration;

/* loaded from: classes5.dex */
public abstract class CronetLogger {

    /* loaded from: classes5.dex */
    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK
    }

    public abstract void logCronetEngineCreation(int i, CronetEngineBuilderInfo cronetEngineBuilderInfo, CronetVersion cronetVersion, CronetSource cronetSource);

    public abstract void logCronetTrafficInfo(int i, CronetTrafficInfo cronetTrafficInfo);

    /* loaded from: classes5.dex */
    public static class CronetEngineBuilderInfo {
        private final boolean mBrotiEnabled;
        private final String mExperimentalOptions;
        private final boolean mHttp2Enabled;
        private final int mHttpCacheMode;
        private final boolean mNetworkQualityEstimatorEnabled;
        private final boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
        private final boolean mQuicEnabled;
        private final String mStoragePath;
        private final int mThreadPriority;
        private final String mUserAgent;

        public CronetEngineBuilderInfo(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
            this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled();
            this.mUserAgent = cronetEngineBuilderImpl.getUserAgent();
            this.mStoragePath = cronetEngineBuilderImpl.storagePath();
            this.mQuicEnabled = cronetEngineBuilderImpl.quicEnabled();
            this.mHttp2Enabled = cronetEngineBuilderImpl.http2Enabled();
            this.mBrotiEnabled = cronetEngineBuilderImpl.brotliEnabled();
            this.mHttpCacheMode = cronetEngineBuilderImpl.publicBuilderHttpCacheMode();
            this.mExperimentalOptions = cronetEngineBuilderImpl.experimentalOptions();
            this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
            this.mThreadPriority = cronetEngineBuilderImpl.threadPriority(10);
        }
    }

    /* loaded from: classes6.dex */
    public static class CronetTrafficInfo {
        private final boolean mDidConnectionMigrationSucceed;
        private final Duration mHeadersLatency;
        private final String mNegotiatedProtocol;
        private final long mRequestBodySizeInBytes;
        private final long mRequestHeaderSizeInBytes;
        private final long mResponseBodySizeInBytes;
        private final long mResponseHeaderSizeInBytes;
        private final int mResponseStatusCode;
        private final Duration mTotalLatency;
        private final boolean mWasConnectionMigrationAttempted;

        public CronetTrafficInfo(long j, long j2, long j3, long j4, int i, Duration duration, Duration duration2, String str, boolean z, boolean z2) {
            this.mRequestHeaderSizeInBytes = j;
            this.mRequestBodySizeInBytes = j2;
            this.mResponseHeaderSizeInBytes = j3;
            this.mResponseBodySizeInBytes = j4;
            this.mResponseStatusCode = i;
            this.mHeadersLatency = duration;
            this.mTotalLatency = duration2;
            this.mNegotiatedProtocol = str;
            this.mWasConnectionMigrationAttempted = z;
            this.mDidConnectionMigrationSucceed = z2;
        }
    }

    /* loaded from: classes5.dex */
    public static class CronetVersion {
        private final int mBuildVersion;
        private final int mMajorVersion;
        private final int mMinorVersion;
        private final int mPatchVersion;

        public CronetVersion(String str) {
            String[] split = str.split("\\.");
            this.mMajorVersion = Integer.parseInt(split[0]);
            this.mMinorVersion = Integer.parseInt(split[1]);
            this.mBuildVersion = Integer.parseInt(split[2]);
            this.mPatchVersion = Integer.parseInt(split[3]);
        }

        public String toString() {
            int i = this.mMajorVersion;
            int i2 = this.mMinorVersion;
            int i3 = this.mBuildVersion;
            int i4 = this.mPatchVersion;
            return i + "." + i2 + "." + i3 + "." + i4;
        }
    }
}
