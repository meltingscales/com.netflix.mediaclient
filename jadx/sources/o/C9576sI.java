package o;

import com.netflix.model.leafs.ArtworkColors;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.sI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9576sI extends FilterInputStream {
    private static final short e = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] a;
    private byte[] c;
    private byte[] d;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13902o;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C9576sI(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(new BufferedInputStream(inputStream, 4096));
        this.h = Integer.MAX_VALUE;
        this.d = new byte[8];
        this.c = new byte[8];
        this.a = new byte[8];
        this.j = 8;
        this.i = 8;
        this.g = Math.min(Math.max(i2, 5), 16);
        this.f = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.c, 0, 8);
        }
        d((iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32), i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        d();
        int i = this.j;
        if (i >= this.i) {
            return -1;
        }
        byte[] bArr = this.d;
        this.j = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            d();
            int i5 = this.j;
            if (i5 >= this.i) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.d;
            this.j = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        d();
        return this.i - this.j;
    }

    private void d(long j, int i) {
        if (i == 0) {
            c(j);
            return;
        }
        int i2 = (int) j;
        this.m = i2;
        this.f13902o = i2 * i;
        this.l = i ^ i2;
        this.n = (int) (j >> 32);
    }

    private void c(long j) {
        this.m = (int) j;
        long j2 = j >> 3;
        short s = e;
        this.f13902o = (int) ((s * j2) >> 32);
        this.l = (int) (j >> 32);
        this.n = (int) (j2 + s);
    }

    private void a() {
        if (this.f == 3) {
            byte[] bArr = this.d;
            System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        }
        byte[] bArr2 = this.d;
        int i = ((bArr2[0] << 24) & ArtworkColors.DEFAULT_BACKGROUND_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.g;
            if (i3 >= i4) {
                break;
            }
            short s = e;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.l)) ^ ((i >>> 5) + this.n);
            i -= (((i2 << 4) + this.m) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f13902o);
            i3++;
        }
        byte[] bArr3 = this.d;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f == 3) {
            b();
            byte[] bArr4 = this.a;
            System.arraycopy(bArr4, 0, this.c, 0, bArr4.length);
        }
    }

    private void b() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.d;
            bArr[i] = (byte) (bArr[i] ^ this.c[i]);
        }
    }

    private int d() {
        if (this.h == Integer.MAX_VALUE) {
            this.h = this.in.read();
        }
        if (this.j == 8) {
            byte[] bArr = this.d;
            int i = this.h;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = this.in.read(this.d, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            a();
            int read2 = this.in.read();
            this.h = read2;
            this.j = 0;
            this.i = read2 < 0 ? 8 - (this.d[7] & 255) : 8;
        }
        return this.i;
    }
}
