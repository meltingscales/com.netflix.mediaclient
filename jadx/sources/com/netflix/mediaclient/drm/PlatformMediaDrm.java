package com.netflix.mediaclient.drm;

import android.annotation.SuppressLint;
import android.media.MediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import java.util.HashMap;
import java.util.UUID;
import o.C8192dfj;

/* loaded from: classes3.dex */
public class PlatformMediaDrm implements NetflixMediaDrm {
    protected static final String TAG = "PlatformMediaDrm";
    protected final MediaDrm mMediaDrm;

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public int getMaxSecurityLevel() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformMediaDrm(UUID uuid) {
        if (uuid == null) {
            throw new IllegalStateException("UUID can not be null");
        }
        this.mMediaDrm = new MediaDrm(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnEventListener$0(NetflixMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void setOnEventListener(final NetflixMediaDrm.OnEventListener onEventListener) {
        this.mMediaDrm.setOnEventListener(onEventListener == null ? null : new MediaDrm.OnEventListener() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrm$$ExternalSyntheticLambda0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                PlatformMediaDrm.this.lambda$setOnEventListener$0(onEventListener, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public byte[] openSession(NetflixMediaDrm.SessionType sessionType) {
        return this.mMediaDrm.openSession();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void closeSession(byte[] bArr) {
        try {
            this.mMediaDrm.closeSession(bArr);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public NetflixMediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) {
        return new KeyRequest(this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap));
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        return this.mMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public NetflixMediaDrm.ProvisionRequest getProvisionRequest() {
        final MediaDrm.ProvisionRequest provisionRequest = this.mMediaDrm.getProvisionRequest();
        return new NetflixMediaDrm.ProvisionRequest() { // from class: com.netflix.mediaclient.drm.PlatformMediaDrm.1
            @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.ProvisionRequest
            public byte[] getData() {
                return provisionRequest.getData();
            }

            @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.ProvisionRequest
            public String getDefaultUrl() {
                return provisionRequest.getDefaultUrl();
            }
        };
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        this.mMediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public HashMap<String, String> queryKeyStatus(byte[] bArr) {
        return this.mMediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void close() {
        this.mMediaDrm.release();
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mMediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public String getPropertyString(String str) {
        return this.mMediaDrm.getPropertyString(str);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public byte[] getPropertyByteArray(String str) {
        return this.mMediaDrm.getPropertyByteArray(str);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void setPropertyString(String str, String str2) {
        this.mMediaDrm.setPropertyString(str, str2);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mMediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public NetflixMediaDrm.CryptoSession getCryptoSession(byte[] bArr, String str, String str2) {
        return new PlatformCryptoSession(this.mMediaDrm.getCryptoSession(bArr, str, str2));
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public void removeKeys(byte[] bArr) {
        this.mMediaDrm.removeKeys(bArr);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public int getMaxSessionCount() {
        return C8192dfj.a(this.mMediaDrm, NetflixMediaDrm.PROPERTY_MAX_NUMBER_OF_SESSIONS, 8);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    @SuppressLint({"InlinedApi"})
    public int getMaxHdcpLevel() {
        return C8192dfj.a(this.mMediaDrm, NetflixMediaDrm.PROPERTY_MAX_HDCP_LEVEL, 0);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public String getOemCryptoApiVersion() {
        return C8192dfj.a(this.mMediaDrm, NetflixMediaDrm.PROPERTY_OEM_CRYPTO_API_VERSION, "");
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm
    public String getResourceRatingTier() {
        return C8192dfj.a(this.mMediaDrm, NetflixMediaDrm.PROPERTY_RESOURCE_RATING_TIER, "");
    }

    /* loaded from: classes3.dex */
    public static final class PlatformCryptoSession implements NetflixMediaDrm.CryptoSession {
        MediaDrm.CryptoSession mCryptoSession;

        PlatformCryptoSession(MediaDrm.CryptoSession cryptoSession) {
            this.mCryptoSession = cryptoSession;
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.CryptoSession
        public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            return this.mCryptoSession.encrypt(bArr, bArr2, bArr3);
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.CryptoSession
        public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            return this.mCryptoSession.decrypt(bArr, bArr2, bArr3);
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.CryptoSession
        public byte[] sign(byte[] bArr, byte[] bArr2) {
            return this.mCryptoSession.sign(bArr, bArr2);
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.CryptoSession
        public boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            return this.mCryptoSession.verify(bArr, bArr2, bArr3);
        }
    }

    /* loaded from: classes3.dex */
    public static final class KeyRequest implements NetflixMediaDrm.KeyRequest {
        private final MediaDrm.KeyRequest mKeyRequest;

        KeyRequest(MediaDrm.KeyRequest keyRequest) {
            this.mKeyRequest = keyRequest;
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.KeyRequest
        public byte[] getData() {
            return this.mKeyRequest.getData();
        }

        @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.KeyRequest
        public String getDefaultUrl() {
            return this.mKeyRequest.getDefaultUrl();
        }
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(uuid);
    }
}
