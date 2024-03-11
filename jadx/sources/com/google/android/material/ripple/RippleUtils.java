package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public class RippleUtils {
    public static final boolean USE_FRAMEWORK_RIPPLE = true;
    private static final int[] PRESSED_STATE_SET = {16842919};
    private static final int[] HOVERED_FOCUSED_STATE_SET = {16843623, 16842908};
    private static final int[] FOCUSED_STATE_SET = {16842908};
    private static final int[] HOVERED_STATE_SET = {16843623};
    private static final int[] SELECTED_PRESSED_STATE_SET = {16842913, 16842919};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = {16842913, 16843623, 16842908};
    private static final int[] SELECTED_FOCUSED_STATE_SET = {16842913, 16842908};
    private static final int[] SELECTED_HOVERED_STATE_SET = {16842913, 16843623};
    private static final int[] SELECTED_STATE_SET = {16842913};
    private static final int[] ENABLED_PRESSED_STATE_SET = {16842910, 16842919};
    static final String LOG_TAG = RippleUtils.class.getSimpleName();

    private RippleUtils() {
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = SELECTED_STATE_SET;
            int colorForState = getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET);
            int[] iArr2 = FOCUSED_STATE_SET;
            return new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{colorForState, getColorForState(colorStateList, iArr2), getColorForState(colorStateList, PRESSED_STATE_SET)});
        }
        int[] iArr3 = SELECTED_PRESSED_STATE_SET;
        int colorForState2 = getColorForState(colorStateList, iArr3);
        int[] iArr4 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        int colorForState3 = getColorForState(colorStateList, iArr4);
        int[] iArr5 = SELECTED_FOCUSED_STATE_SET;
        int colorForState4 = getColorForState(colorStateList, iArr5);
        int[] iArr6 = SELECTED_HOVERED_STATE_SET;
        int colorForState5 = getColorForState(colorStateList, iArr6);
        int[] iArr7 = SELECTED_STATE_SET;
        int[] iArr8 = PRESSED_STATE_SET;
        int colorForState6 = getColorForState(colorStateList, iArr8);
        int[] iArr9 = HOVERED_FOCUSED_STATE_SET;
        int colorForState7 = getColorForState(colorStateList, iArr9);
        int[] iArr10 = FOCUSED_STATE_SET;
        int colorForState8 = getColorForState(colorStateList, iArr10);
        int[] iArr11 = HOVERED_STATE_SET;
        return new ColorStateList(new int[][]{iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, StateSet.NOTHING}, new int[]{colorForState2, colorForState3, colorForState4, colorForState5, 0, colorForState6, colorForState7, colorForState8, getColorForState(colorStateList, iArr11), 0});
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
                Log.w(LOG_TAG, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    private static int getColorForState(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return USE_FRAMEWORK_RIPPLE ? doubleAlpha(colorForState) : colorForState;
    }

    @TargetApi(21)
    private static int doubleAlpha(int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, (int) PrivateKeyType.INVALID));
    }
}
