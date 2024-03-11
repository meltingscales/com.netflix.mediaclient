package o;

import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dxT extends dxL {
    private final InterfaceC8585dra<dpR> c;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxT(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        this.c = interfaceC8585dra;
    }

    @Override // o.dwM
    public void e(Throwable th) {
        InterfaceC8585dra<dpR> interfaceC8585dra = this.c;
        Result.c cVar = Result.e;
        interfaceC8585dra.resumeWith(Result.e(dpR.c));
    }
}
