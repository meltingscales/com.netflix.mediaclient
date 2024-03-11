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
public final class FragmentVerifyAgeBinding {
    private final LinearLayout rootView;
    public final NestedScrollView scrollView;
    public final ExpandingDropDownView skipVerifyExpandingView;
    public final ExpandingDropDownView verifyAgeExpandingView;
    public final C1204Sr verifyAgeHeader;
    public final SignupBannerView warningView;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private FragmentVerifyAgeBinding(LinearLayout linearLayout, NestedScrollView nestedScrollView, ExpandingDropDownView expandingDropDownView, ExpandingDropDownView expandingDropDownView2, C1204Sr c1204Sr, SignupBannerView signupBannerView) {
        this.rootView = linearLayout;
        this.scrollView = nestedScrollView;
        this.skipVerifyExpandingView = expandingDropDownView;
        this.verifyAgeExpandingView = expandingDropDownView2;
        this.verifyAgeHeader = c1204Sr;
        this.warningView = signupBannerView;
    }

    public static FragmentVerifyAgeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVerifyAgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_age, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentVerifyAgeBinding bind(View view) {
        int i = R.id.scrollView;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null) {
            i = R.id.skipVerifyExpandingView;
            ExpandingDropDownView expandingDropDownView = (ExpandingDropDownView) ViewBindings.findChildViewById(view, i);
            if (expandingDropDownView != null) {
                i = R.id.verifyAgeExpandingView;
                ExpandingDropDownView expandingDropDownView2 = (ExpandingDropDownView) ViewBindings.findChildViewById(view, i);
                if (expandingDropDownView2 != null) {
                    i = R.id.verifyAgeHeader;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = R.id.warningView;
                        SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                        if (signupBannerView != null) {
                            return new FragmentVerifyAgeBinding((LinearLayout) view, nestedScrollView, expandingDropDownView, expandingDropDownView2, c1204Sr, signupBannerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
