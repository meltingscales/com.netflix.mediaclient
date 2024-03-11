package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$mapLatest$1<R, T> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super R>, T, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ drX<T, InterfaceC8585dra<? super R>, Object> d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(drX<? super T, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super FlowKt__MergeKt$mapLatest$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.d = drx;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: e */
    public final Object invoke(dyQ<? super R> dyq, T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.d, interfaceC8585dra);
        flowKt__MergeKt$mapLatest$1.e = dyq;
        flowKt__MergeKt$mapLatest$1.c = t;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ dyq2 = (dyQ) this.e;
            Object obj2 = this.c;
            this.e = dyq2;
            this.b = 1;
            obj = this.d.invoke(obj2, this);
            dyq = dyq2;
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            dyq = (dyQ) this.e;
        }
        this.e = null;
        this.b = 2;
        if (dyq.emit(obj, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
