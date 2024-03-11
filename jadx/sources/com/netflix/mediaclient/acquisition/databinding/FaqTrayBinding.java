package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes6.dex */
public final class FaqTrayBinding {
    public final ConstraintLayout dim;
    private final ConstraintLayout rootView;
    public final FrameLayout sheet;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private FaqTrayBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.dim = constraintLayout2;
        this.sheet = frameLayout;
    }

    public static FaqTrayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FaqTrayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.faq_tray, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FaqTrayBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.sheet;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new FaqTrayBinding(constraintLayout, constraintLayout, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
