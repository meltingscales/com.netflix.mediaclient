package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ServiceTokenCAD;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: o.aZu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2098aZu implements InterfaceC5132bsw {
    private final aYD d;
    private final AtomicInteger h;
    private JSONObject i;
    private final AtomicLong j;
    public static final d c = new d(null);
    private static final String a = "nf_msl_cad";
    private static final long b = 60000;
    private static final String e = "count";

    @Override // o.InterfaceC5132bsw
    public JSONObject a() {
        return this.i;
    }

    public C2098aZu(aYD ayd) {
        C8632dsu.c((Object) ayd, "");
        this.d = ayd;
        this.h = new AtomicInteger(0);
        this.j = new AtomicLong(0L);
        f();
    }

    /* renamed from: o.aZu$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.InterfaceC5132bsw
    public boolean b() {
        Config_FastProperty_ServiceTokenCAD.c cVar = Config_FastProperty_ServiceTokenCAD.Companion;
        if (cVar.d()) {
            C1044Mm.j(a, "CAD service token is disabled by configuration.");
            return true;
        } else if (i()) {
            C1044Mm.j(a, "CAD service token was requested more time than defined in FP: %d ", Integer.valueOf(cVar.a()));
            return true;
        } else {
            return false;
        }
    }

    @Override // o.InterfaceC5132bsw
    public boolean d() {
        return this.d.a("cad");
    }

    @Override // o.InterfaceC5132bsw
    public String c() {
        String c2;
        synchronized (this) {
            this.j.set(System.currentTimeMillis());
            this.h.incrementAndGet();
            g();
            c2 = C8189dfg.c();
        }
        return c2;
    }

    @Override // o.InterfaceC5132bsw
    public boolean e() {
        synchronized (this) {
            if (this.j.longValue() <= 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.j.longValue();
            if (currentTimeMillis < 0 || currentTimeMillis >= b) {
                this.j.set(0L);
                return false;
            }
            return true;
        }
    }

    public final void f() {
        synchronized (this) {
            String e2 = C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_cad", (String) null);
            if (C8168dfL.g(e2)) {
                C1044Mm.e(a, "CAD request never done on this device.");
            } else {
                this.i = new JSONObject(e2);
            }
        }
    }

    private final boolean i() {
        int a2 = Config_FastProperty_ServiceTokenCAD.Companion.a();
        if (a2 > 0) {
            return this.h.get() >= a2;
        }
        C1044Mm.j(a, "Error count is disabled.");
        return false;
    }

    private final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(e, this.h.intValue());
        } catch (Throwable th) {
            C1044Mm.b(a, th, "Failed to create CAD state JSON object.", new Object[0]);
        }
        return jSONObject;
    }

    private final void g() {
        synchronized (this) {
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "preference_cad", j().toString());
        }
    }

    public String toString() {
        JSONObject jSONObject = this.i;
        AtomicInteger atomicInteger = this.h;
        AtomicLong atomicLong = this.j;
        return "CadMonitor(PreviousStatus=" + jSONObject + ", RequestCount=" + atomicInteger + ", PendingTs=" + atomicLong + ")";
    }
}
