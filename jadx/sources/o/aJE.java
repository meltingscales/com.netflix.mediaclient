package o;

import android.util.SparseIntArray;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.composite.CompositeMetricsCollector;
import com.facebook.battery.metrics.core.StatefulSystemMetricsCollector;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.cpu.CpuFrequencyMetrics;
import com.facebook.battery.metrics.cpu.CpuFrequencyMetricsCollector;
import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.metrics.cpu.CpuMetricsCollector;
import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aJE extends aJJ implements aJI {
    public static final c d = new c(null);
    private final StatefulSystemMetricsCollector<CompositeMetrics, CompositeMetricsCollector> e;

    public /* synthetic */ aJE(InterfaceC1662aJp interfaceC1662aJp, long j, int i, C8627dsp c8627dsp) {
        this(interfaceC1662aJp, (i & 2) != 0 ? 10000L : j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJE(InterfaceC1662aJp interfaceC1662aJp, long j) {
        super(CaptureType.c, interfaceC1662aJp, j);
        C8632dsu.c((Object) interfaceC1662aJp, "");
        this.e = new StatefulSystemMetricsCollector<>(new CompositeMetricsCollector.Builder().addMetricsCollector(CpuFrequencyMetrics.class, new CpuFrequencyMetricsCollector()).addMetricsCollector(CpuMetrics.class, new CpuMetricsCollector()).build());
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CPUUsageCapture");
        }
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        Map d2;
        Map k;
        Throwable th;
        dpR dpr;
        Map d3;
        Map k2;
        Throwable th2;
        try {
            CompositeMetrics latestDiffAndReset = this.e.getLatestDiffAndReset();
            if (latestDiffAndReset != null) {
                if (latestDiffAndReset.isValid(CpuMetrics.class)) {
                    SystemMetrics metric = latestDiffAndReset.getMetric(CpuMetrics.class);
                    C8632dsu.a(metric, "");
                    e((CpuMetrics) metric);
                }
                if (latestDiffAndReset.isValid(CpuFrequencyMetrics.class)) {
                    SystemMetrics metric2 = latestDiffAndReset.getMetric(CpuFrequencyMetrics.class);
                    C8632dsu.a(metric2, "");
                    e((CpuFrequencyMetrics) metric2);
                }
                super.j();
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            if (dpr == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("diffMetrics was null in CPUUsageCapture", null, null, true, k2, false, false, 96, null);
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
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        } catch (Exception e) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("SPY-17141 An Exception occurred in CPUCapture", e, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c3 = errorType2.c();
                    c1596aHd2.a(c3 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
        }
    }

    public final void e(CpuMetrics cpuMetrics) {
        C8632dsu.c((Object) cpuMetrics, "");
        double d2 = cpuMetrics.systemTimeS;
        double d3 = cpuMetrics.userTimeS;
        double d4 = d2 + d3;
        if (d4 == 0.0d) {
            return;
        }
        b("cpuTimePercent", (d3 / d4) * 100.0d);
    }

    public final void e(CpuFrequencyMetrics cpuFrequencyMetrics) {
        SparseIntArray sparseIntArray;
        SparseIntArray[] sparseIntArrayArr;
        int i;
        C8632dsu.c((Object) cpuFrequencyMetrics, "");
        CpuFrequencyMetrics cpuFrequencyMetrics2 = new CpuFrequencyMetrics();
        cpuFrequencyMetrics2.set(cpuFrequencyMetrics);
        SparseIntArray[] sparseIntArrayArr2 = cpuFrequencyMetrics2.timeInStateS;
        C8632dsu.a(sparseIntArrayArr2, "");
        int length = sparseIntArrayArr2.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int size = sparseIntArrayArr2[i2].size();
            if (size == 0) {
                sparseIntArrayArr = sparseIntArrayArr2;
                i = length;
            } else {
                long j = 0;
                float f = 0.0f;
                int i4 = 0;
                while (i4 < size) {
                    f += sparseIntArray.keyAt(i4) * sparseIntArray.valueAt(i4);
                    j += sparseIntArray.valueAt(i4);
                    i4++;
                    sparseIntArrayArr2 = sparseIntArrayArr2;
                    length = length;
                }
                sparseIntArrayArr = sparseIntArrayArr2;
                i = length;
                float f2 = f / ((float) j);
                float keyAt = f2 / sparseIntArray.keyAt(size - 1);
                if (keyAt > 0.0f) {
                    i3++;
                    d2 += f2;
                    d3 += keyAt;
                }
            }
            i2++;
            sparseIntArrayArr2 = sparseIntArrayArr;
            length = i;
        }
        if (i3 == 0) {
            return;
        }
        double d4 = i3;
        b("cpuCores", CpuFrequencyMetricsCollector.getTotalCores());
        b("cpuActiveCores", d4);
        b("cpuUsageHertz", d2 / d4);
        b("cpuUsedPercent", (d3 / d4) * 100.0d);
    }

    @Override // o.AbstractC1660aJn
    public JSONObject c() {
        SummaryStatistics a;
        JSONObject jSONObject = new JSONObject();
        C1667aJu c1667aJu = g().get("cpuCores");
        if (c1667aJu != null && (a = c1667aJu.a()) != null) {
            jSONObject.put("cpuCores", a.getMax());
        }
        return jSONObject;
    }
}
