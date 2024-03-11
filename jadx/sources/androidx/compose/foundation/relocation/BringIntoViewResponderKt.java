package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public final class BringIntoViewResponderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m1160translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m1158getTopLeftF1C5BW0());
    }
}
