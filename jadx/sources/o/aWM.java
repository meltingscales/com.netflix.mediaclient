package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.action.CastDevice;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class aWM extends C1045Mp {
    public static final aWM b = new aWM();
    private static Long c;

    private aWM() {
        super("MdxCL");
    }

    public static final void e() {
        Map d;
        Map k;
        Throwable th;
        if (c != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Previous CastSession was not ended.", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
        c = Logger.INSTANCE.startSession(new CastDevice(AppView.castDeviceItem, null, CommandValue.CastDeviceCommand, null));
        b.getLogTag();
    }

    public static final void d() {
        b.getLogTag();
        Logger.INSTANCE.endSession(c);
        c = null;
    }

    public static final void a() {
        b.getLogTag();
        Logger.INSTANCE.cancelSession(c);
        c = null;
    }
}
