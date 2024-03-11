package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;

/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimatorKt {
    private static final LazyLayoutAnimation[] EmptyArray = new LazyLayoutAnimation[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutAnimationSpecsNode getSpecs(Object obj) {
        if (obj instanceof LazyLayoutAnimationSpecsNode) {
            return (LazyLayoutAnimationSpecsNode) obj;
        }
        return null;
    }
}
