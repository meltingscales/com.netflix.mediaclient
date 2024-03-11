package com.netflix.mediaclient.ui.live.impl;

import io.reactivex.Single;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C9646uN;
import o.InterfaceC8585dra;
import o.InterfaceC9638uF;
import o.bZM;
import o.dAU;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C9646uN.e>, Object> {
    int a;
    final /* synthetic */ bZM d;
    final /* synthetic */ C9646uN.b e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1(bZM bzm, C9646uN.b bVar, InterfaceC8585dra<? super LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = bzm;
        this.e = bVar;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C9646uN.e> interfaceC8585dra) {
        return ((LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1(this.d, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC9638uF interfaceC9638uF;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC9638uF = this.d.b;
            Single<C9646uN.e> d = interfaceC9638uF.d(this.e);
            this.a = 1;
            obj = dAU.d(d, this);
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
