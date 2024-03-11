package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes.dex */
final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    private DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.disabledThumbColor = j2;
        this.activeTrackColor = j3;
        this.inactiveTrackColor = j4;
        this.disabledActiveTrackColor = j5;
        this.disabledInactiveTrackColor = j6;
        this.activeTickColor = j7;
        this.inactiveTickColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTickColor = j10;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> thumbColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1090)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.thumbColor : this.disabledThumbColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> trackColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1095)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? z2 ? this.activeTrackColor : this.inactiveTrackColor : z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> tickColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1106)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? z2 ? this.activeTickColor : this.inactiveTickColor : z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.m1294equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m1294equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m1294equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m1294equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m1294equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m1294equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m1294equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m1294equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m1294equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m1294equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.thumbColor);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.disabledThumbColor);
        int m1300hashCodeimpl3 = Color.m1300hashCodeimpl(this.activeTrackColor);
        int m1300hashCodeimpl4 = Color.m1300hashCodeimpl(this.inactiveTrackColor);
        int m1300hashCodeimpl5 = Color.m1300hashCodeimpl(this.disabledActiveTrackColor);
        int m1300hashCodeimpl6 = Color.m1300hashCodeimpl(this.disabledInactiveTrackColor);
        int m1300hashCodeimpl7 = Color.m1300hashCodeimpl(this.activeTickColor);
        int m1300hashCodeimpl8 = Color.m1300hashCodeimpl(this.inactiveTickColor);
        return (((((((((((((((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + m1300hashCodeimpl3) * 31) + m1300hashCodeimpl4) * 31) + m1300hashCodeimpl5) * 31) + m1300hashCodeimpl6) * 31) + m1300hashCodeimpl7) * 31) + m1300hashCodeimpl8) * 31) + Color.m1300hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m1300hashCodeimpl(this.disabledInactiveTickColor);
    }
}
