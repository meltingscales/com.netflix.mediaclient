package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class AddProfilesEeFaqItemLayoutAb31697Binding {
    public final C1204Sr answer;
    public final ImageView icon;
    public final C1204Sr question;
    private final ConstraintLayout rootView;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private AddProfilesEeFaqItemLayoutAb31697Binding(ConstraintLayout constraintLayout, C1204Sr c1204Sr, ImageView imageView, C1204Sr c1204Sr2) {
        this.rootView = constraintLayout;
        this.answer = c1204Sr;
        this.icon = imageView;
        this.question = c1204Sr2;
    }

    public static AddProfilesEeFaqItemLayoutAb31697Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddProfilesEeFaqItemLayoutAb31697Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_profiles_ee_faq_item_layout_ab31697, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AddProfilesEeFaqItemLayoutAb31697Binding bind(View view) {
        int i = R.id.answer;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.question;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    return new AddProfilesEeFaqItemLayoutAb31697Binding((ConstraintLayout) view, c1204Sr, imageView, c1204Sr2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
