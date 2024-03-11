package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    public final CheckboxColors colors(Composer composer, int i) {
        composer.startReplaceableGroup(-9530498);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:188)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors$material3_release;
    }

    /* renamed from: colors-5tl4gsc  reason: not valid java name */
    public final CheckboxColors m735colors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-89536160);
        long m1309getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j;
        long m1309getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j2;
        long m1309getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j3;
        long m1309getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4;
        long m1309getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j5;
        long m1309getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:213)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        CheckboxColors m734copy2qZNXz8 = defaultCheckboxColors$material3_release.m734copy2qZNXz8(m1309getUnspecified0d7_KjU3, companion.m1308getTransparent0d7_KjU(), m1309getUnspecified0d7_KjU, companion.m1308getTransparent0d7_KjU(), m1309getUnspecified0d7_KjU4, companion.m1308getTransparent0d7_KjU(), m1309getUnspecified0d7_KjU6, m1309getUnspecified0d7_KjU, m1309getUnspecified0d7_KjU2, m1309getUnspecified0d7_KjU4, m1309getUnspecified0d7_KjU5, m1309getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m734copy2qZNXz8;
    }

    public final CheckboxColors getDefaultCheckboxColors$material3_release(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached$material3_release = colorScheme.getDefaultCheckboxColorsCached$material3_release();
        if (defaultCheckboxColorsCached$material3_release == null) {
            CheckboxTokens checkboxTokens = CheckboxTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedIconColor());
            Color.Companion companion = Color.Companion;
            CheckboxColors checkboxColors = new CheckboxColors(fromToken, companion.m1308getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), companion.m1308getTransparent0d7_KjU(), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m1308getTransparent0d7_KjU(), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedOutlineColor()), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultCheckboxColorsCached$material3_release(checkboxColors);
            return checkboxColors;
        }
        return defaultCheckboxColorsCached$material3_release;
    }
}
