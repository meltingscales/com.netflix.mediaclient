package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFAQView_Ab31697;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FragmentAddProfilesEeAb31697Binding {
    public final CheckBox checkBox;
    public final C1204Sr checkBoxErrorTextView;
    public final NetflixSignupButton ctaButton;
    public final AddProfilesEEFAQView_Ab31697 faqLayout;
    public final C1204Sr header;
    public final ProfileEntryEditTextCheckbox ownerName;
    public final LinearLayout profilesForm;
    public final C1204Sr reminderTextView;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final C1204Sr shareAccountTextView;
    public final C1204Sr subheader;
    public final C1204Sr toolTipTextView;
    public final ProfileEntryEditTextCheckbox userProfile1;
    public final ProfileEntryEditTextCheckbox userProfile2;
    public final ProfileEntryEditTextCheckbox userProfile3;
    public final ProfileEntryEditTextCheckbox userProfile4;
    public final SignupBannerView warningView;

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentAddProfilesEeAb31697Binding(NestedScrollView nestedScrollView, CheckBox checkBox, C1204Sr c1204Sr, NetflixSignupButton netflixSignupButton, AddProfilesEEFAQView_Ab31697 addProfilesEEFAQView_Ab31697, C1204Sr c1204Sr2, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox, LinearLayout linearLayout, C1204Sr c1204Sr3, NestedScrollView nestedScrollView2, C1204Sr c1204Sr4, C1204Sr c1204Sr5, C1204Sr c1204Sr6, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox2, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox3, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox4, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox5, SignupBannerView signupBannerView) {
        this.rootView = nestedScrollView;
        this.checkBox = checkBox;
        this.checkBoxErrorTextView = c1204Sr;
        this.ctaButton = netflixSignupButton;
        this.faqLayout = addProfilesEEFAQView_Ab31697;
        this.header = c1204Sr2;
        this.ownerName = profileEntryEditTextCheckbox;
        this.profilesForm = linearLayout;
        this.reminderTextView = c1204Sr3;
        this.scrollView = nestedScrollView2;
        this.shareAccountTextView = c1204Sr4;
        this.subheader = c1204Sr5;
        this.toolTipTextView = c1204Sr6;
        this.userProfile1 = profileEntryEditTextCheckbox2;
        this.userProfile2 = profileEntryEditTextCheckbox3;
        this.userProfile3 = profileEntryEditTextCheckbox4;
        this.userProfile4 = profileEntryEditTextCheckbox5;
        this.warningView = signupBannerView;
    }

    public static FragmentAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddProfilesEeAb31697Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_profiles_ee_ab31697, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAddProfilesEeAb31697Binding bind(View view) {
        int i = R.id.checkBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.checkBoxErrorTextView;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.ctaButton;
                NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                if (netflixSignupButton != null) {
                    i = R.id.faqLayout;
                    AddProfilesEEFAQView_Ab31697 addProfilesEEFAQView_Ab31697 = (AddProfilesEEFAQView_Ab31697) ViewBindings.findChildViewById(view, i);
                    if (addProfilesEEFAQView_Ab31697 != null) {
                        i = R.id.header;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            i = R.id.ownerName;
                            ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox = (ProfileEntryEditTextCheckbox) ViewBindings.findChildViewById(view, i);
                            if (profileEntryEditTextCheckbox != null) {
                                i = R.id.profilesForm;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.reminderTextView;
                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr3 != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i = R.id.shareAccountTextView;
                                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                        if (c1204Sr4 != null) {
                                            i = R.id.subheader;
                                            C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                            if (c1204Sr5 != null) {
                                                i = R.id.toolTipTextView;
                                                C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr6 != null) {
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
                                                                        return new FragmentAddProfilesEeAb31697Binding(nestedScrollView, checkBox, c1204Sr, netflixSignupButton, addProfilesEEFAQView_Ab31697, c1204Sr2, profileEntryEditTextCheckbox, linearLayout, c1204Sr3, nestedScrollView, c1204Sr4, c1204Sr5, c1204Sr6, profileEntryEditTextCheckbox2, profileEntryEditTextCheckbox3, profileEntryEditTextCheckbox4, profileEntryEditTextCheckbox5, signupBannerView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
