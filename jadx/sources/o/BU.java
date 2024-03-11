package o;

import java.util.List;

/* loaded from: classes2.dex */
public final class BU implements InterfaceC9037hy {
    private final String a;
    private final List<e> b;
    private final String c;
    private final String d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final List<e> d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BU) {
            BU bu = (BU) obj;
            return C8632dsu.c((Object) this.e, (Object) bu.e) && C8632dsu.c((Object) this.a, (Object) bu.a) && C8632dsu.c((Object) this.c, (Object) bu.c) && C8632dsu.c((Object) this.d, (Object) bu.d) && C8632dsu.c(this.b, bu.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.a.hashCode();
        String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        List<e> list = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.d;
        List<e> list = this.b;
        return "StringFieldFragment(__typename=" + str + ", id=" + str2 + ", persistedCacheKey=" + str3 + ", initialValue=" + str4 + ", validations=" + list + ")";
    }

    public BU(String str, String str2, String str3, String str4, List<e> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.b = list;
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final BZ e;

        public final BZ c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            BZ bz = this.e;
            return "Validation(__typename=" + str + ", stringValidationFragment=" + bz + ")";
        }

        public e(String str, BZ bz) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bz, "");
            this.b = str;
            this.e = bz;
        }
    }
}
