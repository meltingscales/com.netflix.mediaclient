package o;

/* loaded from: classes5.dex */
final class dxB extends AbstractC8744dwy {
    private final drM<Throwable, dpR> d;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxB(drM<? super Throwable, dpR> drm) {
        this.d = drm;
    }

    @Override // o.AbstractC8742dww
    public void e(Throwable th) {
        this.d.invoke(th);
    }

    public String toString() {
        return "InvokeOnCancel[" + dwW.c(this.d) + '@' + dwW.a(this) + ']';
    }
}
