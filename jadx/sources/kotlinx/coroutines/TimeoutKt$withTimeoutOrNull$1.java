package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8779dyf;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public Object a;
    public long b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;

    public TimeoutKt$withTimeoutOrNull$1(InterfaceC8585dra<? super TimeoutKt$withTimeoutOrNull$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.d |= Integer.MIN_VALUE;
        return C8779dyf.c(0L, null, this);
    }
}
