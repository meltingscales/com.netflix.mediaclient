package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.SignOutReason;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.SignOut;
import com.netflix.cl.model.event.session.command.SignOutCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import io.reactivex.android.schedulers.AndroidSchedulers;
import o.C9834xU;

/* renamed from: o.caR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC6284caR extends bZV {
    public static Intent d(Context context) {
        return new Intent(context, a());
    }

    public static void e(final Activity activity) {
        new AlertDialog.Builder(activity, C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.ei).setMessage(com.netflix.mediaclient.ui.R.o.ea).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, (DialogInterface.OnClickListener) null).setPositiveButton(com.netflix.mediaclient.ui.R.o.go, new DialogInterface.OnClickListener() { // from class: o.caR.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                CLv2Utils.d(new SignOutCommand());
                Activity activity2 = activity;
                activity2.startActivity(ActivityC6284caR.d(activity2));
                activity.overridePendingTransition(0, 0);
            }
        }).show();
    }

    public static Class<?> a() {
        return NetflixApplication.getInstance().M() ? ActivityC6281caO.class : ActivityC6284caR.class;
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mUserAgentRepository = new cQQ();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: o.caR.3
            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                Long startSession = Logger.INSTANCE.startSession(new SignOut(SignOutReason.user, null, null, null, null));
                if (C8126deW.c(ActivityC6284caR.this) != null) {
                    ActivityC6284caR.this.b(startSession);
                    CLv2Utils.d(new SignOutCommand());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Status status, Long l) {
        if (status.j()) {
            Logger.INSTANCE.endSession(l);
            d();
            return;
        }
        Logger.INSTANCE.endSession(Action.createActionFailedEvent(l, C8169dfM.b(status)));
        InterfaceC1593aHa.b("Error logging out: " + status.l());
        C8054ddD.c(this, com.netflix.mediaclient.ui.R.o.dJ, 1).show();
        finish();
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    private void d() {
        C1044Mm.a("LogoutActivity", "Handling logout completion...");
        PerformanceProfilerImpl.INSTANCE.b();
        C8054ddD.c(this, com.netflix.mediaclient.ui.R.o.gr, 1);
        c(this, "handleLogoutComplete()");
    }

    public static void c(NetflixActivity netflixActivity, String str) {
        ServiceManager serviceManager = netflixActivity.getServiceManager();
        if (serviceManager == null) {
            C1044Mm.j("LogoutActivity", "ServiceManager is null - can't flush caches!");
        } else {
            serviceManager.j().d();
        }
        NetflixActivity.finishAllActivities(netflixActivity);
        netflixActivity.startActivity(ActivityC4183bZh.d(netflixActivity, netflixActivity.getUiScreen()));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.logout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AutoDispose"})
    public void b(final Long l) {
        this.mUserAgentRepository.k().observeOn(AndroidSchedulers.mainThread()).takeUntil(this.mActivityDestroy).subscribe(new bDM<Status>("LogoutActivity logoutError") { // from class: o.caR.4
            @Override // io.reactivex.Observer
            /* renamed from: c */
            public void onNext(Status status) {
                ActivityC6284caR.this.d(status, l);
            }
        });
    }
}
