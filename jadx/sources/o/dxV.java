package o;

import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dxV<T> extends dxL {
    private final C8741dwv<T> e;

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxV(C8741dwv<? super T> c8741dwv) {
        this.e = c8741dwv;
    }

    @Override // o.dwM
    public void e(Throwable th) {
        Object cy_ = b().cy_();
        if (cy_ instanceof dwO) {
            C8741dwv<T> c8741dwv = this.e;
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(C8556dpz.a(((dwO) cy_).a)));
            return;
        }
        C8741dwv<T> c8741dwv2 = this.e;
        Result.c cVar2 = Result.e;
        c8741dwv2.resumeWith(Result.e(dxJ.d(cy_)));
    }
}
