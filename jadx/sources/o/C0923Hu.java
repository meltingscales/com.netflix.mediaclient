package o;

/* renamed from: o.Hu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0923Hu implements InterfaceC0909Hg {
    public static final d e = new d(null);
    private final C0918Hp c;
    private final C0918Hp d;

    public C0923Hu(C0915Hm c0915Hm, long j) {
        C8632dsu.c((Object) c0915Hm, "");
        this.c = new C0918Hp(c0915Hm, "DELETE FROM falcor_leafs WHERE path = ?", j);
        this.d = new C0918Hp(c0915Hm, "DELETE FROM falcor_leafs WHERE path LIKE ?", j);
    }

    /* renamed from: o.Hu$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SqliteDiskCacheDeleter");
        }
    }

    @Override // o.InterfaceC0911Hi
    public void b(boolean z) {
        this.c.b(z);
        this.d.b(z);
    }

    @Override // o.InterfaceC0911Hi, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
        this.d.close();
    }

    @Override // o.InterfaceC0909Hg
    public void e(String str) {
        C8632dsu.c((Object) str, "");
        this.d.e(str);
    }
}
