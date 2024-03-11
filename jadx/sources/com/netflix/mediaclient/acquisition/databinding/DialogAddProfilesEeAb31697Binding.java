package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class DialogAddProfilesEeAb31697Binding {
    public final AddProfilesEeBulletsLayoutBinding bulletsLayout;
    public final NetflixSignupButton ctaButton;
    public final FrameLayout dialogBackground;
    private final FrameLayout rootView;
    public final C1204Sr titleText;

    public FrameLayout getRoot() {
        return this.rootView;
    }

    private DialogAddProfilesEeAb31697Binding(FrameLayout frameLayout, AddProfilesEeBulletsLayoutBinding addProfilesEeBulletsLayoutBinding, NetflixSignupButton netflixSignupButton, FrameLayout frameLayout2, C1204Sr c1204Sr) {
        this.rootView = frameLayout;
        this.bulletsLayout = addProfilesEeBulletsLayoutBinding;
        this.ctaButton = netflixSignupButton;
        this.dialogBackground = frameLayout2;
        this.titleText = c1204Sr;
    }

    public static DialogAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_add_profiles_ee_ab31697, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAddProfilesEeAb31697Binding bind(View view) {
        int i = R.id.bulletsLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            AddProfilesEeBulletsLayoutBinding bind = AddProfilesEeBulletsLayoutBinding.bind(findChildViewById);
            i = R.id.ctaButton;
            NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
            if (netflixSignupButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.titleText;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    return new DialogAddProfilesEeAb31697Binding(frameLayout, bind, netflixSignupButton, frameLayout, c1204Sr);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
