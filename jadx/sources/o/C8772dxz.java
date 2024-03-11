package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.dxz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8772dxz extends dxE {
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C8772dxz.class, "_invoked");
    private volatile int _invoked;
    private final drM<Throwable, dpR> c;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8772dxz(drM<? super Throwable, dpR> drm) {
        this.c = drm;
    }

    @Override // o.dwM
    public void e(Throwable th) {
        if (d.compareAndSet(this, 0, 1)) {
            this.c.invoke(th);
        }
    }
}
