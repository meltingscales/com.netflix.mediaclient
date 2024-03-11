package o;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: o.pc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9439pc extends OutputStream {
    public static final byte[] c = new byte[0];
    private byte[] a;
    private final LinkedList<byte[]> b;
    private int d;
    private final C9382oY e;
    private int i;

    public int a() {
        return this.d;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] d() {
        return this.a;
    }

    public void e(int i) {
        this.d = i;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public C9439pc() {
        this((C9382oY) null);
    }

    public C9439pc(C9382oY c9382oY) {
        this(c9382oY, 500);
    }

    public C9439pc(int i) {
        this(null, i);
    }

    public C9439pc(C9382oY c9382oY, int i) {
        this.b = new LinkedList<>();
        this.e = c9382oY;
        this.a = c9382oY == null ? new byte[i > 131072 ? 131072 : i] : c9382oY.e(2);
    }

    private C9439pc(C9382oY c9382oY, byte[] bArr, int i) {
        this.b = new LinkedList<>();
        this.e = null;
        this.a = bArr;
        this.d = i;
    }

    public static C9439pc e(byte[] bArr, int i) {
        return new C9439pc(null, bArr, i);
    }

    public void c() {
        this.i = 0;
        this.d = 0;
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    public void b() {
        byte[] bArr;
        c();
        C9382oY c9382oY = this.e;
        if (c9382oY == null || (bArr = this.a) == null) {
            return;
        }
        c9382oY.a(2, bArr);
        this.a = null;
    }

    public void a(int i) {
        if (this.d >= this.a.length) {
            g();
        }
        byte[] bArr = this.a;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void c(int i) {
        int i2 = this.d;
        byte[] bArr = this.a;
        int i3 = i2 + 1;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 8);
            this.d = i2 + 2;
            bArr[i3] = (byte) i;
            return;
        }
        a(i >> 8);
        a(i);
    }

    public void d(int i) {
        int i2 = this.d;
        byte[] bArr = this.a;
        int i3 = i2 + 2;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 16);
            bArr[i2 + 1] = (byte) (i >> 8);
            this.d = i2 + 3;
            bArr[i3] = (byte) i;
            return;
        }
        a(i >> 16);
        a(i >> 8);
        a(i);
    }

    public byte[] i() {
        int i = this.i + this.d;
        if (i == 0) {
            return c;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it = this.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.a, 0, bArr, i2, this.d);
        int i3 = i2 + this.d;
        if (i3 != i) {
            throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this.b.isEmpty()) {
            c();
        }
        return bArr;
    }

    public byte[] e() {
        g();
        return this.a;
    }

    public byte[] b(int i) {
        this.d = i;
        return i();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.a.length - this.d, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.a, this.d, min);
                i += min;
                this.d += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            }
            g();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        a(i);
    }

    private void g() {
        int length = this.i + this.a.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.i = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 131072) {
            max = 131072;
        }
        this.b.add(this.a);
        this.a = new byte[max];
        this.d = 0;
    }
}
