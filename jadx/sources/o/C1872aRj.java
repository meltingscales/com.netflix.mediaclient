package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872aRj extends aRM {
    public static final c c = new c(null);
    private final String b = "55123";
    private final int a = 7;
    private final String d = "Prequery Search Page Variations on Page Platform";

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.d;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    /* renamed from: o.aRj$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private final String a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final boolean h;
        private final boolean i;
        private final boolean j;

        public /* synthetic */ b(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C8627dsp c8627dsp) {
            this(str, z, z2, z3, z4, z5, z6, z7);
        }

        public final boolean a() {
            return this.c;
        }

        public final boolean c() {
            return this.h;
        }

        private b(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.h = z3;
            this.j = z4;
            this.i = z5;
            this.d = z6;
            this.e = z7;
        }

        /* renamed from: o.aRj$b$d */
        /* loaded from: classes3.dex */
        public static final class d extends b {
            public static final d e = new d();

            private d() {
                super("Control - Current Production on Falcor", true, false, false, false, false, false, false, null);
            }
        }

        /* renamed from: o.aRj$b$c */
        /* loaded from: classes3.dex */
        public static final class c extends b {
            public static final c d = new c();

            private c() {
                super("PQS On Depp", false, true, false, false, false, false, false, null);
            }
        }

        /* renamed from: o.aRj$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0093b extends b {
            public static final C0093b b = new C0093b();

            private C0093b() {
                super("PQS On Depp via Page Platform", false, false, true, false, false, false, false, null);
            }
        }

        /* renamed from: o.aRj$b$i */
        /* loaded from: classes3.dex */
        public static final class i extends b {
            public static final i a = new i();

            private i() {
                super("PQS to include Trending Now", false, false, true, true, false, false, false, null);
            }
        }

        /* renamed from: o.aRj$b$j */
        /* loaded from: classes3.dex */
        public static final class j extends b {
            public static final j b = new j();

            private j() {
                super("PQS to include Top Searches as Gallery", false, false, true, false, true, false, false, null);
            }
        }

        /* renamed from: o.aRj$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super("PQS to include Lolomo Style UI", false, false, true, false, false, true, false, null);
            }
        }

        /* renamed from: o.aRj$b$e */
        /* loaded from: classes3.dex */
        public static final class e extends b {
            public static final e e = new e();

            private e() {
                super("PQS Tertiary control w/ Games Enabled", false, false, true, false, false, true, true, null);
            }
        }
    }

    /* renamed from: o.aRj$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: o.aRj$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class C0094c {
            public static final /* synthetic */ int[] b;

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
                try {
                    iArr[ABTestConfig.Cell.CELL_5.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_6.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_7.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                b = iArr;
            }
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final b a() {
            ABTestConfig.Cell e = C1818aPj.e(C1872aRj.class);
            C8632dsu.a(e, "");
            return b(e);
        }

        public final boolean c() {
            return a().c() || a().a();
        }

        private final b b(ABTestConfig.Cell cell) {
            switch (C0094c.b[cell.ordinal()]) {
                case 1:
                    return b.d.e;
                case 2:
                    return b.c.d;
                case 3:
                    return b.C0093b.b;
                case 4:
                    return b.i.a;
                case 5:
                    return b.j.b;
                case 6:
                    return b.a.a;
                case 7:
                    return b.e.e;
                default:
                    return b.d.e;
            }
        }
    }
}
