package androidx.compose.foundation;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class OverscrollKt {
    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
