package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.AddCachedVideoCommand;
import com.netflix.cl.model.event.session.command.BackCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import org.json.JSONObject;

/* renamed from: o.cer  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6522cer extends C1045Mp {
    private static Long d;
    public static final C6522cer b = new C6522cer();
    private static final AppView e = AppView.miniMovieDetails;
    public static final int a = 8;

    private C6522cer() {
        super("QuickDrawCLHelper");
    }

    public final void b(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        if (d != null) {
            Logger.INSTANCE.endSession(d);
            d = null;
        }
        d = Logger.INSTANCE.startSession(new Presentation(e, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)));
    }

    public final void c() {
        getLogTag();
        if (d != null) {
            Logger.INSTANCE.endSession(d);
            d = null;
        }
    }

    public final void c(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        Logger.INSTANCE.logEvent(new Closed(e, null, CommandValue.BackCommand, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)));
        CLv2Utils.d(new BackCommand());
    }

    public final void f(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        Logger.INSTANCE.logEvent(new Closed(e, null, CommandValue.CancelCommand, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)));
    }

    public final void d(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.addCachedVideoButton, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)), (Command) new AddCachedVideoCommand(), true);
    }

    public final void e(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        CLv2Utils.INSTANCE.b(e, CommandValue.ViewDetailsCommand, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null));
    }

    public final void a(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        CLv2Utils.INSTANCE.b(e, CommandValue.PlayCommand, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null));
    }

    public final void a(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        getLogTag();
        CLv2Utils.INSTANCE.b(AppView.unavailableContentButton, CommandValue.UnavailableContentCommand, trackingInfo);
    }

    public final void i(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        getLogTag();
        CLv2Utils.b(false, AppView.unavailableContentButton, trackingInfoHolder.c(new JSONObject().put("isLocked", 1)), null);
    }
}
