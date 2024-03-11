package com.netflix.clcs.ui;

import com.netflix.clcs.models.Toast;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.FY;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.duI;
import o.duM;
import o.dwU;

/* loaded from: classes2.dex */
public final class ClcsToastKt$ClcsToast$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Toast b;
    int c;
    final /* synthetic */ FY e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClcsToastKt$ClcsToast$1(Toast toast, FY fy, InterfaceC8585dra<? super ClcsToastKt$ClcsToast$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = toast;
        this.e = fy;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClcsToastKt$ClcsToast$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ClcsToastKt$ClcsToast$1(this.b, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            duI.b bVar = duI.d;
            long a = duM.a(this.b.f().intValue(), DurationUnit.a);
            this.c = 1;
            if (C8749dxc.c(a, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.e.e(this.b.e());
        return dpR.c;
    }
}
