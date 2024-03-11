package o;

import java.util.concurrent.Future;

/* renamed from: o.dxm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8759dxm implements InterfaceC8760dxn {
    private final Future<?> c;

    public C8759dxm(Future<?> future) {
        this.c = future;
    }

    @Override // o.InterfaceC8760dxn
    public void co_() {
        this.c.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.c + ']';
    }
}
