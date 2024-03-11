package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;

/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    private AnchoredDraggableDefaults() {
    }
}
