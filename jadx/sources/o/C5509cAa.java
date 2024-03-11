package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.action.Play;
import com.netflix.cl.model.event.session.action.StartPlay;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;

/* renamed from: o.cAa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5509cAa {
    private Long a;
    private Long c;
    private final AppView e = AppView.postPlay;

    public final void e(long j, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        this.c = Logger.INSTANCE.startSession(new Play(null, this.e, CommandValue.PlayCommand, Long.valueOf(j), CLv2Utils.b(trackingInfo, true)));
    }

    public final void d() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.c = null;
        }
    }

    public final void a() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.c = null;
        }
    }

    public final void a(long j, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        this.a = Logger.INSTANCE.startSession(new StartPlay(null, 0L, this.e, CommandValue.PlayCommand, Long.valueOf(j), CLv2Utils.b(trackingInfo, true)));
    }

    public final void c() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.a = null;
        }
    }

    public final void b() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.a = null;
        }
    }

    public final void b(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        CLv2Utils.b(false, AppView.boxArt, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null), null);
    }

    public final void c(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        CLv2Utils.b(false, AppView.previews, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null), null);
    }

    public final void e(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.boxArt, null, CommandValue.OpenPreviewCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }
}
