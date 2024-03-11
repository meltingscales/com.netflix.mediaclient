package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m553getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m554getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    private ButtonDefaults() {
    }

    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m551buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        composer.startReplaceableGroup(1870371134);
        long m565getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU() : j;
        long m571contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m571contentColorForek8zF_U(m565getPrimary0d7_KjU, composer, i & 14) : j2;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j5 = ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(materialTheme.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m569getSurface0d7_KjU());
        } else {
            j5 = j3;
        }
        long m1292copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m565getPrimary0d7_KjU, m571contentColorForek8zF_U, j5, m1292copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m555textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        long m1308getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m1308getTransparent0d7_KjU() : j;
        long m565getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU() : j2;
        long m1292copywmQWz5c$default = (i2 & 4) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1308getTransparent0d7_KjU, m565getPrimary0d7_KjU, m1308getTransparent0d7_KjU, m1292copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m552elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-737170518);
        float m2492constructorimpl = (i2 & 1) != 0 ? Dp.m2492constructorimpl(2) : f;
        float m2492constructorimpl2 = (i2 & 2) != 0 ? Dp.m2492constructorimpl(8) : f2;
        float m2492constructorimpl3 = (i2 & 4) != 0 ? Dp.m2492constructorimpl(0) : f3;
        float m2492constructorimpl4 = (i2 & 8) != 0 ? Dp.m2492constructorimpl(4) : f4;
        float m2492constructorimpl5 = (i2 & 16) != 0 ? Dp.m2492constructorimpl(4) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] objArr = {Dp.m2490boximpl(m2492constructorimpl), Dp.m2490boximpl(m2492constructorimpl2), Dp.m2490boximpl(m2492constructorimpl3), Dp.m2490boximpl(m2492constructorimpl4), Dp.m2490boximpl(m2492constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(m2492constructorimpl, m2492constructorimpl2, m2492constructorimpl3, m2492constructorimpl4, m2492constructorimpl5, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    static {
        float m2492constructorimpl = Dp.m2492constructorimpl(16);
        ButtonHorizontalPadding = m2492constructorimpl;
        float f = 8;
        float m2492constructorimpl2 = Dp.m2492constructorimpl(f);
        ButtonVerticalPadding = m2492constructorimpl2;
        PaddingValues m272PaddingValuesa9UjIt4 = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl, m2492constructorimpl2, m2492constructorimpl, m2492constructorimpl2);
        ContentPadding = m272PaddingValuesa9UjIt4;
        MinWidth = Dp.m2492constructorimpl(64);
        MinHeight = Dp.m2492constructorimpl(36);
        IconSize = Dp.m2492constructorimpl(18);
        IconSpacing = Dp.m2492constructorimpl(f);
        OutlinedBorderSize = Dp.m2492constructorimpl(1);
        float m2492constructorimpl3 = Dp.m2492constructorimpl(f);
        TextButtonHorizontalPadding = m2492constructorimpl3;
        TextButtonContentPadding = PaddingKt.m272PaddingValuesa9UjIt4(m2492constructorimpl3, m272PaddingValuesa9UjIt4.mo251calculateTopPaddingD9Ej5fM(), m2492constructorimpl3, m272PaddingValuesa9UjIt4.mo248calculateBottomPaddingD9Ej5fM());
    }
}
