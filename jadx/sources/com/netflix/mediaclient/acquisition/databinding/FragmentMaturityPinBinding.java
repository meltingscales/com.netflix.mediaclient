package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.expandingDropDownView.ExpandingDropDownView;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentMaturityPinBinding {
    public final C1204Sr maturityPinHeader;
    private final LinearLayout rootView;
    public final NestedScrollView scrollView;
    public final ExpandingDropDownView skipVerifyExpandingView;
    public final ExpandingDropDownView verifyAgeExpandingView;
    public final SignupBannerView warningView;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private FragmentMaturityPinBinding(LinearLayout linearLayout, C1204Sr c1204Sr, NestedScrollView nestedScrollView, ExpandingDropDownView expandingDropDownView, ExpandingDropDownView expandingDropDownView2, SignupBannerView signupBannerView) {
        this.rootView = linearLayout;
        this.maturityPinHeader = c1204Sr;
        this.scrollView = nestedScrollView;
        this.skipVerifyExpandingView = expandingDropDownView;
        this.verifyAgeExpandingView = expandingDropDownView2;
        this.warningView = signupBannerView;
    }

    public static FragmentMaturityPinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMaturityPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_maturity_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMaturityPinBinding bind(View view) {
        int i = R.id.maturityPinHeader;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.scrollView;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = R.id.skipVerifyExpandingView;
                ExpandingDropDownView expandingDropDownView = (ExpandingDropDownView) ViewBindings.findChildViewById(view, i);
                if (expandingDropDownView != null) {
                    i = R.id.verifyAgeExpandingView;
                    ExpandingDropDownView expandingDropDownView2 = (ExpandingDropDownView) ViewBindings.findChildViewById(view, i);
                    if (expandingDropDownView2 != null) {
                        i = R.id.warningView;
                        SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                        if (signupBannerView != null) {
                            return new FragmentMaturityPinBinding((LinearLayout) view, c1204Sr, nestedScrollView, expandingDropDownView, expandingDropDownView2, signupBannerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
