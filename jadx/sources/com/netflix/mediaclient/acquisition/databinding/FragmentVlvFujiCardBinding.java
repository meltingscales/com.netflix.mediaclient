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
public final class FragmentVlvFujiCardBinding {
    public final C1204Sr header;
    public final NetflixImageView imageView;
    private final ConstraintLayout rootView;
    public final C1204Sr subheader;
    public final LinearLayout textSection;
    public final View viewTop60Black;
    public final View viewTranslucentBlack;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentVlvFujiCardBinding(ConstraintLayout constraintLayout, C1204Sr c1204Sr, NetflixImageView netflixImageView, C1204Sr c1204Sr2, LinearLayout linearLayout, View view, View view2) {
        this.rootView = constraintLayout;
        this.header = c1204Sr;
        this.imageView = netflixImageView;
        this.subheader = c1204Sr2;
        this.textSection = linearLayout;
        this.viewTop60Black = view;
        this.viewTranslucentBlack = view2;
    }

    public static FragmentVlvFujiCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVlvFujiCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_vlv_fuji_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentVlvFujiCardBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.header;
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
                    if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewTop60Black))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewTranslucentBlack))) != null) {
                        return new FragmentVlvFujiCardBinding((ConstraintLayout) view, c1204Sr, netflixImageView, c1204Sr2, linearLayout, findChildViewById, findChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
