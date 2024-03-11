package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878aRp extends aRM {
    public static final a d = new a(null);
    private final String b = "56540";
    private final int a = 4;
    private final String e = "Play Delay Headers";

    public static final boolean c() {
        return d.c();
    }

    public static final boolean h() {
        return d.e();
    }

    public static final boolean j() {
        return d.a();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: l */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRp$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: o.aRp$a$d */
        /* loaded from: classes6.dex */
        public final /* synthetic */ class d {
            public static final /* synthetic */ int[] e;

            static {
                int[] iArr = new int[ABTestConfig.Cell.values().length];
                try {
                    iArr[ABTestConfig.Cell.CELL_2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_4.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ABTestConfig.Cell.CELL_3.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                e = iArr;
            }
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean e() {
            return b() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean a() {
            ABTestConfig.Cell b = b();
            int i = b == null ? -1 : d.e[b.ordinal()];
            return i == 1 || i == 2;
        }

        public final boolean c() {
            ABTestConfig.Cell b = b();
            int i = b == null ? -1 : d.e[b.ordinal()];
            return i == 2 || i == 3;
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(C1878aRp.class);
        }
    }
}
