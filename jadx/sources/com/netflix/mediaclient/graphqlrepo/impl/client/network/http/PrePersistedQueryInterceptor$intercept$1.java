package com.netflix.mediaclient.graphqlrepo.impl.client.network.http;

import com.apollographql.apollo3.exception.DefaultApolloException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1500aDp;
import o.C8556dpz;
import o.C8586drb;
import o.C8951gR;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes3.dex */
public final class PrePersistedQueryInterceptor$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC9135jq a;
    int b;
    final /* synthetic */ C8951gR<D> c;
    private /* synthetic */ Object d;
    final /* synthetic */ C1500aDp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrePersistedQueryInterceptor$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, C1500aDp c1500aDp, InterfaceC8585dra<? super PrePersistedQueryInterceptor$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC9135jq;
        this.c = c8951gR;
        this.e = c1500aDp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PrePersistedQueryInterceptor$intercept$1 prePersistedQueryInterceptor$intercept$1 = new PrePersistedQueryInterceptor$intercept$1(this.a, this.c, this.e, interfaceC8585dra);
        prePersistedQueryInterceptor$intercept$1.d = obj;
        return prePersistedQueryInterceptor$intercept$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrePersistedQueryInterceptor$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        boolean b;
        boolean e2;
        C8954gU c;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.d;
            dyS a = this.a.a(this.c);
            this.d = dyq;
            this.b = 1;
            obj = dyR.d(a, (InterfaceC8585dra) this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            } else if (i == 3) {
                C8556dpz.d(obj);
                return dpR.c;
            } else if (i == 4) {
                C8556dpz.d(obj);
                return dpR.c;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dyq = (dyQ) this.d;
            C8556dpz.d(obj);
        }
        C8954gU c8954gU = (C8954gU) obj;
        b = this.e.b(c8954gU.e);
        if (!b) {
            e2 = this.e.e(c8954gU.e);
            if (!e2) {
                c = this.e.c(c8954gU, true);
                this.d = null;
                this.b = 4;
                if (dyq.emit(c, this) == e) {
                    return e;
                }
                return dpR.c;
            }
            C8954gU e3 = new C8954gU.c(this.c.h(), this.c.j()).c(new DefaultApolloException("Persisted query not supported, this should never happen", null, 2, null)).e();
            this.d = null;
            this.b = 3;
            if (dyq.emit(e3, this) == e) {
                return e;
            }
            return dpR.c;
        }
        C8954gU e4 = new C8954gU.c(this.c.h(), this.c.j()).c(new DefaultApolloException("Persisted query not found, this should never happen", null, 2, null)).e();
        this.d = null;
        this.b = 2;
        if (dyq.emit(e4, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
