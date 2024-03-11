package o;

import java.io.InputStream;

/* renamed from: o.on  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9397on extends InputStream {
    private final int a;
    private final InputStream b;
    private byte[] c;
    private int d;
    private final C9389of e;

    public C9397on(C9389of c9389of, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.e = c9389of;
        this.b = inputStream;
        this.c = bArr;
        this.d = i;
        this.a = i2;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.c != null ? this.a - this.d : this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
        this.b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            if (this.c == null) {
                this.b.mark(i);
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.c;
        if (bArr != null) {
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            byte b = bArr[i];
            if (i2 >= this.a) {
                a();
            }
            return b & 255;
        }
        return this.b.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            int i3 = this.a;
            int i4 = this.d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.d + i2;
            this.d = i6;
            if (i6 >= this.a) {
                a();
            }
            return i2;
        }
        return this.b.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
            if (this.c == null) {
                this.b.reset();
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j2;
        if (this.c != null) {
            int i = this.a;
            int i2 = this.d;
            j2 = i - i2;
            if (j2 > j) {
                this.d = i2 + ((int) j);
                return j;
            }
            a();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.b.skip(j) : j2;
    }

    private void a() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            C9389of c9389of = this.e;
            if (c9389of != null) {
                c9389of.c(bArr);
            }
        }
    }
}
