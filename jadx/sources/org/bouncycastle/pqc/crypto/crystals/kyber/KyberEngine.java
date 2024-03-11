package org.bouncycastle.pqc.crypto.crystals.kyber;

/* loaded from: classes6.dex */
class KyberEngine {
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private KyberIndCpa indCpa;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KyberEngine(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.KyberK = r5
            r0 = 3
            r1 = 2
            if (r5 == r1) goto L36
            if (r5 == r0) goto L33
            r0 = 4
            if (r5 != r0) goto L17
            r4.KyberEta1 = r1
            r0 = 160(0xa0, float:2.24E-43)
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 352
            goto L3e
        L17:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "K: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = " is not supported for Crystals Kyber"
            r6.append(r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L33:
            r4.KyberEta1 = r1
            goto L38
        L36:
            r4.KyberEta1 = r0
        L38:
            r0 = 128(0x80, float:1.794E-43)
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 320
        L3e:
            r4.KyberPolyVecCompressedBytes = r0
            r1 = 32
            r4.sessionKeyLength = r1
            int r5 = r5 * 384
            r4.KyberPolyVecBytes = r5
            int r2 = r5 + 32
            r4.KyberIndCpaPublicKeyBytes = r2
            r4.KyberIndCpaSecretKeyBytes = r5
            int r3 = r4.KyberPolyCompressedBytes
            int r0 = r0 + r3
            r4.KyberIndCpaBytes = r0
            r4.KyberPublicKeyBytes = r2
            int r5 = r5 + r2
            int r5 = r5 + 64
            r4.KyberSecretKeyBytes = r5
            r4.KyberCipherTextBytes = r0
            r4.CryptoBytes = r1
            r4.CryptoSecretKeyBytes = r5
            r4.CryptoPublicKeyBytes = r2
            r4.CryptoCipherTextBytes = r0
            if (r6 == 0) goto L6c
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric
            r5.<init>()
            goto L71
        L6c:
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric
            r5.<init>()
        L71:
            r4.symmetric = r5
            org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa
            r5.<init>(r4)
            r4.indCpa = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine.<init>(int, boolean):void");
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }
}
