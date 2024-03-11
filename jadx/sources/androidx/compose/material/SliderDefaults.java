package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m637colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        composer.startReplaceableGroup(436017687);
        long m565getPrimary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU() : j;
        if ((i3 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j11 = ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(materialTheme.getColors(composer, 6).m564getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m569getSurface0d7_KjU());
        } else {
            j11 = j2;
        }
        long m565getPrimary0d7_KjU2 = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m565getPrimary0d7_KjU() : j3;
        long m1292copywmQWz5c$default = (i3 & 8) != 0 ? Color.m1292copywmQWz5c$default(m565getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m1292copywmQWz5c$default2 = (i3 & 16) != 0 ? Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m1292copywmQWz5c$default3 = (i3 & 32) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m1292copywmQWz5c$default4 = (i3 & 64) != 0 ? Color.m1292copywmQWz5c$default(ColorsKt.m571contentColorForek8zF_U(m565getPrimary0d7_KjU2, composer, (i >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1292copywmQWz5c$default5 = (i3 & 128) != 0 ? Color.m1292copywmQWz5c$default(m565getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1292copywmQWz5c$default6 = (i3 & JSONzip.end) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m1292copywmQWz5c$default7 = (i3 & 512) != 0 ? Color.m1292copywmQWz5c$default(m1292copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, i, i2, "androidx.compose.material.SliderDefaults.colors (Slider.kt:498)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(m565getPrimary0d7_KjU, j11, m565getPrimary0d7_KjU2, m1292copywmQWz5c$default, m1292copywmQWz5c$default2, m1292copywmQWz5c$default3, m1292copywmQWz5c$default4, m1292copywmQWz5c$default5, m1292copywmQWz5c$default6, m1292copywmQWz5c$default7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
