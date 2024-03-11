package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class ContentTransform {
    private final ExitTransition initialContentExit;
    private SizeTransform sizeTransform;
    private final EnterTransition targetContentEnter;
    private final MutableFloatState targetContentZIndex$delegate;

    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final void setSizeTransform$animation_release(SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.sizeTransform = sizeTransform;
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform, int i, C8627dsp c8627dsp) {
        this(enterTransition, exitTransition, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex$delegate.getFloatValue();
    }
}
