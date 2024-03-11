package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class DeviceSurveyDeviceChoiceBinding {
    public final ImageView checkMark;
    public final LinearLayout deviceContent;
    public final ImageView deviceImage;
    public final C1204Sr deviceText;
    private final LinearLayout rootView;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private DeviceSurveyDeviceChoiceBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ImageView imageView2, C1204Sr c1204Sr) {
        this.rootView = linearLayout;
        this.checkMark = imageView;
        this.deviceContent = linearLayout2;
        this.deviceImage = imageView2;
        this.deviceText = c1204Sr;
    }

    public static DeviceSurveyDeviceChoiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DeviceSurveyDeviceChoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.device_survey_device_choice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DeviceSurveyDeviceChoiceBinding bind(View view) {
        int i = R.id.check_mark;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.deviceImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.deviceText;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    return new DeviceSurveyDeviceChoiceBinding(linearLayout, imageView, linearLayout, imageView2, c1204Sr);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
