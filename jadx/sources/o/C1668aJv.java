package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import androidx.core.content.ContextCompat;
import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetrics;
import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector;
import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.aJv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1668aJv extends aJJ implements aJF {
    public static final c e = new c(null);
    private final InterfaceC8554dpx a;
    private final DeviceBatteryMetrics c;
    private final DeviceBatteryMetricsCollector d;
    private final Intent j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668aJv(@ApplicationContext final Context context, InterfaceC1662aJp interfaceC1662aJp) {
        super(CaptureType.b, interfaceC1662aJp, 0L, 4, null);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1662aJp, "");
        C1332Xp c1332Xp = C1332Xp.b;
        DeviceBatteryMetricsCollector deviceBatteryMetricsCollector = new DeviceBatteryMetricsCollector((Context) C1332Xp.b(Context.class));
        this.d = deviceBatteryMetricsCollector;
        this.c = deviceBatteryMetricsCollector.createMetrics();
        this.j = ContextCompat.registerReceiver(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 2);
        b = dpB.b(new drO<BatteryManager>() { // from class: com.netflix.mediaclient.performance.impl.capture.model.BatteryLevelCapture$batteryManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final BatteryManager invoke() {
                return (BatteryManager) ContextCompat.getSystemService(context, BatteryManager.class);
            }
        });
        this.a = b;
    }

    /* renamed from: o.aJv$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("BatteryLevelCapture");
        }
    }

    private final BatteryManager m() {
        return (BatteryManager) this.a.getValue();
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        Map d;
        Map k;
        Throwable th;
        super.j();
        try {
            k();
            o();
        } catch (Throwable th2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-36444 An Exception occurred in BatteryLevelCapture", th2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    private final void k() {
        this.d.getSnapshot(this.c);
        b("batteryConsPercent", this.c.batteryLevelPct);
        BatteryManager m = m();
        Long valueOf = m != null ? Long.valueOf(m.getLongProperty(4)) : null;
        BatteryManager m2 = m();
        Long valueOf2 = m2 != null ? Long.valueOf(m2.getLongProperty(1)) : null;
        BatteryManager m3 = m();
        Long valueOf3 = m3 != null ? Long.valueOf(m3.getLongProperty(3)) : null;
        BatteryManager m4 = m();
        Long valueOf4 = m4 != null ? Long.valueOf(m4.getLongProperty(2)) : null;
        if (valueOf != null && valueOf.longValue() != Long.MIN_VALUE) {
            b("bCapacity", valueOf.longValue());
        }
        if (valueOf2 != null && valueOf2.longValue() != Long.MIN_VALUE) {
            b("batteryAmperage", valueOf2.longValue());
        }
        if (valueOf3 != null && valueOf3.longValue() != Long.MIN_VALUE) {
            b("bCurrentAvg", valueOf3.longValue());
        }
        if (valueOf4 == null || valueOf4.longValue() == Long.MIN_VALUE) {
            return;
        }
        b("bCurrentNow", valueOf4.longValue());
    }

    private final void o() {
        Intent intent = this.j;
        int intExtra = intent != null ? intent.getIntExtra("status", -1) : -1;
        b("isCharging", (intExtra == 2 || intExtra == 5) ? 1.0d : 0.0d);
    }

    @Override // o.AbstractC1660aJn
    public JSONObject c() {
        SummaryStatistics a;
        JSONObject jSONObject = new JSONObject();
        C1667aJu c1667aJu = g().get("isCharging");
        if (c1667aJu != null && (a = c1667aJu.a()) != null) {
            jSONObject.put("isCharging", C8632dsu.c(a.getMax(), 1.0d));
        }
        return jSONObject;
    }
}
