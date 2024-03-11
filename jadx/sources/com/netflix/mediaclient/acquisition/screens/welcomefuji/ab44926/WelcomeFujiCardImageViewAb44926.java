package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1332Xp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes6.dex */
public final class WelcomeFujiCardImageViewAb44926 extends NetflixImageView {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WelcomeFujiCardImageViewAb44926(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WelcomeFujiCardImageViewAb44926(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ WelcomeFujiCardImageViewAb44926(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFujiCardImageViewAb44926(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // com.netflix.mediaclient.android.widget.NetflixImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        C1332Xp c1332Xp = C1332Xp.b;
        setVisibility(measuredHeight < ((int) TypedValue.applyDimension(1, (float) 96, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) ? 4 : 0);
    }
}
