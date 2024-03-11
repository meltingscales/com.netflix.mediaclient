package com.netflix.mediaclient.util.log.clv2;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8269dhG;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ Activity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1(Activity activity, InterfaceC8585dra<? super NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = activity;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            C8269dhG.d(this.e);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
