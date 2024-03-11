package o;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;

/* loaded from: classes3.dex */
class aLC extends AbstractC1714aLn {
    private long e;

    public aLC(NetflixActivity netflixActivity, Map<String, String> map, long j) {
        super(netflixActivity, map);
        this.e = j;
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        C1044Mm.e("NflxHandler", "Profile gate is required.");
        C8194dfl.c(this.b, this.d, this.e);
        AppView appView = AppView.browseTitles;
        NetflixActivity netflixActivity = this.b;
        cNT a = cNT.a(netflixActivity);
        NetflixActivity netflixActivity2 = this.b;
        netflixActivity.startActivity(a.c(netflixActivity2, appView, netflixActivity2.getUiScreen()));
        return NflxHandler.Response.HANDLING;
    }
}
