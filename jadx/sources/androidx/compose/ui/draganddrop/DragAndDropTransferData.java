package androidx.compose.ui.draganddrop;

import android.content.ClipData;

/* loaded from: classes.dex */
public final class DragAndDropTransferData {
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }
}
