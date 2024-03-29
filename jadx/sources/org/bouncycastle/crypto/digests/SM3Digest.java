package org.bouncycastle.crypto.digests;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SM3Digest extends GeneralDigest {
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            T[i] = (2055708042 << i3) | (2055708042 >>> (32 - i3));
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private int P0(int i) {
        return ((i >>> 15) | (i << 17)) ^ (((i << 9) | (i >>> 23)) ^ i);
    }

    private int P1(int i) {
        return ((i >>> 9) | (i << 23)) ^ (((i << 15) | (i >>> 17)) ^ i);
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, JSONzip.end, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            i = 16;
            if (i2 >= 16) {
                break;
            }
            this.W[i2] = this.inwords[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.W;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            iArr[i3] = (((i5 << 7) | (i5 >>> 25)) ^ P1(((i4 << 15) | (i4 >>> 17)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9]))) ^ this.W[i3 - 6];
        }
        int[] iArr2 = this.V;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int i10 = iArr2[4];
        int i11 = iArr2[5];
        int i12 = iArr2[6];
        int i13 = iArr2[7];
        int i14 = 0;
        int i15 = i12;
        while (i14 < i) {
            int i16 = (i6 << 12) | (i6 >>> 20);
            int i17 = i16 + i10 + T[i14];
            int i18 = (i17 << 7) | (i17 >>> 25);
            int[] iArr3 = this.W;
            int i19 = iArr3[i14];
            int i20 = iArr3[i14 + 4];
            int FF0 = FF0(i6, i7, i8);
            i14++;
            i9 = i8;
            i8 = (i7 << 9) | (i7 >>> 23);
            i7 = i6;
            i6 = FF0 + i9 + (i18 ^ i16) + (i19 ^ i20);
            i = 16;
            int i21 = i10;
            i10 = P0(GG0(i10, i11, i15) + i13 + i18 + i19);
            i13 = i15;
            i15 = (i11 << 19) | (i11 >>> 13);
            i11 = i21;
        }
        int i22 = i13;
        int i23 = i15;
        int i24 = i6;
        int i25 = 16;
        while (i25 < 64) {
            int i26 = (i24 << 12) | (i24 >>> 20);
            int i27 = i26 + i10 + T[i25];
            int i28 = (i27 << 7) | (i27 >>> 25);
            int[] iArr4 = this.W;
            int i29 = iArr4[i25];
            int i30 = iArr4[i25 + 4];
            int FF1 = FF1(i24, i7, i8);
            i25++;
            int i31 = (i7 >>> 23) | (i7 << 9);
            i11 = i10;
            i10 = P0(GG1(i10, i11, i23) + i22 + i28 + i29);
            i22 = i23;
            i23 = (i11 << 19) | (i11 >>> 13);
            i7 = i24;
            i24 = FF1 + i9 + (i28 ^ i26) + (i29 ^ i30);
            i9 = i8;
            i8 = i31;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i24 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i7;
        iArr5[2] = iArr5[2] ^ i8;
        iArr5[3] = iArr5[3] ^ i9;
        iArr5[4] = iArr5[4] ^ i10;
        iArr5[5] = iArr5[5] ^ i11;
        iArr5[6] = i23 ^ iArr5[6];
        iArr5[7] = i22 ^ iArr5[7];
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            if (i2 >= 14) {
                int[] iArr = this.inwords;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i2 + 2;
                iArr[i2 + 1] = (int) j;
                return;
            }
            this.inwords[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.inwords;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = Pack.bigEndianToInt(bArr, i);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
