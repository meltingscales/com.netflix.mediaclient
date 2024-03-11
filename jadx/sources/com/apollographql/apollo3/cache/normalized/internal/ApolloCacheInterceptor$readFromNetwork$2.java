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
public final class ApolloCacheInterceptor$readFromNetwork$2<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9061iV a;
    final /* synthetic */ C9028hp b;
    /* synthetic */ Object c;
    final /* synthetic */ C8951gR<D> d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$readFromNetwork$2(C9061iV c9061iV, C8951gR<D> c8951gR, C9028hp c9028hp, InterfaceC8585dra<? super ApolloCacheInterceptor$readFromNetwork$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c9061iV;
        this.d = c8951gR;
        this.b = c9028hp;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$readFromNetwork$2) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCacheInterceptor$readFromNetwork$2 apolloCacheInterceptor$readFromNetwork$2 = new ApolloCacheInterceptor$readFromNetwork$2(this.a, this.d, this.b, interfaceC8585dra);
        apolloCacheInterceptor$readFromNetwork$2.c = obj;
        return apolloCacheInterceptor$readFromNetwork$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            C9061iV c9061iV = this.a;
            C8951gR<D> c8951gR = this.d;
            C9028hp c9028hp = this.b;
            this.e = 1;
            if (C9061iV.b(c9061iV, c8951gR, (C8954gU) this.c, c9028hp, null, this, 8, null) == e) {
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
