package com.netflix.mediaclient.util.log.clv2;

import com.netflix.mediaclient.NetflixApplication;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8269dhG;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;

    public AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1(InterfaceC8585dra<? super AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            NetflixApplication netflixApplication = NetflixApplication.getInstance();
            C8632dsu.a(netflixApplication, "");
            C8269dhG.d(netflixApplication);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
