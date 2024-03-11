package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cWD {
    public static final d a = new d(null);
    private Long c;
    private final AppView e = AppView.umsAlert;
    private final AppView d = AppView.umsAlertButton;

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("UmaCL");
        }
    }

    public final TrackingInfo e(final String str) {
        Map b;
        Map k;
        Throwable th;
        if (C8168dfL.h(str)) {
            try {
                return new TrackingInfo() { // from class: o.cWL
                    @Override // com.netflix.cl.model.JsonSerializer
                    public final JSONObject toJSONObject() {
                        JSONObject b2;
                        b2 = cWD.b(str);
                        return b2;
                    }
                };
            } catch (JSONException e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                b = dqD.b(dpD.a("trackingInfo", str));
                k = dqE.k(b);
                C1596aHd c1596aHd = new C1596aHd("Bad UMA trackingInfo", e, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
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
                    return null;
                }
                dVar.e().b(c1596aHd, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(String str) {
        return new JSONObject(str);
    }

    public final Long a(String str) {
        Map b;
        Map k;
        Throwable th;
        Long l = this.c;
        if (l != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            b = dqD.b(dpD.a("presentationSessionId", String.valueOf(l)));
            k = dqE.k(b);
            C1596aHd c1596aHd = new C1596aHd("unended UMA PresentationSessionId for Uma Tooltip", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
        Long startSession = Logger.INSTANCE.startSession(new Presentation(this.e, e(str)));
        this.c = startSession;
        return startSession;
    }

    public final void a() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.c = null;
        }
    }

    public final void d(String str) {
        CLv2Utils.INSTANCE.b(new Focus(this.d, e(str)), (Command) new SubmitCommand(), false);
    }
}
