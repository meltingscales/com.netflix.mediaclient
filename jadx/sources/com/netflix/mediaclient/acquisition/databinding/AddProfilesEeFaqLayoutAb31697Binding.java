package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class AddProfilesEeFaqLayoutAb31697Binding {
    public final FrameLayout dialogBackground;
    public final View divider;
    public final C1204Sr faqHeaderText;
    public final RecyclerView faqRecyclerView;
    private final FrameLayout rootView;

    public FrameLayout getRoot() {
        return this.rootView;
    }

    private AddProfilesEeFaqLayoutAb31697Binding(FrameLayout frameLayout, FrameLayout frameLayout2, View view, C1204Sr c1204Sr, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.dialogBackground = frameLayout2;
        this.divider = view;
        this.faqHeaderText = c1204Sr;
        this.faqRecyclerView = recyclerView;
    }

    public static AddProfilesEeFaqLayoutAb31697Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddProfilesEeFaqLayoutAb31697Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_profiles_ee_faq_layout_ab31697, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AddProfilesEeFaqLayoutAb31697Binding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.faqHeaderText;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.faqRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new AddProfilesEeFaqLayoutAb31697Binding(frameLayout, frameLayout, findChildViewById, c1204Sr, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
