package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, drM<? super FocusState, dpR> drm) {
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), drm), z, mutableInteractionSource);
    }
}
