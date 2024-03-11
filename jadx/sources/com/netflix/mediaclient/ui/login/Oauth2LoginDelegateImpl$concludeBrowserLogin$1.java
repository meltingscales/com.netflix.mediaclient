package com.netflix.mediaclient.ui.login;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5015bql;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.YM;
import o.aCE;
import o.aCI;
import o.aCK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class Oauth2LoginDelegateImpl$concludeBrowserLogin$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ UserAgent c;
    int d;
    final /* synthetic */ drM<Boolean, dpR> e;
    final /* synthetic */ Oauth2LoginDelegateImpl h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oauth2LoginDelegateImpl$concludeBrowserLogin$1(Oauth2LoginDelegateImpl oauth2LoginDelegateImpl, String str, String str2, UserAgent userAgent, drM<? super Boolean, dpR> drm, InterfaceC8585dra<? super Oauth2LoginDelegateImpl$concludeBrowserLogin$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.h = oauth2LoginDelegateImpl;
        this.b = str;
        this.a = str2;
        this.c = userAgent;
        this.e = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new Oauth2LoginDelegateImpl$concludeBrowserLogin$1(this.h, this.b, this.a, this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Oauth2LoginDelegateImpl$concludeBrowserLogin$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCI aci;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                aci = this.h.e;
                YM ym = new YM(this.b, this.a);
                this.d = 1;
                obj = aCE.d.c(aci, ym, null, false, null, true, this, 14, null);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            aCK.b((C8954gU) obj, false, 1, null);
            UserAgent userAgent = this.c;
            final drM<Boolean, dpR> drm = this.e;
            userAgent.c(new C5015bql() { // from class: com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl$concludeBrowserLogin$1.1
                @Override // o.C5015bql, o.InterfaceC5018bqo
                public void c(Status status) {
                    C8632dsu.c((Object) status, "");
                    if (status.j()) {
                        drm.invoke(Boolean.TRUE);
                    } else {
                        drm.invoke(Boolean.FALSE);
                    }
                }
            });
        } catch (Exception unused) {
            this.e.invoke(C8589dre.e(false));
        }
        return dpR.c;
    }
}
