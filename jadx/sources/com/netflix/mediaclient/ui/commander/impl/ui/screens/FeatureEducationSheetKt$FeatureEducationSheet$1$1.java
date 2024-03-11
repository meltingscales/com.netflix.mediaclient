package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class FeatureEducationSheetKt$FeatureEducationSheet$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    int b;
    final /* synthetic */ DeviceSheetScreen.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureEducationSheetKt$FeatureEducationSheet$1$1(boolean z, DeviceSheetScreen.a aVar, InterfaceC8585dra<? super FeatureEducationSheetKt$FeatureEducationSheet$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = z;
        this.d = aVar;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FeatureEducationSheetKt$FeatureEducationSheet$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FeatureEducationSheetKt$FeatureEducationSheet$1$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            if (this.a) {
                DeviceSheetScreen.a aVar = this.d;
                if (aVar instanceof DeviceSheetScreen.a.C0059a) {
                    aVar.e().invoke(DeviceSheetScreen.e.o.e);
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
