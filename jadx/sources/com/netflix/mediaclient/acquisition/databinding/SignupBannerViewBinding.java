package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class SignupBannerViewBinding {
    private final View rootView;
    public final ImageView signupBannerImageView;
    public final C1204Sr signupBannerTextView;

    public View getRoot() {
        return this.rootView;
    }

    private SignupBannerViewBinding(View view, ImageView imageView, C1204Sr c1204Sr) {
        this.rootView = view;
        this.signupBannerImageView = imageView;
        this.signupBannerTextView = c1204Sr;
    }

    public static SignupBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.signup_banner_view, viewGroup);
        return bind(viewGroup);
    }

    public static SignupBannerViewBinding bind(View view) {
        int i = R.id.signupBannerImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.signupBannerTextView;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                return new SignupBannerViewBinding(view, imageView, c1204Sr);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
