package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.Xof;

/* loaded from: classes6.dex */
class FrodoEngine {
    private final int B;
    private final int D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;
    private final int n;
    private final int q;

    public FrodoEngine(int i, int i2, int i3, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.n = i;
        this.D = i2;
        this.q = 1 << i2;
        this.B = i3;
        int i4 = i3 * 64;
        this.len_mu = i4;
        this.len_seedSE = i4;
        this.len_s = i4;
        this.len_k = i4;
        this.len_pkh = i4;
        this.len_ss = i4;
        int i5 = i4 / 8;
        this.len_mu_bytes = i5;
        this.len_seedSE_bytes = i5;
        this.len_s_bytes = i5;
        this.len_k_bytes = i5;
        this.len_pkh_bytes = i5;
        this.len_ss_bytes = i5;
        int i6 = ((i2 * i) * 8) / 8;
        this.len_ct_bytes = ((i2 * 64) / 8) + i6;
        int i7 = i6 + 16;
        this.len_pk_bytes = i7;
        this.len_sk_bytes = i7 + i5 + (i * 16) + i5;
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }
}
