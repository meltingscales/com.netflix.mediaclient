package o;

/* renamed from: o.cwj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7466cwj {

    /* renamed from: o.cwj$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC7466cwj {
        private final C7465cwi c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.c, ((a) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C7465cwi c7465cwi = this.c;
            return "Ad(data=" + c7465cwi + ")";
        }

        public a(C7465cwi c7465cwi) {
            C8632dsu.c((Object) c7465cwi, "");
            this.c = c7465cwi;
        }
    }

    /* renamed from: o.cwj$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC7466cwj {
        public static final d a = new d();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1369127035;
        }

        public String toString() {
            return "NoAd";
        }

        private d() {
        }
    }

    /* renamed from: o.cwj$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC7466cwj {
        public static final b c = new b();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 498560103;
        }

        public String toString() {
            return "Error";
        }

        private b() {
        }
    }
}
