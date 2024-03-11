package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class FormInputViewHolderBinding {
    public final EditText editText;
    public final C1204Sr inputError;
    public final TextInputLayout inputLayout;
    private final LinearLayout rootView;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private FormInputViewHolderBinding(LinearLayout linearLayout, EditText editText, C1204Sr c1204Sr, TextInputLayout textInputLayout) {
        this.rootView = linearLayout;
        this.editText = editText;
        this.inputError = c1204Sr;
        this.inputLayout = textInputLayout;
    }

    public static FormInputViewHolderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FormInputViewHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.form_input_view_holder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FormInputViewHolderBinding bind(View view) {
        int i = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.inputError;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.inputLayout;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout != null) {
                    return new FormInputViewHolderBinding((LinearLayout) view, editText, c1204Sr, textInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
