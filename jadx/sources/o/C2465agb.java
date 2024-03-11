package o;

import java.util.List;

/* renamed from: o.agb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2465agb implements InterfaceC9037hy {
    private final String a;
    private final c b;
    private final C2529ahm e;

    public final C2529ahm a() {
        return this.e;
    }

    public final c d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2465agb) {
            C2465agb c2465agb = (C2465agb) obj;
            return C8632dsu.c((Object) this.a, (Object) c2465agb.a) && C8632dsu.c(this.b, c2465agb.b) && C8632dsu.c(this.e, c2465agb.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        c cVar = this.b;
        return (((hashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        c cVar = this.b;
        C2529ahm c2529ahm = this.e;
        return "LolomoDownloadsForYouRow(__typename=" + str + ", firstEntity=" + cVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2465agb(String str, c cVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.b = cVar;
        this.e = c2529ahm;
    }

    /* renamed from: o.agb$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final List<b> b;

        public final String a() {
            return this.a;
        }

        public final List<b> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<b> list = this.b;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<b> list = this.b;
            return "FirstEntity(__typename=" + str + ", edges=" + list + ")";
        }

        public c(String str, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = list;
        }
    }

    /* renamed from: o.agb$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2353aee a;
        private final String e;

        public final C2353aee b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2353aee c2353aee = this.a;
            return "Edge(__typename=" + str + ", downloadsForYouRowHeaderData=" + c2353aee + ")";
        }

        public b(String str, C2353aee c2353aee) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2353aee, "");
            this.e = str;
            this.a = c2353aee;
        }
    }
}
