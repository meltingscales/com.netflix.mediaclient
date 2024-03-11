package o;

import java.nio.ByteBuffer;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dID implements dIq {
    public final C7872dIo b;
    public boolean c;
    public final dIH e;

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // o.dIq
    public C7872dIo o() {
        return this.b;
    }

    public dID(dIH dih) {
        C8632dsu.c((Object) dih, "");
        this.e = dih;
        this.b = new C7872dIo();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        C8632dsu.c((Object) byteBuffer, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.b.write(byteBuffer);
        j();
        return write;
    }

    @Override // o.dIH
    public void a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.a(c7872dIo, j);
        j();
    }

    @Override // o.dIq
    public dIq b(ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.b(byteString);
        return j();
    }

    @Override // o.dIq
    public dIq b(String str) {
        C8632dsu.c((Object) str, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.b(str);
        return j();
    }

    @Override // o.dIq
    public dIq c(String str, int i, int i2) {
        C8632dsu.c((Object) str, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.c(str, i, i2);
        return j();
    }

    @Override // o.dIq
    public dIq d(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.d(bArr);
        return j();
    }

    @Override // o.dIq
    public dIq e(byte[] bArr, int i, int i2) {
        C8632dsu.c((Object) bArr, "");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.e(bArr, i, i2);
        return j();
    }

    @Override // o.dIq
    public dIq c(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.c(i);
        return j();
    }

    @Override // o.dIq
    public dIq f(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.f(i);
        return j();
    }

    @Override // o.dIq
    public dIq h(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.h(i);
        return j();
    }

    @Override // o.dIq
    public dIq k(long j) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.k(j);
        return j();
    }

    @Override // o.dIq
    public dIq l(long j) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.l(j);
        return j();
    }

    @Override // o.dIq
    public dIq j() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        long b = this.b.b();
        if (b > 0) {
            this.e.a(this.b, b);
        }
        return this;
    }

    @Override // o.dIq
    public dIq i() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        long D = this.b.D();
        if (D > 0) {
            this.e.a(this.b, D);
        }
        return this;
    }

    @Override // o.dIq, o.dIH, java.io.Flushable
    public void flush() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.b.D() > 0) {
            dIH dih = this.e;
            C7872dIo c7872dIo = this.b;
            dih.a(c7872dIo, c7872dIo.D());
        }
        this.e.flush();
    }

    @Override // o.dIH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        try {
            if (this.b.D() > 0) {
                dIH dih = this.e;
                C7872dIo c7872dIo = this.b;
                dih.a(c7872dIo, c7872dIo.D());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.e.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.dIH
    public dIK e() {
        return this.e.e();
    }

    public String toString() {
        return "buffer(" + this.e + ')';
    }
}
