package o;

import android.os.Bundle;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import dagger.Lazy;
import o.bXZ;

/* renamed from: o.bYx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4172bYx {
    public static final b e = new b(null);

    /* renamed from: o.bYx$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("KidsCharacterNavigation");
        }
    }

    public final void c(Lazy<PlaybackLauncher> lazy, bXZ.e eVar) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) eVar, "");
        TrackingInfoHolder e2 = e(eVar.b()).e(eVar.c(), 0);
        CLv2Utils.INSTANCE.e(new Focus(AppView.storyArt, TrackingInfoHolder.e(e2, null, 1, null)), new PlayCommand(null));
        PlayContextImp b2 = TrackingInfoHolder.b(e2, PlayLocationType.STORY_ART, false, 2, null);
        b2.b("detailsPage");
        PlaybackLauncher playbackLauncher = lazy.get();
        C8632dsu.a(playbackLauncher, "");
        InterfaceC5160btX aE_ = eVar.c().aE_();
        C8632dsu.a(aE_, "");
        VideoType type = eVar.c().getType();
        C8632dsu.a(type, "");
        PlaybackLauncher.b.a(playbackLauncher, aE_, type, b2, new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null), null, 16, null);
    }

    public final void c(Lazy<PlaybackLauncher> lazy, bXZ.b bVar) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) bVar, "");
        CLv2Utils.INSTANCE.e(new Focus(AppView.playButton, null), new PlayCommand(null));
        TrackingInfoHolder e2 = e(bVar.a()).e(bVar.e(), bVar.c());
        PlaybackLauncher playbackLauncher = lazy.get();
        C8632dsu.a(playbackLauncher, "");
        InterfaceC5160btX aE_ = bVar.e().aE_();
        C8632dsu.a(aE_, "");
        PlaybackLauncher.b.a(playbackLauncher, aE_, VideoType.SHOW, TrackingInfoHolder.b(e2, PlayLocationType.EPISODE, false, 2, null), null, null, 24, null);
    }

    public final void b(NetflixActivity netflixActivity, bXZ.a aVar, String str) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) str, "");
        if (netflixActivity != null) {
            TrackingInfoHolder e2 = e(aVar.e()).e(aVar.b(), aVar.c());
            CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, TrackingInfoHolder.e(e2, null, 1, null)), new ViewDetailsCommand(), !C8171dfO.c());
            InterfaceC5223buh b2 = aVar.b();
            e.getLogTag();
            if (C8171dfO.c()) {
                QuickDrawDialogFrag.d dVar = QuickDrawDialogFrag.e;
                String id = b2.getId();
                C8632dsu.a(id, "");
                QuickDrawDialogFrag.d.a(dVar, netflixActivity, id, e2, false, null, 24, null);
                return;
            }
            InterfaceC3643bFl.c.a(netflixActivity).d(netflixActivity, b2, e2, str);
        }
    }

    public final void e(KidsCharacterFrag kidsCharacterFrag, final InterfaceC5223buh interfaceC5223buh, final TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) kidsCharacterFrag, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        final NetflixActivity bj_ = kidsCharacterFrag.bj_();
        if (bj_ != null) {
            if (InterfaceC3643bFl.c.a(bj_).d(bj_)) {
                kidsCharacterFrag.bg_();
            }
            C8187dfe.e.a().post(new Runnable() { // from class: o.bYt
                @Override // java.lang.Runnable
                public final void run() {
                    C4172bYx.a(NetflixActivity.this, interfaceC5223buh, trackingInfoHolder);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC3643bFl a = InterfaceC3643bFl.c.a(netflixActivity);
        Bundle bundle = new Bundle();
        bundle.putBoolean("fh_replace_on_backstack", true);
        bundle.putBoolean("fh_skip_transition", true);
        dpR dpr = dpR.c;
        a.d(netflixActivity, interfaceC5223buh, trackingInfoHolder, "characterDP", bundle);
    }

    private final TrackingInfoHolder e(InterfaceC5230buo interfaceC5230buo) {
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.CHARACTER_DP);
        InterfaceC5281bvm y = interfaceC5230buo.y();
        return y != null ? trackingInfoHolder.a(y) : trackingInfoHolder;
    }
}
