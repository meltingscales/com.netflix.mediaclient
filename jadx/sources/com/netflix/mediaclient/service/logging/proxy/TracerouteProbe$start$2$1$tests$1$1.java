package com.netflix.mediaclient.service.logging.proxy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aVE;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class TracerouteProbe$start$2$1$tests$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVE.b>, Object> {
    final /* synthetic */ aVE a;
    final /* synthetic */ int b;
    int c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerouteProbe$start$2$1$tests$1$1(aVE ave, String str, int i, int i2, InterfaceC8585dra<? super TracerouteProbe$start$2$1$tests$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = ave;
        this.d = str;
        this.e = i;
        this.b = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new TracerouteProbe$start$2$1$tests$1$1(this.a, this.d, this.e, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVE.b> interfaceC8585dra) {
        return ((TracerouteProbe$start$2$1$tests$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        aVE.b e;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            e = this.a.e(this.d, this.e, this.b);
            return e;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
