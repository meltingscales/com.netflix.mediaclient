package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    /* renamed from: getColor-WaAFU9c  reason: not valid java name */
    public final long m2019getColorWaAFU9c(Context context, int i) {
        return ColorKt.Color(context.getResources().getColor(i, context.getTheme()));
    }
}
