package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes5.dex */
class OuterHighlightDrawable extends Drawable {
    private final Paint zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.zzi;
        float f2 = this.zzk;
        float f3 = this.zzj;
        float f4 = this.zzl;
        canvas.drawCircle(f + f2, f3 + f4, this.zzg * this.zzh, this.zzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.zzf.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.zzf.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.zzf.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.zzh = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.zzk = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.zzl = f;
        invalidateSelf();
    }
}
