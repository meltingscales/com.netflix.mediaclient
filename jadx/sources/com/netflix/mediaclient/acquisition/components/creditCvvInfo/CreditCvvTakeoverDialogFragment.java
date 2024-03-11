package com.netflix.mediaclient.acquisition.components.creditCvvInfo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.R;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class CreditCvvTakeoverDialogFragment extends NetflixDialogFrag {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String SHOW_CVV_TRUST_MESSAGE = "showCVVTrustMessage";
    public static final String TAG_CREDIT_CVV_TAKEOVER_DIALOG = "creditCvvTakeoverDialog";

    private final void logPresentation() {
    }

    public static final CreditCvvTakeoverDialogFragment newInstance(boolean z) {
        return Companion.newInstance(z);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final CreditCvvTakeoverDialogFragment newInstance(boolean z) {
            CreditCvvTakeoverDialogFragment creditCvvTakeoverDialogFragment = new CreditCvvTakeoverDialogFragment();
            creditCvvTakeoverDialogFragment.setStyle(2, R.l.m);
            Bundle bundle = new Bundle();
            bundle.putBoolean(CreditCvvTakeoverDialogFragment.SHOW_CVV_TRUST_MESSAGE, z);
            creditCvvTakeoverDialogFragment.setArguments(bundle);
            return creditCvvTakeoverDialogFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.acquisition.R.layout.dialog_credit_cvv_takeover, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean(SHOW_CVV_TRUST_MESSAGE)) {
            ((TextView) inflate.findViewById(com.netflix.mediaclient.acquisition.R.id.cvvTrustMessage)).setVisibility(0);
        }
        C8632dsu.d(inflate);
        initClickListeners(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        logPresentation();
    }

    private final void initClickListeners(View view) {
        ((NetflixImageView) view.findViewById(com.netflix.mediaclient.acquisition.R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.creditCvvInfo.CreditCvvTakeoverDialogFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCvvTakeoverDialogFragment.initClickListeners$lambda$0(CreditCvvTakeoverDialogFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$0(CreditCvvTakeoverDialogFragment creditCvvTakeoverDialogFragment, View view) {
        C8632dsu.c((Object) creditCvvTakeoverDialogFragment, "");
        creditCvvTakeoverDialogFragment.dismiss();
    }
}
