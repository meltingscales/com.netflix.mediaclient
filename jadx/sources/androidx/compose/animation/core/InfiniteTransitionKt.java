package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import o.C8626dso;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1013651573);
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return infiniteTransition;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(final InfiniteTransition infiniteTransition, final T t, final T t2, TwoWayConverter<T, V> twoWayConverter, final InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1062847727);
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition.TransitionAnimationState(t, t2, twoWayConverter, infiniteRepeatableSpec, str2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) rememberedValue;
        EffectsKt.SideEffect(new drO<dpR>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (C8632dsu.c(t, transitionAnimationState.getInitialValue$animation_core_release()) && C8632dsu.c(t2, transitionAnimationState.getTargetValue$animation_core_release())) {
                    return;
                }
                transitionAnimationState.updateValues$animation_core_release(t, t2, infiniteRepeatableSpec);
            }
        }, composer, 0);
        EffectsKt.DisposableEffect(transitionAnimationState, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                InfiniteTransition.this.addAnimation$animation_core_release(transitionAnimationState);
                final InfiniteTransition infiniteTransition2 = InfiniteTransition.this;
                final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        InfiniteTransition.this.removeAnimation$animation_core_release(transitionAnimationState2);
                    }
                };
            }
        }, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-644770905);
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i3 = i << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.getVectorConverter(C8626dso.e), infiniteRepeatableSpec, str2, composer, (i & 896) | (i & 112) | 8 | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }
}
