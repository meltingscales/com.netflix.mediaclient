package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class FragmentFujiCardBinding {
    public final View actionBar;
    public final C1204Sr header;
    public final NetflixImageView imageView;
    private final ConstraintLayout rootView;
    public final C1204Sr subheader;
    public final LinearLayout textSection;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentFujiCardBinding(ConstraintLayout constraintLayout, View view, C1204Sr c1204Sr, NetflixImageView netflixImageView, C1204Sr c1204Sr2, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.actionBar = view;
        this.header = c1204Sr;
        this.imageView = netflixImageView;
        this.subheader = c1204Sr2;
        this.textSection = linearLayout;
    }

    public static FragmentFujiCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFujiCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fuji_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFujiCardBinding bind(View view) {
        int i = R.id.actionBar;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.header;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.imageView;
                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView != null) {
                    i = R.id.subheader;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        i = R.id.textSection;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new FragmentFujiCardBinding((ConstraintLayout) view, findChildViewById, c1204Sr, netflixImageView, c1204Sr2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
