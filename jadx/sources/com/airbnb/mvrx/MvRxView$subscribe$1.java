package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [S] */
/* loaded from: classes2.dex */
public final class MvRxView$subscribe$1<S> extends SuspendLambda implements drX<S, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ drM<S, dpR> b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MvRxView$subscribe$1(drM<? super S, dpR> drm, InterfaceC8585dra<? super MvRxView$subscribe$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MvRxView$subscribe$1 mvRxView$subscribe$1 = new MvRxView$subscribe$1(this.b, interfaceC8585dra);
        mvRxView$subscribe$1.a = obj;
        return mvRxView$subscribe$1;
    }

    /* JADX WARN: Incorrect types in method signature: (TS;Lo/dra<-Lo/dpR;>;)Ljava/lang/Object; */
    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(InterfaceC8888fH interfaceC8888fH, InterfaceC8585dra interfaceC8585dra) {
        return ((MvRxView$subscribe$1) create(interfaceC8888fH, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.b.invoke((InterfaceC8888fH) this.a);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
