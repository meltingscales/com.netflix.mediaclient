package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyY;

/* loaded from: classes5.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public boolean a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public /* synthetic */ Object j;

    public FlowKt__ChannelsKt$emitAllImpl$1(InterfaceC8585dra<? super FlowKt__ChannelsKt$emitAllImpl$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.j = obj;
        this.c |= Integer.MIN_VALUE;
        c = dyY.c(null, null, false, this);
        return c;
    }
}
