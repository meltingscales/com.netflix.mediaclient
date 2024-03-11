package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentLearnMoreConfirmBinding {
    public final LinearLayout banner;
    public final C1204Sr header;
    private final LinearLayout rootView;
    public final C1204Sr subheader;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private FragmentLearnMoreConfirmBinding(LinearLayout linearLayout, LinearLayout linearLayout2, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.rootView = linearLayout;
        this.banner = linearLayout2;
        this.header = c1204Sr;
        this.subheader = c1204Sr2;
    }

    public static FragmentLearnMoreConfirmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLearnMoreConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_learn_more_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLearnMoreConfirmBinding bind(View view) {
        int i = R.id.banner;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.header;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.subheader;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    return new FragmentLearnMoreConfirmBinding((LinearLayout) view, linearLayout, c1204Sr, c1204Sr2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
