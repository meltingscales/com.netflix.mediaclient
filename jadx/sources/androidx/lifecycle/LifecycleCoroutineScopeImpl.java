package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8632dsu;
import o.C8737dwr;
import o.C8752dxf;
import o.dqZ;
import o.dxK;

/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final dqZ coroutineContext;
    private final Lifecycle lifecycle;

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, dqZ dqz) {
        C8632dsu.c((Object) lifecycle, "");
        C8632dsu.c((Object) dqz, "");
        this.lifecycle = lifecycle;
        this.coroutineContext = dqz;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            dxK.b(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        C8737dwr.c(this, C8752dxf.d().c(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            dxK.b(getCoroutineContext(), null, 1, null);
        }
    }
}
