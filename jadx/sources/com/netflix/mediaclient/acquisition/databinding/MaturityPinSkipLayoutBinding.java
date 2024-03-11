package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes6.dex */
public final class MaturityPinSkipLayoutBinding {
    private final LinearLayout rootView;
    public final NetflixSignupButton skipCta;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private MaturityPinSkipLayoutBinding(LinearLayout linearLayout, NetflixSignupButton netflixSignupButton) {
        this.rootView = linearLayout;
        this.skipCta = netflixSignupButton;
    }

    public static MaturityPinSkipLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MaturityPinSkipLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.maturity_pin_skip_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MaturityPinSkipLayoutBinding bind(View view) {
        int i = R.id.skipCta;
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
        if (netflixSignupButton != null) {
            return new MaturityPinSkipLayoutBinding((LinearLayout) view, netflixSignupButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
