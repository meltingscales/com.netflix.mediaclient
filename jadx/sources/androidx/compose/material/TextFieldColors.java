package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes5.dex */
public interface TextFieldColors {
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    State<Color> cursorColor(boolean z, Composer composer, int i);

    State<Color> indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    State<Color> labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i);

    State<Color> placeholderColor(boolean z, Composer composer, int i);

    State<Color> textColor(boolean z, Composer composer, int i);

    State<Color> trailingIconColor(boolean z, boolean z2, Composer composer, int i);

    default State<Color> leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-1036335134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1036335134, i, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        State<Color> leadingIconColor = leadingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return leadingIconColor;
    }

    default State<Color> trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(454310320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454310320, i, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:161)");
        }
        State<Color> trailingIconColor = trailingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trailingIconColor;
    }
}
