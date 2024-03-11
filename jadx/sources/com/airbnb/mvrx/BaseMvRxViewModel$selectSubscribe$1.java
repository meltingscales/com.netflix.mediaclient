package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [A] */
/* loaded from: classes2.dex */
public final class BaseMvRxViewModel$selectSubscribe$1<A> extends SuspendLambda implements drX<A, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ drM<A, dpR> c;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseMvRxViewModel$selectSubscribe$1(drM<? super A, dpR> drm, InterfaceC8585dra<? super BaseMvRxViewModel$selectSubscribe$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        BaseMvRxViewModel$selectSubscribe$1 baseMvRxViewModel$selectSubscribe$1 = new BaseMvRxViewModel$selectSubscribe$1(this.c, interfaceC8585dra);
        baseMvRxViewModel$selectSubscribe$1.d = obj;
        return baseMvRxViewModel$selectSubscribe$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(A a, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BaseMvRxViewModel$selectSubscribe$1) create(a, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            this.c.invoke(this.d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
