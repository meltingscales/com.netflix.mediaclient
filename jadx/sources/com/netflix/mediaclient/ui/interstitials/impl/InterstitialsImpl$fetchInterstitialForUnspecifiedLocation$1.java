package com.netflix.mediaclient.ui.interstitials.impl;

import android.content.Context;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0872Fv;
import o.C8157dfA;
import o.C8206dfx;
import o.C8556dpz;
import o.C8586drb;
import o.FM;
import o.FX;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.bXD;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class InterstitialsImpl$fetchInterstitialForUnspecifiedLocation$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC5283bvo a;
    final /* synthetic */ drM<bXD.b, dpR> b;
    final /* synthetic */ InterstitialClient c;
    int d;
    final /* synthetic */ Context e;
    final /* synthetic */ InterstitialsImpl h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterstitialsImpl$fetchInterstitialForUnspecifiedLocation$1(InterstitialsImpl interstitialsImpl, InterfaceC5283bvo interfaceC5283bvo, Context context, InterstitialClient interstitialClient, drM<? super bXD.b, dpR> drm, InterfaceC8585dra<? super InterstitialsImpl$fetchInterstitialForUnspecifiedLocation$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.h = interstitialsImpl;
        this.a = interfaceC5283bvo;
        this.e = context;
        this.c = interstitialClient;
        this.b = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialsImpl$fetchInterstitialForUnspecifiedLocation$1(this.h, this.a, this.e, this.c, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialsImpl$fetchInterstitialForUnspecifiedLocation$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        FX fx;
        FM e2;
        FX fx2;
        String d;
        UmaAlert e3;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                e2 = this.h.e(this.a);
                if (C8206dfx.e()) {
                    String e4 = C8157dfA.e(this.e, "interstitial_lolomo_demo", (String) null);
                    if (e4 != null && e4.length() != 0) {
                        InterstitialClient interstitialClient = this.c;
                        this.d = 1;
                        obj = interstitialClient.e(e4, this);
                        if (obj == e) {
                            return e;
                        }
                        fx2 = (FX) obj;
                    }
                    InterstitialClient interstitialClient2 = this.c;
                    this.d = 2;
                    obj = interstitialClient2.b(e2, this);
                    if (obj == e) {
                        return e;
                    }
                    fx2 = (FX) obj;
                } else {
                    InterstitialClient interstitialClient3 = this.c;
                    this.d = 3;
                    obj = interstitialClient3.b(e2, this);
                    if (obj == e) {
                        return e;
                    }
                    fx2 = (FX) obj;
                }
            } else if (i == 1) {
                C8556dpz.d(obj);
                fx2 = (FX) obj;
            } else if (i == 2) {
                C8556dpz.d(obj);
                fx2 = (FX) obj;
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                fx2 = (FX) obj;
            }
        } catch (InterstitialClient.ServerException e5) {
            this.h.b("InterstitialFetchError", "EndpointError", (String) null, e5);
        } catch (Exception e6) {
            InterstitialsImpl interstitialsImpl = this.h;
            Throwable cause = e6.getCause();
            interstitialsImpl.b("InterstitialFetchError", "RequestError", cause != null ? cause.toString() : null, e6);
        }
        if (fx2 == null || (d = C0872Fv.d(fx2)) == null) {
            this.h.r = fx2;
            fx = this.h.r;
            if (fx != null) {
                this.b.invoke(bXD.b.d.a);
            } else {
                this.b.invoke(bXD.b.C0104b.a);
            }
            return dpR.c;
        }
        InterstitialsImpl interstitialsImpl2 = this.h;
        drM<bXD.b, dpR> drm = this.b;
        e3 = interstitialsImpl2.e(d);
        if (e3 != null) {
            drm.invoke(new bXD.b.a(e3));
        } else {
            drm.invoke(bXD.b.C0104b.a);
        }
        return dpR.c;
    }
}
