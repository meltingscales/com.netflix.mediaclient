package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.dks  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8414dks extends FilterInputStream {
    protected int b;
    protected int c;
    protected byte[] d;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public C8414dks(InputStream inputStream) {
        super(inputStream);
        this.d = null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        if (((FilterInputStream) this).in != null) {
            int i2 = this.c;
            if (i2 < this.b) {
                byte[] bArr = this.d;
                this.c = i2 + 1;
                return bArr[i2];
            }
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                return -1;
            }
            byte[] bArr2 = this.d;
            if (bArr2 != null) {
                int i3 = this.b;
                if (i3 < bArr2.length) {
                    this.b = i3 + 1;
                    bArr2[i3] = (byte) read;
                    i = this.c + 1;
                } else {
                    this.d = null;
                    i = 0;
                    this.b = 0;
                }
                this.c = i;
            }
            return read;
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (((FilterInputStream) this).in == null) {
            throw new IOException("Stream is closed");
        }
        int i4 = this.b;
        int i5 = this.c;
        if (i4 > i5) {
            i3 = Math.min(i4 - i5, i2);
            System.arraycopy(this.d, this.c, bArr, i, i3);
            this.c += i3;
        } else {
            i3 = 0;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i + i3, i2 - i3);
        if (read == -1) {
            if (i3 > 0) {
                return i3;
            }
            return -1;
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            if (this.b + read <= bArr2.length) {
                System.arraycopy(bArr, i3, bArr2, this.c, read);
                this.b += read;
                this.c += read;
            } else {
                this.d = null;
                this.b = 0;
                this.c = 0;
            }
        }
        return i3 + read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (((FilterInputStream) this).in != null) {
            int i = this.b;
            int i2 = this.c;
            long j2 = i - i2;
            if (j2 >= j) {
                this.c = (int) (i2 + j);
                return j;
            }
            this.c = (int) (i2 + j2);
            long j3 = j - j2;
            while (j3 > 0) {
                int i3 = (int) j3;
                int read = read(new byte[i3], 0, i3);
                if (read == -1) {
                    break;
                }
                j3 -= read;
            }
            return j - j3;
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null) {
            throw new IOException("Stream is closed");
        }
        int available = this.b + ((FilterInputStream) this).in.available();
        if (available < 0) {
            return Integer.MAX_VALUE;
        }
        return available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.d;
        int i2 = bArr2 != null ? this.b - this.c : 0;
        if (i2 > 0) {
            System.arraycopy(bArr2, this.c, bArr, 0, i2);
        }
        this.d = bArr;
        this.c = 0;
        this.b = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in == null) {
            throw new IOException("Stream is closed");
        }
        this.c = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.close();
            ((FilterInputStream) this).in = null;
        }
    }
}
