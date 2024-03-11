package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ dyQ<T> d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(dyQ<? super T> dyq, InterfaceC8585dra<? super UndispatchedContextCollector$emitRef$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dyq;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.d, interfaceC8585dra);
        undispatchedContextCollector$emitRef$1.a = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            Object obj2 = this.a;
            this.e = 1;
            if (this.d.emit(obj2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
