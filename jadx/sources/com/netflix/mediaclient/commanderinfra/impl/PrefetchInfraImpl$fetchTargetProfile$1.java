package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.service.user.UserAgent;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1324Xh;
import o.C1331Xo;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.VQ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchTargetProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$fetchTargetProfile$1(String str, InterfaceC8585dra<? super PrefetchInfraImpl$fetchTargetProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrefetchInfraImpl$fetchTargetProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PrefetchInfraImpl$fetchTargetProfile$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            UserAgent b = C1331Xo.b.b();
            InterfaceC5283bvo b2 = b != null ? b.b(this.e) : null;
            if (b2 != null) {
                for (VQ vq : C1324Xh.a.a()) {
                    vq.c(b2);
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
