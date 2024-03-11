package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class ConfirmFragmentLayoutBinding {
    public final LinearLayout accountInformation;
    public final NetflixSignupButton confirmButton;
    public final C1204Sr confirmHeader;
    public final C1204Sr confirmPreHeader;
    public final KoreaCheckBoxesView koreaCheckBoxes;
    public final C1204Sr planDescription;
    public final C1204Sr planName;
    public final SignupBannerView positiveView;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final C1204Sr selectedMop;
    public final LinearLayout touHolder;
    public final TermsOfUseView touView;
    public final C1204Sr userDetails;
    public final SignupBannerView userMessage;
    public final SignupBannerView warningView;
    public final WebView webView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private ConfirmFragmentLayoutBinding(ScrollView scrollView, LinearLayout linearLayout, NetflixSignupButton netflixSignupButton, C1204Sr c1204Sr, C1204Sr c1204Sr2, KoreaCheckBoxesView koreaCheckBoxesView, C1204Sr c1204Sr3, C1204Sr c1204Sr4, SignupBannerView signupBannerView, ScrollView scrollView2, C1204Sr c1204Sr5, LinearLayout linearLayout2, TermsOfUseView termsOfUseView, C1204Sr c1204Sr6, SignupBannerView signupBannerView2, SignupBannerView signupBannerView3, WebView webView) {
        this.rootView = scrollView;
        this.accountInformation = linearLayout;
        this.confirmButton = netflixSignupButton;
        this.confirmHeader = c1204Sr;
        this.confirmPreHeader = c1204Sr2;
        this.koreaCheckBoxes = koreaCheckBoxesView;
        this.planDescription = c1204Sr3;
        this.planName = c1204Sr4;
        this.positiveView = signupBannerView;
        this.scrollView = scrollView2;
        this.selectedMop = c1204Sr5;
        this.touHolder = linearLayout2;
        this.touView = termsOfUseView;
        this.userDetails = c1204Sr6;
        this.userMessage = signupBannerView2;
        this.warningView = signupBannerView3;
        this.webView = webView;
    }

    public static ConfirmFragmentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ConfirmFragmentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.confirm_fragment_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ConfirmFragmentLayoutBinding bind(View view) {
        int i = R.id.accountInformation;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.confirmButton;
            NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
            if (netflixSignupButton != null) {
                i = R.id.confirmHeader;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = R.id.confirmPreHeader;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        i = R.id.koreaCheckBoxes;
                        KoreaCheckBoxesView koreaCheckBoxesView = (KoreaCheckBoxesView) ViewBindings.findChildViewById(view, i);
                        if (koreaCheckBoxesView != null) {
                            i = R.id.plan_description;
                            C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr3 != null) {
                                i = R.id.plan_name;
                                C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr4 != null) {
                                    i = R.id.positiveView;
                                    SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                                    if (signupBannerView != null) {
                                        ScrollView scrollView = (ScrollView) view;
                                        i = R.id.selected_mop;
                                        C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                        if (c1204Sr5 != null) {
                                            i = R.id.touHolder;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.touView;
                                                TermsOfUseView termsOfUseView = (TermsOfUseView) ViewBindings.findChildViewById(view, i);
                                                if (termsOfUseView != null) {
                                                    i = R.id.user_details;
                                                    C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr6 != null) {
                                                        i = R.id.userMessage;
                                                        SignupBannerView signupBannerView2 = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                                                        if (signupBannerView2 != null) {
                                                            i = R.id.warningView;
                                                            SignupBannerView signupBannerView3 = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                                                            if (signupBannerView3 != null) {
                                                                i = R.id.webView;
                                                                WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                                                                if (webView != null) {
                                                                    return new ConfirmFragmentLayoutBinding(scrollView, linearLayout, netflixSignupButton, c1204Sr, c1204Sr2, koreaCheckBoxesView, c1204Sr3, c1204Sr4, signupBannerView, scrollView, c1204Sr5, linearLayout2, termsOfUseView, c1204Sr6, signupBannerView2, signupBannerView3, webView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
