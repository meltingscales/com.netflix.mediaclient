package kotlinx.coroutines.rx2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7674dBd;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class RxObservableCoroutine$send$1 extends ContinuationImpl {
    final /* synthetic */ C7674dBd<T> a;
    public Object b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$send$1(C7674dBd<T> c7674dBd, InterfaceC8585dra<? super RxObservableCoroutine$send$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c7674dBd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.a(null, this);
    }
}
