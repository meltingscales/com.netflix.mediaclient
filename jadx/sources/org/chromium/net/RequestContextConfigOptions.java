package org.chromium.net;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.netflix.android.org.json.zip.JSONzip;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class RequestContextConfigOptions extends GeneratedMessageLite<RequestContextConfigOptions, Builder> implements RequestContextConfigOptionsOrBuilder {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    private static final RequestContextConfigOptions DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile Parser<RequestContextConfigOptions> PARSER = null;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean brotliEnabled_;
    private boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    private boolean disableCache_;
    private boolean enableNetworkQualityEstimator_;
    private boolean http2Enabled_;
    private long httpCacheMaxSize_;
    private int httpCacheMode_;
    private long mockCertVerifier_;
    private int networkThreadPriority_;
    private boolean quicEnabled_;
    private String userAgent_ = "";
    private String storagePath_ = "";
    private String quicDefaultUserAgentId_ = "";
    private String experimentalOptions_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrotliEnabled() {
        this.bitField0_ &= -33;
        this.brotliEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassPublicKeyPinningForLocalTrustAnchors() {
        this.bitField0_ &= -4097;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableCache() {
        this.bitField0_ &= -65;
        this.disableCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableNetworkQualityEstimator() {
        this.bitField0_ &= -2049;
        this.enableNetworkQualityEstimator_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp2Enabled() {
        this.bitField0_ &= -17;
        this.http2Enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMaxSize() {
        this.bitField0_ &= -257;
        this.httpCacheMaxSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMode() {
        this.bitField0_ &= -129;
        this.httpCacheMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockCertVerifier() {
        this.bitField0_ &= -1025;
        this.mockCertVerifier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkThreadPriority() {
        this.bitField0_ &= -8193;
        this.networkThreadPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicEnabled() {
        this.bitField0_ &= -5;
        this.quicEnabled_ = false;
    }

    public static RequestContextConfigOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrotliEnabled(boolean z) {
        this.bitField0_ |= 32;
        this.brotliEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassPublicKeyPinningForLocalTrustAnchors(boolean z) {
        this.bitField0_ |= 4096;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCache(boolean z) {
        this.bitField0_ |= 64;
        this.disableCache_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableNetworkQualityEstimator(boolean z) {
        this.bitField0_ |= 2048;
        this.enableNetworkQualityEstimator_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp2Enabled(boolean z) {
        this.bitField0_ |= 16;
        this.http2Enabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMaxSize(long j) {
        this.bitField0_ |= JSONzip.end;
        this.httpCacheMaxSize_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMode(int i) {
        this.bitField0_ |= 128;
        this.httpCacheMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockCertVerifier(long j) {
        this.bitField0_ |= 1024;
        this.mockCertVerifier_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkThreadPriority(int i) {
        this.bitField0_ |= 8192;
        this.networkThreadPriority_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicEnabled(boolean z) {
        this.bitField0_ |= 4;
        this.quicEnabled_ = z;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBrotliEnabled() {
        return this.brotliEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
        return this.bypassPublicKeyPinningForLocalTrustAnchors_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getDisableCache() {
        return this.disableCache_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getEnableNetworkQualityEstimator() {
        return this.enableNetworkQualityEstimator_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getExperimentalOptions() {
        return this.experimentalOptions_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getHttp2Enabled() {
        return this.http2Enabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getHttpCacheMaxSize() {
        return this.httpCacheMaxSize_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getHttpCacheMode() {
        return this.httpCacheMode_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getMockCertVerifier() {
        return this.mockCertVerifier_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getNetworkThreadPriority() {
        return this.networkThreadPriority_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getQuicDefaultUserAgentId() {
        return this.quicDefaultUserAgentId_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getQuicEnabled() {
        return this.quicEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getStoragePath() {
        return this.storagePath_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBrotliEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasDisableCache() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasEnableNetworkQualityEstimator() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasExperimentalOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttp2Enabled() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMaxSize() {
        return (this.bitField0_ & JSONzip.end) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMode() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasMockCertVerifier() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasNetworkThreadPriority() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicDefaultUserAgentId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasStoragePath() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasUserAgent() {
        return (this.bitField0_ & 1) != 0;
    }

    private RequestContextConfigOptions() {
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.bitField0_ &= -2;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(ByteString byteString) {
        this.userAgent_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public ByteString getStoragePathBytes() {
        return ByteString.copyFromUtf8(this.storagePath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePath(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.storagePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoragePath() {
        this.bitField0_ &= -3;
        this.storagePath_ = getDefaultInstance().getStoragePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePathBytes(ByteString byteString) {
        this.storagePath_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public ByteString getQuicDefaultUserAgentIdBytes() {
        return ByteString.copyFromUtf8(this.quicDefaultUserAgentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.quicDefaultUserAgentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicDefaultUserAgentId() {
        this.bitField0_ &= -9;
        this.quicDefaultUserAgentId_ = getDefaultInstance().getQuicDefaultUserAgentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentIdBytes(ByteString byteString) {
        this.quicDefaultUserAgentId_ = byteString.toStringUtf8();
        this.bitField0_ |= 8;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public ByteString getExperimentalOptionsBytes() {
        return ByteString.copyFromUtf8(this.experimentalOptions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptions(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.experimentalOptions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalOptions() {
        this.bitField0_ &= -513;
        this.experimentalOptions_ = getDefaultInstance().getExperimentalOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptionsBytes(ByteString byteString) {
        this.experimentalOptions_ = byteString.toStringUtf8();
        this.bitField0_ |= 512;
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer byteBuffer) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RequestContextConfigOptions parseFrom(ByteString byteString) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RequestContextConfigOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RequestContextConfigOptions parseFrom(byte[] bArr) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestContextConfigOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RequestContextConfigOptions parseFrom(InputStream inputStream) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestContextConfigOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream inputStream) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestContextConfigOptions parseFrom(CodedInputStream codedInputStream) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RequestContextConfigOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RequestContextConfigOptions requestContextConfigOptions) {
        return DEFAULT_INSTANCE.createBuilder(requestContextConfigOptions);
    }

    /* loaded from: classes5.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RequestContextConfigOptions, Builder> implements RequestContextConfigOptionsOrBuilder {
        private Builder() {
            super(RequestContextConfigOptions.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasUserAgent() {
            return ((RequestContextConfigOptions) this.instance).hasUserAgent();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getUserAgent() {
            return ((RequestContextConfigOptions) this.instance).getUserAgent();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public ByteString getUserAgentBytes() {
            return ((RequestContextConfigOptions) this.instance).getUserAgentBytes();
        }

        public Builder setUserAgent(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgent(str);
            return this;
        }

        public Builder clearUserAgent() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearUserAgent();
            return this;
        }

        public Builder setUserAgentBytes(ByteString byteString) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgentBytes(byteString);
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasStoragePath() {
            return ((RequestContextConfigOptions) this.instance).hasStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getStoragePath() {
            return ((RequestContextConfigOptions) this.instance).getStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public ByteString getStoragePathBytes() {
            return ((RequestContextConfigOptions) this.instance).getStoragePathBytes();
        }

        public Builder setStoragePath(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePath(str);
            return this;
        }

        public Builder clearStoragePath() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearStoragePath();
            return this;
        }

        public Builder setStoragePathBytes(ByteString byteString) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePathBytes(byteString);
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasQuicEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).getQuicEnabled();
        }

        public Builder setQuicEnabled(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicEnabled(z);
            return this;
        }

        public Builder clearQuicEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicEnabled();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).hasQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public ByteString getQuicDefaultUserAgentIdBytes() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentIdBytes();
        }

        public Builder setQuicDefaultUserAgentId(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentId(str);
            return this;
        }

        public Builder clearQuicDefaultUserAgentId() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicDefaultUserAgentId();
            return this;
        }

        public Builder setQuicDefaultUserAgentIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentIdBytes(byteString);
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).hasHttp2Enabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).getHttp2Enabled();
        }

        public Builder setHttp2Enabled(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttp2Enabled(z);
            return this;
        }

        public Builder clearHttp2Enabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttp2Enabled();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasBrotliEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).getBrotliEnabled();
        }

        public Builder setBrotliEnabled(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBrotliEnabled(z);
            return this;
        }

        public Builder clearBrotliEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBrotliEnabled();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasDisableCache() {
            return ((RequestContextConfigOptions) this.instance).hasDisableCache();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getDisableCache() {
            return ((RequestContextConfigOptions) this.instance).getDisableCache();
        }

        public Builder setDisableCache(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setDisableCache(z);
            return this;
        }

        public Builder clearDisableCache() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearDisableCache();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMode();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMode();
        }

        public Builder setHttpCacheMode(int i) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMode(i);
            return this;
        }

        public Builder clearHttpCacheMode() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMode();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMaxSize();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMaxSize();
        }

        public Builder setHttpCacheMaxSize(long j) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMaxSize(j);
            return this;
        }

        public Builder clearHttpCacheMaxSize() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMaxSize();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).hasExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public ByteString getExperimentalOptionsBytes() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptionsBytes();
        }

        public Builder setExperimentalOptions(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptions(str);
            return this;
        }

        public Builder clearExperimentalOptions() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearExperimentalOptions();
            return this;
        }

        public Builder setExperimentalOptionsBytes(ByteString byteString) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptionsBytes(byteString);
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).hasMockCertVerifier();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).getMockCertVerifier();
        }

        public Builder setMockCertVerifier(long j) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setMockCertVerifier(j);
            return this;
        }

        public Builder clearMockCertVerifier() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearMockCertVerifier();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).hasEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).getEnableNetworkQualityEstimator();
        }

        public Builder setEnableNetworkQualityEstimator(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setEnableNetworkQualityEstimator(z);
            return this;
        }

        public Builder clearEnableNetworkQualityEstimator() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearEnableNetworkQualityEstimator();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).hasBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).getBypassPublicKeyPinningForLocalTrustAnchors();
        }

        public Builder setBypassPublicKeyPinningForLocalTrustAnchors(boolean z) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBypassPublicKeyPinningForLocalTrustAnchors(z);
            return this;
        }

        public Builder clearBypassPublicKeyPinningForLocalTrustAnchors() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBypassPublicKeyPinningForLocalTrustAnchors();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).hasNetworkThreadPriority();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).getNetworkThreadPriority();
        }

        public Builder setNetworkThreadPriority(int i) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setNetworkThreadPriority(i);
            return this;
        }

        public Builder clearNetworkThreadPriority() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearNetworkThreadPriority();
            return this;
        }
    }

    /* renamed from: org.chromium.net.RequestContextConfigOptions$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new RequestContextConfigOptions();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RequestContextConfigOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (RequestContextConfigOptions.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RequestContextConfigOptions requestContextConfigOptions = new RequestContextConfigOptions();
        DEFAULT_INSTANCE = requestContextConfigOptions;
        GeneratedMessageLite.registerDefaultInstance(RequestContextConfigOptions.class, requestContextConfigOptions);
    }

    public static Parser<RequestContextConfigOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
