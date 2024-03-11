package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8804dzd;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public int c;

    public FlowKt__EmittersKt$invokeSafely$1(InterfaceC8585dra<? super FlowKt__EmittersKt$invokeSafely$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return C8804dzd.d(null, null, null, this);
    }
}
