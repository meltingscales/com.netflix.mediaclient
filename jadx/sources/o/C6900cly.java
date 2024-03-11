package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;

/* renamed from: o.cly  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6900cly extends C1045Mp {
    public static final C6900cly d = new C6900cly();
    private static Long e;

    private C6900cly() {
        super("MultiMonthCLHelper");
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        getLogTag();
        if (e != null) {
            Logger.INSTANCE.endSession(e);
        }
        e = Logger.INSTANCE.startSession(new Presentation(AppView.umsAlert, CLv2Utils.e(str)));
    }

    public final void e() {
        getLogTag();
        Logger.INSTANCE.endSession(e);
        e = null;
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        getLogTag();
        CLv2Utils.d(new ChangeValueCommand(str));
    }

    public final void e(String str) {
        getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.umsAlertButton, CLv2Utils.e(str)), (Command) new SubmitCommand(), true);
    }

    public final void b(String str) {
        getLogTag();
        CLv2Utils.INSTANCE.e(new Focus(AppView.umsAlertButton, CLv2Utils.e(str)), new CloseCommand());
    }
}
