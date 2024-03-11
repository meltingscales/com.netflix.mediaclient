package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class VerifyAgeSkipLayoutBinding {
    private final LinearLayout rootView;
    public final NetflixSignupButton skipCta;
    public final C1204Sr skipVerifySubheader;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private VerifyAgeSkipLayoutBinding(LinearLayout linearLayout, NetflixSignupButton netflixSignupButton, C1204Sr c1204Sr) {
        this.rootView = linearLayout;
        this.skipCta = netflixSignupButton;
        this.skipVerifySubheader = c1204Sr;
    }

    public static VerifyAgeSkipLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VerifyAgeSkipLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.verify_age_skip_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static VerifyAgeSkipLayoutBinding bind(View view) {
        int i = R.id.skipCta;
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
        if (netflixSignupButton != null) {
            i = R.id.skipVerifySubheader;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                return new VerifyAgeSkipLayoutBinding((LinearLayout) view, netflixSignupButton, c1204Sr);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
