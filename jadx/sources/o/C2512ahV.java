package o;

import java.util.List;

/* renamed from: o.ahV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2512ahV implements InterfaceC9037hy {
    private final C2315adt c;
    private final List<a> d;
    private final String e;

    public final List<a> a() {
        return this.d;
    }

    public final C2315adt b() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2512ahV) {
            C2512ahV c2512ahV = (C2512ahV) obj;
            return C8632dsu.c((Object) this.e, (Object) c2512ahV.e) && C8632dsu.c(this.d, c2512ahV.d) && C8632dsu.c(this.c, c2512ahV.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        List<a> list = this.d;
        return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.e;
        List<a> list = this.d;
        C2315adt c2315adt = this.c;
        return "PlayerAdvisories(__typename=" + str + ", advisories=" + list + ", broadcastInfo=" + c2315adt + ")";
    }

    public C2512ahV(String str, List<a> list, C2315adt c2315adt) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2315adt, "");
        this.e = str;
        this.d = list;
        this.c = c2315adt;
    }

    /* renamed from: o.ahV$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2570aia d;
        private final String e;

        public final C2570aia a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2570aia c2570aia = this.d;
            return "Advisory(__typename=" + str + ", playerAdvisory=" + c2570aia + ")";
        }

        public a(String str, C2570aia c2570aia) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2570aia, "");
            this.e = str;
            this.d = c2570aia;
        }
    }
}
