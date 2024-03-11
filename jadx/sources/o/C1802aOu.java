package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.aOu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1802aOu {
    private static final e b = new e(null);
    private final Map<String, aOD> d;
    private final CdxAgentImpl e;

    public C1802aOu(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.e = cdxAgentImpl;
        this.d = new LinkedHashMap();
    }

    /* renamed from: o.aOu$e */
    /* loaded from: classes3.dex */
    static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_pairing_observer");
        }
    }

    public final void e(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        if (this.d.get(c1255Uq.a()) != null) {
            b.getLogTag();
            return;
        }
        b.getLogTag();
        Integer b2 = this.e.b(c1255Uq);
        if (b2 == null) {
            return;
        }
        this.d.put(c1255Uq.a(), new aOD(c1255Uq, b2.intValue(), false, 4, null));
    }

    public final void d(String str, int i) {
        C1255Uq m;
        C8632dsu.c((Object) str, "");
        aOD aod = this.d.get(str);
        if (aod == null) {
            return;
        }
        e eVar = b;
        eVar.getLogTag();
        if (i == aod.e() && (m = this.e.m()) != null) {
            if (C8632dsu.c((Object) m.b(), (Object) aod.b().b())) {
                eVar.getLogTag();
                boolean c = C8632dsu.c((Object) aod.b().e(), (Object) this.e.j());
                eVar.getLogTag();
                aOV configurationAgent = this.e.getConfigurationAgent();
                if (configurationAgent != null) {
                    String m2 = configurationAgent.w().m();
                    C8632dsu.a(m2, "");
                    C8159dfC.c(new aNC(str, m2, c));
                }
            }
        }
    }
}
