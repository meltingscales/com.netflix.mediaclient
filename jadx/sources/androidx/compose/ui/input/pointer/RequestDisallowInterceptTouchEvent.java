package androidx.compose.ui.input.pointer;

import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class RequestDisallowInterceptTouchEvent implements drM<Boolean, dpR> {
    private PointerInteropFilter pointerInteropFilter;

    public final void setPointerInteropFilter$ui_release(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dpR.c;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.setDisallowIntercept$ui_release(z);
    }
}
