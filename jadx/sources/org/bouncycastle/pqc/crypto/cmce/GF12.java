package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes6.dex */
final class GF12 extends GF {
    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s, short s2) {
        return gf_mul(gf_inv(s), s2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s) {
        short gf_mul = gf_mul(gf_sq(s), s);
        short gf_mul2 = gf_mul(gf_sq(gf_sq(gf_mul)), gf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(gf_mul2)))), gf_mul2))), gf_mul)), s));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s, short s2) {
        int i = (s2 & 1) * s;
        for (int i2 = 1; i2 < 12; i2++) {
            i ^= ((1 << i2) & s2) * s;
        }
        return gf_reduce(i);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i) {
        return (short) ((((i & 14680064) >>> 18) ^ (((i & 4095) ^ (i >>> 12)) ^ ((2093056 & i) >>> 9))) ^ (i >>> 21));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_sq(short s) {
        return gf_reduce(Interleave.expand16to32(s));
    }
}
