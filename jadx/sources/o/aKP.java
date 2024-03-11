package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.List;

/* loaded from: classes3.dex */
public interface aKP {
    default boolean H_() {
        return true;
    }

    boolean c(List<String> list);

    Command d();

    NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str);
}
