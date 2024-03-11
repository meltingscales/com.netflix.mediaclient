package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8632dsu;
import o.dxD;

/* loaded from: classes2.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final dxD dxd) {
        C8632dsu.c((Object) lifecycle, "");
        C8632dsu.c((Object) state, "");
        C8632dsu.c((Object) dispatchQueue, "");
        C8632dsu.c((Object) dxd, "");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(LifecycleController.this, dxd, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
            return;
        }
        dxD.b.b(dxd, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, dxD dxd, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleController, "");
        C8632dsu.c((Object) dxd, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
                lifecycleController.dispatchQueue.pause();
                return;
            } else {
                lifecycleController.dispatchQueue.resume();
                return;
            }
        }
        dxD.b.b(dxd, null, 1, null);
        lifecycleController.finish();
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
