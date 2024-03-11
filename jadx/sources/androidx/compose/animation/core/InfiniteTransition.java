package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    private final MutableState isRunning$delegate;
    private final String label;
    private final MutableState refreshChildNeeded$delegate;
    private long startTimeNanos;

    public InfiniteTransition(String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.label = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.refreshChildNeeded$delegate = mutableStateOf$default;
        this.startTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }

        public TransitionAnimationState(T t, T t2, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, String str) {
            MutableState mutableStateOf$default;
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.value$delegate = mutableStateOf$default;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, twoWayConverter, this.initialValue, this.targetValue, null, 16, null);
        }

        public final void updateValues$animation_core_release(T t, T t2, AnimationSpec<T> animationSpec) {
            this.initialValue = t;
            this.targetValue = t2;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, t2, null, 16, null);
            InfiniteTransition.this.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        public final void onPlayTimeChanged$animation_core_release(long j) {
            InfiniteTransition.this.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j;
            }
            long j2 = j - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j2));
            this.isFinished = this.animation.isFinishedFromNanos(j2);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final void run$animation_core_release(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318043801, i, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(mutableState, this, null), startRestartGroup, 72);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i2) {
                    InfiniteTransition.this.run$animation_core_release(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    private final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j) {
        boolean z;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            z = true;
            int i = 0;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i];
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j);
                }
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }
}
