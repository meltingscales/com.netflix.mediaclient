package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends ContinuationImpl {
    /* synthetic */ Object c;
    final /* synthetic */ FlowKt__DelayKt$debounceInternal$1$values$1.AnonymousClass3<T> d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(FlowKt__DelayKt$debounceInternal$1$values$1.AnonymousClass3<? super T> anonymousClass3, InterfaceC8585dra<? super FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
