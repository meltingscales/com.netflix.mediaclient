package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    /* renamed from: toMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m1744toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, drM<? super MotionEvent, dpR> drm) {
        m1745toMotionEventScopeubNVwUQ(pointerEvent, j, drm, false);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m1743toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, drM<? super MotionEvent, dpR> drm) {
        m1745toMotionEventScopeubNVwUQ(pointerEvent, j, drm, true);
    }

    public static final void emptyCancelMotionEventScope(long j, drM<? super MotionEvent, dpR> drm) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        drm.invoke(obtain);
        obtain.recycle();
    }

    /* renamed from: toMotionEventScope-ubNVwUQ  reason: not valid java name */
    private static final void m1745toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, drM<? super MotionEvent, dpR> drm, boolean z) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent$ui_release.getAction();
        if (z) {
            motionEvent$ui_release.setAction(3);
        }
        motionEvent$ui_release.offsetLocation(-Offset.m1137getXimpl(j), -Offset.m1138getYimpl(j));
        drm.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
        motionEvent$ui_release.setAction(action);
    }
}
