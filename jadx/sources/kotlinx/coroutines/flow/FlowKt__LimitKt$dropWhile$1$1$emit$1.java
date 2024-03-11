package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8802dzb;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public Object c;
    final /* synthetic */ C8802dzb.b<T> d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(C8802dzb.b<? super T> bVar, InterfaceC8585dra<? super FlowKt__LimitKt$dropWhile$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
