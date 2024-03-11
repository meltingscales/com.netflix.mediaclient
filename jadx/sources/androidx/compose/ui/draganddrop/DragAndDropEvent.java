package androidx.compose.ui.draganddrop;

import android.view.DragEvent;

/* loaded from: classes.dex */
public final class DragAndDropEvent {
    private final DragEvent dragEvent;

    public final DragEvent getDragEvent$ui_release() {
        return this.dragEvent;
    }

    public DragAndDropEvent(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }
}
