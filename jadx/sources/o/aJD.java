package o;

import android.app.ActivityManager;
import android.content.Context;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aJD extends aJJ {
    public static final c a = new c(null);
    private ActivityManager.MemoryInfo e;

    @Override // o.aJJ, o.AbstractC1660aJn
    public void a() {
    }

    @Override // o.aJJ, o.AbstractC1660aJn
    public boolean e() {
        return this.e != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJD(InterfaceC1662aJp interfaceC1662aJp) {
        super(CaptureType.i, interfaceC1662aJp, 0L, 4, null);
        C8632dsu.c((Object) interfaceC1662aJp, "");
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SystemMemoryCapture");
        }
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        super.j();
        this.e = new ActivityManager.MemoryInfo();
        C1332Xp c1332Xp = C1332Xp.b;
        Object systemService = ((Context) C1332Xp.b(Context.class)).getSystemService("activity");
        C8632dsu.d(systemService);
        ((ActivityManager) systemService).getMemoryInfo(this.e);
    }

    @Override // o.AbstractC1660aJn
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = this.e;
        if (memoryInfo != null) {
            jSONObject.put("deviceTotalMemMB", memoryInfo.totalMem);
            jSONObject.put("sAvailMem", memoryInfo.availMem);
            jSONObject.put("sTotalMem", memoryInfo.totalMem);
            jSONObject.put("sLowMem", memoryInfo.lowMemory);
        }
        return jSONObject;
    }
}
