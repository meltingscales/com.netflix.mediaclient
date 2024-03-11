package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import o.dsT;

/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i) {
        return i * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        int e;
        int e2;
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        e = dsT.e(Offset.m1137getXimpl(positionInRoot));
        e2 = dsT.e(Offset.m1138getYimpl(positionInRoot));
        view.layout(e, e2, view.getMeasuredWidth() + e, view.getMeasuredHeight() + e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i) {
        if (i == 0) {
            return NestedScrollSource.Companion.m1680getDragWNlRxjI();
        }
        return NestedScrollSource.Companion.m1681getFlingWNlRxjI();
    }
}
