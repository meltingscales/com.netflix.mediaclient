package androidx.compose.material3;

import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;

/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(1266660211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:352)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: cardElevation-aqJV_2Y  reason: not valid java name */
    public final CardElevation m732cardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-574898487);
        float m897getContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilledCardTokens.INSTANCE.m897getContainerElevationD9Ej5fM() : f;
        float m902getPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilledCardTokens.INSTANCE.m902getPressedContainerElevationD9Ej5fM() : f2;
        float m900getFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilledCardTokens.INSTANCE.m900getFocusContainerElevationD9Ej5fM() : f3;
        float m901getHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilledCardTokens.INSTANCE.m901getHoverContainerElevationD9Ej5fM() : f4;
        float m899getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? FilledCardTokens.INSTANCE.m899getDraggedContainerElevationD9Ej5fM() : f5;
        float m898getDisabledContainerElevationD9Ej5fM = (i2 & 32) != 0 ? FilledCardTokens.INSTANCE.m898getDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:378)");
        }
        CardElevation cardElevation = new CardElevation(m897getContainerElevationD9Ej5fM, m902getPressedContainerElevationD9Ej5fM, m900getFocusContainerElevationD9Ej5fM, m901getHoverContainerElevationD9Ej5fM, m899getDraggedContainerElevationD9Ej5fM, m898getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    public final CardColors cardColors(Composer composer, int i) {
        composer.startReplaceableGroup(-1876034303);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:448)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCardColors$material3_release;
    }

    /* renamed from: cardColors-ro_MJ88  reason: not valid java name */
    public final CardColors m731cardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1589582123);
        long m1309getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j;
        long m778contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m778contentColorForek8zF_U(m1309getUnspecified0d7_KjU, composer, i & 14) : j2;
        long m1309getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j3;
        long m1292copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1292copywmQWz5c$default(m778contentColorForek8zF_U, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:465)");
        }
        CardColors m730copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m730copyjRlVdoo(m1309getUnspecified0d7_KjU, m778contentColorForek8zF_U, m1309getUnspecified0d7_KjU2, m1292copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m730copyjRlVdoo;
    }

    public final CardColors getDefaultCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3_release = colorScheme.getDefaultCardColorsCached$material3_release();
        if (defaultCardColorsCached$material3_release == null) {
            FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
            CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m777contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m781surfaceColorAtElevation3ABfNKs(colorScheme, filledCardTokens.m898getDisabledContainerElevationD9Ej5fM())), Color.m1292copywmQWz5c$default(ColorSchemeKt.m777contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
            return cardColors;
        }
        return defaultCardColorsCached$material3_release;
    }
}
