package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8899fS;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8888fH;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX WARN: Incorrect field signature: TS; */
/* loaded from: classes2.dex */
public final class MavericksViewModel$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ AbstractC8899fS<S> d;
    final /* synthetic */ InterfaceC8888fH e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lo/fS<TS;>;TS;Lo/dra<-Lcom/airbnb/mvrx/MavericksViewModel$1;>;)V */
    public MavericksViewModel$1(AbstractC8899fS abstractC8899fS, InterfaceC8888fH interfaceC8888fH, InterfaceC8585dra interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = abstractC8899fS;
        this.e = interfaceC8888fH;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MavericksViewModel$1(this.d, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksViewModel$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            this.d.b((AbstractC8899fS) this.e);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
