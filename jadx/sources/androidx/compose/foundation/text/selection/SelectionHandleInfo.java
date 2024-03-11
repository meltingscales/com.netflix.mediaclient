package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, C8627dsp c8627dsp) {
        this(handle, j, selectionHandleAnchor, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectionHandleInfo) {
            SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
            return this.handle == selectionHandleInfo.handle && Offset.m1134equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m1139hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m1144toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }

    private SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }
}
