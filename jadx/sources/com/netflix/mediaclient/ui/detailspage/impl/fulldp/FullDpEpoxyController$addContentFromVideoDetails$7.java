package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3664bGf;
import o.C8556dpz;
import o.C8586drb;
import o.C9935zP;
import o.InterfaceC5303bwH;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FullDpEpoxyController$addContentFromVideoDetails$7 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ FullDpEpoxyController d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpEpoxyController$addContentFromVideoDetails$7(FullDpEpoxyController fullDpEpoxyController, InterfaceC8585dra<? super FullDpEpoxyController$addContentFromVideoDetails$7> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = fullDpEpoxyController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FullDpEpoxyController$addContentFromVideoDetails$7(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FullDpEpoxyController$addContentFromVideoDetails$7) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5303bwH interfaceC5303bwH;
        AbstractC3664bGf abstractC3664bGf;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            C9935zP c9935zP = this.d.eventBusFactory;
            interfaceC5303bwH = this.d.adsPlan;
            if (interfaceC5303bwH.d()) {
                abstractC3664bGf = AbstractC3664bGf.C3665a.a;
            } else {
                abstractC3664bGf = AbstractC3664bGf.D.c;
            }
            c9935zP.b(AbstractC3664bGf.class, abstractC3664bGf);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
