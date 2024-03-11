package com.netflix.mediaclient.localdiscovery.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aGS;
import o.aGZ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ aGS a;
    final /* synthetic */ aGZ c;
    final /* synthetic */ boolean d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1(aGZ agz, aGS ags, boolean z, InterfaceC8585dra<? super LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = agz;
        this.a = ags;
        this.d = z;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1(this.c, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            aGZ agz = this.c;
            aGS ags = this.a;
            boolean z = this.d;
            this.e = 1;
            e2 = agz.e(ags, z, this);
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
