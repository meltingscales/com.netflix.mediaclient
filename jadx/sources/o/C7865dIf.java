package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import o.C7872dIo;
import okio.ByteString;

/* renamed from: o.dIf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7865dIf implements Closeable {
    private final C7872dIo.d a;
    private final C7872dIo b;
    private final boolean c;
    private final byte[] d;
    private dHX e;
    private final long f;
    private final boolean g;
    private final Random h;
    private final boolean i;
    private final dIq j;
    private final C7872dIo l;
    private boolean m;

    public C7865dIf(boolean z, dIq diq, Random random, boolean z2, boolean z3, long j) {
        C8632dsu.d(diq, "");
        C8632dsu.d(random, "");
        this.c = z;
        this.j = diq;
        this.h = random;
        this.i = z2;
        this.g = z3;
        this.f = j;
        this.b = new C7872dIo();
        this.l = diq.o();
        this.d = z ? new byte[4] : null;
        this.a = z ? new C7872dIo.d() : null;
    }

    public final void a(ByteString byteString) {
        C8632dsu.d(byteString, "");
        b(9, byteString);
    }

    public final void d(ByteString byteString) {
        C8632dsu.d(byteString, "");
        b(10, byteString);
    }

    public final void e(int i, ByteString byteString) {
        ByteString byteString2 = ByteString.e;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                C7864dIe.c.e(i);
            }
            C7872dIo c7872dIo = new C7872dIo();
            c7872dIo.f(i);
            if (byteString != null) {
                c7872dIo.b(byteString);
            }
            byteString2 = c7872dIo.r();
        }
        try {
            b(8, byteString2);
        } finally {
            this.m = true;
        }
    }

    private final void b(int i, ByteString byteString) {
        if (this.m) {
            throw new IOException("closed");
        }
        int k = byteString.k();
        if (k > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.l.c(i | 128);
        if (this.c) {
            this.l.c(k | 128);
            Random random = this.h;
            byte[] bArr = this.d;
            if (bArr == null) {
                C8632dsu.e();
            }
            random.nextBytes(bArr);
            this.l.d(this.d);
            if (k > 0) {
                long D = this.l.D();
                this.l.b(byteString);
                C7872dIo c7872dIo = this.l;
                C7872dIo.d dVar = this.a;
                if (dVar == null) {
                    C8632dsu.e();
                }
                c7872dIo.c(dVar);
                this.a.c(D);
                C7864dIe.c.c(this.a, this.d);
                this.a.close();
            }
        } else {
            this.l.c(k);
            this.l.b(byteString);
        }
        this.j.flush();
    }

    public final void a(int i, ByteString byteString) {
        C8632dsu.d(byteString, "");
        if (this.m) {
            throw new IOException("closed");
        }
        this.b.b(byteString);
        int i2 = i | 128;
        if (this.i && byteString.k() >= this.f) {
            dHX dhx = this.e;
            if (dhx == null) {
                dhx = new dHX(this.g);
                this.e = dhx;
            }
            dhx.c(this.b);
            i2 = i | 192;
        }
        long D = this.b.D();
        this.l.c(i2);
        int i3 = this.c ? 128 : 0;
        if (D <= 125) {
            this.l.c(i3 | ((int) D));
        } else if (D <= 65535) {
            this.l.c(i3 | 126);
            this.l.f((int) D);
        } else {
            this.l.c(i3 | 127);
            this.l.o(D);
        }
        if (this.c) {
            Random random = this.h;
            byte[] bArr = this.d;
            if (bArr == null) {
                C8632dsu.e();
            }
            random.nextBytes(bArr);
            this.l.d(this.d);
            if (D > 0) {
                C7872dIo c7872dIo = this.b;
                C7872dIo.d dVar = this.a;
                if (dVar == null) {
                    C8632dsu.e();
                }
                c7872dIo.c(dVar);
                this.a.c(0L);
                C7864dIe.c.c(this.a, this.d);
                this.a.close();
            }
        }
        this.l.a(this.b, D);
        this.j.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dHX dhx = this.e;
        if (dhx != null) {
            dhx.close();
        }
    }
}
