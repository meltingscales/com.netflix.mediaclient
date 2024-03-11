package com.netflix.mediaclient.ui.pauseads.impl;

import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.pauseads.api.PauseAdsUiModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7474cwr;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC7466cwj;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PauseAdsManagerImpl$showPauseAd$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ NetflixFrag a;
    int c;
    final /* synthetic */ C7474cwr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PauseAdsManagerImpl$showPauseAd$1(C7474cwr c7474cwr, NetflixFrag netflixFrag, InterfaceC8585dra<? super PauseAdsManagerImpl$showPauseAd$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c7474cwr;
        this.a = netflixFrag;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PauseAdsManagerImpl$showPauseAd$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PauseAdsManagerImpl$showPauseAd$1(this.e, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            C7474cwr c7474cwr = this.e;
            this.c = 1;
            obj = c7474cwr.d(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        InterfaceC7466cwj interfaceC7466cwj = (InterfaceC7466cwj) obj;
        if (interfaceC7466cwj instanceof InterfaceC7466cwj.a) {
            this.e.c(PauseAdsUiModel.a.b(), this.a);
        } else if (!(interfaceC7466cwj instanceof InterfaceC7466cwj.d)) {
            boolean z = interfaceC7466cwj instanceof InterfaceC7466cwj.b;
        }
        return dpR.c;
    }
}
