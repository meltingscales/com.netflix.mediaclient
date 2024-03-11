package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes6.dex */
public final class FaqListBinding {
    public final ImageView closeButton;
    public final LinearLayout faqBlocksHolder;
    private final ScrollView rootView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private FaqListBinding(ScrollView scrollView, ImageView imageView, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.closeButton = imageView;
        this.faqBlocksHolder = linearLayout;
    }

    public static FaqListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FaqListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.faq_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FaqListBinding bind(View view) {
        int i = R.id.closeButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.faqBlocksHolder;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                return new FaqListBinding((ScrollView) view, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
