package o;

/* loaded from: classes5.dex */
public final class dwD extends dxE implements dwE {
    public final dwI e;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    public dwD(dwI dwi) {
        this.e = dwi;
    }

    @Override // o.dwE
    public dxD a() {
        return b();
    }

    @Override // o.dwM
    public void e(Throwable th) {
        this.e.e(b());
    }

    @Override // o.dwE
    public boolean b(Throwable th) {
        return b().h(th);
    }
}
