package o;

import java.util.List;
import kotlin.text.Regex;

/* renamed from: o.iD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9043iD {
    public static final a a = new a(null);
    private static final Regex b = new Regex("ApolloCacheReference\\{(.*)\\}");
    private static final C9043iD d = new C9043iD("QUERY_ROOT");
    private final String e;

    public final String c() {
        return this.e;
    }

    public C9043iD(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public boolean equals(Object obj) {
        String str = this.e;
        C9043iD c9043iD = obj instanceof C9043iD ? (C9043iD) obj : null;
        return C8632dsu.c((Object) str, (Object) (c9043iD != null ? c9043iD.e : null));
    }

    public String toString() {
        return "CacheKey(" + this.e + ')';
    }

    public final String a() {
        return "ApolloCacheReference{" + this.e + '}';
    }

    /* renamed from: o.iD$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9043iD b(String str) {
            C8632dsu.c((Object) str, "");
            InterfaceC8678dum b = C9043iD.b.b(str);
            List<String> a = b != null ? b.a() : null;
            if (a == null || a.size() <= 1) {
                throw new IllegalArgumentException(("Not a cache reference: " + str + " Must be of the form: ApolloCacheReference{%s}").toString());
            }
            return new C9043iD(a.get(1));
        }

        public final boolean c(String str) {
            C8632dsu.c((Object) str, "");
            return C9043iD.b.e(str);
        }

        public final C9043iD b() {
            return C9043iD.d;
        }
    }
}
