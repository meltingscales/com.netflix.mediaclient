package o;

import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.BaseNflxHandler;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.C8194dfl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aLE extends BaseNflxHandler {
    public aLE(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        C1044Mm.b("NflxHandler", "handlePlayAction starts...");
        String e = C8194dfl.e(this.d.get("targetid"));
        C8194dfl.d e2 = e();
        if (e2 == null) {
            C1044Mm.d("NflxHandler", "handlePlayAction fails, no video info found!");
            return NflxHandler.Response.NOT_HANDLING;
        } else if (e2.e()) {
            C1044Mm.b("NflxHandler", "handlePlayAction ends, handling with delay.");
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        } else {
            C1044Mm.b("NflxHandler", "handlePlayAction, handling.");
            VideoType a = e2.a();
            if (a == VideoType.MOVIE || a == VideoType.SHOW) {
                a(e2.d(), a, e, C8194dfl.d(this.d));
                return NflxHandler.Response.HANDLING_WITH_DELAY;
            }
            VideoType videoType = VideoType.EPISODE;
            if (a == videoType) {
                String a2 = C8194dfl.a(this.d);
                if (C8168dfL.g(a2)) {
                    C1044Mm.b("NflxHandler", "no episode id");
                    return NflxHandler.Response.NOT_HANDLING;
                }
                a(a2, videoType, e, C8194dfl.d(this.d));
                return NflxHandler.Response.HANDLING_WITH_DELAY;
            }
            return NflxHandler.Response.NOT_HANDLING;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AbstractC5164btb {
        private final String a;
        final /* synthetic */ String d;

        private b(String str, String str2) {
            this.d = str2;
            this.a = str;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            if (status.j()) {
                aLE.this.e(interfaceC5238buw, this.d, C8194dfl.d(this.a));
            }
            C8194dfl.c(aLE.this.b);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            if (status.j()) {
                aLE.this.e(interfaceC5227bul, this.d, C8194dfl.d(this.a));
            }
            C8194dfl.c(aLE.this.b);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            if (status.j()) {
                aLE.this.e(interfaceC5194buE, this.d, C8194dfl.d(this.a));
            }
            C8194dfl.c(aLE.this.b);
        }
    }

    protected void a(String str, VideoType videoType, String str2, String str3) {
        if (VideoType.MOVIE.equals(videoType)) {
            this.b.getServiceManager().j().e(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, new b(str3, str2), "PlayAction", Boolean.FALSE);
        } else if (VideoType.EPISODE.equals(videoType)) {
            this.b.getServiceManager().j().e(str, null, false, new b(str3, str2), "PlayAction");
        } else if (VideoType.SHOW.equals(videoType)) {
            this.b.getServiceManager().j().b(str, (String) null, new b(str3, str2), "PlayAction");
        }
    }

    private void d(NetflixActivity netflixActivity) {
        if (netflixActivity.getUserAgent() == null || !netflixActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        DeepLinkUtils.INSTANCE.d(netflixActivity);
    }

    protected void e(InterfaceC5198buI interfaceC5198buI, String str, PlayContext playContext) {
        d(this.b);
        if (C8168dfL.g(str)) {
            C1044Mm.e("NflxHandler", "Starting local playback");
            aGH.a(this.b).b(interfaceC5198buI.aE_().aH_(), interfaceC5198buI.aE_().aY_(), interfaceC5198buI.getType(), playContext, PlaybackLauncher.e);
            return;
        }
        InterfaceC5131bsv q = this.b.getServiceManager().q();
        if (q == null) {
            C1044Mm.e("NflxHandler", "MDX is null, go local playback");
        } else {
            C1044Mm.e("NflxHandler", "MDX exist, check if target is available");
            if (q.e(str)) {
                c();
                aGH.a(this.b).a(interfaceC5198buI.aE_(), interfaceC5198buI.getType(), playContext, -1L);
                return;
            }
            C1044Mm.e("NflxHandler", "MDX does not know target dial UUID, go local playback");
        }
        aGH.a(this.b).b(interfaceC5198buI.aE_().aH_(), interfaceC5198buI.aE_().aY_(), interfaceC5198buI.getType(), playContext, PlaybackLauncher.e);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response d(String str, String str2, String str3) {
        if (str != null) {
            a(str, VideoType.MOVIE, str2, str3);
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        }
        C1044Mm.d("NflxHandler", "Video ID not found, return to LOLOMO");
        c();
        return NflxHandler.Response.HANDLING;
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response c(String str, String str2, String str3) {
        a(str, VideoType.EPISODE, str2, str3);
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }
}
