package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQK extends aRM {
    public static final d d = new d(null);
    private final String e = "49589";
    private final int c = 2;
    private final String a = "Enable AV1 Playback on Widevine L3 Devices";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.a;
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_Ab48258_AmbientLightMonitor");
        }

        public final boolean a() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell d() {
            ABTestConfig.Cell e = C1818aPj.e(aQK.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
