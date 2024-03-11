package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public final class AnimationResult<T, V extends AnimationVector> {
    private final AnimationEndReason endReason;
    private final AnimationState<T, V> endState;

    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    public AnimationResult(AnimationState<T, V> animationState, AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
