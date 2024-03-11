package androidx.lifecycle;

import o.C8632dsu;
import o.C8752dxf;
import o.dqZ;
import o.dwQ;

/* loaded from: classes2.dex */
public final class PausingDispatcher extends dwQ {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // o.dwQ
    public boolean isDispatchNeeded(dqZ dqz) {
        C8632dsu.c((Object) dqz, "");
        if (C8752dxf.d().c().isDispatchNeeded(dqz)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        C8632dsu.c((Object) dqz, "");
        C8632dsu.c((Object) runnable, "");
        this.dispatchQueue.dispatchAndEnqueue(dqz, runnable);
    }
}
