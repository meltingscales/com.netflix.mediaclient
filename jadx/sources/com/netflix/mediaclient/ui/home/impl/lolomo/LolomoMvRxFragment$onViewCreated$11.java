package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LolomoMvRxFragment$onViewCreated$11 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ LolomoMvRxFragment a;
    final /* synthetic */ NetflixActionBarInterstitials c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoMvRxFragment$onViewCreated$11(NetflixActionBarInterstitials netflixActionBarInterstitials, LolomoMvRxFragment lolomoMvRxFragment, InterfaceC8585dra<? super LolomoMvRxFragment$onViewCreated$11> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = netflixActionBarInterstitials;
        this.a = lolomoMvRxFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoMvRxFragment$onViewCreated$11(this.c, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoMvRxFragment$onViewCreated$11) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyS<Boolean> j;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            NetflixActionBarInterstitials netflixActionBarInterstitials = this.c;
            if (netflixActionBarInterstitials != null && (j = netflixActionBarInterstitials.j()) != null) {
                final LolomoMvRxFragment lolomoMvRxFragment = this.a;
                dyQ<? super Boolean> dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onViewCreated$11.1
                    @Override // o.dyQ
                    public /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                        return c(((Boolean) obj2).booleanValue(), interfaceC8585dra);
                    }

                    public final Object c(boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        LolomoMvRxFragment.this.aq().d(z);
                        return dpR.c;
                    }
                };
                this.e = 1;
                if (j.collect(dyq, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
