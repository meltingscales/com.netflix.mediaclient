package o;

/* renamed from: o.Lh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1014Lh {
    public static final int e = 0;

    public /* synthetic */ AbstractC1014Lh(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC1014Lh() {
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C8632dsu.a(simpleName, "");
        return simpleName;
    }

    /* renamed from: o.Lh$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC1014Lh {
        private final boolean a;

        public e() {
            this(false, 1, null);
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override // o.AbstractC1014Lh
        public String toString() {
            boolean z = this.a;
            return "Icon(isBranded=" + z + ")";
        }

        public e(boolean z) {
            super(null);
            this.a = z;
        }

        public /* synthetic */ e(boolean z, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: o.Lh$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC1014Lh {
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
            return 465797138;
        }

        @Override // o.AbstractC1014Lh
        public String toString() {
            return "Ordered";
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: o.Lh$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1014Lh {
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
            return 1850224153;
        }

        @Override // o.AbstractC1014Lh
        public String toString() {
            return "Unordered";
        }

        private d() {
            super(null);
        }
    }

    /* renamed from: o.Lh$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1014Lh {
        public static final a c = new a();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 315227559;
        }

        @Override // o.AbstractC1014Lh
        public String toString() {
            return "Unstyled";
        }

        private a() {
            super(null);
        }
    }
}
