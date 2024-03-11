package o;

import o.InterfaceC1730aMc;

/* renamed from: o.aHl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1604aHl {
    public static final a e = new a(null);
    private final C1606aHn a;
    private final C1606aHn b;
    private final C1606aHn c;

    public C1604aHl() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1604aHl) {
            C1604aHl c1604aHl = (C1604aHl) obj;
            return C8632dsu.c(this.b, c1604aHl.b) && C8632dsu.c(this.c, c1604aHl.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        C1606aHn c1606aHn = this.b;
        C1606aHn c1606aHn2 = this.c;
        return "EventLoggerState(shouldLog=" + c1606aHn + ", shouldLogHighVolume=" + c1606aHn2 + ")";
    }

    public C1604aHl(C1606aHn c1606aHn, C1606aHn c1606aHn2) {
        C8632dsu.c((Object) c1606aHn, "");
        C8632dsu.c((Object) c1606aHn2, "");
        this.b = c1606aHn;
        this.c = c1606aHn2;
        this.a = new C1606aHn(true, 100);
    }

    public /* synthetic */ C1604aHl(C1606aHn c1606aHn, C1606aHn c1606aHn2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C1606aHn(false, 0) : c1606aHn, (i & 2) != 0 ? new C1606aHn(false, 0) : c1606aHn2);
    }

    /* renamed from: o.aHl$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C1604aHl a(int i, int i2, boolean z) {
            boolean e;
            InterfaceC1730aMc.b bVar = InterfaceC1730aMc.c;
            boolean e2 = bVar.e(i);
            if (z) {
                i2 = i;
                e = e2;
            } else {
                e = bVar.e(i2);
            }
            return new C1604aHl(new C1606aHn(e2, i), new C1606aHn(e, i2));
        }
    }

    public final C1606aHn e(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        return c1596aHd.d ? this.a : c1596aHd.b ? this.c : this.b;
    }
}
