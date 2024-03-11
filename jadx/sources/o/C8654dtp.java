package o;

/* renamed from: o.dtp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8654dtp extends C8646dth implements InterfaceC8649dtk<Integer> {
    public static final d e = new d(null);
    private static final C8654dtp b = new C8654dtp(1, 0);

    public C8654dtp(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: f */
    public Integer h() {
        return Integer.valueOf(d());
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: i */
    public Integer g() {
        return Integer.valueOf(e());
    }

    public boolean a(int i) {
        return d() <= i && i <= e();
    }

    @Override // o.C8646dth
    public boolean b() {
        return d() > e();
    }

    @Override // o.C8646dth
    public boolean equals(Object obj) {
        if (obj instanceof C8654dtp) {
            if (!b() || !((C8654dtp) obj).b()) {
                C8654dtp c8654dtp = (C8654dtp) obj;
                if (d() != c8654dtp.d() || e() != c8654dtp.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C8646dth
    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (d() * 31) + e();
    }

    @Override // o.C8646dth
    public String toString() {
        return d() + ".." + e();
    }

    /* renamed from: o.dtp$d */
    /* loaded from: classes.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C8654dtp d() {
            return C8654dtp.b;
        }
    }
}
