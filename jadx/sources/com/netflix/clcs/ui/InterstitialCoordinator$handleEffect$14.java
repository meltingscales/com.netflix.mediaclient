package com.netflix.clcs.ui;

import com.netflix.clcs.client.InterstitialClient;
import com.netflix.clcs.ui.InterstitialCoordinator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.FE;
import o.FX;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class InterstitialCoordinator$handleEffect$14 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ InterstitialCoordinator c;
    final /* synthetic */ FE d;
    final /* synthetic */ InterstitialCoordinator.d e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialCoordinator$handleEffect$14(InterstitialCoordinator interstitialCoordinator, InterstitialCoordinator.d dVar, FE fe, InterfaceC8585dra<? super InterstitialCoordinator$handleEffect$14> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = interstitialCoordinator;
        this.e = dVar;
        this.d = fe;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialCoordinator$handleEffect$14) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialCoordinator$handleEffect$14(this.c, this.e, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8812dzl interfaceC8812dzl;
        InterstitialClient interstitialClient;
        FX fx;
        InterfaceC8812dzl interfaceC8812dzl2;
        e = C8586drb.e();
        int i = this.b;
        try {
        } catch (Exception e2) {
            interfaceC8812dzl = this.c.k;
            interfaceC8812dzl.d(C8589dre.e(false));
            e2.printStackTrace();
            this.c.b(((FE.f) this.d).c());
        }
        if (i == 0) {
            C8556dpz.d(obj);
            interstitialClient = this.c.c;
            if (interstitialClient == null) {
                fx = null;
                interfaceC8812dzl2 = this.c.k;
                interfaceC8812dzl2.d(C8589dre.e(false));
                this.c.d(fx, InterstitialCoordinator.Navigation.e);
                return dpR.c;
            }
            String b = this.e.b();
            this.b = 1;
            obj = interstitialClient.c(b, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        fx = (FX) obj;
        interfaceC8812dzl2 = this.c.k;
        interfaceC8812dzl2.d(C8589dre.e(false));
        this.c.d(fx, InterstitialCoordinator.Navigation.e);
        return dpR.c;
    }
}
