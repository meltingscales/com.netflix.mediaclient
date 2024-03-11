package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQX extends aRM {
    public static final a d = new a(null);
    private final String c = "53194";
    private final int e = 2;
    private final String a = "Config_Ab53194_LimitFHDStreamsOnDisplayCapability";

    public static final boolean c() {
        return d.b();
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_Ab53194_LimitFHDStreamsOnDisplayCapability");
        }

        public final boolean b() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell e() {
            ABTestConfig.Cell e = C1818aPj.e(aQX.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
