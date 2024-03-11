package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentAddProfilesBinding {
    public final OnrampButton ctaButton;
    public final C1204Sr header;
    public final ProfileEntryEditTextCheckbox ownerName;
    public final LinearLayout profilesForm;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final C1204Sr subheader;
    public final ProfileEntryEditTextCheckbox userProfile1;
    public final ProfileEntryEditTextCheckbox userProfile2;
    public final ProfileEntryEditTextCheckbox userProfile3;
    public final ProfileEntryEditTextCheckbox userProfile4;
    public final SignupBannerView warningView;

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentAddProfilesBinding(NestedScrollView nestedScrollView, OnrampButton onrampButton, C1204Sr c1204Sr, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox, LinearLayout linearLayout, NestedScrollView nestedScrollView2, C1204Sr c1204Sr2, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox2, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox3, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox4, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox5, SignupBannerView signupBannerView) {
        this.rootView = nestedScrollView;
        this.ctaButton = onrampButton;
        this.header = c1204Sr;
        this.ownerName = profileEntryEditTextCheckbox;
        this.profilesForm = linearLayout;
        this.scrollView = nestedScrollView2;
        this.subheader = c1204Sr2;
        this.userProfile1 = profileEntryEditTextCheckbox2;
        this.userProfile2 = profileEntryEditTextCheckbox3;
        this.userProfile3 = profileEntryEditTextCheckbox4;
        this.userProfile4 = profileEntryEditTextCheckbox5;
        this.warningView = signupBannerView;
    }

    public static FragmentAddProfilesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddProfilesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_profiles, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAddProfilesBinding bind(View view) {
        int i = R.id.ctaButton;
        OnrampButton onrampButton = (OnrampButton) ViewBindings.findChildViewById(view, i);
        if (onrampButton != null) {
            i = R.id.header;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.ownerName;
                ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                if (profileEntryEditTextCheckbox != null) {
                    i = R.id.profilesForm;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        i = R.id.subheader;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            i = R.id.userProfile1;
                            ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox2 = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                            if (profileEntryEditTextCheckbox2 != null) {
                                i = R.id.userProfile2;
                                ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox3 = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                                if (profileEntryEditTextCheckbox3 != null) {
                                    i = R.id.userProfile3;
                                    ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox4 = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                                    if (profileEntryEditTextCheckbox4 != null) {
                                        i = R.id.userProfile4;
                                        ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox5 = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                                        if (profileEntryEditTextCheckbox5 != null) {
                                            i = R.id.warningView;
                                            SignupBannerView signupBannerView = (SignupBannerView) ViewBindings.findChildViewById(view, i);
                                            if (signupBannerView != null) {
                                                return new FragmentAddProfilesBinding(nestedScrollView, onrampButton, c1204Sr, profileEntryEditTextCheckbox, linearLayout, nestedScrollView, c1204Sr2, profileEntryEditTextCheckbox2, profileEntryEditTextCheckbox3, profileEntryEditTextCheckbox4, profileEntryEditTextCheckbox5, signupBannerView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
