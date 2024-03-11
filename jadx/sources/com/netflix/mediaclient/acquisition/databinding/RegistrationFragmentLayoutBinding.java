package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes3.dex */
public final class RegistrationFragmentLayoutBinding {
    public final NetflixSignupButton registrationButton;
    public final LinearLayout registrationLayout;
    public final RegistrationReadOnlyBinding registrationReadOnly;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final SignupHeadingView signupHeading;
    public final SignupBannerView userMessage;
    public final SignupBannerView warningView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private RegistrationFragmentLayoutBinding(ScrollView scrollView, NetflixSignupButton netflixSignupButton, LinearLayout linearLayout, RegistrationReadOnlyBinding registrationReadOnlyBinding, ScrollView scrollView2, SignupHeadingView signupHeadingView, SignupBannerView signupBannerView, SignupBannerView signupBannerView2) {
        this.rootView = scrollView;
        this.registrationButton = netflixSignupButton;
        this.registrationLayout = linearLayout;
        this.registrationReadOnly = registrationReadOnlyBinding;
        this.scrollView = scrollView2;
        this.signupHeading = signupHeadingView;
        this.userMessage = signupBannerView;
        this.warningView = signupBannerView2;
    }

    public static RegistrationFragmentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RegistrationFragmentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.registration_fragment_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RegistrationFragmentLayoutBinding bind(View view) {
        View findChildViewById;
        int i = R.id.registrationButton;
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
        if (netflixSignupButton != null) {
            i = R.id.registrationLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.registration_read_only))) != null) {
                RegistrationReadOnlyBinding bind = RegistrationReadOnlyBinding.bind(findChildViewById);
                ScrollView scrollView = (ScrollView) view;
                i = R.id.signupHeading;
                SignupHeadingView signupHeadingView = (SignupHeadingView) ViewBindings.findChildViewById(view, i);
                if (signupHeadingView != null) {
                    i = R.id.userMessage;
                    SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                    if (signupBannerView != null) {
                        i = R.id.warningView;
                        SignupBannerView signupBannerView2 = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                        if (signupBannerView2 != null) {
                            return new RegistrationFragmentLayoutBinding(scrollView, netflixSignupButton, linearLayout, bind, scrollView, signupHeadingView, signupBannerView, signupBannerView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
