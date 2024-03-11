package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;

/* loaded from: classes.dex */
public final class LazyListItemAnimatorKt {
    private static final LazyLayoutAnimation[] EmptyArray = new LazyLayoutAnimation[0];

    public static final /* synthetic */ LazyLayoutAnimation[] access$getEmptyArray$p() {
        return EmptyArray;
    }

    public static final /* synthetic */ LazyLayoutAnimationSpecsNode access$getSpecs(Object obj) {
        return getSpecs(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutAnimationSpecsNode getSpecs(Object obj) {
        if (obj instanceof LazyLayoutAnimationSpecsNode) {
            return (LazyLayoutAnimationSpecsNode) obj;
        }
        return null;
    }
}
