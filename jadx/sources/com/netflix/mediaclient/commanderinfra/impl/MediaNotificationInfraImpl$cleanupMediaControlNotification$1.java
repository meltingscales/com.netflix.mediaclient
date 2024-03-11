package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1303Wm;
import o.C1331Xo;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.WT;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class MediaNotificationInfraImpl$cleanupMediaControlNotification$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1303Wm a;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaNotificationInfraImpl$cleanupMediaControlNotification$1(C1303Wm c1303Wm, InterfaceC8585dra<? super MediaNotificationInfraImpl$cleanupMediaControlNotification$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c1303Wm;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MediaNotificationInfraImpl$cleanupMediaControlNotification$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MediaNotificationInfraImpl$cleanupMediaControlNotification$1(this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WT wt;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            wt = this.a.c;
            if (wt != null) {
                wt.e(C1331Xo.b.e());
            }
            this.a.c = null;
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
