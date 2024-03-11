package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1295We;
import o.C1303Wm;
import o.C1317Xa;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.VX;
import o.WT;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class MediaNotificationInfraImpl$updateNotificationVideoMetadata$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C1303Wm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaNotificationInfraImpl$updateNotificationVideoMetadata$1(C1303Wm c1303Wm, InterfaceC8585dra<? super MediaNotificationInfraImpl$updateNotificationVideoMetadata$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c1303Wm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MediaNotificationInfraImpl$updateNotificationVideoMetadata$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MediaNotificationInfraImpl$updateNotificationVideoMetadata$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WT wt;
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            wt = this.d.c;
            if (wt != null) {
                C1317Xa c1317Xa = C1317Xa.e;
                VX b = c1317Xa.d().b();
                C1295We g = b != null ? b.g() : null;
                VX b2 = c1317Xa.d().b();
                wt.c(g, b2 != null ? b2.e() : null);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
