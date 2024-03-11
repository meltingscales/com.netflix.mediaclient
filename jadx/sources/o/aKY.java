package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.HomeCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.List;

/* loaded from: classes3.dex */
public class aKY implements aKP {
    @Override // o.aKP
    public boolean c(List<String> list) {
        return list.size() > 1;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        String str2 = list.get(1);
        InterfaceC5131bsv q = netflixActivity.getServiceManager().q();
        if (q == null) {
            C1044Mm.d("NetflixComSyncHandler", "Sync action is required, MDX agent is null. This should NOT happen!");
        }
        if (C6539cfH.e(q, str2)) {
            C1044Mm.e("NetflixComSyncHandler", "Sync action is required, target is available, sync");
            q.e(str2);
        } else {
            C1044Mm.j("NetflixComSyncHandler", "Sync action is required, target not available, do nothing!");
        }
        DeepLinkUtils.INSTANCE.d(netflixActivity);
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    public Command d() {
        return new HomeCommand();
    }
}
