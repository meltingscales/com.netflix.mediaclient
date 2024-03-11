package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$1$1<R> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super R>, Object[], InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> b;
    private /* synthetic */ Object c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super FlowKt__ZipKt$combine$1$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.b = interfaceC8612dsa;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: c */
    public final Object invoke(dyQ<? super R> dyq, Object[] objArr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.b, interfaceC8585dra);
        flowKt__ZipKt$combine$1$1.c = dyq;
        flowKt__ZipKt$combine$1$1.e = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.c;
            Object[] objArr = (Object[]) this.e;
            InterfaceC8612dsa<T1, T2, InterfaceC8585dra<? super R>, Object> interfaceC8612dsa = this.b;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.c = dyq;
            this.a = 1;
            obj = interfaceC8612dsa.invoke(obj2, obj3, this);
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
            dyq = (dyQ) this.c;
            C8556dpz.d(obj);
        }
        this.c = null;
        this.a = 2;
        if (dyq.emit(obj, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
