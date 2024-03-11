package com.netflix.mediaclient.drm;

import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface NetflixMediaDrm {
    public static final int DEFAULT_MAX_DRM_SESSION_COUNT = 8;
    public static final String PROPERTY_APP_ID = "appId";
    public static final String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
    public static final String PROPERTY_HDCP_LEVEL = "hdcpLevel";
    public static final String PROPERTY_MAX_HDCP_LEVEL = "maxHdcpLevel";
    public static final String PROPERTY_MAX_NUMBER_OF_SESSIONS = "maxNumberOfSessions";
    public static final String PROPERTY_OEM_CRYPTO_API_VERSION = "oemCryptoApiVersion";
    public static final String PROPERTY_PRIVACY_MODE = "privacyMode";
    public static final String PROPERTY_RESOURCE_RATING_TIER = "resourceRatingTier";
    public static final String PROPERTY_SECURITY_LEVEL = "securityLevel";
    public static final String PROPERTY_SESSION_SHARING = "sessionSharing";
    public static final String PROPERTY_SYSTEM_ID = "systemId";
    public static final String PROPERTY_USAGE_REPORTING_SUPPORT = "usageReportingSupport";
    public static final int RESOURCE_RATING_TIER_HIGH = 3;
    public static final int RESOURCE_RATING_TIER_LOW = 1;
    public static final int RESOURCE_RATING_TIER_MEDIUM = 2;
    public static final int SECURITY_LEVEL_HW_SECURE_ALL = 5;
    public static final int SECURITY_LEVEL_HW_SECURE_CRYPTO = 3;
    public static final int SECURITY_LEVEL_HW_SECURE_DECODE = 4;
    public static final int SECURITY_LEVEL_MAX = 6;
    public static final int SECURITY_LEVEL_NO_SUPPORTED = -1;
    public static final int SECURITY_LEVEL_SW_SECURE_CRYPTO = 1;
    public static final int SECURITY_LEVEL_SW_SECURE_DECODE = 2;
    public static final int SECURITY_LEVEL_UNKNOWN = 0;
    public static final String SYSTEM_ID_FAILURE_TO_RETRIEVE = "SYSTEMID_GET_FAILURE";
    public static final UUID WIDEVINE_SCHEME = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final String WIDEVINE_VERSION_FAILURE_TO_RETRIEVE = "WIDEVINE_VERSION_FAILURE_TO_RETRIEVE";

    /* loaded from: classes3.dex */
    public interface CryptoSession {
        byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

        byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

        byte[] sign(byte[] bArr, byte[] bArr2);

        boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3);
    }

    /* loaded from: classes3.dex */
    public interface KeyRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    /* loaded from: classes3.dex */
    public interface OnEventListener {
        void onEvent(NetflixMediaDrm netflixMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* loaded from: classes3.dex */
    public interface ProvisionRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    /* loaded from: classes6.dex */
    public enum SecurityLevel {
        software,
        hardware
    }

    void close();

    void closeSession(byte[] bArr);

    CryptoSession getCryptoSession(byte[] bArr, String str, String str2);

    KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap);

    int getMaxHdcpLevel();

    int getMaxSecurityLevel();

    int getMaxSessionCount();

    String getOemCryptoApiVersion();

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    ProvisionRequest getProvisionRequest();

    String getResourceRatingTier();

    byte[] openSession(SessionType sessionType);

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    HashMap<String, String> queryKeyStatus(byte[] bArr);

    void removeKeys(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(OnEventListener onEventListener);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);

    /* loaded from: classes3.dex */
    public enum SessionType {
        STREAMING(0, 1),
        OFFLINE(1, 2),
        PersistentUsageRecord(2, 1);
        
        private final int keyType;
        private final int sessionType;

        public int getKeyType() {
            return this.keyType;
        }

        public int getSessionType() {
            return this.sessionType;
        }

        SessionType(int i, int i2) {
            this.sessionType = i;
            this.keyType = i2;
        }
    }
}
