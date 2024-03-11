package o;

import android.app.Activity;
import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.RecommendedTrailer;
import dagger.Lazy;

/* renamed from: o.bRu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3980bRu {
    public static final void b(InterfaceC5141btE interfaceC5141btE, NetflixActivity netflixActivity, PlayContext playContext, AppView appView, TrackingInfoHolder trackingInfoHolder, Lazy<PlaybackLauncher> lazy) {
        RecommendedTrailer l;
        String supplementalVideoId;
        C8632dsu.c((Object) interfaceC5141btE, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) lazy, "");
        if (C8141del.c(netflixActivity) || C8126deW.e((Context) netflixActivity) || (l = interfaceC5141btE.l()) == null || (supplementalVideoId = l.getSupplementalVideoId()) == null) {
            return;
        }
        CLv2Utils.INSTANCE.b(appView, CommandValue.ViewPreviewsCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        lazy.get().c(supplementalVideoId, VideoType.SUPPLEMENTAL, playContext, new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null));
    }

    public static final void a(NetflixActivity netflixActivity, InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder, AppView appView) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) appView, "");
        CLv2Utils.INSTANCE.b(appView, CommandValue.ViewGameDetailsCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
        InterfaceC3643bFl a = InterfaceC3643bFl.c.a(netflixActivity);
        VideoType videoType = VideoType.GAMES;
        String id = interfaceC5185btw.getId();
        C8632dsu.a(id, "");
        a.b(netflixActivity, videoType, id, interfaceC5185btw.getTitle(), trackingInfoHolder, "GameBillboardClick", new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null));
    }

    public static final void a(Context context, TrackingInfoHolder trackingInfoHolder, InterfaceC5140btD interfaceC5140btD, bNS bns) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5140btD, "");
        C8632dsu.c((Object) bns, "");
        Logger logger = Logger.INSTANCE;
        logger.logEvent(new Selected(AppView.gameInstallButton, null, CommandValue.GameInstallCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
        InterfaceC5283bvo b = C8126deW.b();
        if (b != null) {
            InterfaceC3977bRr a = C3981bRv.a(context, b);
            boolean a2 = a.a();
            String k = interfaceC5140btD.k();
            if (k == null || k.length() == 0) {
                return;
            }
            if (a2) {
                logger.logEvent(new Selected(AppView.learnMoreButton, null, CommandValue.LearnMoreCommand, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
                if (InstallInterstitialFragment.d.b((NetflixActivity) C9737vz.e(context, NetflixActivity.class), k, interfaceC5140btD.h(), trackingInfoHolder)) {
                    a.b();
                    return;
                }
            }
            bns.d(bNK.c.e((Activity) C9737vz.e(context, Activity.class), k, "", "", false, interfaceC5140btD.h()));
        }
    }
}
