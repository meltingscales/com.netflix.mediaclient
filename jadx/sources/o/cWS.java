package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* loaded from: classes5.dex */
public final class cWS {
    private final Activity a;
    private final UmaPresentAt.Point b;
    private C6186cXa c;
    private final BroadcastReceiver d;
    private final BroadcastReceiver e;

    @AssistedFactory
    /* loaded from: classes5.dex */
    public interface d {
        cWS b(UmaPresentAt.Point point);
    }

    @AssistedInject
    public cWS(Activity activity, @Assisted UmaPresentAt.Point point) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) point, "");
        this.a = activity;
        this.b = point;
        this.d = new b();
        this.e = new a();
    }

    /* loaded from: classes5.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Map k;
            Throwable th;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            if (cWS.this.b().getServiceManager().c()) {
                try {
                    cWS cws = cWS.this;
                    cws.b(cws.b());
                } catch (Exception e) {
                    InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                    k = dqE.k(new LinkedHashMap());
                    C1596aHd c1596aHd = new C1596aHd("Unable to render UMA", e, null, true, k, false, false, 96, null);
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
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1597aHe c2 = dVar2.c();
                    if (c2 != null) {
                        c2.d(c1596aHd, th);
                    } else {
                        dVar2.e().b(c1596aHd, th);
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            if (cWS.this.b().getServiceManager().c()) {
                cWS.this.d();
            }
        }
    }

    public final void c() {
        LocalBroadcastManager.getInstance(b()).registerReceiver(this.d, new IntentFilter("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
        LocalBroadcastManager.getInstance(b()).registerReceiver(this.e, new IntentFilter("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
    }

    public final void e() {
        LocalBroadcastManager.getInstance(b()).unregisterReceiver(this.d);
        LocalBroadcastManager.getInstance(b()).unregisterReceiver(this.e);
    }

    public final void b(Context context) {
        ServiceManager c;
        C6186cXa c6186cXa;
        C8632dsu.c((Object) context, "");
        C8166dfJ.e("SPY-18152: UMAs should only be removed on the main thread", false, 2, null);
        if (ServiceManager.c(b()) == null || (c = ServiceManager.c(b())) == null || !c.c()) {
            return;
        }
        ServiceManager c2 = ServiceManager.c(b());
        UmaAlert x = c2 != null ? c2.x() : null;
        if (x == null || !x.modalAlert()) {
            return;
        }
        UmaPresentAt.Point point = this.b;
        UmaPresentAt presentAt = x.presentAt();
        if (point != (presentAt != null ? presentAt.point() : null)) {
            return;
        }
        Fragment findFragmentByTag = b().getSupportFragmentManager().findFragmentByTag("UmaDialogFrag");
        if (findFragmentByTag != this.c && (findFragmentByTag instanceof C6186cXa)) {
            ((C6186cXa) findFragmentByTag).dismiss();
        }
        if (x.isConsumed() || x.isStale() || !C6193cXh.d(b(), x)) {
            return;
        }
        C6186cXa c6186cXa2 = this.c;
        if (c6186cXa2 == null) {
            C6186cXa d2 = C6186cXa.c.d(context, x, a());
            this.c = d2;
            if (d2 != null) {
                d2.addDismissOrCancelListener(new e());
            }
        } else if (c6186cXa2 != null) {
            c6186cXa2.d(x);
        }
        C6186cXa c6186cXa3 = this.c;
        if ((c6186cXa3 == null || !c6186cXa3.isVisible()) && (c6186cXa = this.c) != null) {
            c6186cXa.d(b());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends NetflixDialogFrag.a {
        e() {
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
        public void a(NetflixDialogFrag netflixDialogFrag) {
            C8632dsu.c((Object) netflixDialogFrag, "");
            if (netflixDialogFrag == cWS.this.c) {
                cWS.this.c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        C6186cXa c6186cXa;
        C6186cXa c6186cXa2 = this.c;
        if (c6186cXa2 != null) {
            if (c6186cXa2 != null && c6186cXa2.isVisible() && (c6186cXa = this.c) != null) {
                c6186cXa.dismissAllowingStateLoss();
            }
            this.c = null;
        }
    }

    private final ImageResolutionClass a() {
        aOV g;
        ServiceManager c = ServiceManager.c(b());
        if (c == null || (g = c.g()) == null) {
            return null;
        }
        return g.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetflixActivity b() {
        return (NetflixActivity) C9726vo.d(this.a, NetflixActivity.class);
    }
}
