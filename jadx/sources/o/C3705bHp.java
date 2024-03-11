package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.AddToPlaylist;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import javax.inject.Singleton;
import org.json.JSONObject;

@Singleton
/* renamed from: o.bHp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3705bHp {
    public static final d a = new d(null);
    private final AppView b = AppView.movieDetails;

    /* renamed from: o.bHp$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("FullDpCL");
        }
    }

    public final void d(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        CLv2Utils.b(false, AppView.boxArt, trackingInfo, null);
    }

    public final void d(AppView appView, TrackingInfo trackingInfo, boolean z) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfo, "");
        CLv2Utils.INSTANCE.d(this.b, CommandValue.PlayCommand, trackingInfo, new Focus(appView, null), new PlayCommand(null), z, null);
    }

    public final void a(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        CLv2Utils.b(false, AppView.unavailableContentButton, trackingInfoHolder.c(new JSONObject().put("isLocked", 1)), null);
    }

    public final void b(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        CLv2Utils.b(false, AppView.changePlanToWatchButton, trackingInfoHolder.c(new JSONObject().put("isLocked", 1)), null);
    }

    public final void b(AppView appView, TrackingInfo trackingInfo, boolean z) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfo, "");
        CLv2Utils.INSTANCE.d(appView, CommandValue.ViewDetailsCommand, trackingInfo, new Focus(appView, trackingInfo), new ViewDetailsCommand(), z, null);
    }

    public final void e(int i, TrackingInfo trackingInfo) {
        if (i == 1) {
            Logger logger = Logger.INSTANCE;
            logger.endSession(logger.startSession(new Focus(AppView.moreLikeThisButton, trackingInfo)));
        }
    }

    public final Long c(int i, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        return Logger.INSTANCE.startSession(cPU.e.d(i, AppView.thumbButton, AppView.movieDetails, trackingInfo));
    }

    public final Long a() {
        return Logger.INSTANCE.startSession(new Presentation(AppView.ikoResetStatePrompt, null));
    }

    public final void b(Long l, Command command) {
        C8632dsu.c((Object) command, "");
        Logger logger = Logger.INSTANCE;
        logger.endSession(logger.startSession(command));
        logger.endSession(l);
    }

    public final Long e(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        return Logger.INSTANCE.startSession(new AddToPlaylist(AppView.remindMeButton, this.b, CommandValue.AddToPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final Long g(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        return Logger.INSTANCE.startSession(new RemoveFromPlaylist(AppView.remindMeButton, this.b, CommandValue.RemoveFromPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final Long c(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        return Logger.INSTANCE.startSession(new AddToPlaylist(AppView.addToMyListButton, this.b, CommandValue.AddToPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final Long d(TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        return Logger.INSTANCE.startSession(new RemoveFromPlaylist(AppView.removeFromMyListButton, this.b, CommandValue.RemoveFromPlaylistCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final void c(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        a.getLogTag();
        CLv2Utils.INSTANCE.b(AppView.unavailableContentButton, CommandValue.UnavailableContentCommand, trackingInfo);
    }

    public final void e(TrackingInfo trackingInfo) {
        C8632dsu.c((Object) trackingInfo, "");
        a.getLogTag();
        CLv2Utils.INSTANCE.b(AppView.changePlanToWatchButton, CommandValue.ChangePlanToWatchCommand, trackingInfo);
    }
}
