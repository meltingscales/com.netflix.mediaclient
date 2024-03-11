package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3664bGf;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FullDpEpoxyController$buildModels$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int d;
    final /* synthetic */ FullDpEpoxyController e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpEpoxyController$buildModels$1(FullDpEpoxyController fullDpEpoxyController, InterfaceC8585dra<? super FullDpEpoxyController$buildModels$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = fullDpEpoxyController;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FullDpEpoxyController$buildModels$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FullDpEpoxyController$buildModels$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            C9935zP c9935zP = this.e.eventBusFactory;
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
            C8632dsu.a(netflixImmutableStatus, "");
            c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.A(netflixImmutableStatus));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
