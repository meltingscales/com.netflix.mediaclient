package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dxH extends dxL {
    private final drM<Throwable, dpR> e;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxH(drM<? super Throwable, dpR> drm) {
        this.e = drm;
    }

    @Override // o.dwM
    public void e(Throwable th) {
        this.e.invoke(th);
    }
}
