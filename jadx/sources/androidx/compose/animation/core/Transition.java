package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class Transition<S> {
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final MutableLongState playTimeNanos$delegate;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public Transition(TransitionState<S> transitionState, String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.transitionState = transitionState;
        this.label = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.targetState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.segment$delegate = mutableStateOf$default2;
        this.playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.updateChildrenNeeded$delegate = mutableStateOf$default3;
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isSeeking$delegate = mutableStateOf$default4;
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new drO<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Long invoke() {
                SnapshotStateList snapshotStateList;
                SnapshotStateList snapshotStateList2;
                snapshotStateList = ((Transition) this.this$0)._animations;
                int size = snapshotStateList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    j = Math.max(j, ((Transition.TransitionAnimationState) snapshotStateList.get(i)).getDurationNanos$animation_core_release());
                }
                snapshotStateList2 = ((Transition) this.this$0)._transitions;
                int size2 = snapshotStateList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    j = Math.max(j, ((Transition) snapshotStateList2.get(i2)).getTotalDurationNanos());
                }
                return Long.valueOf(j);
            }
        });
        transitionState.transitionConfigured$animation_core_release(this);
    }

    public Transition(S s, String str) {
        this(new MutableTransitionState(s), str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        this((TransitionState) mutableTransitionState, str);
        C8632dsu.d(mutableTransitionState);
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final boolean isRunning() {
        return getStartTimeNanos() != Long.MIN_VALUE;
    }

    public final void onFrame$animation_core_release(long j, float f) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j - getStartTimeNanos());
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition<?> transition = snapshotStateList2.get(i2);
            if (!C8632dsu.c(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!C8632dsu.c(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long j) {
        setStartTimeNanos(j);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void seek(S s, S s2, long j) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !C8632dsu.c(getCurrentState(), s) || !C8632dsu.c(getTargetState(), s2)) {
            if (!C8632dsu.c(getCurrentState(), s)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(s);
                }
            }
            setTargetState$animation_core_release(s2);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s, s2));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition<?> transition = snapshotStateList.get(i);
            C8632dsu.d(transition);
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).seekTo$animation_core_release(j);
        }
        this.lastSeekedTimeNanos = j;
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final void updateTarget$animation_core_release(final S s, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(s) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i2, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!isSeeking() && !C8632dsu.c(getTargetState(), s)) {
                setSegment(new SegmentImpl(getTargetState(), s));
                if (!C8632dsu.c(getCurrentState(), getTargetState())) {
                    TransitionState<S> transitionState = this.transitionState;
                    if (!(transitionState instanceof MutableTransitionState)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState".toString());
                    }
                    ((MutableTransitionState) transitionState).setCurrentState$animation_core_release(getTargetState());
                }
                setTargetState$animation_core_release(s);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
                int size = snapshotStateList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    snapshotStateList.get(i3).resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$3
                final /* synthetic */ Transition<S> $tmp0_rcvr;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp0_rcvr = this;
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    this.$tmp0_rcvr.updateTarget$animation_core_release(s, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void animateTo$animation_core_release(final S s, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s, startRestartGroup, (i2 & 14) | (i2 & 112));
                if (!C8632dsu.c(s, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    startRestartGroup.startReplaceableGroup(-561029496);
                    boolean changed = startRestartGroup.changed(this);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new Transition$animateTo$1$1(this, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (drX) rememberedValue, startRestartGroup, ((i2 >> 3) & 14) | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
                final /* synthetic */ Transition<S> $tmp0_rcvr;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp0_rcvr = this;
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    this.$tmp0_rcvr.animateTo$animation_core_release(s, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations;
        String str = "Transition animation values: ";
        for (int i = 0; i < getAnimations().size(); i++) {
            str = str + animations.get(i) + ", ";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
                j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private final String label;
        private final MutableState needsReset$delegate;
        private final MutableLongState offsetTimeNanos$delegate;
        private final MutableState targetValue$delegate;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(T t, V v, TwoWayConverter<T, V> twoWayConverter, String str) {
            MutableState mutableStateOf$default;
            MutableState mutableStateOf$default2;
            MutableState mutableStateOf$default3;
            MutableState mutableStateOf$default4;
            MutableState mutableStateOf$default5;
            MutableState mutableStateOf$default6;
            T t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.targetValue$delegate = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animationSpec$delegate = mutableStateOf$default2;
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, getTargetValue(), v), null, 2, null);
            this.animation$delegate = mutableStateOf$default3;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.isFinished$delegate = mutableStateOf$default4;
            this.offsetTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.needsReset$delegate = mutableStateOf$default5;
            mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.value$delegate = mutableStateOf$default6;
            this.velocityVector = v;
            Float f = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = twoWayConverter.getConvertToVector().invoke(t);
                int size$animation_core_release = invoke.getSize$animation_core_release();
                for (int i = 0; i < size$animation_core_release; i++) {
                    invoke.set$animation_core_release(i, floatValue);
                }
                t2 = this.typeConverter.getConvertFromVector().invoke(invoke);
            } else {
                t2 = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, t2, 3, null);
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final void onPlayTimeChanged$animation_core_release(long j, float f) {
            long durationNanos;
            if (f > 0.0f) {
                float offsetTimeNanos = ((float) (j - getOffsetTimeNanos())) / f;
                if (!(!Float.isNaN(offsetTimeNanos))) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + j + ", offsetTimeNanos: " + getOffsetTimeNanos()).toString());
                }
                durationNanos = offsetTimeNanos;
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void seekTo$animation_core_release(long j) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        private final void updateAnimation(T t, boolean z) {
            FiniteAnimationSpec<T> animationSpec;
            if (z) {
                animationSpec = getAnimationSpec() instanceof SpringSpec ? getAnimationSpec() : this.interruptionSpec;
            } else {
                animationSpec = getAnimationSpec();
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, getTargetValue(), this.velocityVector));
            Transition.this.onChildAnimationUpdated();
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateTargetValue$animation_core_release(T t, FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (!C8632dsu.c(getTargetValue(), t) || getNeedsReset()) {
                setTargetValue(t);
                setAnimationSpec(finiteAnimationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(Transition.this.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t2);
            setAnimationSpec(finiteAnimationSpec);
            if (C8632dsu.c(getAnimation().getInitialValue(), t) && C8632dsu.c(getAnimation().getTargetValue(), t2)) {
                return;
            }
            updateAnimation$default(this, t, false, 2, null);
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setTargetValue(T t) {
            this.targetValue$delegate.setValue(t);
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z));
        }

        private final long getOffsetTimeNanos() {
            return this.offsetTimeNanos$delegate.getLongValue();
        }

        private final void setOffsetTimeNanos(long j) {
            this.offsetTimeNanos$delegate.setLongValue(j);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset$delegate.getValue()).booleanValue();
        }

        private final void setNeedsReset(boolean z) {
            this.needsReset$delegate.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (C8632dsu.c(getInitialState(), segment.getInitialState()) && C8632dsu.c(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int hashCode = initialState != null ? initialState.hashCode() : 0;
            S targetState = getTargetState();
            return (hashCode * 31) + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* loaded from: classes.dex */
    public interface Segment<S> {
        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s, S s2) {
            return C8632dsu.c(s, getInitialState()) && C8632dsu.c(s2, getTargetState());
        }
    }

    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate;
        private final String label;
        private final TwoWayConverter<T, V> typeConverter;

        public DeferredAnimation(TwoWayConverter<T, V> twoWayConverter, String str) {
            MutableState mutableStateOf$default;
            this.typeConverter = twoWayConverter;
            this.label = str;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.data$delegate = mutableStateOf$default;
        }

        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private drM<? super S, ? extends T> targetValueByState;
            private drM<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final drM<S, T> getTargetValueByState() {
                return (drM<? super S, ? extends T>) this.targetValueByState;
            }

            public final drM<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return (drM<? super Segment<S>, ? extends FiniteAnimationSpec<T>>) this.transitionSpec;
            }

            public final void setTargetValueByState(drM<? super S, ? extends T> drm) {
                this.targetValueByState = drm;
            }

            public final void setTransitionSpec(drM<? super Segment<S>, ? extends FiniteAnimationSpec<T>> drm) {
                this.transitionSpec = drm;
            }

            public DeferredAnimationData(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, drM<? super Segment<S>, ? extends FiniteAnimationSpec<T>> drm, drM<? super S, ? extends T> drm2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = drm;
                this.targetValueByState = drm2;
            }

            public final void updateAnimationStates(Segment<S> segment) {
                T invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (Transition.this.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, this.transitionSpec.invoke(segment));
                    return;
                }
                this.animation.updateTargetValue$animation_core_release(invoke, this.transitionSpec.invoke(segment));
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }
        }

        public final State<T> animate(drM<? super Segment<S>, ? extends FiniteAnimationSpec<T>> drm, drM<? super S, ? extends T> drm2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = Transition.this;
                Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData = new DeferredAnimationData<>(new TransitionAnimationState(drm2.invoke((S) transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, drm2.invoke((S) Transition.this.getCurrentState())), this.typeConverter, this.label), drm, drm2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core_release(deferredAnimationData);
                transition2.addAnimation$animation_core_release(deferredAnimationData.getAnimation());
                data$animation_core_release = deferredAnimationData;
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core_release.setTargetValueByState(drm2);
            data$animation_core_release.setTransitionSpec(drm);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final void setTargetState$animation_core_release(S s) {
        this.targetState$delegate.setValue(s);
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    public final long getPlayTimeNanos() {
        return this.playTimeNanos$delegate.getLongValue();
    }

    public final void setPlayTimeNanos(long j) {
        this.playTimeNanos$delegate.setLongValue(j);
    }

    private final long getStartTimeNanos() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    private final void setStartTimeNanos(long j) {
        this.startTimeNanos$delegate.setLongValue(j);
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z));
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }
}
