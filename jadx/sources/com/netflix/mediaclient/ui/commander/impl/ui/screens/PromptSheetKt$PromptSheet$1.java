package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.VY;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PromptSheetKt$PromptSheet$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ List<VY> a;
    final /* synthetic */ ConnectionState b;
    int c;
    final /* synthetic */ drM<DeviceSheetScreen.e, dpR> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromptSheetKt$PromptSheet$1(ConnectionState connectionState, List<VY> list, drM<? super DeviceSheetScreen.e, dpR> drm, InterfaceC8585dra<? super PromptSheetKt$PromptSheet$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = connectionState;
        this.a = list;
        this.d = drm;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PromptSheetKt$PromptSheet$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PromptSheetKt$PromptSheet$1(this.b, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<VY> list;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            if (this.b == ConnectionState.g && (list = this.a) != null) {
                this.d.invoke(new DeviceSheetScreen.e.t(list.get(0)));
            } else {
                this.d.invoke(DeviceSheetScreen.e.m.d);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
