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
public final class AddProfilesEeBulletsLayoutBinding {
    public final C1204Sr bullet1;
    public final C1204Sr bullet2;
    public final C1204Sr bullet3;
    public final ImageView iconBullet1;
    public final ImageView iconBullet2;
    public final ImageView iconBullet3;
    private final ConstraintLayout rootView;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private AddProfilesEeBulletsLayoutBinding(ConstraintLayout constraintLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.bullet1 = c1204Sr;
        this.bullet2 = c1204Sr2;
        this.bullet3 = c1204Sr3;
        this.iconBullet1 = imageView;
        this.iconBullet2 = imageView2;
        this.iconBullet3 = imageView3;
    }

    public static AddProfilesEeBulletsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddProfilesEeBulletsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.add_profiles_ee_bullets_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AddProfilesEeBulletsLayoutBinding bind(View view) {
        int i = R.id.bullet1;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.bullet2;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = R.id.bullet3;
                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr3 != null) {
                    i = R.id.iconBullet1;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.iconBullet2;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.iconBullet3;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                return new AddProfilesEeBulletsLayoutBinding((ConstraintLayout) view, c1204Sr, c1204Sr2, c1204Sr3, imageView, imageView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
