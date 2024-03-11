package com.netflix.ale;

/* loaded from: classes5.dex */
public enum AleAlgorithm {
    AES_GCM("AES-GCM", false),
    AES_CBC("AES-CBC", false),
    HMAC_SHA256("HMAC-SHA256", false),
    RSA_OAEP("RSA-OAEP", true),
    RSA_OAEP_256("RSA-OAEP-256", true);
    
    private final String algName;
    private final boolean isPK;

    public final String getAlgName() {
        return this.algName;
    }

    public final boolean isPK() {
        return this.isPK;
    }

    AleAlgorithm(String str, boolean z) {
        this.algName = str;
        this.isPK = z;
    }
}
