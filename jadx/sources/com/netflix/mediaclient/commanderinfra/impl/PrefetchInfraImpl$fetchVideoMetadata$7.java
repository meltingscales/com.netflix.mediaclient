package com.netflix.mediaclient.commanderinfra.impl;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1307Wq;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchVideoMetadata$7 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1307Wq a;
    final /* synthetic */ List<String> c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$fetchVideoMetadata$7(C1307Wq c1307Wq, List<String> list, InterfaceC8585dra<? super PrefetchInfraImpl$fetchVideoMetadata$7> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c1307Wq;
        this.c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PrefetchInfraImpl$fetchVideoMetadata$7(this.a, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrefetchInfraImpl$fetchVideoMetadata$7) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            C1307Wq.b(this.a, this.c, 0, 2, null);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
