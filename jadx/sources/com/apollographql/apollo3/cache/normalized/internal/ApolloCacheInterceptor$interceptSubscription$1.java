package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8951gR;
import o.C8954gU;
import o.C9028hp;
import o.C9061iV;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$interceptSubscription$1<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9061iV a;
    int b;
    final /* synthetic */ C8951gR<D> c;
    final /* synthetic */ C9028hp d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$interceptSubscription$1(C9061iV c9061iV, C8951gR<D> c8951gR, C9028hp c9028hp, InterfaceC8585dra<? super ApolloCacheInterceptor$interceptSubscription$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c9061iV;
        this.c = c8951gR;
        this.d = c9028hp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCacheInterceptor$interceptSubscription$1 apolloCacheInterceptor$interceptSubscription$1 = new ApolloCacheInterceptor$interceptSubscription$1(this.a, this.c, this.d, interfaceC8585dra);
        apolloCacheInterceptor$interceptSubscription$1.e = obj;
        return apolloCacheInterceptor$interceptSubscription$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$interceptSubscription$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C9061iV c9061iV = this.a;
            C8951gR<D> c8951gR = this.c;
            C9028hp c9028hp = this.d;
            this.b = 1;
            if (C9061iV.b(c9061iV, c8951gR, (C8954gU) this.e, c9028hp, null, this, 8, null) == e) {
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
