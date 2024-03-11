package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class ExpandingDropDownViewBinding {
    public final FrameLayout expandingContainer;
    public final LinearLayout expandingHeader;
    public final ImageView expandingHeaderChevron;
    public final C1204Sr expandingHeaderText;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private ExpandingDropDownViewBinding(View view, FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, C1204Sr c1204Sr) {
        this.rootView = view;
        this.expandingContainer = frameLayout;
        this.expandingHeader = linearLayout;
        this.expandingHeaderChevron = imageView;
        this.expandingHeaderText = c1204Sr;
    }

    public static ExpandingDropDownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.expanding_drop_down_view, viewGroup);
        return bind(viewGroup);
    }

    public static ExpandingDropDownViewBinding bind(View view) {
        int i = R.id.expandingContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.expandingHeader;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.expandingHeaderChevron;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.expandingHeaderText;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        return new ExpandingDropDownViewBinding(view, frameLayout, linearLayout, imageView, c1204Sr);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
