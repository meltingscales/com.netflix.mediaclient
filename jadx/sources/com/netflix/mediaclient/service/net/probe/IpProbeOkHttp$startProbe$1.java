package com.netflix.mediaclient.service.net.probe;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aZP;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class IpProbeOkHttp$startProbe$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int d;
    final /* synthetic */ aZP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpProbeOkHttp$startProbe$1(aZP azp, InterfaceC8585dra<? super IpProbeOkHttp$startProbe$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = azp;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((IpProbeOkHttp$startProbe$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new IpProbeOkHttp$startProbe$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            aZP azp = this.e;
            this.d = 1;
            if (azp.b(this) == e) {
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
