package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SignUpCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aKD implements aKP {
    @Override // o.aKP
    public boolean c(List<String> list) {
        return e(list);
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C1044Mm.b("NetflixComAccountSignupHandler", "Starting Home Activity");
        netflixActivity.startActivity(HomeActivity.b((Context) netflixActivity, AppView.notificationItem, false));
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    public Command d() {
        return new SignUpCommand();
    }

    private boolean e(List<String> list) {
        return list.size() > 1 && "signup".equalsIgnoreCase(list.get(1));
    }
}
