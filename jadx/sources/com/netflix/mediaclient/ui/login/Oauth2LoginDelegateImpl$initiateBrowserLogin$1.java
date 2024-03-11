package com.netflix.mediaclient.ui.login;

import androidx.activity.ComponentActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OauthTwoViaBrowser;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8738dws;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.RunnableC8122deS;
import o.YP;
import o.aCE;
import o.aCI;
import o.aCK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
final class Oauth2LoginDelegateImpl$initiateBrowserLogin$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ComponentActivity b;
    final /* synthetic */ drM<String, dpR> c;
    int d;
    final /* synthetic */ Oauth2LoginDelegateImpl e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oauth2LoginDelegateImpl$initiateBrowserLogin$1(Oauth2LoginDelegateImpl oauth2LoginDelegateImpl, ComponentActivity componentActivity, drM<? super String, dpR> drm, InterfaceC8585dra<? super Oauth2LoginDelegateImpl$initiateBrowserLogin$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = oauth2LoginDelegateImpl;
        this.b = componentActivity;
        this.c = drm;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Oauth2LoginDelegateImpl$initiateBrowserLogin$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new Oauth2LoginDelegateImpl$initiateBrowserLogin$1(this.e, this.b, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCI aci;
        dwQ dwq;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            aci = this.e.e;
            YP yp = new YP();
            this.d = 1;
            obj = aCE.d.c(aci, yp, null, false, null, true, this, 14, null);
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
        YP.a e2 = ((YP.c) aCK.b((C8954gU) obj, false, 1, null)).e();
        dwq = this.e.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, e2, this.b, this.c, null);
        this.d = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl$initiateBrowserLogin$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ ComponentActivity a;
        final /* synthetic */ Oauth2LoginDelegateImpl b;
        int c;
        final /* synthetic */ drM<String, dpR> d;
        final /* synthetic */ YP.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Oauth2LoginDelegateImpl oauth2LoginDelegateImpl, YP.a aVar, ComponentActivity componentActivity, drM<? super String, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = oauth2LoginDelegateImpl;
            this.e = aVar;
            this.a = componentActivity;
            this.d = drm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.b, this.e, this.a, this.d, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String c;
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                c = this.b.c(this.e.d(), this.e.c(), this.a);
                if (Config_FastProperty_OauthTwoViaBrowser.Companion.d()) {
                    this.d.invoke(c);
                } else {
                    new RunnableC8122deS(this.a, c).run();
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
