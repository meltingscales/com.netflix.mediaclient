package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.io.ByteArrayOutputStream;

/* renamed from: o.xN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9827xN extends ByteArrayOutputStream {
    private final C9819xF a;

    public C9827xN(C9819xF c9819xF, int i) {
        this.a = c9819xF;
        ((ByteArrayOutputStream) this).buf = c9819xF.d(Math.max(i, (int) JSONzip.end));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.a.a(((ByteArrayOutputStream) this).buf);
    }

    private void c(int i) {
        int i2 = ((ByteArrayOutputStream) this).count + i;
        if (i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] d = this.a.d(i2 * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, d, 0, ((ByteArrayOutputStream) this).count);
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = d;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            c(i2);
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        synchronized (this) {
            c(1);
            super.write(i);
        }
    }
}
