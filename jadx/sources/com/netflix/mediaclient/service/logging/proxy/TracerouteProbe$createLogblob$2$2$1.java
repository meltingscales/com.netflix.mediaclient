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
final class TracerouteProbe$createLogblob$2$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVE.b>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    int f;
    final /* synthetic */ aVE i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerouteProbe$createLogblob$2$2$1(aVE ave, String str, int i, int i2, int i3, int i4, InterfaceC8585dra<? super TracerouteProbe$createLogblob$2$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.i = ave;
        this.a = str;
        this.d = i;
        this.c = i2;
        this.e = i3;
        this.b = i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new TracerouteProbe$createLogblob$2$2$1(this.i, this.a, this.d, this.c, this.e, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVE.b> interfaceC8585dra) {
        return ((TracerouteProbe$createLogblob$2$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.f;
        if (i == 0) {
            C8556dpz.d(obj);
            aVE ave = this.i;
            String str = this.a;
            int i2 = this.d;
            int i3 = this.c;
            int i4 = this.e;
            int i5 = this.b;
            this.f = 1;
            obj = ave.b(str, i2, i3, i4, i5, this);
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
