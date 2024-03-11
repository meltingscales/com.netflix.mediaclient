package o;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.command.SignInCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.List;
import java.util.Map;
import o.C1709aLi;
import o.C8194dfl;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.aLi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1709aLi implements aKP {
    public static final a c = new a(null);
    private final Map<String, String> a;
    private final LoginApi b;
    private final InterfaceC6282caP e;

    @AssistedFactory
    /* renamed from: o.aLi$c */
    /* loaded from: classes3.dex */
    public interface c {
        C1709aLi e(Map<String, String> map);
    }

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    @AssistedInject
    public C1709aLi(InterfaceC6282caP interfaceC6282caP, LoginApi loginApi, @Assisted Map<String, String> map) {
        C8632dsu.c((Object) interfaceC6282caP, "");
        C8632dsu.c((Object) loginApi, "");
        C8632dsu.c((Object) map, "");
        this.e = interfaceC6282caP;
        this.b = loginApi;
        this.a = map;
    }

    @Override // o.aKP
    public NflxHandler.Response d(final NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        UserAgent userAgent = netflixActivity.getUserAgent();
        if (userAgent != null && userAgent.v()) {
            e(netflixActivity);
            return NflxHandler.Response.HANDLING;
        } else if (!Config_FastProperty_OauthTwoViaBrowser.Companion.e()) {
            c(netflixActivity, false);
            return NflxHandler.Response.HANDLING;
        } else {
            String str2 = this.a.get("state");
            String str3 = this.a.get("authorizationCode");
            String str4 = this.a.get(UmaAlert.ICON_ERROR);
            if (str4 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "oauth2LoginError");
                jSONObject.put(UmaAlert.ICON_ERROR, str4);
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            }
            InterfaceC6282caP interfaceC6282caP = this.e;
            Lifecycle lifecycle = netflixActivity.getLifecycle();
            C8632dsu.a(lifecycle, "");
            interfaceC6282caP.d(netflixActivity, LifecycleKt.getCoroutineScope(lifecycle), userAgent, str3, str2, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.protocol.netflixcom.DeeplinkOauth2LoginHandler$tryHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return dpR.c;
                }

                public final void a(boolean z) {
                    if (!z) {
                        C1709aLi.this.c(netflixActivity, true);
                    } else {
                        NetflixApplication.getInstance().l();
                    }
                    C8194dfl.c(netflixActivity);
                }
            });
            return NflxHandler.Response.HANDLING_WITH_DELAY;
        }
    }

    @Override // o.aKP
    /* renamed from: a */
    public SignInCommand d() {
        return new SignInCommand();
    }

    private final void e(NetflixActivity netflixActivity) {
        Intent addFlags = cNT.a.d(netflixActivity).c((NetflixActivityBase) netflixActivity, AppView.webLink, false).addFlags(268468224);
        C8632dsu.a(addFlags, "");
        netflixActivity.startActivity(addFlags);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity, boolean z) {
        Intent c2;
        if (z) {
            c2 = this.b.a(netflixActivity, LoginApi.Oauth2State.d);
        } else {
            c2 = this.b.c(netflixActivity);
        }
        netflixActivity.startActivity(c2);
    }

    /* renamed from: o.aLi$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
