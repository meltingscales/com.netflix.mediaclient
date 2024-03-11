package com.netflix.clcs.ui;

import com.netflix.clcs.client.InterstitialClient;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.FE;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class InterstitialCoordinator$handleEffect$7 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ InterstitialCoordinator b;
    int c;
    final /* synthetic */ Map<String, Object> d;
    final /* synthetic */ FE e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialCoordinator$handleEffect$7(InterstitialCoordinator interstitialCoordinator, String str, FE fe, Map<String, Object> map, InterfaceC8585dra<? super InterstitialCoordinator$handleEffect$7> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interstitialCoordinator;
        this.a = str;
        this.e = fe;
        this.d = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialCoordinator$handleEffect$7(this.b, this.a, this.e, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialCoordinator$handleEffect$7) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterstitialClient interstitialClient;
        e = C8586drb.e();
        int i = this.c;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                interstitialClient = this.b.c;
                if (interstitialClient != null) {
                    String str = this.a;
                    String b = ((FE.o) this.e).b();
                    if (b == null) {
                        b = "";
                    }
                    Map<String, ? extends Object> map = this.d;
                    this.c = 1;
                    if (interstitialClient.a(str, b, map, this) == e) {
                        return e;
                    }
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.b.b(((FE.o) this.e).a());
        }
        return dpR.c;
    }
}
