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
public final class UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Status b;
    int c;
    final /* synthetic */ InterfaceC4986bqI d;
    final /* synthetic */ AccountData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1(InterfaceC4986bqI interfaceC4986bqI, AccountData accountData, Status status, InterfaceC8585dra<? super UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = interfaceC4986bqI;
        this.e = accountData;
        this.b = status;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1(this.d, this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.d.e(this.e, this.b);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
