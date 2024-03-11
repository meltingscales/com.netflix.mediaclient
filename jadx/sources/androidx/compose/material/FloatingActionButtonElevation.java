package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public interface FloatingActionButtonElevation {
    State<Dp> elevation(InteractionSource interactionSource, Composer composer, int i);
}
