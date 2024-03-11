package com.netflix.mediaclient.autologin.impl;

import com.netflix.mediaclient.graphql.models.type.TokenScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1347Ye;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.TX;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AutoLoginTokenProviderImpl$createAutoLoginToken$altResponse$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C8954gU<C1347Ye.d>>, Object> {
    final /* synthetic */ TokenScope a;
    int c;
    final /* synthetic */ TX d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLoginTokenProviderImpl$createAutoLoginToken$altResponse$1(TX tx, TokenScope tokenScope, InterfaceC8585dra<? super AutoLoginTokenProviderImpl$createAutoLoginToken$altResponse$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = tx;
        this.a = tokenScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AutoLoginTokenProviderImpl$createAutoLoginToken$altResponse$1(this.d, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C8954gU<C1347Ye.d>> interfaceC8585dra) {
        return ((AutoLoginTokenProviderImpl$createAutoLoginToken$altResponse$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG d;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            d = this.d.d();
            if (d == null) {
                return null;
            }
            C1347Ye c1347Ye = new C1347Ye(this.a);
            this.c = 1;
            obj = aCE.d.c(d, c1347Ye, null, false, null, false, this, 30, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return (C8954gU) obj;
    }
}
