package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.android.app.Status;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC4986bqI;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ InterfaceC4986bqI c;
    final /* synthetic */ Status d;
    final /* synthetic */ InterfaceC5283bvo e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1(InterfaceC4986bqI interfaceC4986bqI, InterfaceC5283bvo interfaceC5283bvo, Status status, InterfaceC8585dra<? super UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = interfaceC4986bqI;
        this.e = interfaceC5283bvo;
        this.d = status;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1(this.c, this.e, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            InterfaceC4986bqI interfaceC4986bqI = this.c;
            if (interfaceC4986bqI != null) {
                interfaceC4986bqI.e(this.e, this.d);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
