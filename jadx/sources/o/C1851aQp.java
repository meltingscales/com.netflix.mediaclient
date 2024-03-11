package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851aQp extends aRM {
    public static final a b = new a(null);
    private final String a = "30235";
    private final int d = 4;
    private final String c = "Android Cellular Streamer CW Prefetch";

    @Override // o.aRM
    public boolean b() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.a;
    }

    @Override // o.aRM
    /* renamed from: e */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aQp$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean b() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell a() {
            return C1818aPj.e(C1851aQp.class);
        }
    }
}
