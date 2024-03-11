package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.List;
import o.AbstractC1608aHp;

/* loaded from: classes3.dex */
public final class aKU implements aKP {
    @Override // o.aKP
    public boolean c(List<String> list) {
        C8632dsu.c((Object) list, "");
        return true;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) list, "");
        C7017coI.c.e().d(AbstractC1608aHp.g.d).b(netflixActivity);
        return NflxHandler.Response.HANDLING;
    }

    /* loaded from: classes3.dex */
    public static final class e extends Command {
        e() {
        }
    }

    @Override // o.aKP
    public Command d() {
        return new e();
    }
}
