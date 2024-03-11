package o;

import java.io.IOException;
import java.net.ProtocolException;
import o.C7824dGs;
import o.C7866dIg;

/* loaded from: classes5.dex */
public final class dGO {
    private final AbstractC7820dGo a;
    private final dGQ b;
    private final dGZ c;
    private final dGT d;
    private final dGS e;
    private boolean j;

    public final dGS b() {
        return this.e;
    }

    public final dGQ g() {
        return this.b;
    }

    public final AbstractC7820dGo h() {
        return this.a;
    }

    public final dGT i() {
        return this.d;
    }

    public final boolean j() {
        return this.j;
    }

    public dGO(dGS dgs, AbstractC7820dGo abstractC7820dGo, dGT dgt, dGZ dgz) {
        C8632dsu.d(dgs, "");
        C8632dsu.d(abstractC7820dGo, "");
        C8632dsu.d(dgt, "");
        C8632dsu.d(dgz, "");
        this.e = dgs;
        this.a = abstractC7820dGo;
        this.d = dgt;
        this.c = dgz;
        this.b = dgz.c();
    }

    public final boolean f() {
        return !C8632dsu.c((Object) this.d.a().l().f(), (Object) this.b.m().c().l().f());
    }

    public final void b(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        try {
            this.a.f(this.e);
            this.c.a(c7826dGu);
            this.a.c(this.e, c7826dGu);
        } catch (IOException e) {
            this.a.b(this.e, e);
            c(e);
            throw e;
        }
    }

    public final dIH a(C7826dGu c7826dGu, boolean z) {
        C8632dsu.d(c7826dGu, "");
        this.j = z;
        AbstractC7825dGt b2 = c7826dGu.b();
        if (b2 == null) {
            C8632dsu.e();
        }
        long d = b2.d();
        this.a.e(this.e);
        return new a(this, this.c.e(c7826dGu, d), d);
    }

    public final void d() {
        try {
            this.c.b();
        } catch (IOException e) {
            this.a.b(this.e, e);
            c(e);
            throw e;
        }
    }

    public final void e() {
        try {
            this.c.e();
        } catch (IOException e) {
            this.a.b(this.e, e);
            c(e);
            throw e;
        }
    }

    public final void n() {
        this.a.h(this.e);
    }

    public final C7824dGs.b d(boolean z) {
        try {
            C7824dGs.b e = this.c.e(z);
            if (e != null) {
                e.c(this);
            }
            return e;
        } catch (IOException e2) {
            this.a.c(this.e, e2);
            c(e2);
            throw e2;
        }
    }

    public final void a(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        this.a.d(this.e, c7824dGs);
    }

    public final AbstractC7829dGx d(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        try {
            String c = C7824dGs.c(c7824dGs, "Content-Type", null, 2, null);
            long b2 = this.c.b(c7824dGs);
            return new C7836dHd(c, b2, dIw.e(new b(this, this.c.d(c7824dGs), b2)));
        } catch (IOException e) {
            this.a.c(this.e, e);
            c(e);
            throw e;
        }
    }

    public final C7866dIg.b k() {
        this.e.m();
        return this.c.c().d(this);
    }

    public final void m() {
        b(-1L, true, true, null);
    }

    public final void l() {
        this.c.c().j();
    }

    public final void a() {
        this.c.a();
    }

    public final void c() {
        this.c.a();
        this.e.d(this, true, true, null);
    }

    private final void c(IOException iOException) {
        this.d.d(iOException);
        this.c.c().c(this.e, iOException);
    }

    public final <E extends IOException> E b(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            c(e);
        }
        if (z2) {
            if (e != null) {
                this.a.b(this.e, e);
            } else {
                this.a.b(this.e, j);
            }
        }
        if (z) {
            if (e != null) {
                this.a.c(this.e, e);
            } else {
                this.a.c(this.e, j);
            }
        }
        return (E) this.e.d(this, z2, z, e);
    }

    public final void o() {
        this.e.d(this, true, false, null);
    }

    /* loaded from: classes5.dex */
    final class a extends dIm {
        private boolean a;
        private long b;
        private final long c;
        private boolean d;
        final /* synthetic */ dGO e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dGO dgo, dIH dih, long j) {
            super(dih);
            C8632dsu.d(dih, "");
            this.e = dgo;
            this.c = j;
        }

        @Override // o.dIm, o.dIH
        public void a(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (!(!this.a)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.c;
            if (j2 != -1 && this.b + j > j2) {
                throw new ProtocolException("expected " + this.c + " bytes but received " + (this.b + j));
            }
            try {
                super.a(c7872dIo, j);
                this.b += j;
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // o.dIm, o.dIH, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // o.dIm, o.dIH, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.a) {
                return;
            }
            this.a = true;
            long j = this.c;
            if (j != -1 && this.b != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        private final <E extends IOException> E b(E e) {
            if (this.d) {
                return e;
            }
            this.d = true;
            return (E) this.e.b(this.b, false, true, e);
        }
    }

    /* loaded from: classes5.dex */
    public final class b extends dIt {
        private boolean a;
        private long b;
        private final long c;
        private boolean d;
        final /* synthetic */ dGO e;
        private boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dGO dgo, dIJ dij, long j) {
            super(dij);
            C8632dsu.d(dij, "");
            this.e = dgo;
            this.c = j;
            this.h = true;
            if (j == 0) {
                a(null);
            }
        }

        @Override // o.dIt, o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            if (!(!this.d)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long b = a().b(c7872dIo, j);
                if (this.h) {
                    this.h = false;
                    this.e.h().g(this.e.b());
                }
                if (b == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.b + b;
                long j3 = this.c;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.c + " bytes but received " + j2);
                }
                this.b = j2;
                if (j2 == j3) {
                    a(null);
                }
                return b;
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // o.dIt, o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.d) {
                return;
            }
            this.d = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.a) {
                return e;
            }
            this.a = true;
            if (e == null && this.h) {
                this.h = false;
                this.e.h().g(this.e.b());
            }
            return (E) this.e.b(this.b, true, false, e);
        }
    }
}
