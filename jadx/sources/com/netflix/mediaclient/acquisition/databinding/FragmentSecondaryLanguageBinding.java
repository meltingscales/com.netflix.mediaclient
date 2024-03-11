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
public final class FragmentSecondaryLanguageBinding {
    public final OnrampButton ctaButton;
    public final C1204Sr header;
    public final LinearLayout langListContainer;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;
    public final C1204Sr subheader;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentSecondaryLanguageBinding(ConstraintLayout constraintLayout, OnrampButton onrampButton, C1204Sr c1204Sr, LinearLayout linearLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, C1204Sr c1204Sr2) {
        this.rootView = constraintLayout;
        this.ctaButton = onrampButton;
        this.header = c1204Sr;
        this.langListContainer = linearLayout;
        this.recyclerView = recyclerView;
        this.scrollView = nestedScrollView;
        this.subheader = c1204Sr2;
    }

    public static FragmentSecondaryLanguageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSecondaryLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_secondary_language, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSecondaryLanguageBinding bind(View view) {
        int i = R.id.ctaButton;
        OnrampButton onrampButton = (OnrampButton) ViewBindings.findChildViewById(view, i);
        if (onrampButton != null) {
            i = R.id.header;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.langListContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = R.id.subheader;
                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr2 != null) {
                                return new FragmentSecondaryLanguageBinding((ConstraintLayout) view, onrampButton, c1204Sr, linearLayout, recyclerView, nestedScrollView, c1204Sr2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
