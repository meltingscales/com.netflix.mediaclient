package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntOffset;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class LazyLayoutAnimationKt {
    private static final SpringSpec<IntOffset> InterruptionSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final drM<GraphicsLayerScope, dpR> DefaultLayerBlock = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt$DefaultLayerBlock$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return dpR.c;
        }
    };

    public static final drM<GraphicsLayerScope, dpR> getDefaultLayerBlock() {
        return DefaultLayerBlock;
    }
}
