package com.netflix.mediaclient.playintegrity.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1683aKj;
import o.C1689aKp;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC1687aKn;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AttestationStatusListenerHolder$alert$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ InterfaceC1687aKn b;
    final /* synthetic */ C1683aKj c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestationStatusListenerHolder$alert$2(InterfaceC1687aKn interfaceC1687aKn, boolean z, C1683aKj c1683aKj, InterfaceC8585dra<? super AttestationStatusListenerHolder$alert$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC1687aKn;
        this.a = z;
        this.c = c1683aKj;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AttestationStatusListenerHolder$alert$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AttestationStatusListenerHolder$alert$2(this.b, this.a, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            C1689aKp.b.getLogTag();
            this.b.c(this.a, this.c);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
