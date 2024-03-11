package o;

import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aJC extends aJJ implements aJF {
    public static final c c = new c(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJC(InterfaceC1662aJp interfaceC1662aJp) {
        super(CaptureType.e, interfaceC1662aJp, 10000L);
        C8632dsu.c((Object) interfaceC1662aJp, "");
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("RuntimeMemoryCapture");
        }
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        super.j();
        Runtime runtime = Runtime.getRuntime();
        b(runtime.freeMemory() / 1048576.0d, runtime.totalMemory() / 1048576.0d, runtime.maxMemory() / 1048576.0d);
    }

    public final void b(double d, double d2, double d3) {
        if (d2 == 0.0d) {
            return;
        }
        double d4 = d2 - d;
        if (d4 <= 0.0d) {
            return;
        }
        b("vmUsedMemoryMB", d4);
        b("rAvailMem", d);
        b("vmPeakMemoryMB", d2);
        b("rMaxMem", d3);
    }

    @Override // o.AbstractC1660aJn
    public JSONObject c() {
        SummaryStatistics a;
        JSONObject jSONObject = new JSONObject();
        C1667aJu c1667aJu = g().get("rMaxMem");
        if (c1667aJu != null && (a = c1667aJu.a()) != null) {
            jSONObject.put("vmMemoryLimitMB", a.getMax());
        }
        return jSONObject;
    }
}
