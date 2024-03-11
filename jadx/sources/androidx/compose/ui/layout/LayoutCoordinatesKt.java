package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo1811localToRootMKHz9U(Offset.Companion.m1149getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo1812localToWindowMKHz9U(Offset.Companion.m1149getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        float a;
        float a2;
        float a3;
        float a4;
        float minOf;
        float minOf2;
        float maxOf;
        float maxOf2;
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m2547getWidthimpl = IntSize.m2547getWidthimpl(findRootCoordinates.mo1809getSizeYbymL2g());
        float m2546getHeightimpl = IntSize.m2546getHeightimpl(findRootCoordinates.mo1809getSizeYbymL2g());
        a = C8657dts.a(boundsInRoot.getLeft(), 0.0f, m2547getWidthimpl);
        a2 = C8657dts.a(boundsInRoot.getTop(), 0.0f, m2546getHeightimpl);
        a3 = C8657dts.a(boundsInRoot.getRight(), 0.0f, m2547getWidthimpl);
        a4 = C8657dts.a(boundsInRoot.getBottom(), 0.0f, m2546getHeightimpl);
        if (a == a3 || a2 == a4) {
            return Rect.Companion.getZero();
        }
        long mo1812localToWindowMKHz9U = findRootCoordinates.mo1812localToWindowMKHz9U(OffsetKt.Offset(a, a2));
        long mo1812localToWindowMKHz9U2 = findRootCoordinates.mo1812localToWindowMKHz9U(OffsetKt.Offset(a3, a2));
        long mo1812localToWindowMKHz9U3 = findRootCoordinates.mo1812localToWindowMKHz9U(OffsetKt.Offset(a3, a4));
        long mo1812localToWindowMKHz9U4 = findRootCoordinates.mo1812localToWindowMKHz9U(OffsetKt.Offset(a, a4));
        minOf = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m1137getXimpl(mo1812localToWindowMKHz9U), Offset.m1137getXimpl(mo1812localToWindowMKHz9U2), Offset.m1137getXimpl(mo1812localToWindowMKHz9U4), Offset.m1137getXimpl(mo1812localToWindowMKHz9U3));
        minOf2 = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m1138getYimpl(mo1812localToWindowMKHz9U), Offset.m1138getYimpl(mo1812localToWindowMKHz9U2), Offset.m1138getYimpl(mo1812localToWindowMKHz9U4), Offset.m1138getYimpl(mo1812localToWindowMKHz9U3));
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m1137getXimpl(mo1812localToWindowMKHz9U), Offset.m1137getXimpl(mo1812localToWindowMKHz9U2), Offset.m1137getXimpl(mo1812localToWindowMKHz9U4), Offset.m1137getXimpl(mo1812localToWindowMKHz9U3));
        maxOf2 = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m1138getYimpl(mo1812localToWindowMKHz9U), Offset.m1138getYimpl(mo1812localToWindowMKHz9U2), Offset.m1138getYimpl(mo1812localToWindowMKHz9U4), Offset.m1138getYimpl(mo1812localToWindowMKHz9U3));
        return new Rect(minOf, minOf2, maxOf, maxOf2);
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m2547getWidthimpl(layoutCoordinates.mo1809getSizeYbymL2g()), IntSize.m2546getHeightimpl(layoutCoordinates.mo1809getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (parentLayoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            parentLayoutCoordinates = parentLayoutCoordinates.getParentLayoutCoordinates();
            layoutCoordinates = layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates;
        }
        for (NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release(); wrappedBy$ui_release != null; wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release()) {
            nodeCoordinator = wrappedBy$ui_release;
        }
        return nodeCoordinator;
    }
}
