package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1307Wq;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$prefetchFeatureEducationAssets$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C1307Wq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$prefetchFeatureEducationAssets$2(C1307Wq c1307Wq, InterfaceC8585dra<? super PrefetchInfraImpl$prefetchFeatureEducationAssets$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c1307Wq;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrefetchInfraImpl$prefetchFeatureEducationAssets$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PrefetchInfraImpl$prefetchFeatureEducationAssets$2(this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object b;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            C1307Wq c1307Wq = this.b;
            this.a = 1;
            b = c1307Wq.b(this);
            if (b == e) {
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
