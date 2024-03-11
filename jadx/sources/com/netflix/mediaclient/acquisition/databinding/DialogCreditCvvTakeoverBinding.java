package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes6.dex */
public final class DialogCreditCvvTakeoverBinding {
    public final NetflixImageView amexImage;
    public final NetflixImageView closeButton;
    public final TextView cvvTrustMessage;
    public final TextView dialogText;
    private final ConstraintLayout rootView;
    public final NetflixImageView visaImage;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private DialogCreditCvvTakeoverBinding(ConstraintLayout constraintLayout, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, TextView textView, TextView textView2, NetflixImageView netflixImageView3) {
        this.rootView = constraintLayout;
        this.amexImage = netflixImageView;
        this.closeButton = netflixImageView2;
        this.cvvTrustMessage = textView;
        this.dialogText = textView2;
        this.visaImage = netflixImageView3;
    }

    public static DialogCreditCvvTakeoverBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCreditCvvTakeoverBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_credit_cvv_takeover, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCreditCvvTakeoverBinding bind(View view) {
        int i = R.id.amexImage;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = R.id.closeButton;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                i = R.id.cvvTrustMessage;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.dialogText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.visaImage;
                        NetflixImageView netflixImageView3 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                        if (netflixImageView3 != null) {
                            return new DialogCreditCvvTakeoverBinding((ConstraintLayout) view, netflixImageView, netflixImageView2, textView, textView2, netflixImageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
