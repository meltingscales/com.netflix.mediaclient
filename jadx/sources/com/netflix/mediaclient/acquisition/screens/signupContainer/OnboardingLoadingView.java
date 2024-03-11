package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.acquisition.R;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class OnboardingLoadingView extends ConstraintLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingLoadingView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ OnboardingLoadingView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        View.inflate(context, R.layout.loading_onboarding_inset, this);
        setBackgroundResource(C9834xU.c.b);
    }
}
