package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.cpj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7095cpj {
    private static Long e;
    public static final C7095cpj d = new C7095cpj();
    public static final int c = 8;

    private C7095cpj() {
    }

    public final void b() {
        Map k;
        Throwable th;
        Long l = e;
        if (l != null) {
            l.longValue();
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("NotificationPermissionCL startPresentationSession again without endSession", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        e = Logger.INSTANCE.startSession(new Presentation(AppView.clientDrivenInterstitialView, C1281Vq.d(c())));
    }

    public final void d() {
        Long l = e;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
        e = null;
    }

    public final void c(CommandValue commandValue) {
        C8632dsu.c((Object) commandValue, "");
        b(AppView.clientDrivenInterstitialViewButton, commandValue);
    }

    public final void d(CommandValue commandValue) {
        C8632dsu.c((Object) commandValue, "");
        b(AppView.SystemNotificationPrompt, commandValue);
    }

    private final void b(AppView appView, CommandValue commandValue) {
        Logger.INSTANCE.logEvent(new Selected(appView, null, commandValue, C1281Vq.d(c())));
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageName", "AndroidNotificationPermissions");
        return jSONObject;
    }
}
