package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: classes6.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GF2PolynomialCalculator(int i, int i2, long j) {
        this.VEC_N_SIZE_64 = i;
        this.PARAM_N = i2;
        this.RED_MASK = j;
    }
}
