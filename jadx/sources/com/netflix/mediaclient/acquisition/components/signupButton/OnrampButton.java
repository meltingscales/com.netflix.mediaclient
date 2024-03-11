package com.netflix.mediaclient.acquisition.components.signupButton;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Pair;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class OnrampButton extends NetflixSignupButton {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnrampButton(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnrampButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnrampButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ OnrampButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnrampButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        Pair pair;
        super.setActivated(z);
        if (z) {
            pair = new Pair(Integer.valueOf(C9834xU.c.f), Integer.valueOf(C9834xU.c.e));
        } else {
            pair = new Pair(Integer.valueOf(C9834xU.c.z), Integer.valueOf(C9834xU.c.p));
        }
        updateTextAndButtonColor(((Number) pair.b()).intValue(), ((Number) pair.c()).intValue());
    }
}
