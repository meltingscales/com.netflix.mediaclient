package com.netflix.mediaclient.ui.pauseads.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7465cwi;
import o.C7474cwr;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C7465cwi>, Object> {
    final /* synthetic */ C7474cwr a;
    int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1(C7474cwr c7474cwr, InterfaceC8585dra<? super PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c7474cwr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1(this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C7465cwi> interfaceC8585dra) {
        return ((PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            C7474cwr c7474cwr = this.a;
            this.d = 1;
            obj = c7474cwr.a(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
