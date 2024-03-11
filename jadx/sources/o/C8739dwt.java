package o;

import java.util.concurrent.Future;

/* renamed from: o.dwt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8739dwt extends AbstractC8744dwy {
    private final Future<?> b;

    public C8739dwt(Future<?> future) {
        this.b = future;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    @Override // o.AbstractC8742dww
    public void e(Throwable th) {
        if (th != null) {
            this.b.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.b + ']';
    }
}
