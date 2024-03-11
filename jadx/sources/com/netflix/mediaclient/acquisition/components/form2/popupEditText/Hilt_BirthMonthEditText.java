package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_BirthMonthEditText extends PopupEditText {
    private boolean injected;

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public Hilt_BirthMonthEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inject();
    }

    Hilt_BirthMonthEditText(Context context) {
        super(context);
        inject();
    }

    Hilt_BirthMonthEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    Hilt_BirthMonthEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.Hilt_PopupEditText
    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((BirthMonthEditText_GeneratedInjector) generatedComponent()).injectBirthMonthEditText((BirthMonthEditText) UnsafeCasts.unsafeCast(this));
    }
}
