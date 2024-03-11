package com.netflix.mediaclient.ui.epoxymodels.api.tracking;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3179au;
import o.AbstractC3828bMd;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.bLR;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class VideoAutoPlay$requestPlay$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ bLR<AbstractC3179au> a;
    final /* synthetic */ AbstractC3179au b;
    final /* synthetic */ long c;
    int d;
    final /* synthetic */ AbstractC3828bMd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAutoPlay$requestPlay$1(long j, AbstractC3828bMd abstractC3828bMd, bLR<AbstractC3179au> blr, AbstractC3179au abstractC3179au, InterfaceC8585dra<? super VideoAutoPlay$requestPlay$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = j;
        this.e = abstractC3828bMd;
        this.a = blr;
        this.b = abstractC3179au;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new VideoAutoPlay$requestPlay$1(this.c, this.e, this.a, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((VideoAutoPlay$requestPlay$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            long j = this.c;
            this.d = 1;
            if (C8749dxc.b(j, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.e.d(this.a, this.b);
        return dpR.c;
    }
}
