package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m724getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m725getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    private ButtonDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final Shape getTextShape(Composer composer, int i) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:539)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final ButtonColors buttonColors(Composer composer, int i) {
        composer.startReplaceableGroup(1449248637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors$material3_release;
    }

    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m722buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-339300779);
        long m1309getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j;
        long m1309getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j2;
        long m1309getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j3;
        long m1309getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        ButtonColors m721copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m721copyjRlVdoo(m1309getUnspecified0d7_KjU, m1309getUnspecified0d7_KjU2, m1309getUnspecified0d7_KjU3, m1309getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m721copyjRlVdoo;
    }

    public final ButtonColors getDefaultButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3_release = colorScheme.getDefaultButtonColorsCached$material3_release();
        if (defaultButtonColorsCached$material3_release == null) {
            FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultButtonColorsCached$material3_release;
    }

    public final ButtonColors textButtonColors(Composer composer, int i) {
        composer.startReplaceableGroup(1880341584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:717)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextButtonColors$material3_release;
    }

    /* renamed from: textButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m726textButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1402274782);
        long m1308getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m1308getTransparent0d7_KjU() : j;
        long value = (i2 & 2) != 0 ? ColorSchemeKt.getValue(TextButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j2;
        long m1308getTransparent0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m1308getTransparent0d7_KjU() : j3;
        long m1292copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1292copywmQWz5c$default(ColorSchemeKt.getValue(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:736)");
        }
        ButtonColors m721copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m721copyjRlVdoo(m1308getTransparent0d7_KjU, value, m1308getTransparent0d7_KjU2, m1292copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m721copyjRlVdoo;
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3_release = colorScheme.getDefaultTextButtonColorsCached$material3_release();
        if (defaultTextButtonColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m1308getTransparent0d7_KjU = companion.m1308getTransparent0d7_KjU();
            TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(m1308getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m1308getTransparent0d7_KjU(), Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultTextButtonColorsCached$material3_release;
    }

    /* renamed from: buttonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m723buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1827791191);
        float m891getContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilledButtonTokens.INSTANCE.m891getContainerElevationD9Ej5fM() : f;
        float m896getPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilledButtonTokens.INSTANCE.m896getPressedContainerElevationD9Ej5fM() : f2;
        float m893getFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilledButtonTokens.INSTANCE.m893getFocusContainerElevationD9Ej5fM() : f3;
        float m894getHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilledButtonTokens.INSTANCE.m894getHoverContainerElevationD9Ej5fM() : f4;
        float m892getDisabledContainerElevationD9Ej5fM = (i2 & 16) != 0 ? FilledButtonTokens.INSTANCE.m892getDisabledContainerElevationD9Ej5fM() : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:774)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(m891getContainerElevationD9Ej5fM, m896getPressedContainerElevationD9Ej5fM, m893getFocusContainerElevationD9Ej5fM, m894getHoverContainerElevationD9Ej5fM, m892getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    static {
        float m2492constructorimpl = Dp.m2492constructorimpl(24);
        ButtonHorizontalPadding = m2492constructorimpl;
        float f = 8;
        float m2492constructorimpl2 = Dp.m2492constructorimpl(f);
        ButtonVerticalPadding = m2492constructorimpl2;
        PaddingValues m272PaddingValuesa9UjIt4 = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl, m2492constructorimpl2, m2492constructorimpl, m2492constructorimpl2);
        ContentPadding = m272PaddingValuesa9UjIt4;
        float f2 = 16;
        float m2492constructorimpl3 = Dp.m2492constructorimpl(f2);
        ButtonWithIconHorizontalStartPadding = m2492constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl3, m2492constructorimpl2, m2492constructorimpl, m2492constructorimpl2);
        float m2492constructorimpl4 = Dp.m2492constructorimpl(12);
        TextButtonHorizontalPadding = m2492constructorimpl4;
        TextButtonContentPadding = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl4, m272PaddingValuesa9UjIt4.mo251calculateTopPaddingD9Ej5fM(), m2492constructorimpl4, m272PaddingValuesa9UjIt4.mo248calculateBottomPaddingD9Ej5fM());
        float m2492constructorimpl5 = Dp.m2492constructorimpl(f2);
        TextButtonWithIconHorizontalEndPadding = m2492constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl4, m272PaddingValuesa9UjIt4.mo251calculateTopPaddingD9Ej5fM(), m2492constructorimpl5, m272PaddingValuesa9UjIt4.mo248calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m2492constructorimpl(58);
        MinHeight = Dp.m2492constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m895getIconSizeD9Ej5fM();
        IconSpacing = Dp.m2492constructorimpl(f);
    }
}
