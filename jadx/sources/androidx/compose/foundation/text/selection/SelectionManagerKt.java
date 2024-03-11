package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;

/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m1161Rect0a9Yr6o(layoutCoordinates.mo1814windowToLocalMKHz9U(boundsInWindow.m1158getTopLeftF1C5BW0()), layoutCoordinates.mo1814windowToLocalMKHz9U(boundsInWindow.m1155getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA  reason: not valid java name */
    public static final boolean m531containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float m1137getXimpl = Offset.m1137getXimpl(j);
        if (left <= m1137getXimpl && m1137getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float m1138getYimpl = Offset.m1138getYimpl(j);
            if (top <= m1138getYimpl && m1138getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
