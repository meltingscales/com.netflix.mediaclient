package com.netflix.mediaclient.commanderinfra.impl;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1291Wa;
import o.C1307Wq;
import o.C1317Xa;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.VV;
import o.VX;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$selectSeason$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ C1307Wq c;
    final /* synthetic */ C1291Wa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$selectSeason$1$1(C1307Wq c1307Wq, C1291Wa c1291Wa, InterfaceC8585dra<? super PrefetchInfraImpl$selectSeason$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c1307Wq;
        this.e = c1291Wa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PrefetchInfraImpl$selectSeason$1$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrefetchInfraImpl$selectSeason$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        VV d;
        List<C1291Wa> c;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            VX b = C1317Xa.e.d().b();
            if (b != null && (d = b.d()) != null && (c = d.c()) != null) {
                C1307Wq c1307Wq = this.c;
                C1291Wa c1291Wa = this.e;
                this.b = 1;
                if (C1307Wq.e(c1307Wq, c, c1291Wa, 0, this, 4, null) == e) {
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
