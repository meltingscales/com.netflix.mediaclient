package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class ItemSecondaryLanguageDarkBinding {
    private final ConstraintLayout rootView;
    public final CheckBox secondaryLanguageCheckBox;
    public final ConstraintLayout secondaryLanguageLayout;
    public final C1204Sr secondaryLanguageText;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private ItemSecondaryLanguageDarkBinding(ConstraintLayout constraintLayout, CheckBox checkBox, ConstraintLayout constraintLayout2, C1204Sr c1204Sr) {
        this.rootView = constraintLayout;
        this.secondaryLanguageCheckBox = checkBox;
        this.secondaryLanguageLayout = constraintLayout2;
        this.secondaryLanguageText = c1204Sr;
    }

    public static ItemSecondaryLanguageDarkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSecondaryLanguageDarkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_secondary_language_dark, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSecondaryLanguageDarkBinding bind(View view) {
        int i = R.id.secondaryLanguageCheckBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.secondaryLanguageText;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i2);
            if (c1204Sr != null) {
                return new ItemSecondaryLanguageDarkBinding(constraintLayout, checkBox, constraintLayout, c1204Sr);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
