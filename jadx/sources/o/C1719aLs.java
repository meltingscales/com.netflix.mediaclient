package o;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.Map;
import o.C8194dfl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aLs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1719aLs extends AbstractC1720aLt {
    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response c(String str, String str2, String str3) {
        return null;
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response d(String str, String str2, String str3) {
        return null;
    }

    public C1719aLs(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        C1044Mm.b("NflxHandler", "handleDownloadAction starts...");
        final C8194dfl.d e = e();
        if (e == null) {
            C1044Mm.d("NflxHandler", "handleDownloadAction fails, no video info found!");
            return NflxHandler.Response.NOT_HANDLING;
        } else if (e.e()) {
            C1044Mm.b("NflxHandler", "handleDownloadAction ends, handling with delay.");
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        } else {
            C1044Mm.b("NflxHandler", "handleDownloadAction, handling.");
            final VideoType a = e.a();
            final String d = e.d();
            return b(e.d(), new Runnable() { // from class: o.aLr
                @Override // java.lang.Runnable
                public final void run() {
                    C1719aLs.this.e(a, d, e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(VideoType videoType, String str, C8194dfl.d dVar) {
        DetailsActivityAction b = b();
        String g = g();
        String d = C8194dfl.d(this.d);
        if (videoType == VideoType.EPISODE) {
            C1044Mm.e("NflxHandler", "Showing details for episode: " + str + ", type: " + videoType + ", show: " + dVar.c());
            InterfaceC3643bFl.a((Context) this.b).c(this.b, dVar.c(), str, b(dVar.c(), d), b, g);
            return;
        }
        C1044Mm.e("NflxHandler", "Showing details for: " + str + ", type: " + videoType);
        InterfaceC3643bFl a = InterfaceC3643bFl.a((Context) this.b);
        NetflixActivity netflixActivity = this.b;
        TrackingInfoHolder b2 = b(str, d);
        a.c(netflixActivity, videoType, str, "", b2, b, g, getClass().getSimpleName() + ":mov");
    }

    private String g() {
        return this.d.get("msg_token");
    }

    private DetailsActivityAction b() {
        return DetailsActivityAction.c;
    }

    private TrackingInfoHolder b(String str, String str2) {
        return C8194dfl.d(str, str2, new EmptyPlayContext("NflxHandler", -541));
    }
}
