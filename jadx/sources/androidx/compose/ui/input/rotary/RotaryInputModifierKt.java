package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import o.drM;

/* loaded from: classes.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onRotaryScrollEvent(Modifier modifier, drM<? super RotaryScrollEvent, Boolean> drm) {
        return modifier.then(new RotaryInputElement(drm, null));
    }
}
