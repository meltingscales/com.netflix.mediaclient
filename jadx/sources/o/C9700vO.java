package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: o.vO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9700vO {
    public static final int d(Resources.Theme theme, Context context, int i) {
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) context, "");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        C8632dsu.a(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
}
