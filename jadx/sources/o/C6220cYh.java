package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.model.context.GestureInput;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.SelectPlan;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.EditPlanCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.cl.model.event.session.command.ViewAccountMenuCommand;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cYh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6220cYh extends C1045Mp {
    private static Long a;
    private static Long b;
    private static Long d;
    private static Long h;
    private static Long i;
    public static final C6220cYh c = new C6220cYh();
    public static final int e = 8;

    private C6220cYh() {
        super("PlanSelectCLHelper");
    }

    public final void d(String str) {
        Logger logger = Logger.INSTANCE;
        b = logger.startSession(new Focus(AppView.umsAlertButton, CLv2Utils.e(str)));
        i = Long.valueOf(logger.addContext(new GestureInput(GestureInputKind.tap, Double.valueOf(1.0d))));
        CLv2Utils.d(new EditPlanCommand());
        h = logger.startSession(new SubmitCommand());
    }

    public final void a() {
        Logger logger = Logger.INSTANCE;
        logger.endSession(h);
        logger.removeContext(i);
        logger.endSession(b);
    }

    public final void a(String str) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        getLogTag();
        if (d != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("unended planSelectPresentationSessionId", null, null, false, k, false, false, 96, null);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            Logger.INSTANCE.endSession(d);
        }
        d = Logger.INSTANCE.startSession(new Presentation(AppView.planSelection, CLv2Utils.e(str)));
    }

    public final void c() {
        getLogTag();
        Logger.INSTANCE.endSession(d);
        d = null;
    }

    public final void d(int i2) {
        getLogTag();
        CLv2Utils.d(new ChangeValueCommand(Integer.valueOf(i2)));
    }

    public final void c(int i2) {
        getLogTag();
        CLv2Utils.d(new SelectCommand());
        a = Logger.INSTANCE.startSession(new SelectPlan(null, null, String.valueOf(i2), null, null));
    }

    public final void d(UpdateProductChoiceResponse updateProductChoiceResponse) {
        getLogTag();
        Long l = a;
        if (l != null) {
            long longValue = l.longValue();
            if (updateProductChoiceResponse != null && updateProductChoiceResponse.success()) {
                Logger.INSTANCE.endSession(Long.valueOf(longValue));
                CLv2Utils.c(false, AppView.planSaveSuccess, CLv2Utils.e(updateProductChoiceResponse.trackingInfo()), null, false);
                return;
            }
            ExtLogger.INSTANCE.failedAction(Long.valueOf(longValue), new Error(String.valueOf(updateProductChoiceResponse), null, null).toJSONObject().toString());
            CLv2Utils.c(false, AppView.planSaveError, CLv2Utils.e(updateProductChoiceResponse != null ? updateProductChoiceResponse.trackingInfo() : null), null, false);
        }
    }

    public final void e() {
        getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.planSelection, null), (Command) new ViewAccountMenuCommand(), true);
    }
}
