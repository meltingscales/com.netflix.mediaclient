package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dAH;
import o.dpR;
import o.drM;
import o.dyQ;
import o.dzT;

/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dyQ<T> a;
    final /* synthetic */ Ref.ObjectRef<Object> d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$1(dyQ<? super T> dyq, Ref.ObjectRef<Object> objectRef, InterfaceC8585dra<? super FlowKt__DelayKt$debounceInternal$1$3$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.a = dyq;
        this.d = objectRef;
    }

    @Override // o.drM
    /* renamed from: c */
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ<T> dyq = this.a;
            dAH dah = dzT.b;
            Object obj2 = this.d.d;
            if (obj2 == dah) {
                obj2 = null;
            }
            this.e = 1;
            if (dyq.emit(obj2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.d.d = null;
        return dpR.c;
    }
}
