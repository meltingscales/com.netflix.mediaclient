package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.util.SignupFlowModeStackManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import javax.inject.Inject;
import o.C8054ddD;
import o.C8168dfL;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;
import o.drO;

/* loaded from: classes3.dex */
public final class ErrorDialogHelper {
    public static final int $stable = 8;
    private final Activity activity;
    private final LoginApi loginApi;

    public final boolean showError(int i) {
        return showError$default(this, i, null, null, 6, null);
    }

    public final boolean showError(int i, drO<dpR> dro) {
        return showError$default(this, i, dro, null, 4, null);
    }

    @Inject
    public ErrorDialogHelper(Activity activity, LoginApi loginApi) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) loginApi, "");
        this.activity = activity;
        this.loginApi = loginApi;
    }

    public final void relaunchApp() {
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        Activity activity = this.activity;
        activity.startActivity(NetflixApplication.d(activity));
        this.activity.finish();
    }

    public final void goToSignin() {
        SignupFlowModeStackManager.INSTANCE.clearStackAndFlowModes();
        Activity activity = this.activity;
        activity.startActivity(this.loginApi.c(activity));
        this.activity.finish();
    }

    private final String errorStringFromRequestStatus(Status status) {
        String d = C8168dfL.d(R.string.generic_retryable_failure);
        C8632dsu.a(d, "");
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean showError$default(ErrorDialogHelper errorDialogHelper, Status status, int i, drO dro, drO dro2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = com.netflix.mediaclient.ui.R.o.f13253fi;
        }
        if ((i2 & 4) != 0) {
            dro = null;
        }
        if ((i2 & 8) != 0) {
            dro2 = null;
        }
        return errorDialogHelper.showError(status, i, dro, dro2);
    }

    public final boolean showError(Status status, int i, drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) status, "");
        return showError(errorStringFromRequestStatus(status), i, dro, dro2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean showError$default(ErrorDialogHelper errorDialogHelper, int i, drO dro, drO dro2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            dro = null;
        }
        if ((i2 & 4) != 0) {
            dro2 = null;
        }
        return errorDialogHelper.showError(i, dro, dro2);
    }

    public final boolean showError(int i, drO<dpR> dro, drO<dpR> dro2) {
        String d = C8168dfL.d(i);
        C8632dsu.a(d, "");
        return showError$default(this, d, 0, dro, dro2, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean showError$default(ErrorDialogHelper errorDialogHelper, String str, int i, drO dro, drO dro2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = com.netflix.mediaclient.ui.R.o.f13253fi;
        }
        if ((i2 & 4) != 0) {
            dro = null;
        }
        if ((i2 & 8) != 0) {
            dro2 = null;
        }
        return errorDialogHelper.showError(str, i, dro, dro2);
    }

    public final boolean showError(String str, int i, final drO<dpR> dro, final drO<dpR> dro2) {
        C8632dsu.c((Object) str, "");
        if (C8054ddD.l(this.activity)) {
            return false;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.activity, C9834xU.o.c).setMessage(str).setCancelable(false).setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.ErrorDialogHelper$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ErrorDialogHelper.showError$lambda$0(drO.this, dialogInterface, i2);
            }
        });
        if (dro2 != null) {
            positiveButton.setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.ErrorDialogHelper$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ErrorDialogHelper.showError$lambda$1(drO.this, dialogInterface, i2);
                }
            });
        }
        positiveButton.show();
        return true;
    }

    public static final void showError$lambda$0(drO dro, DialogInterface dialogInterface, int i) {
        if (dro != null) {
            dro.invoke();
        }
        dialogInterface.dismiss();
    }

    public static final void showError$lambda$1(drO dro, DialogInterface dialogInterface, int i) {
        dro.invoke();
        dialogInterface.dismiss();
    }
}
