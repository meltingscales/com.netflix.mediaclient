package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.VT;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ProfileMismatchResolutionSheetKt$ProfileMismatchResolutionSheetSuccess$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ VT a;
    int b;
    final /* synthetic */ drM<DeviceSheetScreen.e, dpR> d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileMismatchResolutionSheetKt$ProfileMismatchResolutionSheetSuccess$1(boolean z, VT vt, drM<? super DeviceSheetScreen.e, dpR> drm, InterfaceC8585dra<? super ProfileMismatchResolutionSheetKt$ProfileMismatchResolutionSheetSuccess$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = z;
        this.a = vt;
        this.d = drm;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileMismatchResolutionSheetKt$ProfileMismatchResolutionSheetSuccess$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileMismatchResolutionSheetKt$ProfileMismatchResolutionSheetSuccess$1(this.e, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VT vt;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            if (this.e && (vt = this.a) != null) {
                this.d.invoke(new DeviceSheetScreen.e.p(vt));
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
