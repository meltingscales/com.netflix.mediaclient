package o;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;

/* renamed from: o.vz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9737vz {
    public static final <T> T b(Context context, Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        if (context != null) {
            return (T) C8141del.d(context, cls);
        }
        return null;
    }

    public static final <T> T e(Context context, Class<T> cls) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cls, "");
        return (T) C8141del.e(context, cls);
    }

    public static final boolean a(Context context) {
        return C8141del.c(context);
    }

    public static final boolean d(Context context) {
        C8632dsu.c((Object) context, "");
        ContentResolver contentResolver = context.getContentResolver();
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f) == 0.0f;
    }

    public static final Drawable d(Context context, int i, int i2) {
        C8632dsu.c((Object) context, "");
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(context, i2));
            return drawable;
        }
        return null;
    }
}
