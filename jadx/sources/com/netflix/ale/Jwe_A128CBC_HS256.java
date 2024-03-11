package com.netflix.ale;

import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import o.C8563dqf;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;

/* loaded from: classes5.dex */
public final class Jwe_A128CBC_HS256 extends JweBase {
    public static final Companion Companion = new Companion(null);
    private static final JweEncScheme ENC = JweEncScheme.A128CBC_HS256;
    private static final int IV_LENGTH_BYTES = 16;
    private final AleKey encKey;
    private final AleKey hmacKey;

    public /* synthetic */ Jwe_A128CBC_HS256(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey, AleKey aleKey2, C8627dsp c8627dsp) {
        this(aleCrypto, aleUtil, str, aleKey, aleKey2);
    }

    private Jwe_A128CBC_HS256(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey, AleKey aleKey2) {
        super(aleCrypto, aleUtil, ENC, str, 16);
        this.encKey = aleKey;
        this.hmacKey = aleKey2;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Jwe create(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey, AleKey aleKey2) {
            C8632dsu.c((Object) aleCrypto, "");
            C8632dsu.c((Object) aleUtil, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aleKey, "");
            C8632dsu.c((Object) aleKey2, "");
            if (aleKey.getAlgorithm() != AleAlgorithm.AES_CBC) {
                throw new Exception("invalid AES-CBC key");
            }
            if (aleKey2.getAlgorithm() != AleAlgorithm.HMAC_SHA256) {
                throw new Exception("invalid HMAC-SHA256 key");
            }
            return new Jwe_A128CBC_HS256(aleCrypto, aleUtil, str, aleKey, aleKey2, null);
        }
    }

    @Override // com.netflix.ale.JweBase
    protected Pair<byte[], byte[]> doEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        try {
            byte[] aesCbcEncrypt = getCrypto().aesCbcEncrypt(this.encKey, bArr3, bArr);
            return new Pair<>(aesCbcEncrypt, computeHmac(constructHmacInput(bArr2, bArr3, aesCbcEncrypt)));
        } catch (Throwable th) {
            throw new Exception("Internal encrypt error: " + th.getMessage(), th);
        }
    }

    @Override // com.netflix.ale.JweBase
    protected byte[] doDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        C8632dsu.c((Object) bArr4, "");
        if (!Arrays.equals(bArr4, computeHmac(constructHmacInput(bArr2, bArr, bArr3)))) {
            throw new Exception("JWE is untrusted");
        }
        try {
            return getCrypto().aesCbcDecrypt(this.encKey, bArr, bArr3);
        } catch (Throwable th) {
            throw new Exception("Internal decrypt error: " + th.getMessage(), th);
        }
    }

    private final byte[] computeHmac(byte[] bArr) {
        List c;
        byte[] i;
        try {
            c = C8563dqf.c(getCrypto().hmacSha256(this.hmacKey, bArr), new C8654dtp(0, 15));
            i = C8576dqs.i(c);
            return i;
        } catch (Throwable th) {
            throw new Exception("Internal hmac error: " + th.getMessage(), th);
        }
    }

    private final byte[] constructHmacInput(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return catByteArrays(new byte[][]{bArr, bArr2, bArr3, longToBigEndianByteArray(Jwe_A128CBC_HS256$$ExternalSyntheticBackport0.m(bArr.length * 8))});
    }

    private final byte extractByteFromLong(long j, int i) {
        if (i < 0 || i > 7) {
            throw new Exception("Invalid byte index " + i + " (must be between 0 and 7)");
        }
        return (byte) ((j >> (i * 8)) & 255);
    }

    private final byte[] longToBigEndianByteArray(long j) {
        return new byte[]{extractByteFromLong(j, 7), extractByteFromLong(j, 6), extractByteFromLong(j, 5), extractByteFromLong(j, 4), extractByteFromLong(j, 3), extractByteFromLong(j, 2), extractByteFromLong(j, 1), extractByteFromLong(j, 0)};
    }
}
