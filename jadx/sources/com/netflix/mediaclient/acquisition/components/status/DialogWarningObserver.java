package com.netflix.mediaclient.acquisition.components.status;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import o.C8187dfe;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class DialogWarningObserver implements Observer<String> {
    public static final int $stable = 8;
    private final NetflixActivity activity;

    public DialogWarningObserver(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        this.activity = netflixActivity;
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(String str) {
        boolean g;
        C8632dsu.c((Object) str, "");
        g = C8691duz.g(str);
        if (g) {
            return;
        }
        final DialogFragment newInstance = AlertDialogFragment.Companion.newInstance(str);
        C8187dfe.c(new Runnable() { // from class: com.netflix.mediaclient.acquisition.components.status.DialogWarningObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DialogWarningObserver.onChanged$lambda$0(DialogWarningObserver.this, newInstance);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChanged$lambda$0(DialogWarningObserver dialogWarningObserver, DialogFragment dialogFragment) {
        C8632dsu.c((Object) dialogWarningObserver, "");
        C8632dsu.c((Object) dialogFragment, "");
        dialogWarningObserver.activity.showDialog(dialogFragment);
    }

    /* loaded from: classes3.dex */
    public static final class AlertDialogFragment extends DialogFragment {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final String EXTRA_ALERT_WARNING = "ALERT_WARNING";

        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final DialogFragment newInstance(String str) {
                C8632dsu.c((Object) str, "");
                Bundle bundle = new Bundle();
                bundle.putString(AlertDialogFragment.EXTRA_ALERT_WARNING, str);
                AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
                alertDialogFragment.setArguments(bundle);
                return alertDialogFragment;
            }
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            String string;
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString(EXTRA_ALERT_WARNING)) == null) {
                string = getString(R.string.generic_retryable_failure);
            }
            C8632dsu.d((Object) string);
            AlertDialog show = new AlertDialog.Builder(getContext(), C9834xU.o.c).setMessage(string).setCancelable(false).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, (DialogInterface.OnClickListener) null).show();
            C8632dsu.a(show, "");
            return show;
        }
    }
}
