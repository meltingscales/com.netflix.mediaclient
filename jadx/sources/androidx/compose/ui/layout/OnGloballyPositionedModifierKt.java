package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    public static final Modifier onGloballyPositioned(Modifier modifier, drM<? super LayoutCoordinates, dpR> drm) {
        return modifier.then(new OnGloballyPositionedElement(drm));
    }
}
