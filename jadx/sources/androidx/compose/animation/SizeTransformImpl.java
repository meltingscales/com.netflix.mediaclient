package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import o.drX;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final drX<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeTransformImpl(boolean z, drX<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> drx) {
        this.clip = z;
        this.sizeAnimationSpec = drx;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo52createAnimationSpecTemP2vQ(long j, long j2) {
        return this.sizeAnimationSpec.invoke(IntSize.m2542boximpl(j), IntSize.m2542boximpl(j2));
    }
}
