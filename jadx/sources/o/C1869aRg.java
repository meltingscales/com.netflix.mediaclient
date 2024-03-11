package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1869aRg extends aRM {
    public static final d e = new d(null);
    private final String d = "54869";
    private final int c = 2;
    private final String b = "A/A Config";

    public static final boolean c() {
        return e.a();
    }

    @Override // o.aRM
    public String d() {
        return this.d;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* renamed from: o.aRg$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1869aRg.class);
        }
    }
}
