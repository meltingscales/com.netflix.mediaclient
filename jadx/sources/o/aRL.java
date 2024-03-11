package o;

import o.C1858aQw;
import o.C1859aQx;
import o.C1861aQz;

/* loaded from: classes.dex */
public final class aRL {
    public static final e e = new e(null);
    private static final a b = new a("Control", false, false);

    public static final a a() {
        return e.a();
    }

    /* loaded from: classes.dex */
    public static final class a {
        private final boolean a;
        private final String d;
        private final boolean e;

        public final boolean d() {
            return this.e;
        }

        public final boolean e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && this.a == aVar.a && this.e == aVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.a;
            boolean z2 = this.e;
            return "Features(friendlyName=" + str + ", updatedMetadataPrefetching=" + z + ", prefetchLolomoImages=" + z2 + ")";
        }

        public a(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = z;
            this.e = z2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final a b() {
            return aRL.b;
        }

        public final a a() {
            C1859aQx.e eVar = C1859aQx.b;
            if (eVar.a()) {
                return eVar.d();
            }
            C1861aQz.d dVar = C1861aQz.a;
            if (dVar.c()) {
                return dVar.e();
            }
            C1858aQw.d dVar2 = C1858aQw.a;
            if (dVar2.a()) {
                return dVar2.b();
            }
            return b();
        }

        public final int c() {
            return C8151dev.f() ? 6 : 4;
        }
    }
}
