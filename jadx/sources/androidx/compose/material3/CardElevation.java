package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import o.C8576dqs;
import o.C8627dsp;
import o.drX;

/* loaded from: classes.dex */
public final class CardElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: tonalElevation-u2uoSUM$material3_release  reason: not valid java name */
    public final float m733tonalElevationu2uoSUM$material3_release(boolean z) {
        return z ? this.defaultElevation : this.disabledElevation;
    }

    private CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }

    public final State<Dp> shadowElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-1763481333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:651)");
        }
        composer.startReplaceableGroup(-1409178619);
        if (interactionSource == null) {
            composer.startReplaceableGroup(-1409178567);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m2490boximpl(this.defaultElevation), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return mutableState;
        }
        composer.endReplaceableGroup();
        State<Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & 112) | (i & 14) | (i & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private final State<Dp> animateElevation(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        Object D;
        float f;
        composer.startReplaceableGroup(-1421890746);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421890746, i, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:662)");
        }
        composer.startReplaceableGroup(-748208142);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-748208053);
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i & 48) == 32;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new CardElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (drX) rememberedValue2, composer, (i >> 3) & 14);
        D = C8576dqs.D((List<? extends Object>) snapshotStateList);
        Interaction interaction = (Interaction) D;
        if (!z) {
            f = this.disabledElevation;
        } else if (interaction instanceof PressInteraction.Press) {
            f = this.pressedElevation;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f = this.hoveredElevation;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f = this.focusedElevation;
        } else {
            f = interaction instanceof DragInteraction.Start ? this.draggedElevation : this.defaultElevation;
        }
        float f2 = f;
        composer.startReplaceableGroup(-748206009);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(Dp.m2490boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        Animatable animatable = (Animatable) rememberedValue3;
        composer.endReplaceableGroup();
        Dp m2490boximpl = Dp.m2490boximpl(f2);
        composer.startReplaceableGroup(-748205925);
        boolean changedInstance = composer.changedInstance(animatable);
        boolean changed = composer.changed(f2);
        boolean z4 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean changedInstance2 = composer.changedInstance(interaction);
        Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance | changed | z4 | z2 | changedInstance2) || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new CardElevation$animateElevation$2$1(animatable, f2, z, this, interaction, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m2490boximpl, (drX) rememberedValue4, composer, 0);
        State<Dp> asState = animatable.asState();
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
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        return Dp.m2494equalsimpl0(this.defaultElevation, cardElevation.defaultElevation) && Dp.m2494equalsimpl0(this.pressedElevation, cardElevation.pressedElevation) && Dp.m2494equalsimpl0(this.focusedElevation, cardElevation.focusedElevation) && Dp.m2494equalsimpl0(this.hoveredElevation, cardElevation.hoveredElevation) && Dp.m2494equalsimpl0(this.disabledElevation, cardElevation.disabledElevation);
    }

    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.defaultElevation);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.pressedElevation);
        int m2495hashCodeimpl3 = Dp.m2495hashCodeimpl(this.focusedElevation);
        return (((((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + m2495hashCodeimpl3) * 31) + Dp.m2495hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m2495hashCodeimpl(this.disabledElevation);
    }
}
