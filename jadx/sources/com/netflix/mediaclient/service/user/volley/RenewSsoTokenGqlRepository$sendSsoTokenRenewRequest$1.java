package com.netflix.mediaclient.service.user.volley;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1401Zz;
import o.C5057bra;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8738dws;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCI;
import o.dpR;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C5057bra a;
    int b;
    final /* synthetic */ C1401Zz c;
    final /* synthetic */ aCI d;
    final /* synthetic */ C5057bra.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1(aCI aci, C1401Zz c1401Zz, C5057bra c5057bra, C5057bra.d dVar, InterfaceC8585dra<? super RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = aci;
        this.c = c1401Zz;
        this.a = c5057bra;
        this.e = dVar;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1(this.d, this.c, this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwQ dwq;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            aCI aci = this.d;
            C8632dsu.a(aci, "");
            C1401Zz c1401Zz = this.c;
            RequestPriority requestPriority = RequestPriority.d;
            this.b = 1;
            obj = aCE.d.c(aci, c1401Zz, null, false, requestPriority, true, this, 6, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        dwq = this.a.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, (C8954gU) obj, this.e, null);
        this.b = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.user.volley.RenewSsoTokenGqlRepository$sendSsoTokenRenewRequest$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C8954gU<C1401Zz.e> a;
        final /* synthetic */ C5057bra b;
        int c;
        final /* synthetic */ C5057bra.d e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C5057bra c5057bra, C8954gU<C1401Zz.e> c8954gU, C5057bra.d dVar, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = c5057bra;
            this.a = c8954gU;
            this.e = dVar;
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.b, this.a, this.e, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                this.b.d(this.a.d, this.e);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
