package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dzJ;

/* loaded from: classes5.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {
    public int a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    final /* synthetic */ dzJ.d<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(dzJ.d<? super T> dVar, InterfaceC8585dra<? super ChannelFlowMerge$collectTo$2$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
