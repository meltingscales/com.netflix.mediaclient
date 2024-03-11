package o;

import java.util.List;

/* renamed from: o.aeV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2344aeV implements InterfaceC9037hy {
    private final List<e> a;
    private final String b;
    private final int c;
    private final C2337aeO d;
    private final String e;
    private final String i;

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.b;
    }

    public final C2337aeO d() {
        return this.d;
    }

    public final List<e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2344aeV) {
            C2344aeV c2344aeV = (C2344aeV) obj;
            return C8632dsu.c((Object) this.e, (Object) c2344aeV.e) && this.c == c2344aeV.c && C8632dsu.c((Object) this.i, (Object) c2344aeV.i) && C8632dsu.c((Object) this.b, (Object) c2344aeV.b) && C8632dsu.c(this.a, c2344aeV.a) && C8632dsu.c(this.d, c2344aeV.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.c);
        int hashCode3 = this.i.hashCode();
        String str = this.b;
        int hashCode4 = str == null ? 0 : str.hashCode();
        List<e> list = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        int i = this.c;
        String str2 = this.i;
        String str3 = this.b;
        List<e> list = this.a;
        C2337aeO c2337aeO = this.d;
        return "GameSummary(__typename=" + str + ", gameId=" + i + ", unifiedEntityId=" + str2 + ", title=" + str3 + ", tags=" + list + ", gameContentAdvisory=" + c2337aeO + ")";
    }

    public C2344aeV(String str, int i, String str2, String str3, List<e> list, C2337aeO c2337aeO) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c2337aeO, "");
        this.e = str;
        this.c = i;
        this.i = str2;
        this.b = str3;
        this.a = list;
        this.d = c2337aeO;
    }

    /* renamed from: o.aeV$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String c;

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.c, (Object) eVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            return "Tag(__typename=" + str + ", displayName=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
        }
    }
}
