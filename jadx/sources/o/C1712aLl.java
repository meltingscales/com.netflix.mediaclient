package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.event.session.command.SubmitCommand;
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

/* renamed from: o.aLl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1712aLl implements aKP {
    public static final c a = new c(null);
    private final Map<String, String> b;
    private final bEY e;

    @AssistedFactory
    /* renamed from: o.aLl$d */
    /* loaded from: classes3.dex */
    public interface d {
        C1712aLl b(Map<String, String> map);
    }

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    @AssistedInject
    public C1712aLl(bEY bey, @Assisted Map<String, String> map) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) map, "");
        this.e = bey;
        this.b = map;
    }

    /* renamed from: o.aLl$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("InternalGameControllerHandler");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aKP
    public boolean c(List<String> list) {
        String str;
        boolean a2;
        Config_FastProperty_GameController.d dVar = Config_FastProperty_GameController.Companion;
        if (!dVar.d() || (str = this.b.get("controllerUiUrl")) == null) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        Boolean bool = null;
        if (host != null) {
            for (Object obj : dVar.c()) {
                String str2 = (String) obj;
                if (!C8632dsu.c((Object) host, (Object) str2)) {
                    C8632dsu.d((Object) host);
                    a2 = C8691duz.a(host, "." + str2, false, 2, null);
                    if (a2) {
                    }
                }
                bool = obj;
            }
            bool = Boolean.valueOf(bool != null);
        }
        return bool != null && bool.booleanValue();
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        UserAgent userAgent = netflixActivity.getUserAgent();
        boolean v = userAgent != null ? userAgent.v() : false;
        c cVar = a;
        cVar.getLogTag();
        if (Config_FastProperty_GameController.Companion.e() && v) {
            cVar.getLogTag();
            DeepLinkUtils.INSTANCE.c(netflixActivity);
        } else if (!v) {
            netflixActivity.startActivity(cVB.d(netflixActivity));
        }
        this.e.e(netflixActivity, this.b);
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    /* renamed from: a */
    public SubmitCommand d() {
        return new SubmitCommand();
    }
}
