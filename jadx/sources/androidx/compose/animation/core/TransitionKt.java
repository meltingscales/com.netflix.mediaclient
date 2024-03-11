package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import o.drM;

/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <T> Transition<T> updateTransition(T t, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Transition(t, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(t, composer, (i & 8) | 48 | (i & 14));
        composer.startReplaceableGroup(-561051652);
        boolean changed = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (drM) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1643203617);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transitionState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(-561041970);
        boolean changed2 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (drM) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, (i & 14) | (i & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberTransition;
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final Transition<S> transition2 = transition;
                final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.removeAnimation$animation_core_release(deferredAnimation2);
                    }
                };
            }
        }, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t, T t2, String str, Composer composer, int i) {
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            MutableTransitionState mutableTransitionState = new MutableTransitionState(t);
            Object transition2 = new Transition(mutableTransitionState, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(transition2);
            rememberedValue = transition2;
        }
        composer.endReplaceableGroup();
        final Transition<T> transition3 = (Transition) rememberedValue;
        composer.startReplaceableGroup(-561014285);
        boolean changed2 = composer.changed(transition);
        boolean changed3 = composer.changed(transition3);
        Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition3);
                    final Transition<S> transition4 = transition;
                    final Transition<T> transition5 = transition3;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.removeTransition$animation_core_release(transition5);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition3, (drM) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition3.seek(t, t2, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition3.updateTarget$animation_core_release(t2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition3.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition3;
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i) {
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.TransitionAnimationState(t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) rememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t, t2, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t2, finiteAnimationSpec);
        }
        composer.startReplaceableGroup(-561010487);
        boolean changed2 = composer.changed(transition);
        boolean changed3 = composer.changed(transitionAnimationState);
        Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.removeAnimation$animation_core_release(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (drM) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }
}
