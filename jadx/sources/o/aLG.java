package o;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.Map;
import o.C8194dfl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aLG extends AbstractC1720aLt {
    protected DetailsActivityAction b() {
        return null;
    }

    protected String d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aLG(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        C1044Mm.b("NflxHandler", "handleViewDetailsAction starts...");
        final C8194dfl.d e = e();
        if (e == null) {
            C1044Mm.d("NflxHandler", "handleViewDetailsAction fails, no video info found!");
            return NflxHandler.Response.NOT_HANDLING;
        } else if (e.e()) {
            C1044Mm.b("NflxHandler", "handleViewDetailsAction ends, handling with delay.");
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        } else {
            return b(e.d(), new Runnable() { // from class: o.aLI
                @Override // java.lang.Runnable
                public final void run() {
                    aLG.this.b(e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void b(C8194dfl.d dVar) {
        VideoType a = dVar.a();
        String d = dVar.d();
        String d2 = C8194dfl.d(this.d);
        if (a == VideoType.EPISODE) {
            InterfaceC3643bFl.a((Context) this.b).c(this.b, dVar.c(), d, C8194dfl.a(d, d2), b(), d());
            return;
        }
        InterfaceC3643bFl a2 = InterfaceC3643bFl.a((Context) this.b);
        NetflixActivity netflixActivity = this.b;
        TrackingInfoHolder a3 = C8194dfl.a(d, d2);
        DetailsActivityAction b = b();
        String d3 = d();
        a2.c(netflixActivity, a, d, "", a3, b, d3, getClass().getSimpleName() + ":mov");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, String str2) {
        InterfaceC3643bFl a = InterfaceC3643bFl.a((Context) this.b);
        NetflixActivity netflixActivity = this.b;
        VideoType videoType = VideoType.MOVIE;
        TrackingInfoHolder a2 = C8194dfl.a(str, str2);
        DetailsActivityAction b = b();
        String d = d();
        a.c(netflixActivity, videoType, str, "", a2, b, d, getClass().getSimpleName() + ":tinyUrlMov");
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response d(final String str, String str2, final String str3) {
        return b(str, new Runnable() { // from class: o.aLJ
            @Override // java.lang.Runnable
            public final void run() {
                aLG.this.e(str, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2) {
        InterfaceC3643bFl a = InterfaceC3643bFl.a((Context) this.b);
        NetflixActivity netflixActivity = this.b;
        VideoType videoType = VideoType.SHOW;
        TrackingInfoHolder a2 = C8194dfl.a(str, str2);
        DetailsActivityAction b = b();
        String d = d();
        a.c(netflixActivity, videoType, str, "", a2, b, d, getClass().getSimpleName() + ":tinyUrlEp");
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response c(final String str, String str2, final String str3) {
        return b(str, new Runnable() { // from class: o.aLK
            @Override // java.lang.Runnable
            public final void run() {
                aLG.this.c(str, str3);
            }
        });
    }
}
