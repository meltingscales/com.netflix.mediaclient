package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class IconFormInputViewHolderBinding {
    public final EditText editText;
    public final NetflixImageView imageButton;
    public final View inputBackground;
    public final C1204Sr inputError;
    public final TextInputLayout inputLayout;
    private final ConstraintLayout rootView;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private IconFormInputViewHolderBinding(ConstraintLayout constraintLayout, EditText editText, NetflixImageView netflixImageView, View view, C1204Sr c1204Sr, TextInputLayout textInputLayout) {
        this.rootView = constraintLayout;
        this.editText = editText;
        this.imageButton = netflixImageView;
        this.inputBackground = view;
        this.inputError = c1204Sr;
        this.inputLayout = textInputLayout;
    }

    public static IconFormInputViewHolderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IconFormInputViewHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.icon_form_input_view_holder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IconFormInputViewHolderBinding bind(View view) {
        View findChildViewById;
        int i = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.imageButton;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.inputBackground))) != null) {
                i = R.id.inputError;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = R.id.inputLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                    if (textInputLayout != null) {
                        return new IconFormInputViewHolderBinding((ConstraintLayout) view, editText, netflixImageView, findChildViewById, c1204Sr, textInputLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
