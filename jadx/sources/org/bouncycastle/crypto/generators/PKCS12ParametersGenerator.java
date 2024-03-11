package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes6.dex */
public class PKCS12ParametersGenerator extends PBEParametersGenerator {
    private Digest digest;
    private int u;
    private int v;

    public PKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof ExtendedDigest) {
            this.u = digest.getDigestSize();
            this.v = ((ExtendedDigest) digest).getByteLength();
            return;
        }
        throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = i3 + (bArr2[length] & 255) + (bArr[i4] & 255);
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i4 = this.v;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i2];
        int i5 = 0;
        for (int i6 = 0; i6 != i4; i6++) {
            bArr3[i6] = (byte) i;
        }
        byte[] bArr5 = this.salt;
        int i7 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i8 = this.v;
            int length = i8 * (((bArr5.length + i8) - 1) / i8);
            bArr = new byte[length];
            for (int i9 = 0; i9 != length; i9++) {
                byte[] bArr6 = this.salt;
                bArr[i9] = bArr6[i9 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i10 = this.v;
            int length2 = i10 * (((bArr7.length + i10) - 1) / i10);
            bArr2 = new byte[length2];
            for (int i11 = 0; i11 != length2; i11++) {
                byte[] bArr8 = this.password;
                bArr2[i11] = bArr8[i11 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i12 = this.v;
        byte[] bArr10 = new byte[i12];
        int i13 = this.u;
        int i14 = ((i2 + i13) - 1) / i13;
        byte[] bArr11 = new byte[i13];
        int i15 = 1;
        while (i15 <= i14) {
            this.digest.update(bArr3, i5, i4);
            this.digest.update(bArr9, i5, length3);
            this.digest.doFinal(bArr11, i5);
            for (int i16 = i7; i16 < this.iterationCount; i16++) {
                this.digest.update(bArr11, i5, i13);
                this.digest.doFinal(bArr11, i5);
            }
            for (int i17 = i5; i17 != i12; i17++) {
                bArr10[i17] = bArr11[i17 % i13];
            }
            int i18 = i5;
            while (true) {
                int i19 = this.v;
                if (i18 == length3 / i19) {
                    break;
                }
                adjust(bArr9, i19 * i18, bArr10);
                i18++;
            }
            if (i15 == i14) {
                int i20 = (i15 - 1) * this.u;
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, i20, i2 - i20);
            } else {
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i15 - 1) * this.u, i13);
            }
            i15++;
            i5 = i3;
            i7 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(1, i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i3);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i3), generateDerivedKey(2, i4), 0, i4);
    }
}