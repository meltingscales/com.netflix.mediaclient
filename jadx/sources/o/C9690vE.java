package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

/* renamed from: o.vE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9690vE {
    public static final void c(Drawable drawable, Context context, boolean z, int i, int i2) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) context, "");
        if (z) {
            i = i2;
        }
        DrawableCompat.setTint(drawable, ContextCompat.getColor(context, i));
    }
}
