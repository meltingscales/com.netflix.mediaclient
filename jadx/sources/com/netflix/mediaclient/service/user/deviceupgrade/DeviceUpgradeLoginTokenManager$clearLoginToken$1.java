package com.netflix.mediaclient.service.user.deviceupgrade;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8246dgk;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DeviceUpgradeLoginTokenManager$clearLoginToken$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ DeviceUpgradeLoginTokenManager e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpgradeLoginTokenManager$clearLoginToken$1(DeviceUpgradeLoginTokenManager deviceUpgradeLoginTokenManager, InterfaceC8585dra<? super DeviceUpgradeLoginTokenManager$clearLoginToken$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = deviceUpgradeLoginTokenManager;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DeviceUpgradeLoginTokenManager$clearLoginToken$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DeviceUpgradeLoginTokenManager$clearLoginToken$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8246dgk c8246dgk;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            c8246dgk = this.e.e;
            c8246dgk.a();
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
