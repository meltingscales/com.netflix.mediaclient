package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public interface LayoutCoordinates {
    LayoutCoordinates getParentLayoutCoordinates();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo1809getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A  reason: not valid java name */
    long mo1810localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j);

    /* renamed from: localToRoot-MK-Hz9U  reason: not valid java name */
    long mo1811localToRootMKHz9U(long j);

    /* renamed from: localToWindow-MK-Hz9U  reason: not valid java name */
    long mo1812localToWindowMKHz9U(long j);

    /* renamed from: windowToLocal-MK-Hz9U  reason: not valid java name */
    long mo1814windowToLocalMKHz9U(long j);

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    /* renamed from: transformFrom-EL8BTi8  reason: not valid java name */
    default void mo1813transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }
}
