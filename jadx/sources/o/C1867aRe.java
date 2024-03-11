package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867aRe extends aRM {
    public static final a a = new a(null);
    private final String b = "54621";
    private final int d = 4;
    private final String e = "Search GraphQL Migration With Option 5";

    public static final boolean c() {
        return a.a();
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRe$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        private final boolean a;
        private final String b;
        private final boolean c;
        private final boolean d;
        private final boolean e;

        public /* synthetic */ c(String str, boolean z, boolean z2, boolean z3, boolean z4, C8627dsp c8627dsp) {
            this(str, z, z2, z3, z4);
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean c() {
            return this.e;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }

        private c(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.b = str;
            this.a = z;
            this.e = z2;
            this.c = z3;
            this.d = z4;
        }

        /* renamed from: o.aRe$c$b */
        /* loaded from: classes3.dex */
        public static final class b extends c {
            public static final b b = new b();

            private b() {
                super("Control - Current Production", false, false, false, false, null);
            }
        }

        /* renamed from: o.aRe$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends c {
            public static final a c = new a();

            private a() {
                super("Search Option 5 with UXConfig", true, true, true, false, null);
            }
        }

        /* renamed from: o.aRe$c$d */
        /* loaded from: classes3.dex */
        public static final class d extends c {
            public static final d a = new d();

            private d() {
                super("Search Option 5 without UXconfig", true, true, false, false, null);
            }
        }

        /* renamed from: o.aRe$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0092c extends c {
            public static final C0092c b = new C0092c();

            private C0092c() {
                super("Search Option 3 With UXconfig", true, false, false, true, null);
            }
        }
    }

    /* renamed from: o.aRe$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: o.aRe$a$c */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class c {
            public static final /* synthetic */ int[] e;

            static {
                int[] iArr = new int[ABTestConfig.Cell.values().length];
                try {
                    iArr[ABTestConfig.Cell.CELL_1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_3.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_4.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                e = iArr;
            }
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final c c() {
            ABTestConfig.Cell e = C1818aPj.e(C1867aRe.class);
            C8632dsu.a(e, "");
            return a(e);
        }

        public final boolean a() {
            return c().b();
        }

        public final boolean e() {
            return c().c();
        }

        private final c a(ABTestConfig.Cell cell) {
            int i = c.e[cell.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return c.C0092c.b;
                        }
                        return c.b.b;
                    }
                    return c.d.a;
                }
                return c.a.c;
            }
            return c.b.b;
        }
    }
}
