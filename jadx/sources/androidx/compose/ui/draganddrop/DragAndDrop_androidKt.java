package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.OffsetKt;

/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        return OffsetKt.Offset(dragAndDropEvent.getDragEvent$ui_release().getX(), dragAndDropEvent.getDragEvent$ui_release().getY());
    }
}
