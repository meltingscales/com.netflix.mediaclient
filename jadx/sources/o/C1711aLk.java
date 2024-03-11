package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GameController;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.List;
import java.util.Map;

/* renamed from: o.aLk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1711aLk implements aKP {
    public static final d b = new d(null);
    private final bEY d;
    private final Map<String, String> e;

    @AssistedFactory
    /* renamed from: o.aLk$e */
    /* loaded from: classes3.dex */
    public interface e {
        C1711aLk e(Map<String, String> map);
    }

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    @AssistedInject
    public C1711aLk(bEY bey, @Assisted Map<String, String> map) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) map, "");
        this.d = bey;
        this.e = map;
    }

    /* renamed from: o.aLk$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GameControllerHandler");
        }
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return Config_FastProperty_GameController.Companion.d();
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        Integer n;
        ConnectionSource connectionSource;
        UserAgent userAgent;
        int w;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        boolean z = true;
        String str2 = (list == null || list.size() <= 1) ? null : list.get(1);
        n = C8689dux.n(this.e.getOrDefault("connectionSource", "0"));
        if (n != null) {
            ConnectionSource[] values = ConnectionSource.values();
            int intValue = n.intValue();
            if (intValue >= 0) {
                w = C8563dqf.w(values);
                if (intValue <= w) {
                    connectionSource = values[intValue];
                }
            }
            connectionSource = ConnectionSource.deepLink;
        } else {
            connectionSource = ConnectionSource.deepLink;
        }
        if (c(list) && str2 != null) {
            UserAgent userAgent2 = netflixActivity.getUserAgent();
            boolean v = userAgent2 != null ? userAgent2.v() : false;
            d dVar = b;
            dVar.getLogTag();
            boolean z2 = (!v || (userAgent = netflixActivity.getUserAgent()) == null || userAgent.u()) ? false : true;
            dVar.getLogTag();
            if (!Config_FastProperty_GameController.Companion.e() || !z2) {
                z = false;
            }
            dVar.getLogTag();
            if (z) {
                dVar.getLogTag();
                DeepLinkUtils.INSTANCE.c(netflixActivity);
            } else if (!v) {
                netflixActivity.startActivity(cVB.d(netflixActivity));
            }
            this.d.a(netflixActivity, str2, connectionSource);
            return NflxHandler.Response.HANDLING;
        }
        return NflxHandler.Response.NOT_HANDLING;
    }

    @Override // o.aKP
    /* renamed from: b */
    public SubmitCommand d() {
        return new SubmitCommand();
    }
}
