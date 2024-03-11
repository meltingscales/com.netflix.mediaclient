package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.dpR;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* loaded from: classes2.dex */
public final class BaseMvRxViewModel$selectSubscribe$7<A, B, C> extends SuspendLambda implements InterfaceC8613dsb<A, B, C, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ InterfaceC8612dsa<A, B, C, dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseMvRxViewModel$selectSubscribe$7(InterfaceC8612dsa<? super A, ? super B, ? super C, dpR> interfaceC8612dsa, InterfaceC8585dra<? super BaseMvRxViewModel$selectSubscribe$7> interfaceC8585dra) {
        super(4, interfaceC8585dra);
        this.e = interfaceC8612dsa;
    }

    @Override // o.InterfaceC8613dsb
    /* renamed from: e */
    public final Object invoke(A a, B b, C c, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        BaseMvRxViewModel$selectSubscribe$7 baseMvRxViewModel$selectSubscribe$7 = new BaseMvRxViewModel$selectSubscribe$7(this.e, interfaceC8585dra);
        baseMvRxViewModel$selectSubscribe$7.a = a;
        baseMvRxViewModel$selectSubscribe$7.b = b;
        baseMvRxViewModel$selectSubscribe$7.d = c;
        return baseMvRxViewModel$selectSubscribe$7.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.e.invoke(this.a, this.b, this.d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
