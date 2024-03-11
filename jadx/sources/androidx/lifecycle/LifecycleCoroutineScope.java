package androidx.lifecycle;

import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* loaded from: classes2.dex */
public abstract class LifecycleCoroutineScope implements dwU {
    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final dxD launchWhenStarted(drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        dxD c;
        C8632dsu.c((Object) drx, "");
        c = C8737dwr.c(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, drx, null), 3, null);
        return c;
    }

    public final dxD launchWhenResumed(drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        dxD c;
        C8632dsu.c((Object) drx, "");
        c = C8737dwr.c(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, drx, null), 3, null);
        return c;
    }
}
