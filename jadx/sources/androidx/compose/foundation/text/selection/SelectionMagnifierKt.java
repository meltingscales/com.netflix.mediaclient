package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new drM<Offset, AnimationVector2D>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m526invokek4lQ0M(offset.m1146unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final AnimationVector2D m526invokek4lQ0M(long j) {
            AnimationVector2D animationVector2D;
            if (OffsetKt.m1151isSpecifiedk4lQ0M(j)) {
                return new AnimationVector2D(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
            }
            animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
            return animationVector2D;
        }
    }, new drM<AnimationVector2D, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // o.drM
        public /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m1126boximpl(m527invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m527invoketuRUvjQ(AnimationVector2D animationVector2D) {
            return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    static {
        long Offset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m1126boximpl(Offset), 3, null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, drO<Offset> dro, drM<? super drO<Offset>, ? extends Modifier> drm) {
        return ComposedModifierKt.composed$default(modifier, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(dro, drm), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Offset> rememberAnimatedMagnifierPosition(drO<Offset> dro, Composer composer, int i) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(dro);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Animatable(Offset.m1126boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), getUnspecifiedSafeOffsetVectorConverter(), Offset.m1126boximpl(getOffsetDisplacementThreshold()), null, 8, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue2;
        EffectsKt.LaunchedEffect(dpR.c, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(state, animatable, null), composer, 70);
        State<Offset> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m1146unboximpl();
    }
}
