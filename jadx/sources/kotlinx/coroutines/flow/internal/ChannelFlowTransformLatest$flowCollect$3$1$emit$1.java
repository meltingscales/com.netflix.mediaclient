package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {
    Object a;
    Object b;
    int c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.AnonymousClass4<T> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.AnonymousClass4<? super T> anonymousClass4, InterfaceC8585dra<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.j = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
