package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class aKV extends C1705aLe {
    public aKV(Map<String, String> map) {
        super(map);
    }

    @Override // o.C1705aLe, o.aKP
    public boolean c(List<String> list) {
        return list.size() > 2 && "Kids".equals(list.get(0));
    }

    @Override // o.C1705aLe
    protected NflxHandler.Response e(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        String str2 = list.get(2);
        String str3 = list.get(1);
        str3.hashCode();
        if (str3.equals(SignupConstants.Field.VIDEO_TITLE)) {
            a(str2, netflixActivity, intent, str);
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        } else if (str3.equals("character")) {
            InterfaceC3643bFl.a((Context) netflixActivity).b(netflixActivity, VideoType.CHARACTERS, list.get(2), null, new TrackingInfoHolder(PlayLocationType.DEEPLINK).d(Integer.parseInt(str2), C8194dfl.d(str)), "DeepLink", new PlayerExtras());
            netflixActivity.finish();
            return NflxHandler.Response.HANDLING;
        } else {
            return NflxHandler.Response.NOT_HANDLING;
        }
    }

    @Override // o.C1705aLe, o.aKP
    public Command d() {
        return new ViewDetailsCommand();
    }
}
