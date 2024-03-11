package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.crb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7193crb {
    private static Long a;
    public static final C7193crb d = new C7193crb();
    private static final AppView c = AppView.newUserExperienceDialog;

    private C7193crb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(int i) {
        return new JSONObject().put("dialogIndex", i);
    }

    public final TrackingInfo f(final int i) {
        return new TrackingInfo() { // from class: o.cqY
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject h;
                h = C7193crb.h(i);
                return h;
            }
        };
    }

    public final Long d(int i) {
        Map d2;
        Map k;
        Throwable th;
        if (a != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "unended new user experience PresentationSessionId " + a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            a();
        }
        Long startSession = Logger.INSTANCE.startSession(new Presentation(c, f(i)));
        a = startSession;
        return startSession;
    }

    public final void a() {
        if (a != null) {
            Logger.INSTANCE.endSession(a);
            a = null;
        }
    }

    public final void a(int i) {
        Logger.INSTANCE.logEvent(new Closed(c, null, CommandValue.CloseCommand, f(i)));
    }

    public final void c(int i) {
        Logger.INSTANCE.logEvent(new Selected(AppView.nextButton, c, CommandValue.SelectCommand, f(i)));
    }

    public final void b(int i) {
        Logger.INSTANCE.logEvent(new Selected(AppView.backButton, c, CommandValue.SelectCommand, f(i)));
    }
}
