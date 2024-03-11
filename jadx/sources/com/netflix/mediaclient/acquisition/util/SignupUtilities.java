package com.netflix.mediaclient.acquisition.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SignupUtilities {
    public static final int $stable = 0;
    public static final SignupUtilities INSTANCE = new SignupUtilities();

    private SignupUtilities() {
    }

    public static final Drawable getDrawableInColor(Context context, int i, int i2) {
        C8632dsu.c((Object) context, "");
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(context, i2));
        }
        return drawable;
    }
}
