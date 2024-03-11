package com.netflix.ale;

import java.util.List;
import kotlin.Pair;
import o.C8563dqf;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;

/* loaded from: classes5.dex */
public final class Jwe_A128GCM extends JweBase {
    public static final Companion Companion = new Companion(null);
    private static final JweEncScheme ENC = JweEncScheme.A128GCM;
    private static final int IV_LENGTH_BYTES = 12;
    private final AleKey key;

    public /* synthetic */ Jwe_A128GCM(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey, C8627dsp c8627dsp) {
        this(aleCrypto, aleUtil, str, aleKey);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Jwe create(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey) {
            C8632dsu.c((Object) aleCrypto, "");
            C8632dsu.c((Object) aleUtil, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aleKey, "");
            if (aleKey.getAlgorithm() != AleAlgorithm.AES_GCM) {
                throw new Exception("invalid AES-GCM key");
            }
            return new Jwe_A128GCM(aleCrypto, aleUtil, str, aleKey, null);
        }
    }

    private Jwe_A128GCM(AleCrypto aleCrypto, AleUtil aleUtil, String str, AleKey aleKey) {
        super(aleCrypto, aleUtil, ENC, str, 12);
        this.key = aleKey;
    }

    @Override // com.netflix.ale.JweBase
    protected Pair<byte[], byte[]> doEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        List c;
        byte[] i;
        List c2;
        byte[] i2;
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        try {
            byte[] aesGcmEncrypt = getCrypto().aesGcmEncrypt(this.key, bArr3, bArr2, bArr);
            int length = aesGcmEncrypt.length;
            c = C8563dqf.c(aesGcmEncrypt, new C8654dtp(0, length - 17));
            i = C8576dqs.i(c);
            c2 = C8563dqf.c(aesGcmEncrypt, new C8654dtp(length - 16, aesGcmEncrypt.length - 1));
            i2 = C8576dqs.i(c2);
            return new Pair<>(i, i2);
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
        try {
            return getCrypto().aesGcmDecrypt(this.key, bArr, bArr2, catByteArrays(new byte[][]{bArr3, bArr4}));
        } catch (Throwable th) {
            throw new Exception("Internal decrypt error: " + th.getMessage(), th);
        }
    }
}
