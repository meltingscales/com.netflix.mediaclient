package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.drO;
import org.chromium.net.ConnectionSubtype;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class ColorSchemeKt {
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new drO<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final ColorScheme invoke() {
            return ColorSchemeKt.m780lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new drO<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m780lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m863getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m863getPrimary0d7_KjU() : j;
        return m779lightColorSchemeCXl9yA(m863getPrimary0d7_KjU, (i & 2) != 0 ? ColorLightTokens.INSTANCE.m853getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? ColorLightTokens.INSTANCE.m864getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? ColorLightTokens.INSTANCE.m854getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? ColorLightTokens.INSTANCE.m848getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? ColorLightTokens.INSTANCE.m866getSecondary0d7_KjU() : j6, (i & 64) != 0 ? ColorLightTokens.INSTANCE.m855getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? ColorLightTokens.INSTANCE.m867getSecondaryContainer0d7_KjU() : j8, (i & JSONzip.end) != 0 ? ColorLightTokens.INSTANCE.m856getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? ColorLightTokens.INSTANCE.m877getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m859getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m878getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m860getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m844getBackground0d7_KjU() : j14, (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m850getOnBackground0d7_KjU() : j15, (i & Privacy.DEFAULT) != 0 ? ColorLightTokens.INSTANCE.m868getSurface0d7_KjU() : j16, (i & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? ColorLightTokens.INSTANCE.m857getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m876getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m858getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m863getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m849getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m847getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m845getError0d7_KjU() : j23, (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m851getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m846getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m852getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m861getOutline0d7_KjU() : j27, (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m862getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m865getScrim0d7_KjU() : j29, (i & 536870912) != 0 ? ColorLightTokens.INSTANCE.m869getSurfaceBright0d7_KjU() : j30, (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m870getSurfaceContainer0d7_KjU() : j31, (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m871getSurfaceContainerHigh0d7_KjU() : j32, (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m872getSurfaceContainerHighest0d7_KjU() : j33, (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m873getSurfaceContainerLow0d7_KjU() : j34, (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m874getSurfaceContainerLowest0d7_KjU() : j35, (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m875getSurfaceDim0d7_KjU() : j36);
    }

    /* renamed from: lightColorScheme-C-Xl9yA  reason: not valid java name */
    public static final ColorScheme m779lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m777contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        if (Color.m1294equalsimpl0(j, colorScheme.m759getPrimary0d7_KjU())) {
            return colorScheme.m749getOnPrimary0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m762getSecondary0d7_KjU())) {
            return colorScheme.m751getOnSecondary0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m774getTertiary0d7_KjU())) {
            return colorScheme.m755getOnTertiary0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m740getBackground0d7_KjU())) {
            return colorScheme.m746getOnBackground0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m741getError0d7_KjU())) {
            return colorScheme.m747getOnError0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m760getPrimaryContainer0d7_KjU())) {
            return colorScheme.m750getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m763getSecondaryContainer0d7_KjU())) {
            return colorScheme.m752getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m775getTertiaryContainer0d7_KjU())) {
            return colorScheme.m756getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m742getErrorContainer0d7_KjU())) {
            return colorScheme.m748getOnErrorContainer0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m745getInverseSurface0d7_KjU())) {
            return colorScheme.m743getInverseOnSurface0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m764getSurface0d7_KjU())) {
            return colorScheme.m753getOnSurface0d7_KjU();
        }
        if (Color.m1294equalsimpl0(j, colorScheme.m773getSurfaceVariant0d7_KjU())) {
            return colorScheme.m754getOnSurfaceVariant0d7_KjU();
        }
        if (!Color.m1294equalsimpl0(j, colorScheme.m765getSurfaceBright0d7_KjU()) && !Color.m1294equalsimpl0(j, colorScheme.m766getSurfaceContainer0d7_KjU()) && !Color.m1294equalsimpl0(j, colorScheme.m767getSurfaceContainerHigh0d7_KjU()) && !Color.m1294equalsimpl0(j, colorScheme.m768getSurfaceContainerHighest0d7_KjU()) && !Color.m1294equalsimpl0(j, colorScheme.m769getSurfaceContainerLow0d7_KjU()) && !Color.m1294equalsimpl0(j, colorScheme.m770getSurfaceContainerLowest0d7_KjU())) {
            return Color.Companion.m1309getUnspecified0d7_KjU();
        }
        return colorScheme.m753getOnSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m778contentColorForek8zF_U(long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:823)");
        }
        long m777contentColorFor4WTKRHQ = m777contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m777contentColorFor4WTKRHQ == Color.Companion.m1309getUnspecified0d7_KjU()) {
            m777contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m777contentColorFor4WTKRHQ;
    }

    /* renamed from: applyTonalElevation-RFCenO8  reason: not valid java name */
    public static final long m776applyTonalElevationRFCenO8(ColorScheme colorScheme, long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:841)");
        }
        boolean booleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m1294equalsimpl0(j, colorScheme.m764getSurface0d7_KjU()) && booleanValue) {
            j = m781surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m740getBackground0d7_KjU();
            case 2:
                return colorScheme.m741getError0d7_KjU();
            case 3:
                return colorScheme.m742getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m743getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m744getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m745getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m746getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m747getOnError0d7_KjU();
            case 9:
                return colorScheme.m748getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m749getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m750getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m751getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m752getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m753getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m754getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m772getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m755getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m756getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m757getOutline0d7_KjU();
            case 20:
                return colorScheme.m758getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m759getPrimary0d7_KjU();
            case 22:
                return colorScheme.m760getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m761getScrim0d7_KjU();
            case 24:
                return colorScheme.m762getSecondary0d7_KjU();
            case 25:
                return colorScheme.m763getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m764getSurface0d7_KjU();
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                return colorScheme.m773getSurfaceVariant0d7_KjU();
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                return colorScheme.m765getSurfaceBright0d7_KjU();
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                return colorScheme.m766getSurfaceContainer0d7_KjU();
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                return colorScheme.m767getSurfaceContainerHigh0d7_KjU();
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                return colorScheme.m768getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m769getSurfaceContainerLow0d7_KjU();
            case 33:
                return colorScheme.m770getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m771getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m774getTertiary0d7_KjU();
            case 36:
                return colorScheme.m775getTertiaryContainer0d7_KjU();
            default:
                return Color.Companion.m1309getUnspecified0d7_KjU();
        }
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:945)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs  reason: not valid java name */
    public static final long m781surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        if (Dp.m2494equalsimpl0(f, Dp.m2492constructorimpl(0))) {
            return colorScheme.m764getSurface0d7_KjU();
        }
        return ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(colorScheme.m772getSurfaceTint0d7_KjU(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m764getSurface0d7_KjU());
    }
}
