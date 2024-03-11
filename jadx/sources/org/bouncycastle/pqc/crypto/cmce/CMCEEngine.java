package org.bouncycastle.pqc.crypto.cmce;

import com.netflix.android.org.json.zip.JSONzip;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes6.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;
    private GF gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        BENES benes13;
        this.usePivots = z;
        this.SYS_N = i2;
        this.SYS_T = i3;
        this.GFBITS = i;
        this.poly = iArr;
        this.defaultKeySize = i4;
        this.IRR_BYTES = i3 * 2;
        this.COND_BYTES = (1 << (i - 4)) * ((i * 2) - 1);
        int i5 = i3 * i;
        this.PK_NROWS = i5;
        int i6 = i2 - i5;
        this.PK_NCOLS = i6;
        this.PK_ROW_BYTES = (i6 + 7) / 8;
        this.SYND_BYTES = (i5 + 7) / 8;
        this.GFMASK = (1 << i) - 1;
        if (i == 12) {
            this.gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private static int ctz(long j) {
        long j2 = 72340172838076673L;
        long j3 = 0;
        for (int i = 0; i < 8; i++) {
            j2 &= (~j) >>> i;
            j3 += j2;
        }
        long j4 = 578721382704613384L & j3;
        long j5 = j4 | (j4 >>> 1);
        long j6 = j5 | (j5 >>> 2);
        long j7 = j3 >>> 8;
        long j8 = j3 + (j7 & j6);
        for (int i2 = 2; i2 < 8; i2++) {
            j6 &= j6 >>> 8;
            j7 >>>= 8;
            j8 += j7 & j6;
        }
        return ((int) j8) & PrivateKeyType.INVALID;
    }

    private short eval(short[] sArr, short s) {
        int i = this.SYS_T;
        short s2 = sArr[i];
        while (true) {
            i--;
            if (i < 0) {
                return s2;
            }
            s2 = (short) (this.gf.gf_mul(s2, s) ^ sArr[i]);
        }
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        byte[] bArr2;
        long load8;
        int i;
        int i2;
        long[] jArr2 = new long[64];
        long[] jArr3 = new long[32];
        byte[] bArr3 = new byte[9];
        int i3 = this.PK_NROWS - 32;
        int i4 = i3 / 8;
        int i5 = i3 % 8;
        char c = 0;
        if (this.usePadding) {
            for (int i6 = 0; i6 < 32; i6++) {
                for (int i7 = 0; i7 < 9; i7++) {
                    bArr3[i7] = bArr[i3 + i6][i4 + i7];
                }
                int i8 = 0;
                while (i8 < 8) {
                    int i9 = i8 + 1;
                    bArr3[i8] = (byte) (((bArr3[i8] & 255) >> i5) | (bArr3[i9] << (8 - i5)));
                    i8 = i9;
                }
                jArr2[i6] = Utils.load8(bArr3, 0);
            }
        } else {
            for (int i10 = 0; i10 < 32; i10++) {
                jArr2[i10] = Utils.load8(bArr[i3 + i10], i4);
            }
        }
        long j = 0;
        jArr[0] = 0;
        int i11 = 0;
        while (i11 < 32) {
            long j2 = jArr2[i11];
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < 32; i13++) {
                j2 |= jArr2[i13];
            }
            if (j2 == j) {
                return -1;
            }
            int ctz = ctz(j2);
            long j3 = ctz;
            jArr3[i11] = j3;
            jArr[c] = jArr[c] | (1 << ((int) j3));
            for (int i14 = i12; i14 < 32; i14++) {
                long j4 = jArr2[i11];
                jArr2[i11] = j4 ^ (jArr2[i14] & (((j4 >> ctz) & 1) - 1));
            }
            int i15 = i12;
            while (i15 < 32) {
                long j5 = jArr2[i15];
                jArr2[i15] = j5 ^ (jArr2[i11] & (-((j5 >> ctz) & 1)));
                i15++;
                ctz = ctz;
                c = 0;
            }
            i11 = i12;
            j = 0;
        }
        int i16 = 0;
        while (i16 < 32) {
            int i17 = i16 + 1;
            int i18 = i17;
            while (i18 < 64) {
                long same_mask64 = same_mask64((short) i18, (short) jArr3[i16]) & (sArr[i] ^ sArr[i2]);
                sArr[i3 + i16] = (short) (sArr[i] ^ same_mask64);
                sArr[i3 + i18] = (short) (same_mask64 ^ sArr[i2]);
                i18++;
                bArr3 = bArr3;
            }
            i16 = i17;
        }
        byte[] bArr4 = bArr3;
        int i19 = 0;
        while (i19 < this.PK_NROWS) {
            if (this.usePadding) {
                for (int i20 = 0; i20 < 9; i20++) {
                    bArr4[i20] = bArr[i19][i4 + i20];
                }
                int i21 = 0;
                while (i21 < 8) {
                    int i22 = i21 + 1;
                    bArr4[i21] = (byte) (((bArr4[i21] & 255) >> i5) | (bArr4[i22] << (8 - i5)));
                    i21 = i22;
                }
                bArr2 = bArr4;
                load8 = Utils.load8(bArr2, 0);
            } else {
                bArr2 = bArr4;
                load8 = Utils.load8(bArr[i19], i4);
            }
            for (int i23 = 0; i23 < 32; i23++) {
                int i24 = (int) jArr3[i23];
                long j6 = ((load8 >> i23) ^ (load8 >> i24)) & 1;
                load8 = (j6 << i23) ^ (load8 ^ (j6 << i24));
            }
            if (this.usePadding) {
                Utils.store8(bArr2, 0, load8);
                byte[] bArr5 = bArr[i19];
                int i25 = i4 + 8;
                int i26 = 8 - i5;
                bArr5[i25] = (byte) ((((bArr5[i25] & 255) >>> i5) << i5) | ((bArr2[7] & 255) >>> i26));
                bArr5[i4] = (byte) (((bArr2[0] & 255) << i5) | (((bArr5[i4] & 255) << i26) >>> i26));
                for (int i27 = 7; i27 >= 1; i27--) {
                    bArr[i19][i4 + i27] = (byte) (((bArr2[i27] & 255) << i5) | ((bArr2[i27 - 1] & 255) >>> i26));
                }
            } else {
                Utils.store8(bArr[i19], i4, load8);
            }
            i19++;
            bArr4 = bArr2;
        }
        return 0;
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i;
        int i2;
        int i3 = this.SYS_T;
        short[] sArr2 = new short[i3 + 1];
        sArr2[i3] = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.SYS_T; i5++) {
            sArr2[i5] = Utils.load_gf(bArr2, (i5 * 2) + 40, this.GFMASK);
        }
        int i6 = 1 << this.GFBITS;
        long[] jArr2 = new long[i6];
        for (int i7 = 0; i7 < (1 << this.GFBITS); i7++) {
            long j = iArr[i7];
            jArr2[i7] = j;
            long j2 = j << 31;
            jArr2[i7] = j2;
            long j3 = j2 | i7;
            jArr2[i7] = j3;
            jArr2[i7] = j3 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i6);
        for (int i8 = 1; i8 < (1 << this.GFBITS); i8++) {
            if ((jArr2[i8 - 1] >> 31) == (jArr2[i8] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i9 = 0; i9 < (1 << this.GFBITS); i9++) {
            sArr[i9] = (short) (jArr2[i9] & this.GFMASK);
        }
        int i10 = 0;
        while (true) {
            i = this.SYS_N;
            if (i10 >= i) {
                break;
            }
            sArr3[i10] = Utils.bitrev(sArr[i10], this.GFBITS);
            i10++;
        }
        short[] sArr4 = new short[i];
        root(sArr4, sArr2, sArr3);
        int i11 = 0;
        while (true) {
            i2 = this.SYS_N;
            if (i11 >= i2) {
                break;
            }
            sArr4[i11] = this.gf.gf_inv(sArr4[i11]);
            i11++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance(Byte.TYPE, this.PK_NROWS, i2 / 8);
        for (int i12 = 0; i12 < this.PK_NROWS; i12++) {
            for (int i13 = 0; i13 < this.SYS_N / 8; i13++) {
                bArr3[i12][i13] = 0;
            }
        }
        int i14 = 0;
        while (i14 < this.SYS_T) {
            for (int i15 = 0; i15 < this.SYS_N; i15 += 8) {
                int i16 = 0;
                while (true) {
                    int i17 = this.GFBITS;
                    if (i16 < i17) {
                        bArr3[(i17 * i14) + i16][i15 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i15 + 7] >>> i16) & 1)) << 1)) | ((sArr4[i15 + 6] >>> i16) & 1))) << 1)) | ((sArr4[i15 + 5] >>> i16) & 1))) << 1)) | ((sArr4[i15 + 4] >>> i16) & 1))) << 1)) | ((sArr4[i15 + 3] >>> i16) & 1))) << 1)) | ((sArr4[i15 + 2] >>> i16) & 1))) << 1)) | ((sArr4[i15 + 1] >>> i16) & 1))) << 1)) | ((sArr4[i15] >>> i16) & 1));
                        i16++;
                    }
                }
            }
            for (int i18 = 0; i18 < this.SYS_N; i18++) {
                sArr4[i18] = this.gf.gf_mul(sArr4[i18], sArr3[i18]);
            }
            i14++;
        }
        int i19 = 0;
        while (true) {
            int i20 = this.PK_NROWS;
            if (i19 < i20) {
                i14 = i19 >>> 3;
                int i21 = i19 & 7;
                if (this.usePivots && i19 == i20 - 32) {
                    if (mov_columns(bArr3, sArr, jArr) != 0) {
                        return -1;
                    }
                }
                int i22 = i19 + 1;
                int i23 = i22;
                while (i23 < this.PK_NROWS) {
                    byte b = (byte) (-((byte) (((byte) (((byte) (bArr3[i19][i14] ^ bArr3[i23][i14])) >> i21)) & 1)));
                    for (int i24 = i4; i24 < this.SYS_N / 8; i24++) {
                        byte[] bArr4 = bArr3[i19];
                        bArr4[i24] = (byte) (bArr4[i24] ^ (bArr3[i23][i24] & b));
                    }
                    i23++;
                    i4 = 0;
                }
                if (((bArr3[i19][i14] >> i21) & 1) == 0) {
                    return -1;
                }
                for (int i25 = 0; i25 < this.PK_NROWS; i25++) {
                    if (i25 != i19) {
                        byte b2 = (byte) (-((byte) (((byte) (bArr3[i25][i14] >> i21)) & 1)));
                        for (int i26 = 0; i26 < this.SYS_N / 8; i26++) {
                            byte[] bArr5 = bArr3[i25];
                            bArr5[i26] = (byte) (bArr5[i26] ^ (bArr3[i19][i26] & b2));
                        }
                    }
                }
                i19 = i22;
                i4 = 0;
            } else if (bArr == null) {
                return 0;
            } else {
                if (this.usePadding) {
                    int i27 = i20 % 8;
                    if (i27 == 0) {
                        System.arraycopy(bArr3[i14], (i20 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        int i28 = this.SYS_N / 8;
                        return 0;
                    }
                    int i29 = 0;
                    int i30 = 0;
                    while (true) {
                        int i31 = this.PK_NROWS;
                        if (i29 >= i31) {
                            return 0;
                        }
                        int i32 = (i31 - 1) / 8;
                        while (i32 < (this.SYS_N / 8) - 1) {
                            byte[] bArr6 = bArr3[i29];
                            byte b3 = bArr6[i32];
                            i32++;
                            bArr[i30] = (byte) ((bArr6[i32] << (8 - i27)) | ((b3 & 255) >>> i27));
                            i30++;
                        }
                        bArr[i30] = (byte) ((bArr3[i29][i32] & 255) >>> i27);
                        i29++;
                        i30++;
                    }
                } else {
                    int i33 = ((this.SYS_N - i20) + 7) / 8;
                    int i34 = 0;
                    while (true) {
                        int i35 = this.PK_NROWS;
                        if (i34 >= i35) {
                            return 0;
                        }
                        System.arraycopy(bArr3[i34], i35 / 8, bArr, i33 * i34, i33);
                        i34++;
                    }
                }
            }
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SYS_N; i++) {
            sArr[i] = eval(sArr2, sArr3[i]);
        }
    }

    private static long same_mask64(short s, short s2) {
        return -(((s ^ s2) - 1) >>> 63);
    }

    private static void sort64(long[] jArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        int i4 = 1;
        while (i4 < i3 - i4) {
            i4 += i4;
        }
        for (int i5 = i4; i5 > 0; i5 >>>= 1) {
            int i6 = 0;
            for (int i7 = 0; i7 < i3 - i5; i7++) {
                if ((i7 & i5) == 0) {
                    int i8 = i + i7;
                    int i9 = i8 + i5;
                    long j = jArr[i9];
                    long j2 = jArr[i8];
                    long j3 = (-((j - j2) >>> 63)) & (j ^ j2);
                    jArr[i8] = j2 ^ j3;
                    jArr[i9] = jArr[i9] ^ j3;
                }
            }
            for (int i10 = i4; i10 > i5; i10 >>>= 1) {
                while (i6 < i3 - i10) {
                    if ((i6 & i5) == 0) {
                        int i11 = i + i6;
                        int i12 = i11 + i5;
                        long j4 = jArr[i12];
                        for (int i13 = i10; i13 > i5; i13 >>>= 1) {
                            int i14 = i11 + i13;
                            long j5 = jArr[i14];
                            long j6 = (-((j5 - j4) >>> 63)) & (j4 ^ j5);
                            j4 ^= j6;
                            jArr[i14] = j5 ^ j6;
                        }
                        jArr[i12] = j4;
                    }
                    i6++;
                }
            }
        }
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i = 1 << this.GFBITS;
        short[] sArr = new short[i];
        long[] jArr = {0};
        int[] iArr = new int[i];
        int i2 = i * 4;
        int i3 = (this.SYS_N / 8) + i2;
        byte[] bArr3 = new byte[i3];
        int i4 = this.IRR_BYTES;
        SHAKEDigest sHAKEDigest = new SHAKEDigest(JSONzip.end);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i3);
        for (int i5 = 0; i5 < (1 << this.GFBITS); i5++) {
            iArr[i5] = Utils.load4(bArr3, (i5 * 4) + (((i3 - 32) - i4) - i2));
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getPublicKeySize() {
        if (this.usePadding) {
            int i = this.PK_NROWS;
            return i * ((this.SYS_N / 8) - ((i - 1) / 8));
        }
        return (this.PK_NROWS * this.PK_NCOLS) / 8;
    }
}
