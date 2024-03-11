package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873aRk extends aRM {
    public static final e a = new e(null);
    private final String d = "56069";
    private final int b = 2;
    private final String c = "Irma Full search migration";

    public static final boolean c() {
        return a.b();
    }

    @Override // o.aRM
    public String d() {
        return this.d;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aRk$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private final boolean b;
        private final boolean c;
        private final String d;

        public /* synthetic */ b(String str, boolean z, boolean z2, C8627dsp c8627dsp) {
            this(str, z, z2);
        }

        public final boolean d() {
            return this.b;
        }

        private b(String str, boolean z, boolean z2) {
            this.d = str;
            this.b = z;
            this.c = z2;
        }

        /* renamed from: o.aRk$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends b {
            public static final a c = new a();

            private a() {
                super("Control - Current Production", false, false, null);
            }
        }

        /* renamed from: o.aRk$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0095b extends b {
            public static final C0095b c = new C0095b();

            private C0095b() {
                super("Irma full search enabled", true, true, null);
            }
        }
    }

    /* renamed from: o.aRk$e */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: o.aRk$e$c */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class c {
            public static final /* synthetic */ int[] c;

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
                c = iArr;
            }
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final b c() {
            ABTestConfig.Cell e = C1818aPj.e(C1873aRk.class);
            C8632dsu.a(e, "");
            return a(e);
        }

        public final boolean b() {
            return c().d();
        }

        private final b a(ABTestConfig.Cell cell) {
            int i = c.c[cell.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return b.C0095b.c;
                }
                return b.a.c;
            }
            return b.a.c;
        }
    }
}
