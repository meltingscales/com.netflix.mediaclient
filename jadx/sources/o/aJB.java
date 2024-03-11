package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class aJB extends aJJ implements aJF {
    public static final d d = new d(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJB(InterfaceC1662aJp interfaceC1662aJp) {
        super(CaptureType.a, interfaceC1662aJp, 300000L);
        C8632dsu.c((Object) interfaceC1662aJp, "");
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("RuntimeMemoryCapture");
        }
    }

    @Override // o.AbstractC1660aJn
    public void j() {
        super.j();
        C1332Xp c1332Xp = C1332Xp.b;
        b((Context) C1332Xp.b(Context.class));
    }

    public final void b(Context context) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) context, "");
        try {
            Object systemService = context.getSystemService("activity");
            C8632dsu.d(systemService);
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) systemService).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo != null) {
                if (true ^ (processMemoryInfo.length == 0)) {
                    Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
                    c("appPeakMemoryMB", memoryInfo.getTotalPss());
                    c("dalvikPss", memoryInfo.dalvikPss);
                    c("appUsedMemoryMB", memoryInfo.nativePss);
                    c("otherPss", memoryInfo.otherPss);
                    return;
                }
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d3 = dqE.d();
            k2 = dqE.k(d3);
            C1596aHd c1596aHd = new C1596aHd("SPY-31259: MemoryInfo was empty in ProcessMemoryCaptureFromService", null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
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
        } catch (Exception e) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("SPY-31259: An error happened in ProcessMemoryCaptureFromService", e, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd2.a(c2 + " " + b2);
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

    private final void c(String str, int i) {
        if (i > 0) {
            b(str, i / 1024.0d);
        }
    }
}
