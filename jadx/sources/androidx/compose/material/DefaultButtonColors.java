package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes.dex */
final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    public /* synthetic */ DefaultButtonColors(long j, long j2, long j3, long j4, C8627dsp c8627dsp) {
        this(j, j2, j3, j4);
    }

    private DefaultButtonColors(long j, long j2, long j3, long j4) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.disabledBackgroundColor = j3;
        this.disabledContentColor = j4;
    }

    @Override // androidx.compose.material.ButtonColors
    public State<Color> backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:585)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    public State<Color> contentColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:590)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.contentColor : this.disabledContentColor), composer, 0);
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
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.m1294equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m1294equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m1294equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m1294equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.backgroundColor);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.contentColor);
        return (((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + Color.m1300hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m1300hashCodeimpl(this.disabledContentColor);
    }
}
