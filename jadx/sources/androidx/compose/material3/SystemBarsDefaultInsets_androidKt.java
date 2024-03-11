package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    public static final WindowInsets getSystemBarsForVisualComponents(WindowInsets.Companion companion, Composer composer, int i) {
        composer.startReplaceableGroup(1816710665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1816710665, i, -1, "androidx.compose.material3.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:24)");
        }
        WindowInsets systemBars = WindowInsets_androidKt.getSystemBars(companion, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }
}
