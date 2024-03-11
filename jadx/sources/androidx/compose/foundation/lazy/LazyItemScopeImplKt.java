package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public final class LazyItemScopeImplKt {
    public static final Modifier animateItem(Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        return (finiteAnimationSpec == null && finiteAnimationSpec2 == null) ? modifier : modifier.then(new AnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2));
    }
}
