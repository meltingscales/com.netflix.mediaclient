package org.chromium.net.impl;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes5.dex */
public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");
    private final Context mApplicationContext;
    private boolean mBrotiEnabled;
    private String mExperimentalOptions;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private HttpCacheMode mHttpCacheMode;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private String mStoragePath;
    private String mUserAgent;
    private final List<QuicHint> mQuicHints = new LinkedList();
    private final List<Pkp> mPkps = new LinkedList();
    private int mThreadPriority = 20;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableBrotli(boolean z) {
        this.mBrotiEnabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttp2(boolean z) {
        this.mHttp2Enabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean z) {
        this.mNetworkQualityEstimatorEnabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableQuic(boolean z) {
        this.mQuicEnabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableSdch(boolean z) {
        return this;
    }

    public String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context getContext() {
        return this.mApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserAgent() {
        return this.mUserAgent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Pkp> publicKeyPins() {
        return this.mPkps;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<QuicHint> quicHints() {
        return this.mQuicHints;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setExperimentalOptions(String str) {
        this.mExperimentalOptions = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String storagePath() {
        return this.mStoragePath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int threadPriority(int i) {
        int i2 = this.mThreadPriority;
        return i2 == 20 ? i : i2;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
    }

    /* loaded from: classes5.dex */
    public static class QuicHint {
        final int mAlternatePort;
        final String mHost;
        final int mPort;

        QuicHint(String str, int i, int i2) {
            this.mHost = str;
            this.mPort = i;
            this.mAlternatePort = i2;
        }
    }

    /* loaded from: classes5.dex */
    public static class Pkp {
        final Date mExpirationDate;
        final byte[][] mHashes;
        final String mHost;
        final boolean mIncludeSubdomains;

        Pkp(String str, byte[][] bArr, boolean z, Date date) {
            this.mHost = str;
            this.mHashes = bArr;
            this.mIncludeSubdomains = z;
            this.mExpirationDate = date;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);
        
        private final boolean mContentCacheEnabled;
        private final int mType;

        int getType() {
            return this.mType;
        }

        boolean isContentCacheEnabled() {
            return this.mContentCacheEnabled;
        }

        HttpCacheMode(int i, boolean z) {
            this.mContentCacheEnabled = z;
            this.mType = i;
        }

        int toPublicBuilderCacheMode() {
            int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[ordinal()];
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        if (i == 4) {
                            return 1;
                        }
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                }
                return i2;
            }
            return 0;
        }

        static HttpCacheMode fromPublicBuilderCacheMode(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return DISK;
                        }
                        throw new IllegalArgumentException("Unknown public builder cache mode");
                    }
                    return DISK_NO_HTTP;
                }
                return MEMORY;
            }
            return DISABLED;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode;

        static {
            int[] iArr = new int[HttpCacheMode.values().length];
            $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode = iArr;
            try {
                iArr[HttpCacheMode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[HttpCacheMode.DISK_NO_HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[HttpCacheMode.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[HttpCacheMode.MEMORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CronetEngineBuilderImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
        enableQuic(true);
        enableHttp2(true);
        enableBrotli(false);
        enableHttpCache(0, 0L);
        enableNetworkQualityEstimator(false);
        enablePublicKeyPinningBypassForLocalTrustAnchors(true);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        return UserAgent.from(this.mApplicationContext);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.mStoragePath = str;
            return this;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getDefaultQuicUserAgentId() {
        return this.mQuicEnabled ? UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext) : "";
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttpCache(int i, long j) {
        HttpCacheMode fromPublicBuilderCacheMode = HttpCacheMode.fromPublicBuilderCacheMode(i);
        if (fromPublicBuilderCacheMode.getType() == 1 && storagePath() == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.mHttpCacheMode = fromPublicBuilderCacheMode;
        this.mHttpCacheMaxSize = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean cacheDisabled() {
        return !this.mHttpCacheMode.isContentCacheEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int httpCacheMode() {
        return this.mHttpCacheMode.getType();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int publicBuilderHttpCacheMode() {
        return this.mHttpCacheMode.toPublicBuilderCacheMode();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addQuicHint(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
        }
        this.mQuicHints.add(new QuicHint(str, i, i2));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        if (str != null) {
            if (set != null) {
                if (date == null) {
                    throw new NullPointerException("The pin expiration date cannot be null");
                }
                String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(str);
                HashMap hashMap = new HashMap();
                for (byte[] bArr : set) {
                    if (bArr == null || bArr.length != 32) {
                        throw new IllegalArgumentException("Public key pin is invalid");
                    }
                    hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                }
                this.mPkps.add(new Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()]), z, date));
                return this;
            }
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        }
        throw new NullPointerException("The hostname cannot be null");
    }

    private static String validateHostNameForPinningAndConvert(String str) {
        if (INVALID_PKP_HOST_NAME.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        } else if (str.length() > 255) {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        } else {
            try {
                return IDN.toASCII(str, 2);
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setThreadPriority(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.mThreadPriority = i;
        return this;
    }
}
