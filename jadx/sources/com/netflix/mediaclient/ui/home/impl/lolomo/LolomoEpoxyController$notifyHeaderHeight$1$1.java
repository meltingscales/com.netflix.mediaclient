package com.netflix.mediaclient.ui.home.impl.lolomo;

import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bSJ;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LolomoEpoxyController$notifyHeaderHeight$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ View c;
    final /* synthetic */ LolomoEpoxyController d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoEpoxyController$notifyHeaderHeight$1$1(LolomoEpoxyController lolomoEpoxyController, View view, InterfaceC8585dra<? super LolomoEpoxyController$notifyHeaderHeight$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = lolomoEpoxyController;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoEpoxyController$notifyHeaderHeight$1$1(this.d, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoEpoxyController$notifyHeaderHeight$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            this.d.getEventBusFactory().b(bSJ.class, new bSJ.a(this.c.getHeight()));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
