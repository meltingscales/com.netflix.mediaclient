package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    /* renamed from: actualTintColorFilter-xETnrds  reason: not valid java name */
    public static final android.graphics.ColorFilter m1196actualTintColorFilterxETnrds(long j, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BlendModeColorFilterHelper.INSTANCE.m1263BlendModeColorFilterxETnrds(j, i);
        }
        return new PorterDuffColorFilter(ColorKt.m1317toArgb8_81llA(j), AndroidBlendMode_androidKt.m1186toPorterDuffModes9anfk8(i));
    }
}
