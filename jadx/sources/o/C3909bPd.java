package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;

/* renamed from: o.bPd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3909bPd {
    public static final d a = new d(null);
    private final AppView c = AppView.gameDetails;

    /* renamed from: o.bPd$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GdpCL");
        }
    }

    public final void b(TrackingInfo trackingInfo, String str) {
        C8632dsu.c((Object) trackingInfo, "");
        C8632dsu.c((Object) str, "");
        bOK.e(trackingInfo, str);
    }

    public final void a(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.gameInstallButton, null, CommandValue.GameInstallCommand, trackingInfo));
    }

    public final void c(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.learnMoreButton, null, CommandValue.LearnMoreCommand, trackingInfo));
    }

    public final void d(AppView appView, TrackingInfo trackingInfo, boolean z) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfo, "");
        CLv2Utils.INSTANCE.b(new Focus(appView, trackingInfo), new ViewDetailsCommand(), z);
    }
}
