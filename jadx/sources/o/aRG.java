package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aRG extends aRM {
    public static final d b = new d(null);
    private final String c = "57776";
    private final int a = 2;
    private final String d = "Home lolomo on DEPP";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.d;
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_Ab57776_HomeLolomoOnDepp");
        }

        public final boolean e() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(aRG.class);
        }
    }
}
