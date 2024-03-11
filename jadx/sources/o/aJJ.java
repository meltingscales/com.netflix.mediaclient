package o;

import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class aJJ extends AbstractC1660aJn {
    public static final d b = new d(null);
    private final long a;
    private final InterfaceC1662aJp c;
    private final Map<String, C1667aJu> d;
    private final Runnable e;

    public final Map<String, C1667aJu> g() {
        return this.d;
    }

    public /* synthetic */ aJJ(CaptureType captureType, InterfaceC1662aJp interfaceC1662aJp, long j, int i, C8627dsp c8627dsp) {
        this(captureType, interfaceC1662aJp, (i & 4) != 0 ? 60000L : j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJJ(CaptureType captureType, InterfaceC1662aJp interfaceC1662aJp, long j) {
        super(captureType);
        C8632dsu.c((Object) captureType, "");
        C8632dsu.c((Object) interfaceC1662aJp, "");
        this.c = interfaceC1662aJp;
        this.a = j;
        this.d = new LinkedHashMap();
        this.e = new Runnable() { // from class: o.aJJ.5
            @Override // java.lang.Runnable
            public void run() {
                if (!C8141del.a()) {
                    C8166dfJ.e("PerformanceCapture");
                }
                aJJ.this.j();
                aJJ.this.c.b().postDelayed(this, aJJ.this.a);
            }
        };
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PerformanceCapture");
        }
    }

    @Override // o.AbstractC1660aJn
    public final void f() {
        super.f();
        this.c.b().post(this.e);
    }

    @Override // o.AbstractC1660aJn
    public void h() {
        super.h();
        this.c.b().removeCallbacks(this.e);
    }

    public void b(String str, double d2) {
        C8632dsu.c((Object) str, "");
        if (!C8141del.a()) {
            C8166dfJ.e("PerformanceCapture");
        }
        C1667aJu c1667aJu = this.d.get(str);
        if (c1667aJu == null) {
            c1667aJu = new C1667aJu(str, false, 2, null);
            this.d.put(str, c1667aJu);
        }
        c1667aJu.e(d2);
    }

    @Override // o.AbstractC1660aJn
    public Map<String, SummaryStatistics> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C1667aJu> entry : this.d.entrySet()) {
            if (entry.getValue().d()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().a());
            }
        }
        return linkedHashMap;
    }

    @Override // o.AbstractC1660aJn
    public void a() {
        if (!C8141del.a()) {
            C8166dfJ.e("PerformanceCapture");
        }
        for (Map.Entry<String, C1667aJu> entry : this.d.entrySet()) {
            entry.getValue().c();
        }
    }

    @Override // o.AbstractC1660aJn
    public boolean e() {
        Map<String, C1667aJu> map = this.d;
        if (!map.isEmpty()) {
            for (Map.Entry<String, C1667aJu> entry : map.entrySet()) {
                if (entry.getValue().d()) {
                    return true;
                }
            }
        }
        return false;
    }
}
