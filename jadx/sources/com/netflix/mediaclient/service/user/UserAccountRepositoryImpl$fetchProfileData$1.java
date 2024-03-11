package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.android.app.Status;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC5011bqh;
import o.C5014bqk;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC4986bqI;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$fetchProfileData$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC5283bvo a;
    final /* synthetic */ String b;
    int c;
    final /* synthetic */ C5014bqk d;
    final /* synthetic */ InterfaceC4986bqI e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$fetchProfileData$1(C5014bqk c5014bqk, String str, InterfaceC5283bvo interfaceC5283bvo, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryImpl$fetchProfileData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c5014bqk;
        this.b = str;
        this.a = interfaceC5283bvo;
        this.e = interfaceC4986bqI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$fetchProfileData$1(this.d, this.b, this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$fetchProfileData$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5011bqh {
        final /* synthetic */ C5014bqk a;
        final /* synthetic */ InterfaceC4986bqI d;
        final /* synthetic */ InterfaceC5283bvo e;

        a(C5014bqk c5014bqk, InterfaceC5283bvo interfaceC5283bvo, InterfaceC4986bqI interfaceC4986bqI) {
            this.a = c5014bqk;
            this.e = interfaceC5283bvo;
            this.d = interfaceC4986bqI;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void e(InterfaceC5283bvo interfaceC5283bvo, Status status) {
            C8632dsu.c((Object) status, "");
            if (status.j()) {
                this.a.a(interfaceC5283bvo, this.e);
            }
            C8737dwr.c(this.a.a, this.a.g, null, new UserAccountRepositoryImpl$fetchProfileData$1$webClientCallback$1$onProfileDataFetched$1(this.d, interfaceC5283bvo, status, null), 2, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.d.b(this.b, new a(this.d, this.a, this.e));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
