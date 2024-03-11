package com.netflix.hawkins.consumer.component.tooltip;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1021Lo;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class HawkinsTooltipPopUpKt$HawkinsTooltipPopup$3$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ long a;
    int c;
    final /* synthetic */ MutableState<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HawkinsTooltipPopUpKt$HawkinsTooltipPopup$3$1$1(long j, MutableState<Boolean> mutableState, InterfaceC8585dra<? super HawkinsTooltipPopUpKt$HawkinsTooltipPopup$3$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = j;
        this.e = mutableState;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HawkinsTooltipPopUpKt$HawkinsTooltipPopup$3$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new HawkinsTooltipPopUpKt$HawkinsTooltipPopup$3$1$1(this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        boolean e2;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.a;
            this.c = 1;
            if (C8749dxc.c(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        e2 = C1021Lo.e(this.e);
        if (e2) {
            C1021Lo.b(this.e, false);
        }
        return dpR.c;
    }
}
