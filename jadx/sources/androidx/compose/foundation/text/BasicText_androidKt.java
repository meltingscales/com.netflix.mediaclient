package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;

/* loaded from: classes.dex */
public final class BasicText_androidKt {
    public static final Modifier textPointerHoverIcon(Modifier modifier, SelectionRegistrar selectionRegistrar) {
        return selectionRegistrar == null ? modifier : PointerIconKt.pointerHoverIcon$default(modifier, TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }
}
