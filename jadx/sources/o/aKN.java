package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.HomeCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aKN implements aKP {
    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C1044Mm.b("NetflixComHomeHandler", "Starting home activity");
        DeepLinkUtils.INSTANCE.d(netflixActivity);
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    public Command d() {
        return new HomeCommand();
    }
}
