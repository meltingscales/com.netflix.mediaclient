package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentOnRampForProfileOnboardingAb53426Binding {
    public final C1204Sr chooseText;
    public final OnrampButton headerCtaButton;
    public final LinearLayout headerCtaButtonContainer;
    public final LinearLayout langListContainer;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;
    public final C1204Sr stepLabel;
    public final C1204Sr subheaderText;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentOnRampForProfileOnboardingAb53426Binding(ConstraintLayout constraintLayout, C1204Sr c1204Sr, OnrampButton onrampButton, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, NestedScrollView nestedScrollView, C1204Sr c1204Sr2, C1204Sr c1204Sr3) {
        this.rootView = constraintLayout;
        this.chooseText = c1204Sr;
        this.headerCtaButton = onrampButton;
        this.headerCtaButtonContainer = linearLayout;
        this.langListContainer = linearLayout2;
        this.recyclerView = recyclerView;
        this.scrollView = nestedScrollView;
        this.stepLabel = c1204Sr2;
        this.subheaderText = c1204Sr3;
    }

    public static FragmentOnRampForProfileOnboardingAb53426Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOnRampForProfileOnboardingAb53426Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_on_ramp_for_profile_onboarding_ab53426, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnRampForProfileOnboardingAb53426Binding bind(View view) {
        int i = R.id.chooseText;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.headerCtaButton;
            OnrampButton onrampButton = (OnrampButton) ViewBindings.findChildViewById(view, i);
            if (onrampButton != null) {
                i = R.id.headerCtaButtonContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.langListContainer;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.stepLabel;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null) {
                                    i = R.id.subheaderText;
                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr3 != null) {
                                        return new FragmentOnRampForProfileOnboardingAb53426Binding((ConstraintLayout) view, c1204Sr, onrampButton, linearLayout, linearLayout2, recyclerView, nestedScrollView, c1204Sr2, c1204Sr3);
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
