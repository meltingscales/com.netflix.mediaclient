package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {
    void populateFocusOrder(FocusOrder focusOrder);
}
