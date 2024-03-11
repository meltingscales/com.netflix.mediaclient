package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditText;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateEditText;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthEditText;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class VerifyAgeDobPinLayoutBinding {
    public final BirthDateEditText birthDateDropdown;
    public final BirthMonthEditText birthMonthDropdown;
    public final BirthYearEditText birthYearEditText;
    public final C1204Sr dobErrorText;
    public final MaturityPinEntry maturityPinEntry;
    private final LinearLayout rootView;
    public final NetflixSignupButton verifyAgeCta;
    public final C1204Sr verifyAgeSubheader;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private VerifyAgeDobPinLayoutBinding(LinearLayout linearLayout, BirthDateEditText birthDateEditText, BirthMonthEditText birthMonthEditText, BirthYearEditText birthYearEditText, C1204Sr c1204Sr, MaturityPinEntry maturityPinEntry, NetflixSignupButton netflixSignupButton, C1204Sr c1204Sr2) {
        this.rootView = linearLayout;
        this.birthDateDropdown = birthDateEditText;
        this.birthMonthDropdown = birthMonthEditText;
        this.birthYearEditText = birthYearEditText;
        this.dobErrorText = c1204Sr;
        this.maturityPinEntry = maturityPinEntry;
        this.verifyAgeCta = netflixSignupButton;
        this.verifyAgeSubheader = c1204Sr2;
    }

    public static VerifyAgeDobPinLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VerifyAgeDobPinLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.verify_age_dob_pin_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static VerifyAgeDobPinLayoutBinding bind(View view) {
        int i = R.id.birthDateDropdown;
        BirthDateEditText birthDateEditText = (BirthDateEditText) ViewBindings.findChildViewById(view, i);
        if (birthDateEditText != null) {
            i = R.id.birthMonthDropdown;
            BirthMonthEditText birthMonthEditText = (BirthMonthEditText) ViewBindings.findChildViewById(view, i);
            if (birthMonthEditText != null) {
                i = R.id.birthYearEditText;
                BirthYearEditText birthYearEditText = (BirthYearEditText) ViewBindings.findChildViewById(view, i);
                if (birthYearEditText != null) {
                    i = R.id.dobErrorText;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = R.id.maturityPinEntry;
                        MaturityPinEntry maturityPinEntry = (MaturityPinEntry) ViewBindings.findChildViewById(view, i);
                        if (maturityPinEntry != null) {
                            i = R.id.verifyAgeCta;
                            NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                            if (netflixSignupButton != null) {
                                i = R.id.verifyAgeSubheader;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null) {
                                    return new VerifyAgeDobPinLayoutBinding((LinearLayout) view, birthDateEditText, birthMonthEditText, birthYearEditText, c1204Sr, maturityPinEntry, netflixSignupButton, c1204Sr2);
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
