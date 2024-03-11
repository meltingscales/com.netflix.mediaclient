package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.aLg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1707aLg implements aKP {
    private final C1713aLm c;

    public C1707aLg() {
        this(new C1713aLm());
    }

    public C1707aLg(C1713aLm c1713aLm) {
        this.c = c1713aLm;
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return list.size() > 1;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        d(list.get(1), netflixActivity, str);
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    private NflxHandler.Response d(final String str, final NetflixActivity netflixActivity, final String str2) {
        netflixActivity.getServiceManager().j().a(str, new AbstractC5164btb() { // from class: o.aLg.5
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void d(InterfaceC5223buh interfaceC5223buh, Status status) {
                if (status.j() && interfaceC5223buh != null) {
                    C1707aLg.this.b(netflixActivity, interfaceC5223buh.getType(), str, str2);
                    return;
                }
                InterfaceC1598aHf.a(new C1596aHd("SPY-7518 - got error trying to fetch video summary for: " + str).b(false));
                C8194dfl.c(netflixActivity);
            }
        });
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    @Override // o.aKP
    public Command d() {
        return new PlayCommand(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aLg$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC5164btb {
        final /* synthetic */ NetflixActivity c;
        private final String d;
        final /* synthetic */ VideoType e;

        b(String str, NetflixActivity netflixActivity, VideoType videoType) {
            this.c = netflixActivity;
            this.e = videoType;
            this.d = str;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            if (status.j()) {
                C1707aLg.this.e(this.c, this.e, interfaceC5238buw.aE_(), C8194dfl.d(this.d));
            }
            C8194dfl.c(this.c);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            if (status.j()) {
                C1707aLg.this.e(this.c, this.e, interfaceC5227bul.aE_(), C8194dfl.d(this.d));
            }
            C8194dfl.c(this.c);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            if (status.j()) {
                C1707aLg.this.e(this.c, this.e, interfaceC5194buE.aE_(), C8194dfl.d(this.d));
            }
            C8194dfl.c(this.c);
        }
    }

    protected void b(NetflixActivity netflixActivity, VideoType videoType, String str, String str2) {
        if (VideoType.MOVIE.equals(videoType)) {
            netflixActivity.getServiceManager().j().e(str, this.c.e(), false, TaskMode.FROM_CACHE_OR_NETWORK, new b(str2, netflixActivity, videoType), "DeepLink.Watch", Boolean.FALSE);
        } else if (VideoType.EPISODE.equals(videoType)) {
            netflixActivity.getServiceManager().j().e(str, this.c.e(), false, new b(str2, netflixActivity, videoType), "DeepLink.Watch");
        } else if (VideoType.SHOW.equals(videoType)) {
            netflixActivity.getServiceManager().j().b(str, (String) null, new b(str2, netflixActivity, videoType), "DeepLink.Watch");
        }
    }

    protected void e(final NetflixActivity netflixActivity, final VideoType videoType, final InterfaceC5160btX interfaceC5160btX, final PlayContext playContext) {
        if (C8168dfL.h(this.c.e())) {
            netflixActivity.getServiceManager().j().a(videoType, interfaceC5160btX.aH_(), this.c.e(), new AbstractC5164btb() { // from class: o.aLg.1
                @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                public void c(int i, Status status) {
                    status.j();
                    C1707aLg.this.e(netflixActivity, interfaceC5160btX, videoType, playContext);
                }
            });
        } else {
            e(netflixActivity, interfaceC5160btX, videoType, playContext);
        }
    }

    protected void e(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext) {
        boolean e;
        String c = this.c.c();
        boolean f = this.c.f();
        boolean b2 = this.c.b();
        long millis = this.c.a() > 0 ? TimeUnit.SECONDS.toMillis(this.c.a()) : -1L;
        InterfaceC5131bsv q = netflixActivity.getServiceManager().q();
        if (C8168dfL.g(c)) {
            C1044Mm.a("NetflixComWatchHandler", "Starting local playback setStopRemotePlayback=%b", Boolean.valueOf(f));
            if (q != null && f && !C8168dfL.g(q.i())) {
                C1044Mm.e("NetflixComWatchHandler", "Disconnecting current target.");
                q.d("", 0);
                q.c("");
            }
            aGH.a(netflixActivity).c(interfaceC5160btX, videoType, playContext, millis);
            return;
        }
        if (q == null) {
            C1044Mm.e("NetflixComWatchHandler", "MDX is null, go local playback");
        } else {
            if (b2) {
                e = q.c(c, this.c.d());
                C1044Mm.a("NetflixComWatchHandler", "setDialIpAsCurrentTarget " + c + " " + this.c.d() + " " + e);
            } else {
                e = q.e(c);
                C1044Mm.a("NetflixComWatchHandler", "setDialUuidAsCurrentTarget %s %b", c, Boolean.valueOf(e));
            }
            C1044Mm.e("NetflixComWatchHandler", "MDX exist, check if target is available");
            if (e) {
                DeepLinkUtils.INSTANCE.d(netflixActivity);
                aGH.a(netflixActivity).a(interfaceC5160btX, videoType, playContext, millis);
                return;
            }
            C1044Mm.e("NetflixComWatchHandler", "MDX does not know target dial UUID, go local playback");
        }
        aGH.a(netflixActivity).c(interfaceC5160btX, videoType, playContext, millis);
    }
}
