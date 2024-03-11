package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.errors.DownloadDiagnostics$showStoragePermissionDialog$1;
import com.netflix.mediaclient.ui.offline.errors.DownloadDiagnostics$showWideVineRecoverableDialog$1;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C7400cvW;
import o.C7403cvZ;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cvW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7400cvW {
    private final C7403cvZ b;
    private final DialogInterface.OnClickListener d;

    public C7400cvW(Context context) {
        C8632dsu.c((Object) context, "");
        this.b = new C7403cvZ(context);
        this.d = new DialogInterface.OnClickListener() { // from class: o.cvU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7400cvW.b(dialogInterface, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final void e(cUS cus, ServiceManager serviceManager) {
        dpR dpr;
        OfflineUnavailableReason L;
        C8632dsu.c((Object) cus, "");
        C8632dsu.c((Object) serviceManager, "");
        if (C8054ddD.l(cus) || serviceManager.H()) {
            return;
        }
        if (C4337bcc.a()) {
            e(cus, OfflineUnavailableReason.NA_NO_EXTERNAL_STORAGE);
        } else if (C4337bcc.a(cus)) {
            c(cus, OfflineUnavailableReason.NA_OFFLINE_STORAGE_NOT_AVAILABLE);
        } else {
            aOV g = serviceManager.g();
            if (g == null || (L = g.L()) == null) {
                dpr = null;
            } else {
                e(cus, L);
                dpr = dpR.c;
            }
            if (dpr == null) {
                if (b(cus)) {
                    b(cus, OfflineUnavailableReason.NA_MSL_CLIENT_DISABLED);
                } else {
                    e(cus, OfflineUnavailableReason.NA_WIDE_VINE_UNRECOVERABLE);
                }
            }
        }
    }

    private final void c(cUS cus, OfflineUnavailableReason offlineUnavailableReason) {
        Observable<C7403cvZ.b> takeUntil = this.b.c(cus, offlineUnavailableReason.d()).takeUntil(cus.getActivityDestroy());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new DownloadDiagnostics$showStoragePermissionDialog$1(this, cus), 3, (Object) null);
    }

    private final void b(NetflixActivity netflixActivity, OfflineUnavailableReason offlineUnavailableReason) {
        Observable<C7403cvZ.b> takeUntil = this.b.c(netflixActivity, offlineUnavailableReason.d()).takeUntil(netflixActivity.getActivityDestroy());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new DownloadDiagnostics$showWideVineRecoverableDialog$1(this, netflixActivity), 3, (Object) null);
    }

    private final void e(final NetflixActivity netflixActivity, OfflineUnavailableReason offlineUnavailableReason) {
        Observable<C7403cvZ.b> takeUntil = this.b.c(netflixActivity, offlineUnavailableReason.d()).takeUntil(netflixActivity.getActivityDestroy());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<C7403cvZ.b, dpR>() { // from class: com.netflix.mediaclient.ui.offline.errors.DownloadDiagnostics$showDialog$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7403cvZ.b bVar) {
                e(bVar);
                return dpR.c;
            }

            public final void e(C7403cvZ.b bVar) {
                DialogInterface.OnClickListener onClickListener;
                C7400cvW c7400cvW = C7400cvW.this;
                AlertDialog.Builder message = new AlertDialog.Builder(netflixActivity).setTitle(bVar.a()).setMessage(bVar.e());
                int i = R.o.f13253fi;
                onClickListener = C7400cvW.this.d;
                AlertDialog create = message.setPositiveButton(i, onClickListener).create();
                C8632dsu.a(create, "");
                c7400cvW.d(create);
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AlertDialog alertDialog) {
        alertDialog.show();
        View findViewById = alertDialog.findViewById(16908299);
        C8632dsu.d(findViewById);
        ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final boolean b(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        boolean b = C8157dfA.b((Context) netflixActivity, "offline_ever_worked", false);
        ServiceManager serviceManager = netflixActivity.getServiceManager();
        aOV g = serviceManager != null ? serviceManager.g() : null;
        return b || (g != null && C8189dfg.d(netflixActivity, g.o()));
    }
}
