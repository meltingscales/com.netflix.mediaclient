package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SHA1Digest extends GeneralDigest {
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private int g(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 << 1) | (i2 >>> 31);
        }
        int i3 = this.H1;
        int i4 = this.H2;
        int i5 = this.H3;
        int i6 = this.H4;
        int i7 = this.H5;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int f = i7 + ((i3 << 5) | (i3 >>> 27)) + f(i4, i5, i6) + this.X[i9] + 1518500249;
            int i10 = (i4 << 30) | (i4 >>> 2);
            int f2 = i6 + ((f << 5) | (f >>> 27)) + f(i3, i10, i5) + this.X[i9 + 1] + 1518500249;
            int i11 = (i3 << 30) | (i3 >>> 2);
            int f3 = i5 + ((f2 << 5) | (f2 >>> 27)) + f(f, i11, i10) + this.X[i9 + 2] + 1518500249;
            i7 = (f << 30) | (f >>> 2);
            i4 = i10 + ((f3 << 5) | (f3 >>> 27)) + f(f2, i7, i11) + this.X[i9 + 3] + 1518500249;
            i6 = (f2 << 30) | (f2 >>> 2);
            i3 = i11 + ((i4 << 5) | (i4 >>> 27)) + f(f3, i6, i7) + this.X[i9 + 4] + 1518500249;
            i5 = (f3 << 30) | (f3 >>> 2);
            i8++;
            i9 += 5;
        }
        int i12 = 0;
        while (i12 < 4) {
            int h = i7 + ((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6) + this.X[i9] + 1859775393;
            int i13 = (i4 << 30) | (i4 >>> 2);
            int h2 = i6 + ((h << 5) | (h >>> 27)) + h(i3, i13, i5) + this.X[i9 + 1] + 1859775393;
            int i14 = (i3 << 30) | (i3 >>> 2);
            int h3 = i5 + ((h2 << 5) | (h2 >>> 27)) + h(h, i14, i13) + this.X[i9 + 2] + 1859775393;
            i7 = (h << 30) | (h >>> 2);
            i4 = i13 + ((h3 << 5) | (h3 >>> 27)) + h(h2, i7, i14) + this.X[i9 + 3] + 1859775393;
            i6 = (h2 << 30) | (h2 >>> 2);
            i3 = i14 + ((i4 << 5) | (i4 >>> 27)) + h(h3, i6, i7) + this.X[i9 + 4] + 1859775393;
            i5 = (h3 << 30) | (h3 >>> 2);
            i12++;
            i9 += 5;
        }
        int i15 = 0;
        while (i15 < 4) {
            int g = i7 + (((((i3 << 5) | (i3 >>> 27)) + g(i4, i5, i6)) + this.X[i9]) - 1894007588);
            int i16 = (i4 << 30) | (i4 >>> 2);
            int g2 = i6 + (((((g << 5) | (g >>> 27)) + g(i3, i16, i5)) + this.X[i9 + 1]) - 1894007588);
            int i17 = (i3 << 30) | (i3 >>> 2);
            int g3 = i5 + (((((g2 << 5) | (g2 >>> 27)) + g(g, i17, i16)) + this.X[i9 + 2]) - 1894007588);
            i7 = (g << 30) | (g >>> 2);
            i4 = i16 + (((((g3 << 5) | (g3 >>> 27)) + g(g2, i7, i17)) + this.X[i9 + 3]) - 1894007588);
            i6 = (g2 << 30) | (g2 >>> 2);
            i3 = i17 + (((((i4 << 5) | (i4 >>> 27)) + g(g3, i6, i7)) + this.X[i9 + 4]) - 1894007588);
            i5 = (g3 << 30) | (g3 >>> 2);
            i15++;
            i9 += 5;
        }
        int i18 = 0;
        while (i18 <= 3) {
            int h4 = i7 + (((((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6)) + this.X[i9]) - 899497514);
            int i19 = (i4 << 30) | (i4 >>> 2);
            int h5 = i6 + (((((h4 << 5) | (h4 >>> 27)) + h(i3, i19, i5)) + this.X[i9 + 1]) - 899497514);
            int i20 = (i3 << 30) | (i3 >>> 2);
            int h6 = i5 + (((((h5 << 5) | (h5 >>> 27)) + h(h4, i20, i19)) + this.X[i9 + 2]) - 899497514);
            i7 = (h4 << 30) | (h4 >>> 2);
            i4 = i19 + (((((h6 << 5) | (h6 >>> 27)) + h(h5, i7, i20)) + this.X[i9 + 3]) - 899497514);
            i6 = (h5 << 30) | (h5 >>> 2);
            i3 = i20 + (((((i4 << 5) | (i4 >>> 27)) + h(h6, i6, i7)) + this.X[i9 + 4]) - 899497514);
            i5 = (h6 << 30) | (h6 >>> 2);
            i18++;
            i9 += 5;
        }
        this.H1 += i3;
        this.H2 += i4;
        this.H3 += i5;
        this.H4 += i6;
        this.H5 += i7;
        this.xOff = 0;
        for (int i21 = 0; i21 < 16; i21++) {
            this.X[i21] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }
}
