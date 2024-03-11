package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C7819dGn;

/* renamed from: o.dGu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7826dGu {
    private final String a;
    private final Map<Class<?>, Object> b;
    private final C7819dGn c;
    private final AbstractC7825dGt d;
    private C7806dGa e;
    private final C7818dGm i;

    public final AbstractC7825dGt b() {
        return this.d;
    }

    public final C7819dGn c() {
        return this.c;
    }

    public final Map<Class<?>, Object> d() {
        return this.b;
    }

    public final String i() {
        return this.a;
    }

    public final C7818dGm j() {
        return this.i;
    }

    public C7826dGu(C7818dGm c7818dGm, String str, C7819dGn c7819dGn, AbstractC7825dGt abstractC7825dGt, Map<Class<?>, ? extends Object> map) {
        C8632dsu.d(c7818dGm, "");
        C8632dsu.d((Object) str, "");
        C8632dsu.d(c7819dGn, "");
        C8632dsu.d(map, "");
        this.i = c7818dGm;
        this.a = str;
        this.c = c7819dGn;
        this.d = abstractC7825dGt;
        this.b = map;
    }

    public final boolean a() {
        return this.i.i();
    }

    public final String a(String str) {
        C8632dsu.d((Object) str, "");
        return this.c.a(str);
    }

    public final List<String> c(String str) {
        C8632dsu.d((Object) str, "");
        return this.c.b(str);
    }

    public final b g() {
        return new b(this);
    }

    public final C7806dGa e() {
        C7806dGa c7806dGa = this.e;
        if (c7806dGa == null) {
            C7806dGa c = C7806dGa.d.c(this.c);
            this.e = c;
            return c;
        }
        return c7806dGa;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.i);
        if (this.c.c() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.c) {
                if (i < 0) {
                    C8569dql.h();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String b2 = pair2.b();
                String c = pair2.c();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(b2);
                sb.append(':');
                sb.append(c);
                i++;
            }
            sb.append(']');
        }
        if (!this.b.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.b);
        }
        sb.append('}');
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }

    /* renamed from: o.dGu$b */
    /* loaded from: classes5.dex */
    public static class b {
        private Map<Class<?>, Object> a;
        private String b;
        private C7818dGm c;
        private AbstractC7825dGt d;
        private C7819dGn.d e;

        public b a(C7818dGm c7818dGm) {
            C8632dsu.d(c7818dGm, "");
            this.c = c7818dGm;
            return this;
        }

        public b() {
            this.a = new LinkedHashMap();
            this.b = "GET";
            this.e = new C7819dGn.d();
        }

        public b(C7826dGu c7826dGu) {
            Map<Class<?>, Object> k;
            C8632dsu.d(c7826dGu, "");
            this.a = new LinkedHashMap();
            this.c = c7826dGu.j();
            this.b = c7826dGu.i();
            this.d = c7826dGu.b();
            if (c7826dGu.d().isEmpty()) {
                k = new LinkedHashMap<>();
            } else {
                k = dqE.k(c7826dGu.d());
            }
            this.a = k;
            this.e = c7826dGu.c().e();
        }

        public b a(String str) {
            boolean b;
            boolean b2;
            C8632dsu.d((Object) str, "");
            b = C8691duz.b(str, "ws:", true);
            if (b) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                C8632dsu.b(substring, "");
                sb.append(substring);
                str = sb.toString();
            } else {
                b2 = C8691duz.b(str, "wss:", true);
                if (b2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https:");
                    String substring2 = str.substring(4);
                    C8632dsu.b(substring2, "");
                    sb2.append(substring2);
                    str = sb2.toString();
                }
            }
            return a(C7818dGm.a.c(str));
        }

        public b a(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            this.e.b(str, str2);
            return this;
        }

        public b e(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            this.e.d(str, str2);
            return this;
        }

        public b b(String str) {
            C8632dsu.d((Object) str, "");
            this.e.d(str);
            return this;
        }

        public b b(C7819dGn c7819dGn) {
            C8632dsu.d(c7819dGn, "");
            this.e = c7819dGn.e();
            return this;
        }

        public b b() {
            return e("GET", (AbstractC7825dGt) null);
        }

        public b c(AbstractC7825dGt abstractC7825dGt) {
            C8632dsu.d(abstractC7825dGt, "");
            return e("POST", abstractC7825dGt);
        }

        public b e(String str, AbstractC7825dGt abstractC7825dGt) {
            C8632dsu.d((Object) str, "");
            if (str.length() > 0) {
                if (abstractC7825dGt == null) {
                    if (!(!C7835dHc.b(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!C7835dHc.c(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.b = str;
                this.d = abstractC7825dGt;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public C7826dGu a() {
            C7818dGm c7818dGm = this.c;
            if (c7818dGm != null) {
                return new C7826dGu(c7818dGm, this.b, this.e.b(), this.d, dGB.e(this.a));
            }
            throw new IllegalStateException("url == null".toString());
        }
    }
}
