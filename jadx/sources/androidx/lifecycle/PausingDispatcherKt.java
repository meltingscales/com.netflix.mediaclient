package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8738dws;
import o.C8752dxf;
import o.InterfaceC8585dra;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return whenStarted(lifecycleOwner.getLifecycle(), drx, interfaceC8585dra);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, drx, interfaceC8585dra);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, drx, interfaceC8585dra);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return C8738dws.c(C8752dxf.d().c(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, drx, null), interfaceC8585dra);
    }
}
