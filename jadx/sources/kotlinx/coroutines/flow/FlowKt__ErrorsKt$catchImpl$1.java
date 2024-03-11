package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC8585dra<? super FlowKt__ErrorsKt$catchImpl$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return dyR.d((dyS) null, (dyQ) null, this);
    }
}
