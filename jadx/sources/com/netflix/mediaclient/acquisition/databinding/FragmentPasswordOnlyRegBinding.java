package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes3.dex */
public final class FragmentPasswordOnlyRegBinding {
    public final FormViewEditText email;
    public final FormViewEditText password;
    public final NetflixSignupButton registrationButton;
    public final LinearLayout registrationLayout;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final SignupHeadingView signupHeading;
    public final SignupBannerView userMessage;
    public final SignupBannerView warningView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private FragmentPasswordOnlyRegBinding(ScrollView scrollView, FormViewEditText formViewEditText, FormViewEditText formViewEditText2, NetflixSignupButton netflixSignupButton, LinearLayout linearLayout, ScrollView scrollView2, SignupHeadingView signupHeadingView, SignupBannerView signupBannerView, SignupBannerView signupBannerView2) {
        this.rootView = scrollView;
        this.email = formViewEditText;
        this.password = formViewEditText2;
        this.registrationButton = netflixSignupButton;
        this.registrationLayout = linearLayout;
        this.scrollView = scrollView2;
        this.signupHeading = signupHeadingView;
        this.userMessage = signupBannerView;
        this.warningView = signupBannerView2;
    }

    public static FragmentPasswordOnlyRegBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPasswordOnlyRegBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_password_only_reg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPasswordOnlyRegBinding bind(View view) {
        int i = R.id.email;
        FormViewEditText formViewEditText = (FormViewEditText) ViewBindings.findChildViewById(view, i);
        if (formViewEditText != null) {
            i = R.id.password;
            FormViewEditText formViewEditText2 = (FormViewEditText) ViewBindings.findChildViewById(view, i);
            if (formViewEditText2 != null) {
                i = R.id.registrationButton;
                NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                if (netflixSignupButton != null) {
                    i = R.id.registrationLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
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
                                    return new FragmentPasswordOnlyRegBinding(scrollView, formViewEditText, formViewEditText2, netflixSignupButton, linearLayout, scrollView, signupHeadingView, signupBannerView, signupBannerView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
