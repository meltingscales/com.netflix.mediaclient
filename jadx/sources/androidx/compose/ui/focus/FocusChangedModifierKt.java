package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, drM<? super FocusState, dpR> drm) {
        return modifier.then(new FocusChangedElement(drm));
    }
}
