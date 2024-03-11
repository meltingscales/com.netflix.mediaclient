package com.netflix.mediaclient.ui.commander.impl.ui.modes.browse;

import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class CollapsedBrowseKt$ClLaunchedEffect$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ TargetDeviceUiState d;
    final /* synthetic */ drM<ControllerScreen.e, dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollapsedBrowseKt$ClLaunchedEffect$1$1(drM<? super ControllerScreen.e, dpR> drm, boolean z, TargetDeviceUiState targetDeviceUiState, boolean z2, InterfaceC8585dra<? super CollapsedBrowseKt$ClLaunchedEffect$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = drm;
        this.c = z;
        this.d = targetDeviceUiState;
        this.b = z2;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollapsedBrowseKt$ClLaunchedEffect$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollapsedBrowseKt$ClLaunchedEffect$1$1(this.e, this.c, this.d, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            this.e.invoke(new ControllerScreen.e.C0716c(this.c, this.d, this.b));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
