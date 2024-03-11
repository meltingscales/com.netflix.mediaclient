package com.netflix.clcs.ui;

import com.netflix.clcs.client.InterstitialClient;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.FE;
import o.FX;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class InterstitialCoordinator$handleEffect$4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterstitialCoordinator a;
    final /* synthetic */ FE b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ Map<String, Object> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialCoordinator$handleEffect$4(InterstitialCoordinator interstitialCoordinator, String str, FE fe, Map<String, Object> map, InterfaceC8585dra<? super InterstitialCoordinator$handleEffect$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interstitialCoordinator;
        this.c = str;
        this.b = fe;
        this.e = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialCoordinator$handleEffect$4(this.a, this.c, this.b, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialCoordinator$handleEffect$4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8812dzl interfaceC8812dzl;
        InterstitialClient interstitialClient;
        FX fx;
        InterfaceC8812dzl interfaceC8812dzl2;
        e = C8586drb.e();
        int i = this.d;
        try {
        } catch (Exception e2) {
            interfaceC8812dzl = this.a.k;
            interfaceC8812dzl.d(C8589dre.e(false));
            e2.printStackTrace();
            this.a.b(((FE.n) this.b).c());
        }
        if (i == 0) {
            C8556dpz.d(obj);
            interstitialClient = this.a.c;
            if (interstitialClient == null) {
                fx = null;
                interfaceC8812dzl2 = this.a.k;
                interfaceC8812dzl2.d(C8589dre.e(false));
                InterstitialCoordinator.a(this.a, fx, null, 2, null);
                return dpR.c;
            }
            String str = this.c;
            String b = ((FE.n) this.b).b();
            Map<String, ? extends Object> map = this.e;
            this.d = 1;
            obj = interstitialClient.c(str, b, map, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        fx = (FX) obj;
        interfaceC8812dzl2 = this.a.k;
        interfaceC8812dzl2.d(C8589dre.e(false));
        InterstitialCoordinator.a(this.a, fx, null, 2, null);
        return dpR.c;
    }
}
