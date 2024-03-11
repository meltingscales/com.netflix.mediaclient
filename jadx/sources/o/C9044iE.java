package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.iE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9044iE {
    public static final c b = new c(null);
    public static final C9044iE d;
    private final Map<String, String> a;

    public C9044iE(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        this.a = map;
    }

    /* renamed from: o.iE$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Map<String, String> b = new LinkedHashMap();

        public final b d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b.put(str, str2);
            return this;
        }

        public final b e(Map<String, String> map) {
            C8632dsu.c((Object) map, "");
            this.b.putAll(map);
            return this;
        }

        public final C9044iE e() {
            return new C9044iE(this.b);
        }
    }

    public final b d() {
        return b.d().e(this.a);
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.get(str);
    }

    public final boolean c(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.containsKey(str);
    }

    /* renamed from: o.iE$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final b d() {
            return new b();
        }
    }

    static {
        Map d2;
        d2 = dqE.d();
        d = new C9044iE(d2);
    }

    public final C9044iE a(C9044iE c9044iE) {
        C8632dsu.c((Object) c9044iE, "");
        return d().e(c9044iE.a).e();
    }
}
