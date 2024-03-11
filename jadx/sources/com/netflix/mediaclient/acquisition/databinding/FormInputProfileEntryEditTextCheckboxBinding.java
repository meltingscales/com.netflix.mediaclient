package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class FormInputProfileEntryEditTextCheckboxBinding {
    public final NetflixImageView addUserIcon;
    public final EditText editText;
    public final C1204Sr inputError;
    public final TextInputLayout inputLayout;
    public final ConstraintLayout inputWrapper;
    public final CheckBox kidsCheckBox;
    public final C1204Sr kidsIcon;
    public final LinearLayout outerContainer;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private FormInputProfileEntryEditTextCheckboxBinding(View view, NetflixImageView netflixImageView, EditText editText, C1204Sr c1204Sr, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, CheckBox checkBox, C1204Sr c1204Sr2, LinearLayout linearLayout) {
        this.rootView = view;
        this.addUserIcon = netflixImageView;
        this.editText = editText;
        this.inputError = c1204Sr;
        this.inputLayout = textInputLayout;
        this.inputWrapper = constraintLayout;
        this.kidsCheckBox = checkBox;
        this.kidsIcon = c1204Sr2;
        this.outerContainer = linearLayout;
    }

    public static FormInputProfileEntryEditTextCheckboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.form_input_profile_entry_edit_text_checkbox, viewGroup);
        return bind(viewGroup);
    }

    public static FormInputProfileEntryEditTextCheckboxBinding bind(View view) {
        int i = R.id.addUserIcon;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = R.id.editText;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.inputError;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = R.id.inputLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                    if (textInputLayout != null) {
                        i = R.id.inputWrapper;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.kidsCheckBox;
                            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
                            if (checkBox != null) {
                                i = R.id.kidsIcon;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null) {
                                    i = R.id.outerContainer;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        return new FormInputProfileEntryEditTextCheckboxBinding(view, netflixImageView, editText, c1204Sr, textInputLayout, constraintLayout, checkBox, c1204Sr2, linearLayout);
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
