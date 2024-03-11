package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewCachedVideosCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aKI implements aKP {
    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C1044Mm.b("NetflixComDownloadHandler", "Starting download activity");
        String str2 = list.get(1);
        if (!C8168dfL.g(str2)) {
            a(str2, netflixActivity, str);
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        }
        return NflxHandler.Response.NOT_HANDLING;
    }

    @Override // o.aKP
    public Command d() {
        return new ViewCachedVideosCommand();
    }

    private void a(final String str, final NetflixActivity netflixActivity, final String str2) {
        if (netflixActivity.getServiceManager().j() == null) {
            return;
        }
        netflixActivity.getServiceManager().j().a(str, new AbstractC5164btb() { // from class: o.aKI.2
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void d(InterfaceC5223buh interfaceC5223buh, Status status) {
                if (status.j() && interfaceC5223buh != null) {
                    aKI.this.a(netflixActivity, interfaceC5223buh.getType(), str, str2);
                    return;
                }
                InterfaceC1598aHf.a(new C1596aHd("NetflixComDownloadHandler - got error trying to fetch video summary for: " + str).b(false));
                C8194dfl.c(netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AbstractC5164btb {
        final /* synthetic */ NetflixActivity a;
        private final String b;

        c(String str, NetflixActivity netflixActivity) {
            this.a = netflixActivity;
            this.b = str;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            if (status.j()) {
                aKI.this.e(this.a, interfaceC5238buw, C8194dfl.d(this.b));
            }
            C8194dfl.c(this.a);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
            if (status.j()) {
                aKI.this.e(this.a, interfaceC5227bul, C8194dfl.d(this.b));
            }
            C8194dfl.c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetflixActivity netflixActivity, VideoType videoType, String str, String str2) {
        if (netflixActivity.getServiceManager().j() == null) {
            return;
        }
        if (VideoType.MOVIE.equals(videoType)) {
            netflixActivity.getServiceManager().j().e(str, null, false, TaskMode.FROM_CACHE_OR_NETWORK, new c(str2, netflixActivity), "DeepLink.Download", Boolean.FALSE);
        } else if (VideoType.EPISODE.equals(videoType)) {
            netflixActivity.getServiceManager().j().e(str, null, false, new c(str2, netflixActivity), "DeepLink.Download");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(NetflixActivity netflixActivity, InterfaceC5198buI interfaceC5198buI, PlayContext playContext) {
        if (netflixActivity.getServiceManager().t() != null) {
            DeepLinkUtils.INSTANCE.d(netflixActivity, interfaceC5198buI.aE_(), interfaceC5198buI.getType(), playContext);
        }
    }
}
