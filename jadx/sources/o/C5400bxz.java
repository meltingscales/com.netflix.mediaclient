package o;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.view.View;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.util.Map;
import o.C5400bxz;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

/* renamed from: o.bxz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5400bxz extends AbstractC5349bxA {
    private final AppUpdateManager a;
    private AppUpdateInfo d;
    private int e;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5400bxz c5400bxz, Exception exc) {
        C8632dsu.c((Object) c5400bxz, "");
        C8632dsu.c((Object) exc, "");
    }

    @Override // o.AbstractC5349bxA, o.InterfaceC5350bxB
    public void e(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5400bxz(AppUpdateManager appUpdateManager) {
        super("InAppUpdate");
        C8632dsu.c((Object) appUpdateManager, "");
        this.a = appUpdateManager;
    }

    @Override // o.InterfaceC5350bxB
    public boolean e(NetflixActivity netflixActivity, boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        if (z) {
            this.e = 1;
            a("inAppUpdate", false);
            a(netflixActivity);
            return true;
        }
        this.e = 0;
        if (d()) {
            e((Context) netflixActivity);
            a("inAppUpdate", true);
            d(netflixActivity);
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5350bxB
    public void c(NetflixActivity netflixActivity, int i) {
        C8632dsu.c((Object) netflixActivity, "");
        if (i != -1) {
            if (i != 0) {
                return;
            }
            d("inAppUpdate", this.e == 0, new RuntimeException("USER_CANCELED"));
        }
        if (this.e == 0) {
            d((Activity) netflixActivity);
        }
    }

    private final void d(final NetflixActivity netflixActivity) {
        Task<AppUpdateInfo> appUpdateInfo = this.a.getAppUpdateInfo();
        final drM<AppUpdateInfo, dpR> drm = new drM<AppUpdateInfo, dpR>() { // from class: com.netflix.mediaclient.ui.appupdate.InAppUpdater$refreshFlexible$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AppUpdateInfo appUpdateInfo2) {
                d(appUpdateInfo2);
                return dpR.c;
            }

            public final void d(AppUpdateInfo appUpdateInfo2) {
                if (appUpdateInfo2.installStatus() == 11) {
                    C5400bxz.this.c(netflixActivity);
                } else if (appUpdateInfo2.updateAvailability() == 2 && appUpdateInfo2.isUpdateTypeAllowed(0)) {
                    C5400bxz c5400bxz = C5400bxz.this;
                    NetflixActivity netflixActivity2 = netflixActivity;
                    C8632dsu.d(appUpdateInfo2);
                    c5400bxz.b(netflixActivity2, appUpdateInfo2);
                } else if (appUpdateInfo2.updateAvailability() != 3) {
                    C5400bxz.this.d = null;
                    C5400bxz c5400bxz2 = C5400bxz.this;
                    int updateAvailability = appUpdateInfo2.updateAvailability();
                    c5400bxz2.e(new RuntimeException("flexible update not available " + updateAvailability), netflixActivity);
                }
            }
        };
        appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: o.bxF
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C5400bxz.f(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.bxD
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5400bxz.e(C5400bxz.this, netflixActivity, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5400bxz c5400bxz, NetflixActivity netflixActivity, Exception exc) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c5400bxz, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) exc, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("refreshFlexible error", exc, null, true, k, false, false, 96, null);
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
        c5400bxz.e(exc, netflixActivity);
    }

    private final void a(final NetflixActivity netflixActivity) {
        Task<AppUpdateInfo> appUpdateInfo = this.a.getAppUpdateInfo();
        final drM<AppUpdateInfo, dpR> drm = new drM<AppUpdateInfo, dpR>() { // from class: com.netflix.mediaclient.ui.appupdate.InAppUpdater$refreshImmediate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AppUpdateInfo appUpdateInfo2) {
                c(appUpdateInfo2);
                return dpR.c;
            }

            public final void c(AppUpdateInfo appUpdateInfo2) {
                if (!appUpdateInfo2.isUpdateTypeAllowed(1)) {
                    C5400bxz.this.d = null;
                    C5400bxz.this.e(new RuntimeException("refreshImmediate not allowed"), netflixActivity);
                } else if (appUpdateInfo2.updateAvailability() == 2) {
                    C5400bxz c5400bxz = C5400bxz.this;
                    NetflixActivity netflixActivity2 = netflixActivity;
                    C8632dsu.d(appUpdateInfo2);
                    c5400bxz.b(netflixActivity2, appUpdateInfo2);
                } else if (appUpdateInfo2.updateAvailability() == 3) {
                    C5400bxz.this.c(netflixActivity, appUpdateInfo2);
                }
            }
        };
        appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: o.bxJ
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C5400bxz.j(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.bxI
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5400bxz.b(C5400bxz.this, netflixActivity, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5400bxz c5400bxz, NetflixActivity netflixActivity, Exception exc) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c5400bxz, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) exc, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("refreshImmediate error", exc, null, true, k, false, false, 96, null);
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
        c5400bxz.e(exc, netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(NetflixActivity netflixActivity, AppUpdateInfo appUpdateInfo) {
        this.d = appUpdateInfo;
        j(netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity, AppUpdateInfo appUpdateInfo) {
        this.d = appUpdateInfo;
        j(netflixActivity);
    }

    private final void j(NetflixActivity netflixActivity) {
        AppUpdateInfo appUpdateInfo = this.d;
        if (appUpdateInfo == null) {
            return;
        }
        if (appUpdateInfo != null && appUpdateInfo.installStatus() == 11) {
            c(netflixActivity);
            return;
        }
        try {
            AppUpdateManager appUpdateManager = this.a;
            AppUpdateInfo appUpdateInfo2 = this.d;
            C8632dsu.d(appUpdateInfo2);
            appUpdateManager.startUpdateFlowForResult(appUpdateInfo2, this.e, netflixActivity, 23);
        } catch (IntentSender.SendIntentException e) {
            e(e, netflixActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Exception exc, NetflixActivity netflixActivity) {
        a();
        c();
        d("inAppUpdate", this.e == 0, exc);
        d((Activity) netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity) {
        if (netflixActivity instanceof HomeActivity) {
            Snackbar e = e((HomeActivity) netflixActivity);
            e.setAction(com.netflix.mediaclient.ui.R.o.lg, new View.OnClickListener() { // from class: o.bxK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5400bxz.e(C5400bxz.this, view);
                }
            });
            View view = e.getView();
            C8632dsu.a(view, "");
            view.setBackgroundColor(netflixActivity.getResources().getColor(C9834xU.c.l));
            e.setActionTextColor(netflixActivity.getResources().getColor(17170459));
            e.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5400bxz c5400bxz, View view) {
        C8632dsu.c((Object) c5400bxz, "");
        c5400bxz.e();
    }

    private final void e() {
        Task<Void> completeUpdate = this.a.completeUpdate();
        final drM<Void, dpR> drm = new drM<Void, dpR>() { // from class: com.netflix.mediaclient.ui.appupdate.InAppUpdater$completeUpdate$2
            {
                super(1);
            }

            public final void b(Void r1) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Void r1) {
                b(r1);
                return dpR.c;
            }
        };
        completeUpdate.addOnSuccessListener(new OnSuccessListener() { // from class: o.bxE
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C5400bxz.b(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.bxG
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5400bxz.e(C5400bxz.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5400bxz c5400bxz, Exception exc) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c5400bxz, "");
        C8632dsu.c((Object) exc, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("completeUpdate error", exc, null, true, k, false, false, 96, null);
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
    }

    @Override // o.AbstractC5349bxA, o.InterfaceC5350bxB
    public void b(final NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        Task<AppUpdateInfo> appUpdateInfo = this.a.getAppUpdateInfo();
        final drM<AppUpdateInfo, dpR> drm = new drM<AppUpdateInfo, dpR>() { // from class: com.netflix.mediaclient.ui.appupdate.InAppUpdater$onActivityResume$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AppUpdateInfo appUpdateInfo2) {
                e(appUpdateInfo2);
                return dpR.c;
            }

            public final void e(AppUpdateInfo appUpdateInfo2) {
                if (appUpdateInfo2.installStatus() == 11) {
                    C5400bxz.this.c(netflixActivity);
                }
            }
        };
        appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: o.bxC
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C5400bxz.i(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.bxL
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5400bxz.b(C5400bxz.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Snackbar e(HomeActivity homeActivity) {
        C8632dsu.c((Object) homeActivity, "");
        Snackbar make = Snackbar.make(homeActivity.getWindow().getDecorView(), com.netflix.mediaclient.ui.R.o.hC, -2);
        C8632dsu.a(make, "");
        return make;
    }
}
