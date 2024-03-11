package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.Lazy;
import javax.inject.Inject;

/* renamed from: o.cMl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5898cMl {
    private final Lazy<cNT> a;
    private final Lazy<InterfaceC5844cKl> b;
    private final Lazy<LoginApi> c;
    private final NetflixActivity d;
    private final Lazy<InterfaceC8098ddv> e;

    @Inject
    public C5898cMl(Activity activity, Lazy<InterfaceC5844cKl> lazy, Lazy<LoginApi> lazy2, Lazy<cNT> lazy3, Lazy<InterfaceC8098ddv> lazy4) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) lazy4, "");
        this.b = lazy;
        this.c = lazy2;
        this.a = lazy3;
        this.e = lazy4;
        this.d = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = o.C8576dqs.U(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            com.netflix.mediaclient.android.activity.NetflixActivity r0 = r5.d
            com.netflix.mediaclient.servicemgr.ServiceManager r0 = r0.getServiceManager()
            java.util.List r0 = r0.e()
            if (r0 == 0) goto L12
            java.util.List r0 = o.C8570dqm.w(r0)
            if (r0 != 0) goto L16
        L12:
            java.util.List r0 = o.C8570dqm.c()
        L16:
            com.netflix.mediaclient.android.activity.NetflixActivity r1 = r5.d
            java.lang.String r1 = o.C8126deW.b(r1)
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L3f
            if (r1 == 0) goto L3f
            int r0 = r1.length()
            if (r0 != 0) goto L2c
            goto L3f
        L2c:
            dagger.Lazy<o.cKl> r0 = r5.b
            java.lang.Object r0 = r0.get()
            o.cKl r0 = (o.InterfaceC5844cKl) r0
            o.cNp r0 = r0.a()
            com.netflix.mediaclient.android.activity.NetflixActivity r2 = r5.d
            r3 = 0
            r0.a(r2, r1, r3)
            goto L54
        L3f:
            com.netflix.mediaclient.android.activity.NetflixActivity r0 = r5.d
            dagger.Lazy<o.cNT> r1 = r5.a
            java.lang.Object r1 = r1.get()
            o.cNT r1 = (o.cNT) r1
            com.netflix.mediaclient.android.activity.NetflixActivity r3 = r5.d
            com.netflix.cl.model.AppView r4 = com.netflix.cl.model.AppView.moreTab
            android.content.Intent r1 = r1.c(r3, r4, r2)
            r0.startActivity(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5898cMl.e():void");
    }

    public final void a() {
        NetflixActivity netflixActivity = this.d;
        netflixActivity.startActivity(cUS.b(netflixActivity));
    }

    public final void c() {
        new C3983bRx(this.d).d();
    }

    public final void b() {
        Intent d = this.e.get().d((Context) this.d);
        AppView uiScreen = this.d.getUiScreen();
        if (uiScreen != null) {
            d.putExtra(NetflixActivity.EXTRA_SOURCE, uiScreen.name());
        }
        d.putExtra(NetflixActivity.EXTRA_ENTRY, "appMenu");
        this.d.startActivity(d);
    }

    public final void d() {
        this.c.get().d(this.d);
    }
}
