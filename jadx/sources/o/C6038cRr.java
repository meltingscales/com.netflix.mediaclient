package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.search.SearchEventHandler$Companion$handleSearchItemClickEvent$1;
import dagger.Lazy;
import o.AbstractC6078cTd;
import o.InterfaceC3643bFl;

/* renamed from: o.cRr */
/* loaded from: classes4.dex */
public final class C6038cRr {
    public static final e e = new e(null);

    /* renamed from: o.cRr$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public static /* synthetic */ void b(e eVar, AbstractC6078cTd.z zVar, NetflixActivity netflixActivity, String str, PlayerExtras playerExtras, int i, Object obj) {
            e eVar2;
            AbstractC6078cTd.z zVar2;
            NetflixActivity netflixActivity2;
            String str2;
            PlayerExtras playerExtras2;
            if ((i & 8) != 0) {
                playerExtras2 = new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null);
                eVar2 = eVar;
                zVar2 = zVar;
                netflixActivity2 = netflixActivity;
                str2 = str;
            } else {
                eVar2 = eVar;
                zVar2 = zVar;
                netflixActivity2 = netflixActivity;
                str2 = str;
                playerExtras2 = playerExtras;
            }
            eVar2.d(zVar2, netflixActivity2, str2, playerExtras2);
        }

        public final void d(AbstractC6078cTd.z zVar, NetflixActivity netflixActivity, String str, PlayerExtras playerExtras) {
            C8632dsu.c((Object) zVar, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) playerExtras, "");
            InterfaceC5223buh b = zVar.b();
            TrackingInfoHolder c = zVar.c();
            C9726vo.d(c.e(), netflixActivity, new SearchEventHandler$Companion$handleSearchItemClickEvent$1(b, c, str, playerExtras));
        }

        public final void a(AbstractC6078cTd.p pVar, Lazy<PlaybackLauncher> lazy) {
            C8632dsu.c((Object) pVar, "");
            C8632dsu.c((Object) lazy, "");
            TrackingInfoHolder e = pVar.e();
            InterfaceC5278bvj a = pVar.a();
            PlayContextImp b = TrackingInfoHolder.b(e, PlayLocationType.DIRECT_PLAY, false, 2, null);
            CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, e.g()), (Command) new PlayCommand(null), true);
            PlaybackLauncher playbackLauncher = lazy.get();
            C8632dsu.a(playbackLauncher, "");
            VideoType type = a.getType();
            C8632dsu.a(type, "");
            PlaybackLauncher.b.a(playbackLauncher, a, type, b, new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null), null, 16, null);
        }

        public final void e(AbstractC6078cTd.j jVar, NetflixActivity netflixActivity) {
            C8632dsu.c((Object) jVar, "");
            C8632dsu.c((Object) netflixActivity, "");
            CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, jVar.a().g()), (Command) new ViewDetailsCommand(), false);
            InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(netflixActivity), netflixActivity, VideoType.GAMES, jVar.e(), jVar.b(), jVar.a(), "search", null, 64, null);
        }
    }
}
