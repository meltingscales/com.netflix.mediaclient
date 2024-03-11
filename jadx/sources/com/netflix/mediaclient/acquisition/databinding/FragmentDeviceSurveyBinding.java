package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyDeviceContainer;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentDeviceSurveyBinding {
    public final OnrampButton ctaButton;
    public final DeviceSurveyDeviceContainer deviceSurveyDeviceContainer;
    public final C1204Sr header;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final C1204Sr subheader;
    public final SignupBannerView warningView;

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentDeviceSurveyBinding(NestedScrollView nestedScrollView, OnrampButton onrampButton, DeviceSurveyDeviceContainer deviceSurveyDeviceContainer, C1204Sr c1204Sr, NestedScrollView nestedScrollView2, C1204Sr c1204Sr2, SignupBannerView signupBannerView) {
        this.rootView = nestedScrollView;
        this.ctaButton = onrampButton;
        this.deviceSurveyDeviceContainer = deviceSurveyDeviceContainer;
        this.header = c1204Sr;
        this.scrollView = nestedScrollView2;
        this.subheader = c1204Sr2;
        this.warningView = signupBannerView;
    }

    public static FragmentDeviceSurveyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceSurveyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_survey, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDeviceSurveyBinding bind(View view) {
        int i = R.id.ctaButton;
        OnrampButton onrampButton = (OnrampButton) ViewBindings.findChildViewById(view, i);
        if (onrampButton != null) {
            i = R.id.deviceSurveyDeviceContainer;
            DeviceSurveyDeviceContainer deviceSurveyDeviceContainer = (DeviceSurveyDeviceContainer) ViewBindings.findChildViewById(view, i);
            if (deviceSurveyDeviceContainer != null) {
                i = R.id.header;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    i = R.id.subheader;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        i = R.id.warningView;
                        SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                        if (signupBannerView != null) {
                            return new FragmentDeviceSurveyBinding(nestedScrollView, onrampButton, deviceSurveyDeviceContainer, c1204Sr, nestedScrollView, c1204Sr2, signupBannerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
