package com.netflix.mediaclient.ui.interstitials.impl;

import androidx.fragment.app.FragmentManager;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.FX;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class InterstitialsImpl$presentInterstitialForHook$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Map<String, Object> a;
    final /* synthetic */ InterstitialClient b;
    int c;
    final /* synthetic */ FragmentManager d;
    final /* synthetic */ String e;
    final /* synthetic */ InterstitialsImpl j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialsImpl$presentInterstitialForHook$1(InterstitialClient interstitialClient, String str, Map<String, ? extends Object> map, InterstitialsImpl interstitialsImpl, FragmentManager fragmentManager, InterfaceC8585dra<? super InterstitialsImpl$presentInterstitialForHook$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interstitialClient;
        this.e = str;
        this.a = map;
        this.j = interstitialsImpl;
        this.d = fragmentManager;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialsImpl$presentInterstitialForHook$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialsImpl$presentInterstitialForHook$1(this.b, this.e, this.a, this.j, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        FX fx;
        e = C8586drb.e();
        int i = this.c;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                InterstitialClient interstitialClient = this.b;
                String str = this.e;
                Map<String, ? extends Object> map = this.a;
                this.c = 1;
                obj = interstitialClient.c(str, map, this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            fx = (FX) obj;
        } catch (InterstitialClient.ServerException e2) {
            this.j.b("InterstitialFetchError", "EndpointError", (String) null, e2);
        } catch (Exception e3) {
            InterstitialsImpl interstitialsImpl = this.j;
            Throwable cause = e3.getCause();
            interstitialsImpl.b("InterstitialFetchError", "EndpointError", cause != null ? cause.toString() : null, e3);
        }
        if (fx == null) {
            return dpR.c;
        }
        this.j.s = InterstitialsImpl.PresentationLocation.e;
        this.j.e().a(fx, this.b, this.j, this.d);
        return dpR.c;
    }
}
