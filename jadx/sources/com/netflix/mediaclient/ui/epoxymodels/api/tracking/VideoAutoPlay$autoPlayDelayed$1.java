package com.netflix.mediaclient.ui.epoxymodels.api.tracking;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3828bMd;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class VideoAutoPlay$autoPlayDelayed$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AbstractC3828bMd b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAutoPlay$autoPlayDelayed$1(AbstractC3828bMd abstractC3828bMd, InterfaceC8585dra<? super VideoAutoPlay$autoPlayDelayed$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = abstractC3828bMd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new VideoAutoPlay$autoPlayDelayed$1(this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((VideoAutoPlay$autoPlayDelayed$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            this.c = 1;
            if (C8749dxc.b(300L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.b.e();
        return dpR.c;
    }
}
