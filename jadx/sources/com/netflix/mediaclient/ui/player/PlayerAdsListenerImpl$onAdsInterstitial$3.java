package com.netflix.mediaclient.ui.player;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7490cxG;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.cAY;
import o.cBA;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerAdsListenerImpl$onAdsInterstitial$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ C7490cxG d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerAdsListenerImpl$onAdsInterstitial$3(long j, C7490cxG c7490cxG, InterfaceC8585dra<? super PlayerAdsListenerImpl$onAdsInterstitial$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = j;
        this.d = c7490cxG;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerAdsListenerImpl$onAdsInterstitial$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerAdsListenerImpl$onAdsInterstitial$3(this.e, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C9935zP c9935zP;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.e;
            this.c = 1;
            if (C8749dxc.b(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        c9935zP = this.d.b;
        c9935zP.b(cBA.class, cAY.a.c);
        return dpR.c;
    }
}
