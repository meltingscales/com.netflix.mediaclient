package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import o.InterfaceC8612dsa;

/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, InterfaceC8612dsa<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> interfaceC8612dsa) {
        return modifier.then(new LayoutElement(interfaceC8612dsa));
    }
}
