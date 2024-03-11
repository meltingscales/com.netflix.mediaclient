package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes6.dex */
public final class ReggieTrayContentBinding {
    public final ImageView closeButton;
    public final FormViewEditText email;
    public final LinearLayout registrationLayout;
    private final ScrollView rootView;
    public final NetflixSignupButton saveEmailButton;
    public final ScrollView scrollView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private ReggieTrayContentBinding(ScrollView scrollView, ImageView imageView, FormViewEditText formViewEditText, LinearLayout linearLayout, NetflixSignupButton netflixSignupButton, ScrollView scrollView2) {
        this.rootView = scrollView;
        this.closeButton = imageView;
        this.email = formViewEditText;
        this.registrationLayout = linearLayout;
        this.saveEmailButton = netflixSignupButton;
        this.scrollView = scrollView2;
    }

    public static ReggieTrayContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReggieTrayContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.reggie_tray_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReggieTrayContentBinding bind(View view) {
        int i = R.id.closeButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.email;
            FormViewEditText formViewEditText = (FormViewEditText) ViewBindings.findChildViewById(view, i);
            if (formViewEditText != null) {
                i = R.id.registrationLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.saveEmailButton;
                    NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                    if (netflixSignupButton != null) {
                        ScrollView scrollView = (ScrollView) view;
                        return new ReggieTrayContentBinding(scrollView, imageView, formViewEditText, linearLayout, netflixSignupButton, scrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
