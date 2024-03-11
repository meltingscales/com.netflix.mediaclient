package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1880aRr extends aRM {
    public static final b b = new b(null);
    private final String e = "56801";
    private final int a = 2;
    private final String d = "Playback Error Interstitials";

    public static final boolean c() {
        return b.b();
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.d;
    }

    /* renamed from: o.aRr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean b() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(C1880aRr.class);
        }
    }
}
