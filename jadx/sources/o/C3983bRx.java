package o;

import android.net.Uri;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.C3983bRx;
import o.C8153dex;
import o.C8632dsu;
import o.cQQ;
import o.dpR;

/* renamed from: o.bRx */
/* loaded from: classes4.dex */
public final class C3983bRx {
    private boolean a;
    private final NetflixActivity d;
    public static final b c = new b(null);
    public static final int b = 8;

    /* renamed from: o.bRx$c */
    /* loaded from: classes4.dex */
    public interface c {
        void c(boolean z);
    }

    public final void c(String str, Status status, String str2) {
        C8632dsu.c((Object) status, "");
        b(this, str, status, str2, null, false, 24, null);
    }

    public final void c(String str, Status status, String str2, c cVar) {
        C8632dsu.c((Object) status, "");
        b(this, str, status, str2, cVar, false, 16, null);
    }

    @Inject
    public C3983bRx(NetflixActivity netflixActivity) {
        this.d = netflixActivity;
    }

    public static /* synthetic */ void b(C3983bRx c3983bRx, String str, Status status, String str2, c cVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            cVar = null;
        }
        c cVar2 = cVar;
        if ((i & 16) != 0) {
            z = false;
        }
        c3983bRx.b(str, status, str2, cVar2, z);
    }

    public final void b(String str, Status status, String str2, final c cVar, boolean z) {
        Handler handler;
        boolean g;
        Handler handler2;
        synchronized (this) {
            C8632dsu.c((Object) status, "");
            if (this.a) {
                C1044Mm.j("AccountHandler", "Account handler already executed because of timeout. Do nothing...");
            } else {
                this.a = true;
            }
            if (status.j() && str != null) {
                g = C8691duz.g(str);
                if ((!g) && str2 != null) {
                    String c2 = C8051ddA.c(str2, str);
                    if (!z) {
                        RunnableC8122deS runnableC8122deS = new RunnableC8122deS(this.d, c2);
                        NetflixActivity netflixActivity = this.d;
                        if (netflixActivity != null && (handler2 = netflixActivity.getHandler()) != null) {
                            handler2.post(runnableC8122deS);
                        }
                    } else if (this.d != null) {
                        String uri = Uri.parse(c2).buildUpon().appendQueryParameter("inapp", "true").appendQueryParameter("esn", this.d.getServiceManager().k().m()).build().toString();
                        C8632dsu.a(uri, "");
                        this.d.startActivity(ActivityC6188cXc.d.a(this.d, uri, null, null, false));
                    }
                    if (cVar != null) {
                        cVar.c(true);
                    }
                }
            }
            NetflixActivity netflixActivity2 = this.d;
            if (netflixActivity2 != null && (handler = netflixActivity2.getHandler()) != null) {
                handler.post(new Runnable() { // from class: o.bRy
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3983bRx.d(C3983bRx.this, cVar);
                    }
                });
            }
        }
    }

    public static final void d(C3983bRx c3983bRx, c cVar) {
        C8632dsu.c((Object) c3983bRx, "");
        C3985bRz e2 = C3985bRz.a.e();
        c3983bRx.d.showDialog(e2);
        e2.addDismissOrCancelListener(new e(cVar));
    }

    /* renamed from: o.bRx$e */
    /* loaded from: classes4.dex */
    public static final class e extends NetflixDialogFrag.a {
        final /* synthetic */ c c;

        e(c cVar) {
            this.c = cVar;
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
        public void a(NetflixDialogFrag netflixDialogFrag) {
            C8632dsu.c((Object) netflixDialogFrag, "");
            c cVar = this.c;
            if (cVar != null) {
                cVar.c(false);
            }
        }
    }

    public static /* synthetic */ boolean e(C3983bRx c3983bRx, String str, boolean z, c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        return c3983bRx.d(str, z, cVar);
    }

    public final boolean d(String str, boolean z, c cVar) {
        C8632dsu.c((Object) str, "");
        C1044Mm.e("AccountHandler", "Get autologin token...");
        NetflixActivity netflixActivity = this.d;
        if (netflixActivity == null || C8054ddD.l(netflixActivity)) {
            C1044Mm.d("AccountHandler", "On Account clicked -> NetflixActivity is null");
            return false;
        } else if (C8126deW.c(this.d) == null) {
            C1044Mm.d("AccountHandler", "userAgent is not available!");
            return false;
        } else {
            String a = aIJ.a(this.d, str);
            Single<cQQ.d> timeout = new cQQ().a(C8051ddA.e(a)).timeout(10000L, TimeUnit.MILLISECONDS);
            C8632dsu.a(timeout, "");
            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this.d, Lifecycle.Event.ON_DESTROY);
            C8632dsu.a(a2, "");
            Object as = timeout.as(AutoDispose.b(a2));
            C8632dsu.b(as, "");
            ((SingleSubscribeProxy) as).d(new d(a, cVar, z));
            return true;
        }
    }

    /* renamed from: o.bRx$d */
    /* loaded from: classes4.dex */
    public static final class d implements SingleObserver<cQQ.d> {
        final /* synthetic */ String a;
        final /* synthetic */ c b;
        final /* synthetic */ boolean d;

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        d(String str, c cVar, boolean z) {
            C3983bRx.this = r1;
            this.a = str;
            this.b = cVar;
            this.d = z;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: d */
        public void onSuccess(cQQ.d dVar) {
            C8632dsu.c((Object) dVar, "");
            C3983bRx.this.b(dVar.b(), dVar.e(), this.a, this.b, this.d);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
            C1044Mm.e("AccountHandler", "Error while requesting auto login token", th);
            C3983bRx.b(C3983bRx.this, null, new NetworkErrorStatus(C8237dgb.c), this.a, this.b, false, 16, null);
        }
    }

    public final boolean d() {
        NetflixActivity netflixActivity = this.d;
        if (netflixActivity == null || C8054ddD.l(netflixActivity)) {
            C1044Mm.d("AccountHandler", "openAccountSettingsPage -> NetflixActivity is null");
            return false;
        }
        C1645aIz.a(this.d, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.home.AccountHandler$openAccountSettingsPage$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                b(serviceManager);
                return dpR.c;
            }

            public final void b(ServiceManager serviceManager) {
                NetflixActivity netflixActivity2;
                C8632dsu.c((Object) serviceManager, "");
                netflixActivity2 = C3983bRx.this.d;
                boolean e2 = C8153dex.e(netflixActivity2);
                C3983bRx.e(C3983bRx.this, e2 ? "youraccountlite" : "youraccount", e2, null, 4, null);
            }
        });
        return true;
    }

    /* renamed from: o.bRx$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
