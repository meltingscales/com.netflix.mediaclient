package o;

import java.util.List;

/* renamed from: o.agQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2454agQ implements InterfaceC9037hy {
    private final e a;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final e d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2454agQ) {
            C2454agQ c2454agQ = (C2454agQ) obj;
            return C8632dsu.c((Object) this.e, (Object) c2454agQ.e) && C8632dsu.c(this.a, c2454agQ.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        e eVar = this.a;
        return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.e;
        e eVar = this.a;
        return "LolomoRow(__typename=" + str + ", entities=" + eVar + ")";
    }

    public C2454agQ(String str, e eVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = eVar;
    }

    /* renamed from: o.agQ$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final List<d> a;
        private final String b;

        public final List<d> a() {
            return this.a;
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
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<d> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<d> list = this.a;
            return "Entities(__typename=" + str + ", edges=" + list + ")";
        }

        public e(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = list;
        }
    }

    /* renamed from: o.agQ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Integer a;
        private final String c;
        private final b d;
        private final String e;

        public final b a() {
            return this.d;
        }

        public final Integer b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.a;
            int hashCode3 = num == null ? 0 : num.hashCode();
            b bVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            Integer num = this.a;
            b bVar = this.d;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", index=" + num + ", node=" + bVar + ")";
        }

        public d(String str, String str2, Integer num, b bVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = str2;
            this.a = num;
            this.d = bVar;
        }
    }

    /* renamed from: o.agQ$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String d;

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c((Object) this.d, (Object) ((b) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "Node(__typename=" + str + ")";
        }

        public b(String str) {
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }
}
