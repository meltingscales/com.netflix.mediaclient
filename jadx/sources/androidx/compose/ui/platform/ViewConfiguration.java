package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;

/* loaded from: classes.dex */
public interface ViewConfiguration {
    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    float getTouchSlop();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo1873getMinimumTouchTargetSizeMYxV2XQ() {
        float f = 48;
        return DpKt.m2503DpSizeYgX7TsA(Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f));
    }
}
