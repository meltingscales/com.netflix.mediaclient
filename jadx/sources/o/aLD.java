package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;

/* loaded from: classes3.dex */
class aLD extends AbstractC1714aLn {
    public aLD(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        String e = C8194dfl.e(this.d.get("targetid"));
        InterfaceC5131bsv q = this.b.getServiceManager().q();
        if (q == null) {
            C1044Mm.d("NflxHandler", "Sync action is required, MDX agent is null. This should NOT happen!");
            return NflxHandler.Response.NOT_HANDLING;
        } else if (C6539cfH.e(q, e)) {
            C1044Mm.e("NflxHandler", "Sync action is required, target is available, sync");
            q.e(e);
            return NflxHandler.Response.NOT_HANDLING;
        } else {
            C1044Mm.e("NflxHandler", "Sync action is required, target not available, do nothing!");
            return NflxHandler.Response.NOT_HANDLING;
        }
    }
}
