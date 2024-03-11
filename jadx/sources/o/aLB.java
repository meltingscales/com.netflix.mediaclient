package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;

/* loaded from: classes3.dex */
class aLB extends AbstractC1714aLn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aLB(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        String str = this.d.get("query");
        if (C8168dfL.g(str)) {
            C1044Mm.b("NflxHandler", "Could not find query param");
            return NflxHandler.Response.NOT_HANDLING;
        }
        InterfaceC6068cSu.c(this.b).c(str);
        return NflxHandler.Response.HANDLING;
    }
}
