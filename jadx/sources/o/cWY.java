package o;

import android.view.View;
import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.model.context.GestureInput;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes5.dex */
public final class cWY {
    public static final View.OnClickListener c(UmaCta umaCta, UserMessageAreaView userMessageAreaView, cWX cwx) {
        C8632dsu.c((Object) umaCta, "");
        C8632dsu.c((Object) userMessageAreaView, "");
        C8632dsu.c((Object) cwx, "");
        return c(umaCta, userMessageAreaView, cwx, false, false, 24, null);
    }

    public static final View.OnClickListener e(UmaCta umaCta, UserMessageAreaView userMessageAreaView, cWX cwx, boolean z) {
        C8632dsu.c((Object) umaCta, "");
        C8632dsu.c((Object) userMessageAreaView, "");
        C8632dsu.c((Object) cwx, "");
        return c(umaCta, userMessageAreaView, cwx, z, false, 16, null);
    }

    public static final View.OnClickListener e(UmaCta umaCta, UserMessageAreaView userMessageAreaView, boolean z, boolean z2, cWX cwx) {
        C8632dsu.c((Object) umaCta, "");
        C8632dsu.c((Object) userMessageAreaView, "");
        C8632dsu.c((Object) cwx, "");
        return d(umaCta, userMessageAreaView, cwx, z, z2);
    }

    public static /* synthetic */ View.OnClickListener c(UmaCta umaCta, UserMessageAreaView userMessageAreaView, cWX cwx, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return d(umaCta, userMessageAreaView, cwx, z, z2);
    }

    /* loaded from: classes5.dex */
    public static final class e implements View.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ cWX b;
        final /* synthetic */ UserMessageAreaView c;
        final /* synthetic */ boolean d;
        final /* synthetic */ UmaCta e;

        e(UserMessageAreaView userMessageAreaView, UmaCta umaCta, cWX cwx, boolean z, boolean z2) {
            this.c = userMessageAreaView;
            this.e = umaCta;
            this.b = cwx;
            this.a = z;
            this.d = z2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) view, "");
            NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(view.getContext(), NetflixActivity.class);
            if (netflixActivity == null || C8054ddD.l(netflixActivity)) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Expected UMA view to run in a NetflixActivity", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                this.c.e(true);
                return;
            }
            this.c.d(this.e, new GestureInput(GestureInputKind.tap, Double.valueOf(1.0d)));
            netflixActivity.getServiceManager().b();
            view.setEnabled(false);
            this.b.d(this.e, view, netflixActivity);
            if (!this.a) {
                this.c.r();
            }
            if (this.d) {
                this.c.e(true);
            }
        }
    }

    public static final View.OnClickListener d(UmaCta umaCta, UserMessageAreaView userMessageAreaView, cWX cwx, boolean z, boolean z2) {
        C8632dsu.c((Object) umaCta, "");
        C8632dsu.c((Object) userMessageAreaView, "");
        C8632dsu.c((Object) cwx, "");
        return new e(userMessageAreaView, umaCta, cwx, z2, z);
    }
}
