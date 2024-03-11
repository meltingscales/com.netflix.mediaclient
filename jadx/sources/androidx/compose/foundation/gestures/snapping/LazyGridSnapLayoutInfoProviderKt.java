package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static final int offsetOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntOffset.m2534getYimpl(lazyGridItemInfo.mo349getOffsetnOccac());
        }
        return IntOffset.m2533getXimpl(lazyGridItemInfo.mo349getOffsetnOccac());
    }
}
