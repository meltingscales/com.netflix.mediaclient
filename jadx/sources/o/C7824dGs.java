package o;

import java.io.Closeable;
import java.util.List;
import o.C7819dGn;
import okhttp3.Protocol;

/* renamed from: o.dGs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7824dGs implements Closeable {
    private final dGO a;
    private final int b;
    private final AbstractC7829dGx c;
    private final C7824dGs d;
    private final C7821dGp e;
    private C7806dGa f;
    private final C7824dGs g;
    private final C7819dGn h;
    private final String i;
    private final C7824dGs j;
    private final long k;
    private final long l;
    private final Protocol n;

    /* renamed from: o  reason: collision with root package name */
    private final C7826dGu f13809o;

    public final int c() {
        return this.b;
    }

    public final C7824dGs d() {
        return this.d;
    }

    public final AbstractC7829dGx e() {
        return this.c;
    }

    public final dGO f() {
        return this.a;
    }

    public final C7824dGs g() {
        return this.j;
    }

    public final String h() {
        return this.i;
    }

    public final C7821dGp i() {
        return this.e;
    }

    public final C7819dGn j() {
        return this.h;
    }

    public final C7824dGs l() {
        return this.g;
    }

    public final Protocol m() {
        return this.n;
    }

    public final C7826dGu n() {
        return this.f13809o;
    }

    public final long o() {
        return this.k;
    }

    public final long s() {
        return this.l;
    }

    public C7824dGs(C7826dGu c7826dGu, Protocol protocol, String str, int i, C7821dGp c7821dGp, C7819dGn c7819dGn, AbstractC7829dGx abstractC7829dGx, C7824dGs c7824dGs, C7824dGs c7824dGs2, C7824dGs c7824dGs3, long j, long j2, dGO dgo) {
        C8632dsu.d(c7826dGu, "");
        C8632dsu.d(protocol, "");
        C8632dsu.d((Object) str, "");
        C8632dsu.d(c7819dGn, "");
        this.f13809o = c7826dGu;
        this.n = protocol;
        this.i = str;
        this.b = i;
        this.e = c7821dGp;
        this.h = c7819dGn;
        this.c = abstractC7829dGx;
        this.j = c7824dGs;
        this.d = c7824dGs2;
        this.g = c7824dGs3;
        this.l = j;
        this.k = j2;
        this.a = dgo;
    }

    public static /* synthetic */ String c(C7824dGs c7824dGs, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c7824dGs.d(str, str2);
    }

    public final String d(String str, String str2) {
        C8632dsu.d((Object) str, "");
        String a = this.h.a(str);
        return a != null ? a : str2;
    }

    public final b k() {
        return new b(this);
    }

    public final List<C7807dGb> a() {
        String str;
        List<C7807dGb> i;
        C7819dGn c7819dGn = this.h;
        int i2 = this.b;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            i = C8569dql.i();
            return i;
        } else {
            str = "Proxy-Authenticate";
        }
        return C7833dHa.d(c7819dGn, str);
    }

    public final C7806dGa b() {
        C7806dGa c7806dGa = this.f;
        if (c7806dGa == null) {
            C7806dGa c = C7806dGa.d.c(this.h);
            this.f = c;
            return c;
        }
        return c7806dGa;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC7829dGx abstractC7829dGx = this.c;
        if (abstractC7829dGx == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC7829dGx.close();
    }

    public String toString() {
        return "Response{protocol=" + this.n + ", code=" + this.b + ", message=" + this.i + ", url=" + this.f13809o.j() + '}';
    }

    /* renamed from: o.dGs$b */
    /* loaded from: classes5.dex */
    public static class b {
        private AbstractC7829dGx a;
        private C7824dGs b;
        private C7821dGp c;
        private int d;
        private dGO e;
        private C7824dGs f;
        private Protocol g;
        private C7824dGs h;
        private C7819dGn.d i;
        private String j;
        private long k;
        private C7826dGu l;
        private long n;

        public b a(String str) {
            C8632dsu.d((Object) str, "");
            this.j = str;
            return this;
        }

        public b b(C7821dGp c7821dGp) {
            this.c = c7821dGp;
            return this;
        }

        public b c(int i) {
            this.d = i;
            return this;
        }

        public b c(long j) {
            this.k = j;
            return this;
        }

        public b c(Protocol protocol) {
            C8632dsu.d(protocol, "");
            this.g = protocol;
            return this;
        }

        public final void c(dGO dgo) {
            C8632dsu.d(dgo, "");
            this.e = dgo;
        }

        public final int d() {
            return this.d;
        }

        public b e(long j) {
            this.n = j;
            return this;
        }

        public b e(C7826dGu c7826dGu) {
            C8632dsu.d(c7826dGu, "");
            this.l = c7826dGu;
            return this;
        }

        public b e(AbstractC7829dGx abstractC7829dGx) {
            this.a = abstractC7829dGx;
            return this;
        }

        public b() {
            this.d = -1;
            this.i = new C7819dGn.d();
        }

        public b(C7824dGs c7824dGs) {
            C8632dsu.d(c7824dGs, "");
            this.d = -1;
            this.l = c7824dGs.n();
            this.g = c7824dGs.m();
            this.d = c7824dGs.c();
            this.j = c7824dGs.h();
            this.c = c7824dGs.i();
            this.i = c7824dGs.j().e();
            this.a = c7824dGs.e();
            this.h = c7824dGs.g();
            this.b = c7824dGs.d();
            this.f = c7824dGs.l();
            this.k = c7824dGs.s();
            this.n = c7824dGs.o();
            this.e = c7824dGs.f();
        }

        public b d(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            this.i.b(str, str2);
            return this;
        }

        public b a(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            this.i.d(str, str2);
            return this;
        }

        public b d(C7819dGn c7819dGn) {
            C8632dsu.d(c7819dGn, "");
            this.i = c7819dGn.e();
            return this;
        }

        public b e(C7824dGs c7824dGs) {
            d("networkResponse", c7824dGs);
            this.h = c7824dGs;
            return this;
        }

        public b a(C7824dGs c7824dGs) {
            d("cacheResponse", c7824dGs);
            this.b = c7824dGs;
            return this;
        }

        private final void d(String str, C7824dGs c7824dGs) {
            if (c7824dGs != null) {
                if (c7824dGs.e() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                } else if (c7824dGs.g() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                } else if (c7824dGs.d() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                } else if (c7824dGs.l() == null) {
                } else {
                    throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                }
            }
        }

        public b c(C7824dGs c7824dGs) {
            b(c7824dGs);
            this.f = c7824dGs;
            return this;
        }

        private final void b(C7824dGs c7824dGs) {
            if (c7824dGs != null && c7824dGs.e() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        public C7824dGs a() {
            int i = this.d;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.d).toString());
            }
            C7826dGu c7826dGu = this.l;
            if (c7826dGu != null) {
                Protocol protocol = this.g;
                if (protocol != null) {
                    String str = this.j;
                    if (str != null) {
                        return new C7824dGs(c7826dGu, protocol, str, i, this.c, this.i.b(), this.a, this.h, this.b, this.f, this.k, this.n, this.e);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
    }
}
