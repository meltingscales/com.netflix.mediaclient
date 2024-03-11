package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LolomoMvRxFragment$onLoaded$1$1$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ LolomoMvRxFragment c;
    final /* synthetic */ ServiceManager d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoMvRxFragment$onLoaded$1$1$1$1(ServiceManager serviceManager, LolomoMvRxFragment lolomoMvRxFragment, InterfaceC8585dra<? super LolomoMvRxFragment$onLoaded$1$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = serviceManager;
        this.c = lolomoMvRxFragment;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoMvRxFragment$onLoaded$1$1$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoMvRxFragment$onLoaded$1$1$1$1(this.d, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            this.e = 1;
            if (C8749dxc.b(150L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        UmaAlert x = this.d.x();
        if (x != null) {
            this.c.aB().c(x);
        }
        return dpR.c;
    }
}
