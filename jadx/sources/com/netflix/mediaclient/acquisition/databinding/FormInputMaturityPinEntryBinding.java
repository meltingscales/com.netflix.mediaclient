package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class FormInputMaturityPinEntryBinding {
    public final C1204Sr pinErrorText;
    private final View rootView;
    public final AppCompatEditText slot1;
    public final AppCompatEditText slot2;
    public final AppCompatEditText slot3;
    public final AppCompatEditText slot4;

    public View getRoot() {
        return this.rootView;
    }

    private FormInputMaturityPinEntryBinding(View view, C1204Sr c1204Sr, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4) {
        this.rootView = view;
        this.pinErrorText = c1204Sr;
        this.slot1 = appCompatEditText;
        this.slot2 = appCompatEditText2;
        this.slot3 = appCompatEditText3;
        this.slot4 = appCompatEditText4;
    }

    public static FormInputMaturityPinEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.form_input_maturity_pin_entry, viewGroup);
        return bind(viewGroup);
    }

    public static FormInputMaturityPinEntryBinding bind(View view) {
        int i = R.id.pinErrorText;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.slot_1;
            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
            if (appCompatEditText != null) {
                i = R.id.slot_2;
                AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                if (appCompatEditText2 != null) {
                    i = R.id.slot_3;
                    AppCompatEditText appCompatEditText3 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                    if (appCompatEditText3 != null) {
                        i = R.id.slot_4;
                        AppCompatEditText appCompatEditText4 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                        if (appCompatEditText4 != null) {
                            return new FormInputMaturityPinEntryBinding(view, c1204Sr, appCompatEditText, appCompatEditText2, appCompatEditText3, appCompatEditText4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
