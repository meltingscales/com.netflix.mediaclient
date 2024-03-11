package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class RegistrationUserInputBinding {
    public final FormViewEditText email;
    public final CheckBox emailCheckbox;
    public final FormViewEditText password;
    public final CheckBox pipcConsentCheckbox;
    public final ConstraintLayout pipcConsentHolder;
    public final C1204Sr pipcConsentText;
    public final C1204Sr pipcErrorMessage;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private RegistrationUserInputBinding(View view, FormViewEditText formViewEditText, CheckBox checkBox, FormViewEditText formViewEditText2, CheckBox checkBox2, ConstraintLayout constraintLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.rootView = view;
        this.email = formViewEditText;
        this.emailCheckbox = checkBox;
        this.password = formViewEditText2;
        this.pipcConsentCheckbox = checkBox2;
        this.pipcConsentHolder = constraintLayout;
        this.pipcConsentText = c1204Sr;
        this.pipcErrorMessage = c1204Sr2;
    }

    public static RegistrationUserInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.registration_user_input, viewGroup);
        return bind(viewGroup);
    }

    public static RegistrationUserInputBinding bind(View view) {
        int i = R.id.email;
        FormViewEditText formViewEditText = (FormViewEditText) ViewBindings.findChildViewById(view, i);
        if (formViewEditText != null) {
            i = R.id.emailCheckbox;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox != null) {
                i = R.id.password;
                FormViewEditText formViewEditText2 = (FormViewEditText) ViewBindings.findChildViewById(view, i);
                if (formViewEditText2 != null) {
                    i = R.id.pipcConsentCheckbox;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
                    if (checkBox2 != null) {
                        i = R.id.pipcConsentHolder;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.pipcConsentText;
                            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr != null) {
                                i = R.id.pipcErrorMessage;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null) {
                                    return new RegistrationUserInputBinding(view, formViewEditText, checkBox, formViewEditText2, checkBox2, constraintLayout, c1204Sr, c1204Sr2);
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
