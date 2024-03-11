package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;

/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return dpR.c;
        }
        Object b = dwY.b(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, drx, interfaceC8585dra);
        e = C8586drb.e();
        return repeatOnLifecycle == e ? repeatOnLifecycle : dpR.c;
    }
}
