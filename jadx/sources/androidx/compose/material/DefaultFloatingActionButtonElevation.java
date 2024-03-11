package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;

/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    private DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    public State<Dp> elevation(InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-478475335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-478475335, i, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:269)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) rememberedValue;
        EffectsKt.LaunchedEffect(this, new DefaultFloatingActionButtonElevation$elevation$1(floatingActionButtonElevationAnimatable, this, null), composer, ((i >> 3) & 14) | 64);
        EffectsKt.LaunchedEffect(interactionSource, new DefaultFloatingActionButtonElevation$elevation$2(interactionSource, floatingActionButtonElevationAnimatable, null), composer, (i & 14) | 64);
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
        if (obj instanceof DefaultFloatingActionButtonElevation) {
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
            if (Dp.m2494equalsimpl0(this.defaultElevation, defaultFloatingActionButtonElevation.defaultElevation) && Dp.m2494equalsimpl0(this.pressedElevation, defaultFloatingActionButtonElevation.pressedElevation) && Dp.m2494equalsimpl0(this.hoveredElevation, defaultFloatingActionButtonElevation.hoveredElevation)) {
                return Dp.m2494equalsimpl0(this.focusedElevation, defaultFloatingActionButtonElevation.focusedElevation);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.defaultElevation);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.pressedElevation);
        return (((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + Dp.m2495hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m2495hashCodeimpl(this.focusedElevation);
    }
}
