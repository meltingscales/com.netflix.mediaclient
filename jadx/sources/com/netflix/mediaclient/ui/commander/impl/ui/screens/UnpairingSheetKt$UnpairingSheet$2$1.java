package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UnpairingSheetKt$UnpairingSheet$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ drM<ControllerScreen.e, dpR> b;
    final /* synthetic */ drM<DeviceSheetScreen.e, dpR> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnpairingSheetKt$UnpairingSheet$2$1(drM<? super DeviceSheetScreen.e, dpR> drm, drM<? super ControllerScreen.e, dpR> drm2, InterfaceC8585dra<? super UnpairingSheetKt$UnpairingSheet$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = drm;
        this.b = drm2;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UnpairingSheetKt$UnpairingSheet$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UnpairingSheetKt$UnpairingSheet$2$1(this.c, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            this.c.invoke(DeviceSheetScreen.e.g.c);
            this.b.invoke(ControllerScreen.e.C0717d.b);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
