package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes6.dex */
public final class FormInputBirthYearEditTextBinding {
    public final EditText editText;
    public final TextInputLayout inputLayout;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private FormInputBirthYearEditTextBinding(View view, EditText editText, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.editText = editText;
        this.inputLayout = textInputLayout;
    }

    public static FormInputBirthYearEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.form_input_birth_year_edit_text, viewGroup);
        return bind(viewGroup);
    }

    public static FormInputBirthYearEditTextBinding bind(View view) {
        int i = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.inputLayout;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
            if (textInputLayout != null) {
                return new FormInputBirthYearEditTextBinding(view, editText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
