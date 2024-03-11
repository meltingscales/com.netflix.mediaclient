package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.VZ;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PairingSheetKt$PairingSheetSuccess$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ List<VZ> b;
    int c;
    final /* synthetic */ drM<DeviceSheetScreen.e, dpR> d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairingSheetKt$PairingSheetSuccess$1(boolean z, List<VZ> list, drM<? super DeviceSheetScreen.e, dpR> drm, InterfaceC8585dra<? super PairingSheetKt$PairingSheetSuccess$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = z;
        this.b = list;
        this.d = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PairingSheetKt$PairingSheetSuccess$1(this.e, this.b, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PairingSheetKt$PairingSheetSuccess$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            if (this.e) {
                if (!this.b.isEmpty()) {
                    this.d.invoke(DeviceSheetScreen.e.f.c);
                } else {
                    this.d.invoke(DeviceSheetScreen.e.q.b);
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
