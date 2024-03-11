package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes5.dex */
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q  reason: not valid java name */
    public static final State<BorderStroke> m686animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State<Dp> rememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:892)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        State<Color> indicatorColor = textFieldColors.indicatorColor(z, z2, interactionSource, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        float f3 = animateBorderStrokeAsState_NuRrP5Q$lambda$0(collectIsFocusedAsState) ? f : f2;
        if (z) {
            composer.startReplaceableGroup(1685713622);
            rememberUpdatedState = AnimateAsStateKt.m53animateDpAsStateAjpBEmI(f3, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685713720);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m2490boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(rememberUpdatedState.getValue().m2498unboximpl(), new SolidColor(indicatorColor.getValue().m1302unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
