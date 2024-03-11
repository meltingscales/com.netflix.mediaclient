package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bSJ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class LolomoEpoxyController$buildHomeHeaders$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ LolomoEpoxyController d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoEpoxyController$buildHomeHeaders$3(LolomoEpoxyController lolomoEpoxyController, InterfaceC8585dra<? super LolomoEpoxyController$buildHomeHeaders$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = lolomoEpoxyController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoEpoxyController$buildHomeHeaders$3(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoEpoxyController$buildHomeHeaders$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            this.d.getEventBusFactory().b(bSJ.class, new bSJ.a(0));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
