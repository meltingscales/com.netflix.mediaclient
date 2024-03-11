package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;
import java.util.Map;
import o.InterfaceC3643bFl;

/* loaded from: classes3.dex */
public final class aKR extends C1705aLe {
    public static final c b = new c(null);
    private final Map<String, String> d;

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DeepLinkGameDetailsPageHandler");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aKR(Map<String, String> map) {
        super(map);
        C8632dsu.c((Object) map, "");
        this.d = map;
    }

    @Override // o.C1705aLe, o.aKP
    public boolean c(List<String> list) {
        C8632dsu.c((Object) list, "");
        return list.size() > 1;
    }

    @Override // o.C1705aLe, o.aKP
    public Command d() {
        return new ViewDetailsCommand();
    }

    @Override // o.C1705aLe, o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) list, "");
        if (DeepLinkUtils.a(netflixActivity, intent, this.d)) {
            return NflxHandler.Response.HANDLING;
        }
        if (netflixActivity != null) {
            String str2 = list.get(1);
            TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.DEEPLINK);
            int parseInt = Integer.parseInt(str2);
            PlayContext d = C8194dfl.d(str);
            C8632dsu.a(d, "");
            InterfaceC3643bFl.c.a(InterfaceC3643bFl.c.a(netflixActivity), netflixActivity, VideoType.GAMES, str2, null, trackingInfoHolder.d(parseInt, d), "DeepLink", null, 64, null);
            netflixActivity.finish();
            return NflxHandler.Response.HANDLING;
        }
        return NflxHandler.Response.NOT_HANDLING;
    }
}
