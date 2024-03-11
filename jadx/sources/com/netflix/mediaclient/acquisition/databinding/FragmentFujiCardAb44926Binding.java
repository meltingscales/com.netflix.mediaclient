package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiCardImageViewAb44926;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class FragmentFujiCardAb44926Binding {
    public final C1204Sr header;
    public final WelcomeFujiCardImageViewAb44926 imageView;
    private final ConstraintLayout rootView;
    public final C1204Sr subheader;
    public final View toolbarBackground;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentFujiCardAb44926Binding(ConstraintLayout constraintLayout, C1204Sr c1204Sr, WelcomeFujiCardImageViewAb44926 welcomeFujiCardImageViewAb44926, C1204Sr c1204Sr2, View view) {
        this.rootView = constraintLayout;
        this.header = c1204Sr;
        this.imageView = welcomeFujiCardImageViewAb44926;
        this.subheader = c1204Sr2;
        this.toolbarBackground = view;
    }

    public static FragmentFujiCardAb44926Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFujiCardAb44926Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fuji_card_ab44926, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFujiCardAb44926Binding bind(View view) {
        View findChildViewById;
        int i = R.id.header;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.imageView;
            WelcomeFujiCardImageViewAb44926 welcomeFujiCardImageViewAb44926 = (WelcomeFujiCardImageViewAb44926) ViewBindings.findChildViewById(view, i);
            if (welcomeFujiCardImageViewAb44926 != null) {
                i = R.id.subheader;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarBackground))) != null) {
                    return new FragmentFujiCardAb44926Binding((ConstraintLayout) view, c1204Sr, welcomeFujiCardImageViewAb44926, c1204Sr2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}