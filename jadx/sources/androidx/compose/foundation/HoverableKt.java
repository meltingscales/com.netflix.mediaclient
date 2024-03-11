package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class HoverableKt {
    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, mutableInteractionSource, z);
    }

    public static final Modifier hoverable(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z) {
        return modifier.then(z ? new HoverableElement(mutableInteractionSource) : Modifier.Companion);
    }
}
