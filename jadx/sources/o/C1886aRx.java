package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886aRx extends aRM {
    public static final a d = new a(null);
    private final String b = "57277";
    private final int e = 5;
    private final String a = "AppbootConfig";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.a;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    /* renamed from: o.aRx$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {

        /* renamed from: o.aRx$a$c */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ABTestConfig.Cell.values().length];
                try {
                    iArr[ABTestConfig.Cell.CELL_1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_3.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_5.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_4.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final int b() {
            return 1000;
        }

        private a() {
            super("Config_Ab57277_AppbootConfig");
        }

        public final boolean c() {
            return h() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean a() {
            int i = c.a[h().ordinal()];
            return i == 1 || i == 2 || i == 3;
        }

        public final boolean e() {
            int i = c.a[h().ordinal()];
            return i == 1 || i == 4;
        }

        public final int d() {
            int i = c.a[h().ordinal()];
            return (i == 3 || i == 5) ? 3 : 0;
        }

        private final ABTestConfig.Cell h() {
            ABTestConfig.Cell e = C1818aPj.e(C1886aRx.class);
            getLogTag();
            C8632dsu.d(e);
            return e;
        }
    }
}
