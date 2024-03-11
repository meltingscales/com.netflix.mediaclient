package o;

/* renamed from: o.dtc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8641dtc extends C8642dtd implements InterfaceC8649dtk<Character> {
    public static final a e = new a(null);
    private static final C8641dtc b = new C8641dtc(1, 0);

    public C8641dtc(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: j */
    public Character h() {
        return Character.valueOf(e());
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: c */
    public Character g() {
        return Character.valueOf(d());
    }

    public boolean b(char c) {
        return C8632dsu.d(e(), c) <= 0 && C8632dsu.d(c, d()) <= 0;
    }

    @Override // o.C8642dtd
    public boolean a() {
        return C8632dsu.d(e(), d()) > 0;
    }

    @Override // o.C8642dtd
    public boolean equals(Object obj) {
        if (obj instanceof C8641dtc) {
            if (!a() || !((C8641dtc) obj).a()) {
                C8641dtc c8641dtc = (C8641dtc) obj;
                if (e() != c8641dtc.e() || d() != c8641dtc.d()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C8642dtd
    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (e() * 31) + d();
    }

    @Override // o.C8642dtd
    public String toString() {
        return e() + ".." + d();
    }

    /* renamed from: o.dtc$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
