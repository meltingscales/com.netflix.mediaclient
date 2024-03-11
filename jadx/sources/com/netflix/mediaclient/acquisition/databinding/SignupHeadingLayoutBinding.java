package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class SignupHeadingLayoutBinding {
    public final C1204Sr header2Title;
    public final C1204Sr headerTitle;
    private final View rootView;
    public final C1204Sr stepLabel;
    public final LinearLayout subHeadingContainer;

    public View getRoot() {
        return this.rootView;
    }

    private SignupHeadingLayoutBinding(View view, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, LinearLayout linearLayout) {
        this.rootView = view;
        this.header2Title = c1204Sr;
        this.headerTitle = c1204Sr2;
        this.stepLabel = c1204Sr3;
        this.subHeadingContainer = linearLayout;
    }

    public static SignupHeadingLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.signup_heading_layout, viewGroup);
        return bind(viewGroup);
    }

    public static SignupHeadingLayoutBinding bind(View view) {
        int i = R.id.header2Title;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.headerTitle;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = R.id.stepLabel;
                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr3 != null) {
                    i = R.id.subHeadingContainer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new SignupHeadingLayoutBinding(view, c1204Sr, c1204Sr2, c1204Sr3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
