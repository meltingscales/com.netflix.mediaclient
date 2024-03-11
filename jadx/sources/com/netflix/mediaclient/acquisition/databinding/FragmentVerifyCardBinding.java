package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentVerifyCardBinding {
    public final C1204Sr goBackButton;
    private final LinearLayout rootView;
    public final SignupHeadingView signupHeading;
    public final SignupBannerView userMessage;
    public final WebviewLayoutBinding webViewLayout;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private FragmentVerifyCardBinding(LinearLayout linearLayout, C1204Sr c1204Sr, SignupHeadingView signupHeadingView, SignupBannerView signupBannerView, WebviewLayoutBinding webviewLayoutBinding) {
        this.rootView = linearLayout;
        this.goBackButton = c1204Sr;
        this.signupHeading = signupHeadingView;
        this.userMessage = signupBannerView;
        this.webViewLayout = webviewLayoutBinding;
    }

    public static FragmentVerifyCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVerifyCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentVerifyCardBinding bind(View view) {
        View findChildViewById;
        int i = R.id.goBackButton;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.signupHeading;
            SignupHeadingView signupHeadingView = (SignupHeadingView) ViewBindings.findChildViewById(view, i);
            if (signupHeadingView != null) {
                i = R.id.userMessage;
                SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                if (signupBannerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.webViewLayout))) != null) {
                    return new FragmentVerifyCardBinding((LinearLayout) view, c1204Sr, signupHeadingView, signupBannerView, WebviewLayoutBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
