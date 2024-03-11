package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA  reason: not valid java name */
    public static final boolean m1065containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j) {
        if (dragAndDropModifierNode.getNode().isAttached()) {
            LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
            if (coordinates.isAttached()) {
                long mo1809getSizeYbymL2g = coordinates.mo1809getSizeYbymL2g();
                int m2547getWidthimpl = IntSize.m2547getWidthimpl(mo1809getSizeYbymL2g);
                int m2546getHeightimpl = IntSize.m2546getHeightimpl(mo1809getSizeYbymL2g);
                long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                float m1127component1impl = Offset.m1127component1impl(positionInRoot);
                float m1128component2impl = Offset.m1128component2impl(positionInRoot);
                float f = m2547getWidthimpl;
                float f2 = m2546getHeightimpl;
                float m1137getXimpl = Offset.m1137getXimpl(j);
                if (m1127component1impl > m1137getXimpl || m1137getXimpl > f + m1127component1impl) {
                    return false;
                }
                float m1138getYimpl = Offset.m1138getYimpl(j);
                return m1128component2impl <= m1138getYimpl && m1138getYimpl <= f2 + m1128component2impl;
            }
            return false;
        }
        return false;
    }
}
