package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1203Sq;

/* loaded from: classes6.dex */
public final class NetflixSignupButtonLayoutBinding {
    public final ProgressBar loadingView;
    private final View rootView;
    public final C1203Sq textButton;

    public View getRoot() {
        return this.rootView;
    }

    private NetflixSignupButtonLayoutBinding(View view, ProgressBar progressBar, C1203Sq c1203Sq) {
        this.rootView = view;
        this.loadingView = progressBar;
        this.textButton = c1203Sq;
    }

    public static NetflixSignupButtonLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.netflix_signup_button_layout, viewGroup);
        return bind(viewGroup);
    }

    public static NetflixSignupButtonLayoutBinding bind(View view) {
        int i = R.id.loadingView;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.textButton;
            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
            if (c1203Sq != null) {
                return new NetflixSignupButtonLayoutBinding(view, progressBar, c1203Sq);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
