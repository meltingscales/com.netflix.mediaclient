package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC4986bqI;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Status a;
    final /* synthetic */ InterfaceC4986bqI b;
    final /* synthetic */ AccountData d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2(InterfaceC4986bqI interfaceC4986bqI, AccountData accountData, Status status, InterfaceC8585dra<? super UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC4986bqI;
        this.d = accountData;
        this.a = status;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2(this.b, this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            InterfaceC4986bqI interfaceC4986bqI = this.b;
            if (interfaceC4986bqI != null) {
                interfaceC4986bqI.c(this.d, this.a);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
