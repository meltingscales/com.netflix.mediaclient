package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes6.dex */
final class GF13 extends GF {
    private short gf_sq2(short s) {
        return gf_reduce(Interleave.expand16to32(gf_reduce(Interleave.expand16to32(s))));
    }

    private short gf_sq2mul(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 21) ^ j;
        long j4 = (((j2 << 12) * (j3 & 4294967312L)) ^ ((((((268435457 & j3) * j2) ^ ((j2 << 18) * (j & 64))) ^ ((j2 << 3) * (536870914 & j3))) ^ ((j2 << 6) * (1073741828 & j3))) ^ ((j2 << 9) * (2147483656L & j3)))) ^ ((j2 << 15) * (8589934624L & j3));
        long j5 = 2305834213120671744L & j4;
        long j6 = j4 ^ (((j5 >>> 24) ^ ((j5 >>> 18) ^ (j5 >>> 20))) ^ (j5 >>> 26));
        long j7 = 8796025913344L & j6;
        return gf_reduce(((int) (j6 ^ (((j7 >>> 24) ^ ((j7 >>> 20) ^ (j7 >>> 18))) ^ (j7 >>> 26)))) & 67108863);
    }

    private short gf_sqmul(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 7) ^ j;
        long j4 = (((j2 << 4) * (j3 & 262160)) ^ ((((((16385 & j3) * j2) ^ ((j2 << 6) * (j & 64))) ^ ((j2 << 1) * (32770 & j3))) ^ ((j2 << 2) * (65540 & j3))) ^ ((j2 << 3) * (131080 & j3)))) ^ ((j2 << 5) * (524320 & j3));
        long j5 = 137371844608L & j4;
        return gf_reduce(((int) (j4 ^ (((j5 >>> 24) ^ ((j5 >>> 18) ^ (j5 >>> 20))) ^ (j5 >>> 26)))) & 67108863);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s, short s2) {
        short gf_sqmul = gf_sqmul(s, s);
        short gf_sq2mul = gf_sq2mul(gf_sqmul, gf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(gf_sq2mul), gf_sq2mul)), gf_sq2mul), s2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s) {
        return gf_frac(s, (short) 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s, short s2) {
        int i = (s2 & 1) * s;
        for (int i2 = 1; i2 < 13; i2++) {
            i ^= ((1 << i2) & s2) * s;
        }
        return gf_reduce(i);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i) {
        int i2 = i >>> 13;
        int i3 = ((i2 << 4) ^ (i2 << 3)) ^ (i2 << 1);
        int i4 = i3 >>> 13;
        return (short) (((((i & 8191) ^ i2) ^ i4) ^ (i3 & 8191)) ^ (((i4 << 4) ^ (i4 << 3)) ^ (i4 << 1)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_sq(short s) {
        return gf_reduce(Interleave.expand16to32(s));
    }
}
