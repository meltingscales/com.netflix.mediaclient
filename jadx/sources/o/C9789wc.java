package o;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

/* renamed from: o.wc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9789wc {
    private static final TypedValue a = new TypedValue();

    public static final void d(View view, float f) {
        C8632dsu.c((Object) view, "");
        if (view.getVisibility() != 8) {
            view.setAlpha(f);
            view.setVisibility(C9913yu.a(f, 0.0f) ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(Resources resources, int i) {
        TypedValue typedValue = a;
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }
}
