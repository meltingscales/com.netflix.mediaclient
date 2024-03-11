package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class BringIntoViewResponder_androidKt {
    public static final BringIntoViewParent defaultBringIntoViewParent(final CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new BringIntoViewParent() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1
            @Override // androidx.compose.foundation.relocation.BringIntoViewParent
            public final Object bringChildIntoView(LayoutCoordinates layoutCoordinates, drO<Rect> dro, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                android.graphics.Rect rect;
                View view = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(CompositionLocalConsumerModifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
                long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
                Rect invoke = dro.invoke();
                Rect m1160translatek4lQ0M = invoke != null ? invoke.m1160translatek4lQ0M(positionInRoot) : null;
                if (m1160translatek4lQ0M != null) {
                    rect = BringIntoViewResponder_androidKt.toRect(m1160translatek4lQ0M);
                    view.requestRectangleOnScreen(rect, false);
                }
                return dpR.c;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect toRect(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
