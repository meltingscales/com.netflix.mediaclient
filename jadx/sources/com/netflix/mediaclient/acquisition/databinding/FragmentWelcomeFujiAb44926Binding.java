package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.viewPagerIndicator.ViewPagerIndicator;

/* loaded from: classes3.dex */
public final class FragmentWelcomeFujiAb44926Binding {
    public final FormViewEditText email;
    public final View floatingCtaContainer;
    public final ViewPager2 fujiPager;
    public final NetflixSignupButton netflixSignupButtonWelcome;
    private final ConstraintLayout rootView;
    public final ViewPagerIndicator viewPagerIndicator;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentWelcomeFujiAb44926Binding(ConstraintLayout constraintLayout, FormViewEditText formViewEditText, View view, ViewPager2 viewPager2, NetflixSignupButton netflixSignupButton, ViewPagerIndicator viewPagerIndicator) {
        this.rootView = constraintLayout;
        this.email = formViewEditText;
        this.floatingCtaContainer = view;
        this.fujiPager = viewPager2;
        this.netflixSignupButtonWelcome = netflixSignupButton;
        this.viewPagerIndicator = viewPagerIndicator;
    }

    public static FragmentWelcomeFujiAb44926Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeFujiAb44926Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_welcome_fuji_ab44926, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWelcomeFujiAb44926Binding bind(View view) {
        View findChildViewById;
        int i = R.id.email;
        FormViewEditText formViewEditText = (FormViewEditText) ViewBindings.findChildViewById(view, i);
        if (formViewEditText != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.floatingCtaContainer))) != null) {
            i = R.id.fujiPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = R.id.netflixSignupButtonWelcome;
                NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                if (netflixSignupButton != null) {
                    i = R.id.viewPagerIndicator;
                    ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) ViewBindings.findChildViewById(view, i);
                    if (viewPagerIndicator != null) {
                        return new FragmentWelcomeFujiAb44926Binding((ConstraintLayout) view, formViewEditText, findChildViewById, viewPager2, netflixSignupButton, viewPagerIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
