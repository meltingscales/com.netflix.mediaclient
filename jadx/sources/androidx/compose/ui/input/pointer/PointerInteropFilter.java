package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    private boolean disallowIntercept;
    public drM<? super MotionEvent, Boolean> onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.disallowIntercept = z;
    }

    public final void setOnTouchEvent(drM<? super MotionEvent, Boolean> drm) {
        this.onTouchEvent = drm;
    }

    public final drM<MotionEvent, Boolean> getOnTouchEvent() {
        drM drm = this.onTouchEvent;
        if (drm != null) {
            return drm;
        }
        C8632dsu.d("");
        return null;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent == null) {
            return;
        }
        requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
    }
}
