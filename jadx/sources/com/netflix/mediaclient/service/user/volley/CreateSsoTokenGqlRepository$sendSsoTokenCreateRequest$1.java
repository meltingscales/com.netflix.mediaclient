package com.netflix.mediaclient.service.user.volley;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1354Yl;
import o.C4993bqP;
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
public final class CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ aCI a;
    final /* synthetic */ C4993bqP b;
    final /* synthetic */ C1354Yl c;
    final /* synthetic */ C4993bqP.b d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1(aCI aci, C1354Yl c1354Yl, C4993bqP c4993bqP, C4993bqP.b bVar, InterfaceC8585dra<? super CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = aci;
        this.c = c1354Yl;
        this.b = c4993bqP;
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1(this.a, this.c, this.b, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwQ dwq;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            aCI aci = this.a;
            C8632dsu.a(aci, "");
            C1354Yl c1354Yl = this.c;
            RequestPriority requestPriority = RequestPriority.d;
            this.e = 1;
            obj = aCE.d.c(aci, c1354Yl, null, false, requestPriority, true, this, 6, null);
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
        dwq = this.b.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, (C8954gU) obj, this.d, null);
        this.e = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.user.volley.CreateSsoTokenGqlRepository$sendSsoTokenCreateRequest$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C8954gU<C1354Yl.d> b;
        final /* synthetic */ C4993bqP.b c;
        final /* synthetic */ C4993bqP d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C4993bqP c4993bqP, C8954gU<C1354Yl.d> c8954gU, C4993bqP.b bVar, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = c4993bqP;
            this.b = c8954gU;
            this.c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, this.b, this.c, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                this.d.a(this.b, this.c);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
