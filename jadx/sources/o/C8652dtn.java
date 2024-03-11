package o;

/* renamed from: o.dtn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8652dtn extends C8655dtq implements InterfaceC8649dtk<Long> {
    public static final c c = new c(null);
    private static final C8652dtn d = new C8652dtn(1, 0);

    public C8652dtn(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: j */
    public Long h() {
        return Long.valueOf(e());
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: d */
    public Long g() {
        return Long.valueOf(a());
    }

    public boolean e(long j) {
        return e() <= j && j <= a();
    }

    @Override // o.C8655dtq
    public boolean c() {
        return e() > a();
    }

    @Override // o.C8655dtq
    public boolean equals(Object obj) {
        if (obj instanceof C8652dtn) {
            if (!c() || !((C8652dtn) obj).c()) {
                C8652dtn c8652dtn = (C8652dtn) obj;
                if (e() != c8652dtn.e() || a() != c8652dtn.a()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C8655dtq
    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (int) ((31 * (e() ^ (e() >>> 32))) + (a() ^ (a() >>> 32)));
    }

    @Override // o.C8655dtq
    public String toString() {
        return e() + ".." + a();
    }

    /* renamed from: o.dtn$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
