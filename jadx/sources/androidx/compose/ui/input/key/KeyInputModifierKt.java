package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import o.drM;

/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, drM<? super KeyEvent, Boolean> drm) {
        return modifier.then(new KeyInputElement(drm, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, drM<? super KeyEvent, Boolean> drm) {
        return modifier.then(new KeyInputElement(null, drm));
    }
}
