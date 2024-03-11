package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes.dex */
public interface ButtonColors {
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    State<Color> contentColor(boolean z, Composer composer, int i);
}
