package o;

import java.util.List;

/* renamed from: o.aOw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1804aOw {
    public /* synthetic */ AbstractC1804aOw(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.aOw$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1804aOw {
        private final C1255Uq d;

        public final C1255Uq e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.d, ((d) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C1255Uq c1255Uq = this.d;
            return "Implicit(target=" + c1255Uq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1255Uq c1255Uq) {
            super(null);
            C8632dsu.c((Object) c1255Uq, "");
            this.d = c1255Uq;
        }
    }

    private AbstractC1804aOw() {
    }

    /* renamed from: o.aOw$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC1804aOw {
        public static final b b = new b();

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
            return -467127504;
        }

        public String toString() {
            return "Manual";
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: o.aOw$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1804aOw {
        private final List<C1255Uq> a;

        public final List<C1255Uq> c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            List<C1255Uq> list = this.a;
            return "Prompted(targets=" + list + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C1255Uq> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.a = list;
        }
    }
}
