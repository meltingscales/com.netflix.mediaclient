package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {
    void onFocusEvent(FocusState focusState);
}
