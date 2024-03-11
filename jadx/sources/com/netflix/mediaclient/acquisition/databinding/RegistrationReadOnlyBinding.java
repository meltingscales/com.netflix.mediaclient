package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.acquisition.R;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class RegistrationReadOnlyBinding {
    public final C1204Sr readOnlyEmailText;
    private final C1204Sr rootView;

    public C1204Sr getRoot() {
        return this.rootView;
    }

    private RegistrationReadOnlyBinding(C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.rootView = c1204Sr;
        this.readOnlyEmailText = c1204Sr2;
    }

    public static RegistrationReadOnlyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RegistrationReadOnlyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.registration_read_only, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RegistrationReadOnlyBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        C1204Sr c1204Sr = (C1204Sr) view;
        return new RegistrationReadOnlyBinding(c1204Sr, c1204Sr);
    }
}
