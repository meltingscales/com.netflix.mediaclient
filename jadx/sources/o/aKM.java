package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class aKM implements aKP {
    public static final e c = new e(null);

    @Override // o.aKP
    public boolean H_() {
        return false;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("DeepLinkClcsHookHandler");
        }
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return list != null && list.size() > 1;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        UserAgent u = netflixActivity.getServiceManager().u();
        Uri data = intent.getData();
        if (!ConnectivityUtils.o(netflixActivity) || u == null || !u.v() || data == null) {
            return NflxHandler.Response.NOT_HANDLING;
        }
        u.b(new d(netflixActivity, intent, data));
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C5015bql {
        final /* synthetic */ Intent a;
        final /* synthetic */ NetflixActivity b;
        final /* synthetic */ Uri c;

        d(NetflixActivity netflixActivity, Intent intent, Uri uri) {
            this.b = netflixActivity;
            this.a = intent;
            this.c = uri;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void e(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            if (status.j()) {
                aKM.this.a(this.b, this.a);
            } else if (!status.g()) {
                Intent c = C8069ddS.c(this.c);
                c.putExtra("web_intent", true);
                NetflixApplication.getInstance().c(c);
            } else {
                NetflixActivity netflixActivity = this.b;
                Intent d = HomeActivity.d((Context) netflixActivity, netflixActivity.getUiScreen(), false);
                C8632dsu.a(d, "");
                this.b.startActivity(d);
            }
            C8194dfl.c(this.b);
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetflixActivity netflixActivity, Intent intent) {
        Intent d2 = HomeActivity.d((Context) netflixActivity, netflixActivity.getUiScreen(), false);
        C8632dsu.a(d2, "");
        d2.putExtra("is_clcs_hook", true);
        d2.setData(intent.getData());
        netflixActivity.startActivity(d2);
    }
}
