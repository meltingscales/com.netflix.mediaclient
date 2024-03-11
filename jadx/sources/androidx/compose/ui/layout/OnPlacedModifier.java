package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface OnPlacedModifier extends Modifier.Element {
    void onPlaced(LayoutCoordinates layoutCoordinates);
}
