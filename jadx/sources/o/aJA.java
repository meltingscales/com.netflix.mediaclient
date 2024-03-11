package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class aJA extends AbstractC1660aJn implements Choreographer.FrameCallback, DisplayManager.DisplayListener {
    public static final c e = new c(null);
    private final Choreographer a;
    private final Context b;
    private final DisplayManager c;
    private final Display d;
    private final d f;
    private final C1667aJu g;
    private final C1667aJu h;
    private final InterfaceC1662aJp i;
    private double j;
    private long k;
    private double m;
    private int n;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJA(@ApplicationContext Context context, InterfaceC1662aJp interfaceC1662aJp) {
        super(CaptureType.d);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1662aJp, "");
        this.b = context;
        this.i = interfaceC1662aJp;
        Choreographer choreographer = Choreographer.getInstance();
        C8632dsu.a(choreographer, "");
        this.a = choreographer;
        this.c = (DisplayManager) context.getSystemService(DisplayManager.class);
        this.d = m();
        this.j = g();
        this.g = new C1667aJu("fps", true);
        this.h = new C1667aJu("fpsDrop", true);
        this.f = new d(interfaceC1662aJp.b().getLooper());
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("FPSCapture");
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C8632dsu.c((Object) message, "");
            Object obj = message.obj;
            if (obj instanceof Pair) {
                aJA aja = aJA.this;
                Pair pair = (Pair) obj;
                Object d = pair.d();
                C8632dsu.d(d);
                double doubleValue = ((Double) d).doubleValue();
                Object a = pair.a();
                C8632dsu.d(a);
                aja.e(doubleValue, ((Double) a).doubleValue());
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        this.j = g();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        long j2 = this.k;
        if (j2 == 0) {
            this.k = millis;
        } else {
            double d2 = millis - j2;
            if (d2 > 1000.0d) {
                double d3 = (this.n * 1000.0d) / d2;
                b(d3, this.m - d3);
                this.m = d3;
                this.n = 0;
                this.k = millis;
            }
        }
        this.n++;
        this.a.postFrameCallback(this);
    }

    private final void b(double d2, double d3) {
        Message obtainMessage = this.f.obtainMessage();
        C8632dsu.a(obtainMessage, "");
        obtainMessage.obj = new Pair(Double.valueOf(d2), Double.valueOf(d3));
        this.f.sendMessage(obtainMessage);
    }

    public final void e(double d2, double d3) {
        Display display;
        this.g.e(d2);
        if (d3 <= this.j || (display = this.d) == null) {
            return;
        }
        this.h.e((d3 / display.getRefreshRate()) * 100.0d);
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        super.j();
    }

    @Override // o.AbstractC1660aJn
    public void f() {
        Map d2;
        Map k;
        Throwable th;
        if (C8141del.a()) {
            return;
        }
        h();
        super.f();
        if (this.d != null && this.c != null) {
            this.a.postFrameCallback(this);
            this.c.registerDisplayListener(this, null);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.q;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("FPSCapture didn't start, the Display wasn't available", null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType2.c();
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

    @Override // o.AbstractC1660aJn
    public void h() {
        super.h();
        this.a.removeFrameCallback(this);
    }

    @Override // o.AbstractC1660aJn
    public boolean e() {
        return this.g.d() || this.h.d();
    }

    @Override // o.AbstractC1660aJn
    public Map<String, SummaryStatistics> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.g.d()) {
            linkedHashMap.put("fps", this.g.a());
        }
        if (this.h.d()) {
            linkedHashMap.put("fpsDrop", this.h.a());
        }
        return linkedHashMap;
    }

    @Override // o.AbstractC1660aJn
    public void a() {
        if (!C8141del.a()) {
            C8166dfJ.e("PerformanceCapture");
        }
        this.g.c();
        this.h.c();
    }

    private final Display m() {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.c.getDisplays()[0];
        }
        return ((WindowManager) this.b.getSystemService(WindowManager.class)).getDefaultDisplay();
    }

    private final double g() {
        Display display = this.d;
        return ((display != null ? Float.valueOf(display.getRefreshRate()) : Double.valueOf(0.0d)).doubleValue() * 3.0d) / 100.0d;
    }
}
