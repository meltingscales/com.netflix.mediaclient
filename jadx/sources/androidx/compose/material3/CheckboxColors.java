package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    private CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledUncheckedBorderColor = j11;
        this.disabledIndeterminateBorderColor = j12;
    }

    public final State<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i) {
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:476)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State<Color> m46animateColorAsStateeuL9pac = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(toggleableState == toggleableState2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m46animateColorAsStateeuL9pac;
    }

    public final State<Color> boxColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:495)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBoxColor;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.uncheckedBoxColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.disabledUncheckedBoxColor;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1143723294);
            rememberUpdatedState = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143723480);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> borderColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:526)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBorderColor;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.uncheckedBorderColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledBorderColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBorderColor;
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.disabledUncheckedBorderColor;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1209374481);
            rememberUpdatedState = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209374667);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
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
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.m1294equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m1294equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m1294equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m1294equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m1294equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m1294equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m1294equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m1294equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m1294equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m1294equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m1294equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m1294equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.checkedCheckmarkColor);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.uncheckedCheckmarkColor);
        int m1300hashCodeimpl3 = Color.m1300hashCodeimpl(this.checkedBoxColor);
        int m1300hashCodeimpl4 = Color.m1300hashCodeimpl(this.uncheckedBoxColor);
        int m1300hashCodeimpl5 = Color.m1300hashCodeimpl(this.disabledCheckedBoxColor);
        int m1300hashCodeimpl6 = Color.m1300hashCodeimpl(this.disabledUncheckedBoxColor);
        int m1300hashCodeimpl7 = Color.m1300hashCodeimpl(this.disabledIndeterminateBoxColor);
        int m1300hashCodeimpl8 = Color.m1300hashCodeimpl(this.checkedBorderColor);
        int m1300hashCodeimpl9 = Color.m1300hashCodeimpl(this.uncheckedBorderColor);
        int m1300hashCodeimpl10 = Color.m1300hashCodeimpl(this.disabledBorderColor);
        return (((((((((((((((((((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + m1300hashCodeimpl3) * 31) + m1300hashCodeimpl4) * 31) + m1300hashCodeimpl5) * 31) + m1300hashCodeimpl6) * 31) + m1300hashCodeimpl7) * 31) + m1300hashCodeimpl8) * 31) + m1300hashCodeimpl9) * 31) + m1300hashCodeimpl10) * 31) + Color.m1300hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m1300hashCodeimpl(this.disabledIndeterminateBorderColor);
    }

    /* renamed from: copy-2qZNXz8  reason: not valid java name */
    public final CheckboxColors m734copy2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        Color.Companion companion = Color.Companion;
        return new CheckboxColors(j != companion.m1309getUnspecified0d7_KjU() ? j : this.checkedCheckmarkColor, j2 != companion.m1309getUnspecified0d7_KjU() ? j2 : this.uncheckedCheckmarkColor, j3 != companion.m1309getUnspecified0d7_KjU() ? j3 : this.checkedBoxColor, j4 != companion.m1309getUnspecified0d7_KjU() ? j4 : this.uncheckedBoxColor, j5 != companion.m1309getUnspecified0d7_KjU() ? j5 : this.disabledCheckedBoxColor, j6 != companion.m1309getUnspecified0d7_KjU() ? j6 : this.disabledUncheckedBoxColor, j7 != companion.m1309getUnspecified0d7_KjU() ? j7 : this.disabledIndeterminateBoxColor, j8 != companion.m1309getUnspecified0d7_KjU() ? j8 : this.checkedBorderColor, j9 != companion.m1309getUnspecified0d7_KjU() ? j9 : this.uncheckedBorderColor, j10 != companion.m1309getUnspecified0d7_KjU() ? j10 : this.disabledBorderColor, j11 != companion.m1309getUnspecified0d7_KjU() ? j11 : this.disabledUncheckedBorderColor, j12 != companion.m1309getUnspecified0d7_KjU() ? j12 : this.disabledIndeterminateBorderColor, null);
    }
}
