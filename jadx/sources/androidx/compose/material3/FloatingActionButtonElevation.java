package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.drX;

/* loaded from: classes.dex */
public class FloatingActionButtonElevation {
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    /* renamed from: tonalElevation-D9Ej5fM$material3_release  reason: not valid java name */
    public final float m787tonalElevationD9Ej5fM$material3_release() {
        return this.defaultElevation;
    }

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }

    public final State<Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-424810125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:488)");
        }
        State<Dp> animateElevation = animateElevation(interactionSource, composer, (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private final State<Dp> animateElevation(InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-1845106002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:497)");
        }
        composer.startReplaceableGroup(1849274698);
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(rememberedValue);
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1849275046);
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable);
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(this)) || (i & 48) == 32;
        Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z3) || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(this, (drX) rememberedValue2, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1849275366);
        if ((i3 <= 4 || !composer.changed(interactionSource)) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable);
        Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance2 | z) || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (drX) rememberedValue3, composer, i2);
        State<Dp> asState = floatingActionButtonElevationAnimatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (Dp.m2494equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && Dp.m2494equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && Dp.m2494equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return Dp.m2494equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
        }
        return false;
    }

    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.defaultElevation);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.pressedElevation);
        return (((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + Dp.m2495hashCodeimpl(this.focusedElevation)) * 31) + Dp.m2495hashCodeimpl(this.hoveredElevation);
    }
}
