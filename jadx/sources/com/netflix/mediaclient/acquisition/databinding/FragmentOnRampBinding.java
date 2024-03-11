package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentOnRampBinding {
    public final C1204Sr chooseText;
    public final OnrampButton headerCtaButton;
    public final RecyclerView recyclerView;
    private final CoordinatorLayout rootView;
    public final C1204Sr subheaderText;

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    private FragmentOnRampBinding(CoordinatorLayout coordinatorLayout, C1204Sr c1204Sr, OnrampButton onrampButton, RecyclerView recyclerView, C1204Sr c1204Sr2) {
        this.rootView = coordinatorLayout;
        this.chooseText = c1204Sr;
        this.headerCtaButton = onrampButton;
        this.recyclerView = recyclerView;
        this.subheaderText = c1204Sr2;
    }

    public static FragmentOnRampBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOnRampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_on_ramp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnRampBinding bind(View view) {
        int i = R.id.chooseText;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.headerCtaButton;
            OnrampButton onrampButton = (OnrampButton) ViewBindings.findChildViewById(view, i);
            if (onrampButton != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.subheaderText;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        return new FragmentOnRampBinding((CoordinatorLayout) view, c1204Sr, onrampButton, recyclerView, c1204Sr2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
