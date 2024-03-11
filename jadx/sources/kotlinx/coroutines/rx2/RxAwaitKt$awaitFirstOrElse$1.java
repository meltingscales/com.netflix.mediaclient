package kotlinx.coroutines.rx2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dAU;

/* loaded from: classes5.dex */
public final class RxAwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {
    public int a;
    public Object c;
    public /* synthetic */ Object d;

    public RxAwaitKt$awaitFirstOrElse$1(InterfaceC8585dra<? super RxAwaitKt$awaitFirstOrElse$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return dAU.d(null, null, this);
    }
}
