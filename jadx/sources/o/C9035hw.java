package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.hw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9035hw {
    private final List<a> a;
    private final String b;
    private final Map<String, Object> c;
    private final List<Object> d;
    private final Map<String, Object> e;

    public final Map<String, Object> a() {
        return this.c;
    }

    public final List<Object> b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final List<a> e() {
        return this.a;
    }

    public C9035hw(String str, List<a> list, List<? extends Object> list2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = list;
        this.d = list2;
        this.c = map;
        this.e = map2;
    }

    public String toString() {
        return "Error(message = " + this.b + ", locations = " + this.a + ", path=" + this.d + ", extensions = " + this.c + ", nonStandardFields = " + this.e + ')';
    }

    /* renamed from: o.hw$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final int c;
        private final int d;

        public a(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        public String toString() {
            return "Location(line = " + this.c + ", column = " + this.d + ')';
        }
    }
}
