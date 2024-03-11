package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public final class aKW implements aKP {
    public static final c b = new c(null);
    private final LoginApi a;

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    @Inject
    public aKW(LoginApi loginApi) {
        C8632dsu.c((Object) loginApi, "");
        this.a = loginApi;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DeepLinkOauth2InitHandler");
        }
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        Intent c2;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        UserAgent u = netflixActivity.getServiceManager().u();
        if (u != null && u.v()) {
            Intent d = HomeActivity.d((Context) netflixActivity, netflixActivity.getUiScreen(), false);
            C8632dsu.a(d, "");
            netflixActivity.startActivity(d);
        } else {
            if (Config_FastProperty_OauthTwoViaBrowser.Companion.e()) {
                c2 = this.a.a(netflixActivity, LoginApi.Oauth2State.e);
            } else {
                c2 = this.a.c(netflixActivity);
            }
            netflixActivity.startActivity(c2);
        }
        return NflxHandler.Response.HANDLING;
    }

    /* loaded from: classes3.dex */
    public static final class a extends Command {
        a() {
        }
    }

    @Override // o.aKP
    public Command d() {
        return new a();
    }
}
