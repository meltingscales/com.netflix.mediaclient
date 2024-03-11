package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.viewPagerIndicator.ViewPagerIndicator;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentWelcomeFujiBinding {
    public final LinearLayout floatingCtaContainer;
    public final ViewPager2 fujiPager;
    public final NetflixSignupButton netflixSignupButtonWelcome;
    public final C1204Sr planFallbackButton;
    private final ConstraintLayout rootView;
    public final ViewPagerIndicator viewPagerIndicator;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FragmentWelcomeFujiBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager2 viewPager2, NetflixSignupButton netflixSignupButton, C1204Sr c1204Sr, ViewPagerIndicator viewPagerIndicator) {
        this.rootView = constraintLayout;
        this.floatingCtaContainer = linearLayout;
        this.fujiPager = viewPager2;
        this.netflixSignupButtonWelcome = netflixSignupButton;
        this.planFallbackButton = c1204Sr;
        this.viewPagerIndicator = viewPagerIndicator;
    }

    public static FragmentWelcomeFujiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeFujiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_welcome_fuji, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWelcomeFujiBinding bind(View view) {
        int i = R.id.floatingCtaContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.fujiPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = R.id.netflixSignupButtonWelcome;
                NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                if (netflixSignupButton != null) {
                    i = R.id.planFallbackButton;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = R.id.viewPagerIndicator;
                        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) ViewBindings.findChildViewById(view, i);
                        if (viewPagerIndicator != null) {
                            return new FragmentWelcomeFujiBinding((ConstraintLayout) view, linearLayout, viewPager2, netflixSignupButton, c1204Sr, viewPagerIndicator);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
