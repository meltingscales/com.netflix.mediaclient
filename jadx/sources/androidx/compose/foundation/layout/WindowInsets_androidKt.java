package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.Insets;

/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    public static final InsetsValues toInsetsValues(Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final ValueInsets ValueInsets(Insets insets, String str) {
        return new ValueInsets(toInsetsValues(insets), str);
    }

    public static final WindowInsets getDisplayCutout(WindowInsets.Companion companion, Composer composer, int i) {
        composer.startReplaceableGroup(1324817724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        AndroidWindowInsets displayCutout = WindowInsetsHolder.Companion.current(composer, 8).getDisplayCutout();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return displayCutout;
    }

    public static final WindowInsets getSystemBars(WindowInsets.Companion companion, Composer composer, int i) {
        composer.startReplaceableGroup(-282936756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.Companion.current(composer, 8).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }
}
