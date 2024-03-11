package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class OrderFinalMessagingBinding {
    public final C1204Sr autoContinueMessage;
    public final C1204Sr directDebitMessage;
    private final LinearLayout rootView;
    public final C1204Sr signupConfirmationMessage;
    public final C1204Sr title;

    public LinearLayout getRoot() {
        return this.rootView;
    }

    private OrderFinalMessagingBinding(LinearLayout linearLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4) {
        this.rootView = linearLayout;
        this.autoContinueMessage = c1204Sr;
        this.directDebitMessage = c1204Sr2;
        this.signupConfirmationMessage = c1204Sr3;
        this.title = c1204Sr4;
    }

    public static OrderFinalMessagingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OrderFinalMessagingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.order_final_messaging, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static OrderFinalMessagingBinding bind(View view) {
        int i = R.id.autoContinueMessage;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = R.id.directDebitMessage;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = R.id.signupConfirmationMessage;
                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr3 != null) {
                    i = R.id.title;
                    C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr4 != null) {
                        return new OrderFinalMessagingBinding((LinearLayout) view, c1204Sr, c1204Sr2, c1204Sr3, c1204Sr4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
