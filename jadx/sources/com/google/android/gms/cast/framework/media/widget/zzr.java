package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes5.dex */
public final class zzr {
    private static final Logger zza = new Logger("WidgetUtil");

    public static Drawable zzc(Context context, int i, int i2) {
        return zze(context, i, i2, 16842800, 0);
    }

    private static Drawable zze(Context context, int i, int i2, int i3, int i4) {
        int color;
        ColorStateList colorStateList;
        Drawable wrap = DrawableCompat.wrap(context.getResources().getDrawable(i2).mutate());
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = ContextCompat.getColorStateList(context, i);
        } else {
            if (i3 != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
            } else {
                color = ContextCompat.getColor(context, i4);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{color, ColorUtils.setAlphaComponent(color, 128)});
        }
        DrawableCompat.setTintList(wrap, colorStateList);
        return wrap;
    }
}
