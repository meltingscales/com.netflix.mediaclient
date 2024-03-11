package o;

import kotlin.Result;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1;

/* renamed from: o.dBv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7692dBv<R> extends dBJ<R> {
    private final C8741dwv<R> d;

    public C7692dBv(InterfaceC8585dra<? super R> interfaceC8585dra) {
        super(interfaceC8585dra.getContext());
        InterfaceC8585dra b;
        b = C8590drf.b(interfaceC8585dra);
        this.d = new C8741dwv<>(b, 1);
    }

    public final Object e() {
        if (this.d.e()) {
            return this.d.b();
        }
        C8737dwr.c(dwY.c(d()), null, CoroutineStart.UNDISPATCHED, new SelectBuilderImpl$getResult$1(this, null), 1, null);
        return this.d.b();
    }

    public final void c(Throwable th) {
        C8741dwv<R> c8741dwv = this.d;
        Result.c cVar = Result.e;
        c8741dwv.resumeWith(Result.e(C8556dpz.a(th)));
    }
}
