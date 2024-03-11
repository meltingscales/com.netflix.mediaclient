package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5989cPw;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.cPN;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ ProfileViewingRestrictionsFragment c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, InterfaceC8585dra<? super ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = profileViewingRestrictionsFragment;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2(this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        cPN M;
        cPN M2;
        C5989cPw L;
        String N;
        cPN M3;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            ProfileViewingRestrictionsFragment.j.getLogTag();
            M = this.c.M();
            this.a = 1;
            obj = M.a(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                M3 = this.c.M();
                M3.b(ProfileViewingRestrictionsPage.c);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment = this.c;
        M2 = profileViewingRestrictionsFragment.M();
        profileViewingRestrictionsFragment.c((List) obj, M2);
        L = this.c.L();
        N = this.c.N();
        this.a = 2;
        if (L.c(N, this) == e) {
            return e;
        }
        M3 = this.c.M();
        M3.b(ProfileViewingRestrictionsPage.c);
        return dpR.c;
    }
}
