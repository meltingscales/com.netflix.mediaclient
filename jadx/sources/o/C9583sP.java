package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.sP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9583sP extends FilterInputStream {
    private final int b;
    private long[] c;
    private long[] d;
    private short e;
    private byte[] g;
    private int h;
    private int i;
    private int j;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C9583sP(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        super(new BufferedInputStream(inputStream, 4096));
        this.h = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.b = min;
        this.g = new byte[min];
        this.d = new long[4];
        this.c = new long[4];
        this.i = min;
        this.j = min;
        this.d = C9577sJ.d(i ^ i4, min ^ i4);
        this.c = C9577sJ.d(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        d();
        int i = this.i;
        if (i >= this.j) {
            return -1;
        }
        byte[] bArr = this.g;
        this.i = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            d();
            int i5 = this.i;
            if (i5 >= this.j) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.g;
            this.i = i5 + 1;
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
        return this.j - this.i;
    }

    private void b() {
        C9577sJ.c(this.d, this.c, this.e);
        for (int i = 0; i < this.b; i++) {
            byte[] bArr = this.g;
            bArr[i] = (byte) (bArr[i] ^ ((this.d[this.e] >> (i * 8)) & 255));
        }
        this.e = (short) ((this.e + 1) % 4);
    }

    private int d() {
        int i;
        if (this.h == Integer.MAX_VALUE) {
            this.h = this.in.read();
        }
        if (this.i == this.b) {
            byte[] bArr = this.g;
            int i2 = this.h;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = this.in.read(this.g, i3, this.b - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.b);
            if (i3 < this.b) {
                throw new IllegalStateException("unexpected block size");
            }
            b();
            int read2 = this.in.read();
            this.h = read2;
            this.i = 0;
            if (read2 < 0) {
                int i4 = this.b;
                i = i4 - (this.g[i4 - 1] & 255);
            } else {
                i = this.b;
            }
            this.j = i;
        }
        return this.j;
    }
}
