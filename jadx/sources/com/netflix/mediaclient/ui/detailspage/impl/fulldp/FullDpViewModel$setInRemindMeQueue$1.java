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
public final class FullDpViewModel$setInRemindMeQueue$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ TrackingInfoHolder d;
    final /* synthetic */ C3726bIj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpViewModel$setInRemindMeQueue$1(C3726bIj c3726bIj, String str, TrackingInfoHolder trackingInfoHolder, boolean z, InterfaceC8585dra<? super FullDpViewModel$setInRemindMeQueue$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c3726bIj;
        this.c = str;
        this.d = trackingInfoHolder;
        this.a = z;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FullDpViewModel$setInRemindMeQueue$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FullDpViewModel$setInRemindMeQueue$1(this.e, this.c, this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3663bGe interfaceC3663bGe;
        C3723bIg c3723bIg;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC3663bGe = this.e.d;
            String str = this.c;
            TrackingInfoHolder trackingInfoHolder = this.d;
            boolean z = this.a;
            this.b = 1;
            if (interfaceC3663bGe.a(str, trackingInfoHolder, z, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            ((Result) obj).c();
        }
        c3723bIg = this.e.e;
        c3723bIg.e();
        return dpR.c;
    }
}
