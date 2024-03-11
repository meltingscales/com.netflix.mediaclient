package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class MaturityPinEnterPinBinding {
    public final MaturityPinEntry maturityPinEntry;
    public final C1204Sr maturityPinSubheader;
    private final LinearLayout rootView;
    public final NetflixSignupButton verifyAgeCta;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private MaturityPinEnterPinBinding(LinearLayout linearLayout, MaturityPinEntry maturityPinEntry, C1204Sr c1204Sr, NetflixSignupButton netflixSignupButton) {
        this.rootView = linearLayout;
        this.maturityPinEntry = maturityPinEntry;
        this.maturityPinSubheader = c1204Sr;
        this.verifyAgeCta = netflixSignupButton;
    }

    public static MaturityPinEnterPinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MaturityPinEnterPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.maturity_pin_enter_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MaturityPinEnterPinBinding bind(View view) {
        int i = R.id.maturityPinEntry;
        MaturityPinEntry maturityPinEntry = (MaturityPinEntry) ViewBindings.findChildViewById(view, i);
        if (maturityPinEntry != null) {
            i = R.id.maturityPinSubheader;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.verifyAgeCta;
                NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                if (netflixSignupButton != null) {
                    return new MaturityPinEnterPinBinding((LinearLayout) view, maturityPinEntry, c1204Sr, netflixSignupButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
