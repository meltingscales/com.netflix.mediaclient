package androidx.compose.runtime;

import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drX;
import o.dwU;
import o.dwY;
import o.dxD;
import o.dxK;

/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    private dxD job;
    private final dwU scope;
    private final drX<dwU, InterfaceC8585dra<? super dpR>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(dqZ dqz, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        this.task = drx;
        this.scope = dwY.c(dqz);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        dxD c;
        dxD dxd = this.job;
        if (dxd != null) {
            dxK.e(dxd, "Old job was still running!", null, 2, null);
        }
        c = C8737dwr.c(this.scope, null, null, this.task, 3, null);
        this.job = c;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dxD dxd = this.job;
        if (dxd != null) {
            dxd.e(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dxD dxd = this.job;
        if (dxd != null) {
            dxd.e(new LeftCompositionCancellationException());
        }
        this.job = null;
    }
}
