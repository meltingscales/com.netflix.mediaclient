package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;
import o.C6371cbz;

/* loaded from: classes3.dex */
public final class OrderFinalPhoneEntryBinding {
    public final C6371cbz countryPicker;
    public final C1204Sr phoneBodyText;
    public final EditText phoneEditText;
    public final C1204Sr phoneEntryTitle;
    public final TextInputLayout phoneTextInputLayout;
    private final LinearLayout rootView;
    public final LinearLayout smsCheckboxSection;
    public final CheckBox smsConsentCheckbox;
    public final C1204Sr smsConsentCheckboxText;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private OrderFinalPhoneEntryBinding(LinearLayout linearLayout, C6371cbz c6371cbz, C1204Sr c1204Sr, EditText editText, C1204Sr c1204Sr2, TextInputLayout textInputLayout, LinearLayout linearLayout2, CheckBox checkBox, C1204Sr c1204Sr3) {
        this.rootView = linearLayout;
        this.countryPicker = c6371cbz;
        this.phoneBodyText = c1204Sr;
        this.phoneEditText = editText;
        this.phoneEntryTitle = c1204Sr2;
        this.phoneTextInputLayout = textInputLayout;
        this.smsCheckboxSection = linearLayout2;
        this.smsConsentCheckbox = checkBox;
        this.smsConsentCheckboxText = c1204Sr3;
    }

    public static OrderFinalPhoneEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OrderFinalPhoneEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.order_final_phone_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static OrderFinalPhoneEntryBinding bind(View view) {
        int i = R.id.countryPicker;
        C6371cbz c6371cbz = (C6371cbz) ViewBindings.findChildViewById(view, i);
        if (c6371cbz != null) {
            i = R.id.phoneBodyText;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.phoneEditText;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = R.id.phoneEntryTitle;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        i = R.id.phone_text_input_layout;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                        if (textInputLayout != null) {
                            i = R.id.smsCheckboxSection;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.smsConsentCheckbox;
                                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
                                if (checkBox != null) {
                                    i = R.id.smsConsentCheckboxText;
                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr3 != null) {
                                        return new OrderFinalPhoneEntryBinding((LinearLayout) view, c6371cbz, c1204Sr, editText, c1204Sr2, textInputLayout, linearLayout, checkBox, c1204Sr3);
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
