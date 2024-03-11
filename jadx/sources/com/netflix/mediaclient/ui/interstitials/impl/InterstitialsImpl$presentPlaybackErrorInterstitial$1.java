package com.netflix.mediaclient.ui.interstitials.impl;

import androidx.fragment.app.FragmentManager;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0872Fv;
import o.C8556dpz;
import o.C8586drb;
import o.FM;
import o.FX;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.bXD;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class InterstitialsImpl$presentPlaybackErrorInterstitial$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FragmentManager a;
    final /* synthetic */ String b;
    final /* synthetic */ drO<dpR> c;
    final /* synthetic */ InterstitialClient d;
    final /* synthetic */ drM<bXD.b, dpR> e;
    final /* synthetic */ InterfaceC5283bvo f;
    int g;
    final /* synthetic */ InterstitialsImpl h;
    private /* synthetic */ Object i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterstitialsImpl$presentPlaybackErrorInterstitial$1(InterstitialsImpl interstitialsImpl, InterfaceC5283bvo interfaceC5283bvo, InterstitialClient interstitialClient, String str, drM<? super bXD.b, dpR> drm, drO<dpR> dro, FragmentManager fragmentManager, InterfaceC8585dra<? super InterstitialsImpl$presentPlaybackErrorInterstitial$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.h = interstitialsImpl;
        this.f = interfaceC5283bvo;
        this.d = interstitialClient;
        this.b = str;
        this.e = drm;
        this.c = dro;
        this.a = fragmentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        InterstitialsImpl$presentPlaybackErrorInterstitial$1 interstitialsImpl$presentPlaybackErrorInterstitial$1 = new InterstitialsImpl$presentPlaybackErrorInterstitial$1(this.h, this.f, this.d, this.b, this.e, this.c, this.a, interfaceC8585dra);
        interstitialsImpl$presentPlaybackErrorInterstitial$1.i = obj;
        return interstitialsImpl$presentPlaybackErrorInterstitial$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialsImpl$presentPlaybackErrorInterstitial$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        FM e2;
        UmaAlert e3;
        e = C8586drb.e();
        int i = this.g;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.i;
                e2 = this.h.e(this.f);
                InterstitialClient interstitialClient = this.d;
                String str = this.b;
                this.i = dwu;
                this.g = 1;
                obj = interstitialClient.d(str, e2, this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                dwU dwu2 = (dwU) this.i;
                C8556dpz.d(obj);
            }
            FX fx = (FX) obj;
            if (fx == null) {
                this.e.invoke(bXD.b.C0104b.a);
                return dpR.c;
            }
            String d = C0872Fv.d(fx);
            if (d != null) {
                InterstitialsImpl interstitialsImpl = this.h;
                drM<bXD.b, dpR> drm = this.e;
                e3 = interstitialsImpl.e(d);
                if (e3 != null) {
                    drm.invoke(new bXD.b.a(e3));
                } else {
                    drm.invoke(bXD.b.C0104b.a);
                }
                return dpR.c;
            }
            this.e.invoke(bXD.b.d.a);
            this.h.f13276o = this.c;
            this.h.e().a(fx, this.d, this.h, this.a);
            return dpR.c;
        } catch (InterstitialClient.ServerException e4) {
            this.h.b("InterstitialFetchError", "EndpointError", (String) null, e4);
            this.e.invoke(bXD.b.C0104b.a);
            return dpR.c;
        } catch (Exception e5) {
            InterstitialsImpl interstitialsImpl2 = this.h;
            Throwable cause = e5.getCause();
            interstitialsImpl2.b("InterstitialFetchError", "RequestError", cause != null ? cause.toString() : null, e5);
            this.e.invoke(bXD.b.C0104b.a);
            return dpR.c;
        }
    }
}
