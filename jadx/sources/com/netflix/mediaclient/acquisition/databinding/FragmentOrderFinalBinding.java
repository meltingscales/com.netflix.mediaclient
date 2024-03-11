package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;

/* loaded from: classes3.dex */
public final class FragmentOrderFinalBinding {
    public final NetflixSignupButton ctaButton;
    public final OrderFinalMessagingBinding messaging;
    public final OrderFinalPhoneEntryBinding phoneEntry;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final SignupBannerView warningView;

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentOrderFinalBinding(NestedScrollView nestedScrollView, NetflixSignupButton netflixSignupButton, OrderFinalMessagingBinding orderFinalMessagingBinding, OrderFinalPhoneEntryBinding orderFinalPhoneEntryBinding, NestedScrollView nestedScrollView2, SignupBannerView signupBannerView) {
        this.rootView = nestedScrollView;
        this.ctaButton = netflixSignupButton;
        this.messaging = orderFinalMessagingBinding;
        this.phoneEntry = orderFinalPhoneEntryBinding;
        this.scrollView = nestedScrollView2;
        this.warningView = signupBannerView;
    }

    public static FragmentOrderFinalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderFinalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_order_final, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOrderFinalBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ctaButton;
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
        if (netflixSignupButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.messaging))) != null) {
            OrderFinalMessagingBinding bind = OrderFinalMessagingBinding.bind(findChildViewById);
            i = R.id.phoneEntry;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                OrderFinalPhoneEntryBinding bind2 = OrderFinalPhoneEntryBinding.bind(findChildViewById2);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = R.id.warningView;
                SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                if (signupBannerView != null) {
                    return new FragmentOrderFinalBinding(nestedScrollView, netflixSignupButton, bind, bind2, nestedScrollView, signupBannerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
