package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes6.dex */
public final class ViewpagerIndicatorCircleBinding {
    public final ImageView dotIndicator;
    private final ImageView rootView;

    public ImageView getRoot() {
        return this.rootView;
    }

    private ViewpagerIndicatorCircleBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.dotIndicator = imageView2;
    }

    public static ViewpagerIndicatorCircleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewpagerIndicatorCircleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.viewpager_indicator_circle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewpagerIndicatorCircleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ViewpagerIndicatorCircleBinding(imageView, imageView);
    }
}
