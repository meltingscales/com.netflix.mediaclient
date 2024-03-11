package com.netflix.ale;

import o.C8563dqf;
import o.C8632dsu;
import o.C8654dtp;

/* loaded from: classes5.dex */
public abstract class KeyExchangeBase {
    private final AleScheme aleScheme;
    private final AleCrypto crypto;
    private final AleKeyxScheme keyxScheme;
    private final AleUtil util;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AleScheme.values().length];
            iArr[AleScheme.A128GCM.ordinal()] = 1;
            iArr[AleScheme.A128CBC_HS256.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected final AleScheme getAleScheme() {
        return this.aleScheme;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AleCrypto getCrypto() {
        return this.crypto;
    }

    protected final AleKeyxScheme getKeyxScheme() {
        return this.keyxScheme;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AleUtil getUtil() {
        return this.util;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KeyExchangeBase(AleKeyxScheme aleKeyxScheme, AleCrypto aleCrypto, AleUtil aleUtil, AleScheme aleScheme) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        C8632dsu.c((Object) aleCrypto, "");
        C8632dsu.c((Object) aleUtil, "");
        C8632dsu.c((Object) aleScheme, "");
        this.keyxScheme = aleKeyxScheme;
        this.crypto = aleCrypto;
        this.util = aleUtil;
        this.aleScheme = aleScheme;
    }

    public final Jwe createJweFromKey(byte[] bArr, String str) {
        byte[] b;
        byte[] b2;
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) str, "");
        int i = WhenMappings.$EnumSwitchMapping$0[this.aleScheme.ordinal()];
        if (i == 1) {
            if (bArr.length != 16) {
                throw new Exception("bad key size for " + this.aleScheme);
            }
            return Jwe_A128GCM.Companion.create(this.crypto, this.util, str, this.crypto.importSymmetricKey(AleAlgorithm.AES_GCM, bArr));
        } else if (i == 2) {
            if (bArr.length != 32) {
                throw new Exception("bad key size for " + this.aleScheme);
            }
            b = C8563dqf.b(bArr, new C8654dtp(16, 31));
            b2 = C8563dqf.b(bArr, new C8654dtp(0, 15));
            return Jwe_A128CBC_HS256.Companion.create(this.crypto, this.util, str, this.crypto.importSymmetricKey(AleAlgorithm.AES_CBC, b), this.crypto.importSymmetricKey(AleAlgorithm.HMAC_SHA256, b2));
        } else {
            throw new Exception("invalid ALE scheme");
        }
    }
}
