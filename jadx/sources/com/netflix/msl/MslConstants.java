package com.netflix.msl;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.nio.charset.Charset;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class MslConstants {
    public static final Charset e = Charset.forName("UTF-8");

    /* loaded from: classes5.dex */
    public enum CompressionAlgorithm {
        GZIP,
        LZW;

        public static CompressionAlgorithm e(Set<CompressionAlgorithm> set) {
            CompressionAlgorithm[] values = values();
            for (int i = 0; i < values.length && set.size() > 0; i++) {
                CompressionAlgorithm compressionAlgorithm = values[i];
                if (set.contains(compressionAlgorithm)) {
                    return compressionAlgorithm;
                }
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public enum EncryptionAlgo {
        AES;

        @Override // java.lang.Enum
        public String toString() {
            return name();
        }
    }

    /* loaded from: classes5.dex */
    public enum CipherSpec {
        AES_CBC_PKCS5Padding,
        AESWrap,
        RSA_ECB_PKCS1Padding;

        public static CipherSpec b(String str) {
            return AleCryptoBouncyCastle.AES_CBC_PKCS5_ALGO.equals(str) ? AES_CBC_PKCS5Padding : "RSA/ECB/PKCS1Padding".equals(str) ? RSA_ECB_PKCS1Padding : (CipherSpec) Enum.valueOf(CipherSpec.class, str);
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass3.d[ordinal()];
            return i != 1 ? i != 2 ? name() : "RSA/ECB/PKCS1Padding" : AleCryptoBouncyCastle.AES_CBC_PKCS5_ALGO;
        }
    }

    /* renamed from: com.netflix.msl.MslConstants$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CipherSpec.values().length];
            d = iArr;
            try {
                iArr[CipherSpec.AES_CBC_PKCS5Padding.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CipherSpec.RSA_ECB_PKCS1Padding.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum SignatureAlgo {
        HmacSHA256,
        SHA256withRSA,
        AESCmac;

        @Override // java.lang.Enum
        public String toString() {
            return name();
        }
    }

    /* loaded from: classes5.dex */
    public enum ResponseCode {
        FAIL(1),
        TRANSIENT_FAILURE(2),
        ENTITY_REAUTH(3),
        USER_REAUTH(4),
        KEYX_REQUIRED(5),
        ENTITYDATA_REAUTH(6),
        USERDATA_REAUTH(7),
        EXPIRED(8),
        REPLAYED(9),
        SSOTOKEN_REJECTED(10);
        
        private final int m;

        public int e() {
            return this.m;
        }

        public static ResponseCode b(int i) {
            ResponseCode[] values;
            for (ResponseCode responseCode : values()) {
                if (responseCode.e() == i) {
                    return responseCode;
                }
            }
            throw new IllegalArgumentException("Unknown response code value " + i + ".");
        }

        ResponseCode(int i) {
            this.m = i;
        }
    }
}
