package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class ChoiceFieldViewBinding {
    public final C1204Sr editText;
    public final C1204Sr inputError;
    public final ConstraintLayout inputLayout;
    public final NetflixImageView paymentProviderLogo;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private ChoiceFieldViewBinding(View view, C1204Sr c1204Sr, C1204Sr c1204Sr2, ConstraintLayout constraintLayout, NetflixImageView netflixImageView) {
        this.rootView = view;
        this.editText = c1204Sr;
        this.inputError = c1204Sr2;
        this.inputLayout = constraintLayout;
        this.paymentProviderLogo = netflixImageView;
    }

    public static ChoiceFieldViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.choice_field_view, viewGroup);
        return bind(viewGroup);
    }

    public static ChoiceFieldViewBinding bind(View view) {
        int i = R.id.editText;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.inputError;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = R.id.inputLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.payment_provider_logo;
                    NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                    if (netflixImageView != null) {
                        return new ChoiceFieldViewBinding(view, c1204Sr, c1204Sr2, constraintLayout, netflixImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
