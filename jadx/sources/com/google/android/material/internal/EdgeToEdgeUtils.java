package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;
import com.netflix.model.leafs.ArtworkColors;

/* loaded from: classes2.dex */
public class EdgeToEdgeUtils {
    public static void applyEdgeToEdge(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = true;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 != null && num2.intValue() != 0) {
            z2 = false;
        }
        if (z3 || z2) {
            int color = MaterialColors.getColor(window.getContext(), 16842801, (int) ArtworkColors.DEFAULT_BACKGROUND_COLOR);
            if (z3) {
                num = Integer.valueOf(color);
            }
            if (z2) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }

    public static void setLightStatusBar(Window window, boolean z) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void setLightNavigationBar(Window window, boolean z) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843857, (int) ArtworkColors.DEFAULT_BACKGROUND_COLOR);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 27) {
            if (z) {
                return 0;
            }
            return MaterialColors.getColor(context, 16843858, (int) ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        }
        return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, 16843858, (int) ArtworkColors.DEFAULT_BACKGROUND_COLOR), 128);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        return MaterialColors.isColorLight(i) || (i == 0 && z);
    }
}
