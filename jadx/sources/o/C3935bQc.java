package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;

/* renamed from: o.bQc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3935bQc {
    public static final a e = new a(null);
    private Long b;
    private final AppView d = AppView.gameEducationInterstitial;

    public final AppView c() {
        return this.d;
    }

    /* renamed from: o.bQc$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("InstallInterstitialCL");
        }
    }

    public final void b() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.b = null;
        }
    }

    public final void a(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger.INSTANCE.logEvent(new Closed(this.d, null, CommandValue.CloseCommand, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)));
    }

    public final void d(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.gameInstallButton, null, CommandValue.GameInstallCommand, trackingInfo));
    }

    public final void b(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        e.getLogTag();
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.b = null;
        }
        this.b = Logger.INSTANCE.startSession(new Presentation(this.d, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null)));
        CLv2Utils.b(false, AppView.gameInstallButton, TrackingInfoHolder.a(trackingInfoHolder, null, 1, null), null);
    }
}
