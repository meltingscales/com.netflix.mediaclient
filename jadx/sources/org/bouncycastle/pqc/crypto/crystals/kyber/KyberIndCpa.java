package org.bouncycastle.pqc.crypto.crystals.kyber;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class KyberIndCpa {
    public final int KyberGenerateMatrixNBlocks;
    private KyberEngine engine;
    private int eta1;
    private int indCpaBytes;
    private int indCpaPublicKeyBytes;
    private int kyberK;
    private int polyCompressedBytes;
    private int polyVecBytes;
    private int polyVecCompressedBytes;
    private Symmetric symmetric;

    public KyberIndCpa(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.eta1 = kyberEngine.getKyberEta1();
        this.indCpaPublicKeyBytes = kyberEngine.getKyberPublicKeyBytes();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.indCpaBytes = kyberEngine.getKyberIndCpaBytes();
        this.polyVecCompressedBytes = kyberEngine.getKyberPolyVecCompressedBytes();
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        Symmetric symmetric = kyberEngine.getSymmetric();
        this.symmetric = symmetric;
        int i = symmetric.xofBlockBytes;
        this.KyberGenerateMatrixNBlocks = (i + 472) / i;
    }
}
