package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class ContextAddProfilesEeAb31697Binding {
    public final AddProfilesEeBulletsLayoutBinding bulletsLayout;
    public final NetflixSignupButton ctaButton;
    private final ScrollView rootView;
    public final C1204Sr titleText;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private ContextAddProfilesEeAb31697Binding(ScrollView scrollView, AddProfilesEeBulletsLayoutBinding addProfilesEeBulletsLayoutBinding, NetflixSignupButton netflixSignupButton, C1204Sr c1204Sr) {
        this.rootView = scrollView;
        this.bulletsLayout = addProfilesEeBulletsLayoutBinding;
        this.ctaButton = netflixSignupButton;
        this.titleText = c1204Sr;
    }

    public static ContextAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ContextAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.context_add_profiles_ee_ab31697, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ContextAddProfilesEeAb31697Binding bind(View view) {
        int i = R.id.bulletsLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            AddProfilesEeBulletsLayoutBinding bind = AddProfilesEeBulletsLayoutBinding.bind(findChildViewById);
            int i2 = R.id.ctaButton;
            NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i2);
            if (netflixSignupButton != null) {
                i2 = R.id.titleText;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i2);
                if (c1204Sr != null) {
                    return new ContextAddProfilesEeAb31697Binding((ScrollView) view, bind, netflixSignupButton, c1204Sr);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
