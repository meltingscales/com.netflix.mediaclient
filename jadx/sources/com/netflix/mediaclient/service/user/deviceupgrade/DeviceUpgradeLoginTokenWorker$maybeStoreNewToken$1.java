package com.netflix.mediaclient.service.user.deviceupgrade;

import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.graphql.models.type.TokenScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1347Ye;
import o.C8246dgk;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCI;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ DeviceUpgradeLoginTokenWorker b;
    int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1(DeviceUpgradeLoginTokenWorker deviceUpgradeLoginTokenWorker, InterfaceC8585dra<? super DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = deviceUpgradeLoginTokenWorker;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DeviceUpgradeLoginTokenWorker$maybeStoreNewToken$1(this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCI aci;
        C8246dgk c8246dgk;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                aci = this.b.f;
                C1347Ye c1347Ye = new C1347Ye(TokenScope.b);
                this.d = 1;
                obj = aCE.d.c(aci, c1347Ye, null, false, null, true, this, 14, null);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            C1347Ye.d dVar = (C1347Ye.d) ((C8954gU) obj).d;
            if ((dVar != null ? dVar.b() : null) != null) {
                this.b.a("token_fetch_success");
                a aVar = new a(this.b);
                c8246dgk = this.b.c;
                c8246dgk.c(dVar.b(), aVar);
            } else {
                this.b.a("token_creation_failure");
            }
        } catch (ApolloException e2) {
            DeviceUpgradeLoginTokenWorker deviceUpgradeLoginTokenWorker = this.b;
            String message = e2.getMessage();
            deviceUpgradeLoginTokenWorker.a("token_runtime_failure: " + message);
        }
        return dpR.c;
    }

    /* loaded from: classes4.dex */
    public static final class a implements C8246dgk.c {
        final /* synthetic */ DeviceUpgradeLoginTokenWorker e;

        a(DeviceUpgradeLoginTokenWorker deviceUpgradeLoginTokenWorker) {
            this.e = deviceUpgradeLoginTokenWorker;
        }

        @Override // o.C8246dgk.c
        public void a() {
            this.e.a("token_store_success");
        }

        @Override // o.C8246dgk.c
        public void e(Exception exc) {
            C8632dsu.c((Object) exc, "");
            DeviceUpgradeLoginTokenWorker deviceUpgradeLoginTokenWorker = this.e;
            deviceUpgradeLoginTokenWorker.a("token_store_failure: " + exc);
        }
    }
}
