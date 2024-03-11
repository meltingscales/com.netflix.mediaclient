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
public final class AttestationStatusListenerHolder$alertListener$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ C1689aKp b;
    final /* synthetic */ InterfaceC1687aKn c;
    final /* synthetic */ C1683aKj d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestationStatusListenerHolder$alertListener$1(C1689aKp c1689aKp, InterfaceC1687aKn interfaceC1687aKn, C1683aKj c1683aKj, boolean z, InterfaceC8585dra<? super AttestationStatusListenerHolder$alertListener$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c1689aKp;
        this.c = interfaceC1687aKn;
        this.d = c1683aKj;
        this.a = z;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AttestationStatusListenerHolder$alertListener$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AttestationStatusListenerHolder$alertListener$1(this.b, this.c, this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            C1689aKp c1689aKp = this.b;
            InterfaceC1687aKn interfaceC1687aKn = this.c;
            C1683aKj c1683aKj = this.d;
            boolean z = this.a;
            this.e = 1;
            e2 = c1689aKp.e(interfaceC1687aKn, c1683aKj, z, this);
            if (e2 == e) {
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
