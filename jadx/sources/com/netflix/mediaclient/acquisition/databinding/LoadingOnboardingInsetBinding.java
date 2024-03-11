package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes6.dex */
public final class LoadingOnboardingInsetBinding {
    public final ProgressBar loadingView;
    public final ImageView logo;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private LoadingOnboardingInsetBinding(View view, ProgressBar progressBar, ImageView imageView) {
        this.rootView = view;
        this.loadingView = progressBar;
        this.logo = imageView;
    }

    public static LoadingOnboardingInsetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.loading_onboarding_inset, viewGroup);
        return bind(viewGroup);
    }

    public static LoadingOnboardingInsetBinding bind(View view) {
        int i = R.id.loading_view;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new LoadingOnboardingInsetBinding(view, progressBar, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
