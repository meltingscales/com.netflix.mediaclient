package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.action.CastDevice;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.ceT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6498ceT extends C1045Mp {
    private static Long c;
    public static final C6498ceT e = new C6498ceT();
    private static final AppView d = AppView.castButton;

    private C6498ceT() {
        super("CastSheetCL");
    }

    public static final void e() {
        Map d2;
        Map k;
        Throwable th;
        if (c != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Previous CastSheetSession was not ended.", null, null, true, k, false, false, 96, null);
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
            d();
        }
        c = Logger.INSTANCE.startSession(new CastDevice(AppView.castDeviceSelector, null, CommandValue.CastSheetCommand, null));
        e.getLogTag();
    }

    public static final void c() {
        e.getLogTag();
        Logger.INSTANCE.logEvent(new Selected(d, null, CommandValue.CastSheetCommand, null));
    }

    public static final void a() {
        e.getLogTag();
        Logger.INSTANCE.logEvent(new Closed(d, null, CommandValue.CloseCommand, null));
    }

    public static final void d() {
        e.getLogTag();
        Logger.INSTANCE.endSession(c);
        c = null;
    }
}
