package o;

import android.content.Context;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.util.Map;

/* renamed from: o.aLv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1722aLv extends AbstractC1714aLn {
    public C1722aLv(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        C1044Mm.b("NflxHandler", "Starting home activity");
        NetflixActivity netflixActivity = this.b;
        netflixActivity.startActivity(HomeActivity.d((Context) netflixActivity, AppView.UNKNOWN, false));
        this.b.overridePendingTransition(0, 0);
        return NflxHandler.Response.HANDLING;
    }
}
