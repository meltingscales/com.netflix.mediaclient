package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1184Rx;

/* loaded from: classes3.dex */
public final class SignupActivityLayoutBinding {
    public final C1184Rx dialogContainer;
    public final FrameLayout loadingView;
    private final FrameLayout rootView;
    public final FrameLayout signupActivityContent;
    public final FrameLayout signupFragmentContainer;

    public FrameLayout getRoot() {
        return this.rootView;
    }

    private SignupActivityLayoutBinding(FrameLayout frameLayout, C1184Rx c1184Rx, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.rootView = frameLayout;
        this.dialogContainer = c1184Rx;
        this.loadingView = frameLayout2;
        this.signupActivityContent = frameLayout3;
        this.signupFragmentContainer = frameLayout4;
    }

    public static SignupActivityLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SignupActivityLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.signup_activity_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SignupActivityLayoutBinding bind(View view) {
        int i = R.id.dialog_container;
        C1184Rx c1184Rx = (C1184Rx) ViewBindings.findChildViewById(view, i);
        if (c1184Rx != null) {
            i = R.id.loading_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) view;
                i = R.id.signup_fragment_container;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout3 != null) {
                    return new SignupActivityLayoutBinding(frameLayout2, c1184Rx, frameLayout, frameLayout2, frameLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
