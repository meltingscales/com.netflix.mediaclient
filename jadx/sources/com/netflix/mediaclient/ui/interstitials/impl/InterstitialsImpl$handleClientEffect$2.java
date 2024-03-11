package com.netflix.mediaclient.ui.interstitials.impl;

import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidCtaConsentState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.FE;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class InterstitialsImpl$handleClientEffect$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterstitialsImpl a;
    final /* synthetic */ FE b;
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialsImpl$handleClientEffect$2(InterstitialsImpl interstitialsImpl, FE fe, InterfaceC8585dra<? super InterstitialsImpl$handleClientEffect$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interstitialsImpl;
        this.b = fe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialsImpl$handleClientEffect$2(this.a, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialsImpl$handleClientEffect$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        RdidConsentStateRepo rdidConsentStateRepo;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            rdidConsentStateRepo = this.a.y;
            RdidCtaConsentState rdidCtaConsentState = new RdidCtaConsentState(((FE.i) this.b).a(), ((FE.i) this.b).d(), ((FE.i) this.b).e());
            this.c = 1;
            if (rdidConsentStateRepo.storeRdidCtaConsentState(rdidCtaConsentState, this) == e) {
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
