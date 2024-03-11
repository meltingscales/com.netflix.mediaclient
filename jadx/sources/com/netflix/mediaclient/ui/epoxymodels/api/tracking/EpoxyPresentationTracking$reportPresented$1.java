package com.netflix.mediaclient.ui.epoxymodels.api.tracking;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3179au;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC3825bMa;
import o.InterfaceC8585dra;
import o.bLU;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class EpoxyPresentationTracking$reportPresented$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AbstractC3179au a;
    final /* synthetic */ bLU b;
    int c;
    final /* synthetic */ InterfaceC3825bMa d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyPresentationTracking$reportPresented$1(long j, bLU blu, InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au, InterfaceC8585dra<? super EpoxyPresentationTracking$reportPresented$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = j;
        this.b = blu;
        this.d = interfaceC3825bMa;
        this.a = abstractC3179au;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpoxyPresentationTracking$reportPresented$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new EpoxyPresentationTracking$reportPresented$1(this.e, this.b, this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.e;
            this.c = 1;
            if (C8749dxc.b(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.b.a(this.d, this.a);
        return dpR.c;
    }
}
