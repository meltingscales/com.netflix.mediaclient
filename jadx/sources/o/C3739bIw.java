package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;

/* renamed from: o.bIw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3739bIw {
    public static final C3739bIw e = new C3739bIw();

    private C3739bIw() {
    }

    public final void d(AppView appView, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger.INSTANCE.logEvent(new Closed(appView, null, CommandValue.CloseCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final void b(AppView appView, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        CommandValue commandValue = CommandValue.SelectCommand;
        TrackingInfo e2 = TrackingInfoHolder.e(trackingInfoHolder, null, 1, null);
        Logger.INSTANCE.logEvent(new Selected(appView, null, commandValue, e2));
        CLv2Utils.INSTANCE.b(appView, commandValue, e2);
    }
}
