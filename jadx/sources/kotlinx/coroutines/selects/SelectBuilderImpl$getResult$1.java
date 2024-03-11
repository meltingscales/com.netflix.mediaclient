package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7692dBv;
import o.C8556dpz;
import o.C8586drb;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dBI;
import o.dBJ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class SelectBuilderImpl$getResult$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C7692dBv<R> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBuilderImpl$getResult$1(C7692dBv<R> c7692dBv, InterfaceC8585dra<? super SelectBuilderImpl$getResult$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c7692dBv;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SelectBuilderImpl$getResult$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SelectBuilderImpl$getResult$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C8741dwv c8741dwv;
        C8741dwv c8741dwv2;
        e = C8586drb.e();
        int i = this.a;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dBJ dbj = this.d;
                this.a = 1;
                obj = dbj.b((InterfaceC8585dra) this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            c8741dwv2 = ((C7692dBv) this.d).d;
            dBI.c(c8741dwv2, obj);
            return dpR.c;
        } catch (Throwable th) {
            c8741dwv = ((C7692dBv) this.d).d;
            dBI.c((InterfaceC8743dwx<?>) c8741dwv, th);
            return dpR.c;
        }
    }
}
