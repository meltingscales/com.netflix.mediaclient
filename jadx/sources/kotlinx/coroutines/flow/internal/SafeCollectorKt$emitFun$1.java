package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* loaded from: classes5.dex */
public final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC8612dsa<dyQ<? super Object>, Object, InterfaceC8585dra<? super dpR>, Object> {
    public static final SafeCollectorKt$emitFun$1 c = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, dyQ.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: a */
    public final Object invoke(dyQ<Object> dyq, Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return dyq.emit(obj, interfaceC8585dra);
    }
}
