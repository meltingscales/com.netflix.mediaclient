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

/* loaded from: classes3.dex */
public final class FaqBlockViewBinding {
    public final ImageView expandIndicatorIcon;
    public final FrameLayout expandingContainer;
    public final LinearLayout faqHeader;
    public final C1204Sr faqValueText;
    public final C1204Sr headerText;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private FaqBlockViewBinding(View view, ImageView imageView, FrameLayout frameLayout, LinearLayout linearLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.rootView = view;
        this.expandIndicatorIcon = imageView;
        this.expandingContainer = frameLayout;
        this.faqHeader = linearLayout;
        this.faqValueText = c1204Sr;
        this.headerText = c1204Sr2;
    }

    public static FaqBlockViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.faq_block_view, viewGroup);
        return bind(viewGroup);
    }

    public static FaqBlockViewBinding bind(View view) {
        int i = R.id.expandIndicatorIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.expandingContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.faqHeader;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.faqValueText;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = R.id.headerText;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            return new FaqBlockViewBinding(view, imageView, frameLayout, linearLayout, c1204Sr, c1204Sr2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
