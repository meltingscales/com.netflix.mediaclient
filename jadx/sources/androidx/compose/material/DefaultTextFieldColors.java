package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes5.dex */
final class DefaultTextFieldColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    private DefaultTextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.textColor = j;
        this.disabledTextColor = j2;
        this.cursorColor = j3;
        this.errorCursorColor = j4;
        this.focusedIndicatorColor = j5;
        this.unfocusedIndicatorColor = j6;
        this.errorIndicatorColor = j7;
        this.disabledIndicatorColor = j8;
        this.leadingIconColor = j9;
        this.disabledLeadingIconColor = j10;
        this.errorLeadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledTrailingIconColor = j13;
        this.errorTrailingIconColor = j14;
        this.backgroundColor = j15;
        this.focusedLabelColor = j16;
        this.unfocusedLabelColor = j17;
        this.disabledLabelColor = j18;
        this.errorLabelColor = j19;
        this.placeholderColor = j20;
        this.disabledPlaceholderColor = j21;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:717)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(!z ? this.disabledLeadingIconColor : z2 ? this.errorLeadingIconColor : this.leadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-1519634405);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519634405, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:732)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(!z ? this.disabledLeadingIconColor : z2 ? this.errorLeadingIconColor : this.leadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> trailingIconColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(!z ? this.disabledTrailingIconColor : z2 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(1383318157);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1383318157, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:759)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(!z ? this.disabledTrailingIconColor : z2 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:774)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledIndicatorColor;
        } else if (z2) {
            j = this.errorIndicatorColor;
        } else {
            j = indicatorColor$lambda$0(collectIsFocusedAsState) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2054188841);
            rememberUpdatedState = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054188736);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:791)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> placeholderColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:796)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:805)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLabelColor;
        } else if (z2) {
            j = this.errorLabelColor;
        } else {
            j = labelColor$lambda$1(collectIsFocusedAsState) ? this.focusedLabelColor : this.unfocusedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> textColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:818)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> cursorColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:823)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.errorCursorColor : this.cursorColor), composer, 0);
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
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        return Color.m1294equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m1294equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m1294equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m1294equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m1294equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m1294equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m1294equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m1294equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m1294equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m1294equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m1294equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m1294equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m1294equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m1294equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m1294equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m1294equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m1294equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m1294equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m1294equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m1294equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m1294equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.textColor);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.disabledTextColor);
        int m1300hashCodeimpl3 = Color.m1300hashCodeimpl(this.cursorColor);
        int m1300hashCodeimpl4 = Color.m1300hashCodeimpl(this.errorCursorColor);
        int m1300hashCodeimpl5 = Color.m1300hashCodeimpl(this.focusedIndicatorColor);
        int m1300hashCodeimpl6 = Color.m1300hashCodeimpl(this.unfocusedIndicatorColor);
        int m1300hashCodeimpl7 = Color.m1300hashCodeimpl(this.errorIndicatorColor);
        int m1300hashCodeimpl8 = Color.m1300hashCodeimpl(this.disabledIndicatorColor);
        int m1300hashCodeimpl9 = Color.m1300hashCodeimpl(this.leadingIconColor);
        int m1300hashCodeimpl10 = Color.m1300hashCodeimpl(this.disabledLeadingIconColor);
        int m1300hashCodeimpl11 = Color.m1300hashCodeimpl(this.errorLeadingIconColor);
        int m1300hashCodeimpl12 = Color.m1300hashCodeimpl(this.trailingIconColor);
        int m1300hashCodeimpl13 = Color.m1300hashCodeimpl(this.disabledTrailingIconColor);
        int m1300hashCodeimpl14 = Color.m1300hashCodeimpl(this.errorTrailingIconColor);
        int m1300hashCodeimpl15 = Color.m1300hashCodeimpl(this.backgroundColor);
        int m1300hashCodeimpl16 = Color.m1300hashCodeimpl(this.focusedLabelColor);
        int m1300hashCodeimpl17 = Color.m1300hashCodeimpl(this.unfocusedLabelColor);
        int m1300hashCodeimpl18 = Color.m1300hashCodeimpl(this.disabledLabelColor);
        int m1300hashCodeimpl19 = Color.m1300hashCodeimpl(this.errorLabelColor);
        return (((((((((((((((((((((((((((((((((((((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + m1300hashCodeimpl3) * 31) + m1300hashCodeimpl4) * 31) + m1300hashCodeimpl5) * 31) + m1300hashCodeimpl6) * 31) + m1300hashCodeimpl7) * 31) + m1300hashCodeimpl8) * 31) + m1300hashCodeimpl9) * 31) + m1300hashCodeimpl10) * 31) + m1300hashCodeimpl11) * 31) + m1300hashCodeimpl12) * 31) + m1300hashCodeimpl13) * 31) + m1300hashCodeimpl14) * 31) + m1300hashCodeimpl15) * 31) + m1300hashCodeimpl16) * 31) + m1300hashCodeimpl17) * 31) + m1300hashCodeimpl18) * 31) + m1300hashCodeimpl19) * 31) + Color.m1300hashCodeimpl(this.placeholderColor)) * 31) + Color.m1300hashCodeimpl(this.disabledPlaceholderColor);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
