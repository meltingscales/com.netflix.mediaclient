package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import o.InterfaceC8585dra;
import o.drX;

/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {
    Object awaitPointerEvent(PointerEventPass pointerEventPass, InterfaceC8585dra<? super PointerEvent> interfaceC8585dra);

    PointerEvent getCurrentEvent();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo1684getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j, drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return withTimeout$suspendImpl(this, j, drx, interfaceC8585dra);
    }

    default <T> Object withTimeoutOrNull(long j, drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return withTimeoutOrNull$suspendImpl(this, j, drx, interfaceC8585dra);
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    default long mo1683getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m1182getZeroNHjbRc();
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC8585dra);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return drx.invoke(awaitPointerEventScope, interfaceC8585dra);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return drx.invoke(awaitPointerEventScope, interfaceC8585dra);
    }
}
