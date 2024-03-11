package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8806dzf;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public Object b;
    final /* synthetic */ C8806dzf.e.AnonymousClass2 c;
    public int d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(C8806dzf.e.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
