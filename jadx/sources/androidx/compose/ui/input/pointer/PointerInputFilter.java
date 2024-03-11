package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public abstract class PointerInputFilter {
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public abstract void mo1741onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
