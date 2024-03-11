package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes3.dex */
public final class ContextFragmentLayoutWithMessageBinding {
    public final NetflixSignupButton contextButton;
    public final ImageView contextIcon;
    private final ScrollView rootView;
    public final SignupHeadingView signupHeading;
    public final SignupBannerView userMessage;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private ContextFragmentLayoutWithMessageBinding(ScrollView scrollView, NetflixSignupButton netflixSignupButton, ImageView imageView, SignupHeadingView signupHeadingView, SignupBannerView signupBannerView) {
        this.rootView = scrollView;
        this.contextButton = netflixSignupButton;
        this.contextIcon = imageView;
        this.signupHeading = signupHeadingView;
        this.userMessage = signupBannerView;
    }

    public static ContextFragmentLayoutWithMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ContextFragmentLayoutWithMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.context_fragment_layout_with_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ContextFragmentLayoutWithMessageBinding bind(View view) {
        int i = R.id.contextButton;
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
        if (netflixSignupButton != null) {
            i = R.id.contextIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.signupHeading;
                SignupHeadingView signupHeadingView = (SignupHeadingView) ViewBindings.findChildViewById(view, i);
                if (signupHeadingView != null) {
                    i = R.id.userMessage;
                    SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                    if (signupBannerView != null) {
                        return new ContextFragmentLayoutWithMessageBinding((ScrollView) view, netflixSignupButton, imageView, signupHeadingView, signupBannerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
