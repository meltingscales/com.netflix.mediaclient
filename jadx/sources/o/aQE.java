package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQE extends aRM {
    public static final c d = new c(null);
    private final String c = "49285";
    private final String b = "Irma Search prototype";
    private final int e = 3;

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.b;
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    /* loaded from: classes3.dex */
    public static abstract class a {
        private final boolean a;
        private final String c;
        private final boolean d;
        private final boolean e;

        public /* synthetic */ a(String str, boolean z, boolean z2, boolean z3, C8627dsp c8627dsp) {
            this(str, z, z2, z3);
        }

        public final boolean d() {
            return this.e;
        }

        public final boolean e() {
            return this.a;
        }

        private a(String str, boolean z, boolean z2, boolean z3) {
            this.c = str;
            this.a = z;
            this.e = z2;
            this.d = z3;
        }

        /* loaded from: classes3.dex */
        public static final class c extends a {
            public static final c e = new c();

            private c() {
                super("Control - Without Irma or DEPP", false, false, false, null);
            }
        }

        /* renamed from: o.aQE$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0091a extends a {
            public static final C0091a d = new C0091a();

            private C0091a() {
                super("Search powered by Irma", true, true, false, null);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super("Search powered by Depp, but not Irma", true, false, true, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* loaded from: classes3.dex */
        public final /* synthetic */ class a {
            public static final /* synthetic */ int[] d;

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
                d = iArr;
            }
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final a a() {
            ABTestConfig.Cell e = C1818aPj.e(aQE.class);
            C8632dsu.a(e, "");
            return e(e);
        }

        public final boolean b() {
            return a().e();
        }

        private final a e(ABTestConfig.Cell cell) {
            int i = a.d[cell.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return a.b.a;
                    }
                    return a.c.e;
                }
                return a.C0091a.d;
            }
            return a.c.e;
        }
    }
}
