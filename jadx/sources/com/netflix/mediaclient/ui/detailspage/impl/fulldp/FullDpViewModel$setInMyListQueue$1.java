package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3723bIg;
import o.C3726bIj;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC3663bGe;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class FullDpViewModel$setInMyListQueue$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ TrackingInfoHolder c;
    final /* synthetic */ C3726bIj d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpViewModel$setInMyListQueue$1(C3726bIj c3726bIj, String str, TrackingInfoHolder trackingInfoHolder, boolean z, InterfaceC8585dra<? super FullDpViewModel$setInMyListQueue$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c3726bIj;
        this.e = str;
        this.c = trackingInfoHolder;
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FullDpViewModel$setInMyListQueue$1(this.d, this.e, this.c, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FullDpViewModel$setInMyListQueue$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3663bGe interfaceC3663bGe;
        C3723bIg c3723bIg;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC3663bGe = this.d.d;
            String str = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            boolean z = this.b;
            this.a = 1;
            if (interfaceC3663bGe.c(str, trackingInfoHolder, z, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            ((Result) obj).c();
        }
        c3723bIg = this.d.e;
        c3723bIg.c();
        return dpR.c;
    }
}
