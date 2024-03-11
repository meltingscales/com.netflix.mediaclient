package com.netflix.mediaclient.ui.player.v2;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1359Yq;
import o.C5600cBk;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ C5600cBk c;
    final /* synthetic */ C1359Yq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1(C5600cBk c5600cBk, C1359Yq c1359Yq, InterfaceC8585dra<? super PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c5600cBk;
        this.e = c1359Yq;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object d;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C5600cBk c5600cBk = this.c;
            C1359Yq c1359Yq = this.e;
            this.b = 1;
            d = c5600cBk.d(c1359Yq, this);
            if (d == e) {
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
