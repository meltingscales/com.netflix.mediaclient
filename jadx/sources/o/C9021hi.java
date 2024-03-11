package o;

/* renamed from: o.hi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9021hi {
    private final boolean a;
    private final String b;
    private final boolean c;
    private final AbstractC8997hK<Object> d;

    public /* synthetic */ C9021hi(String str, AbstractC8997hK abstractC8997hK, boolean z, boolean z2, C8627dsp c8627dsp) {
        this(str, abstractC8997hK, z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final AbstractC8997hK<Object> b() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    private C9021hi(String str, AbstractC8997hK<? extends Object> abstractC8997hK, boolean z, boolean z2) {
        this.b = str;
        this.d = abstractC8997hK;
        this.c = z;
        this.a = z2;
    }

    /* renamed from: o.hi$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private boolean b;
        private AbstractC8997hK<? extends Object> c;
        private final String d;
        private boolean e;

        public d(String str) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = AbstractC8997hK.d.d();
        }

        public final d b(Object obj) {
            this.c = AbstractC8997hK.d.e(obj);
            return this;
        }

        public final C9021hi b() {
            return new C9021hi(this.d, this.c, this.b, this.e, null);
        }
    }
}
