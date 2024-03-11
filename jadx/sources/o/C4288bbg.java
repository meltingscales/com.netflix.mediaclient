package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.action.Download;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bbg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4288bbg {
    private Long a;

    public final void a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        e(str, str2);
    }

    public final void e() {
        d();
    }

    public final void c() {
        b();
    }

    public final void d(StopReason stopReason) {
        e(stopReason);
    }

    private final void e(String str, String str2) {
        Map d;
        Map k;
        Throwable th;
        if (this.a != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("DownloadActionCLReporter.startAction() sessionId was not null. It should not happen.", null, null, true, k, false, false, 96, null);
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
        this.a = Logger.INSTANCE.startSession(new Download(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str2)), null, null, null, null));
    }

    private final void d() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.a = null;
        }
    }

    private final void b() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.cancelSession(l);
            this.a = null;
        }
    }

    private final void e(StopReason stopReason) {
        Long l = this.a;
        if (l != null) {
            ExtLogger.INSTANCE.failedAction(l, new Error(String.valueOf(stopReason), null, null).toJSONObject().toString());
            this.a = null;
        }
    }
}
