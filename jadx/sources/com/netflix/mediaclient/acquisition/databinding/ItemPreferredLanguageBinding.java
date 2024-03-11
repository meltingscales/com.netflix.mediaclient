package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class ItemPreferredLanguageBinding {
    public final C1204Sr preferredLanguageText;
    private final ConstraintLayout rootView;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private ItemPreferredLanguageBinding(ConstraintLayout constraintLayout, C1204Sr c1204Sr) {
        this.rootView = constraintLayout;
        this.preferredLanguageText = c1204Sr;
    }

    public static ItemPreferredLanguageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPreferredLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_preferred_language, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPreferredLanguageBinding bind(View view) {
        int i = R.id.preferredLanguageText;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            return new ItemPreferredLanguageBinding((ConstraintLayout) view, c1204Sr);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
