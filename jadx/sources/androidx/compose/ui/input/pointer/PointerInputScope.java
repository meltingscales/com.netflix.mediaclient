package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import o.InterfaceC8585dra;
import o.drX;

/* loaded from: classes.dex */
public interface PointerInputScope extends Density {
    <R> Object awaitPointerEventScope(drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra);

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo1742getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();
}
