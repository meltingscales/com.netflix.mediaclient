package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4054bUn;
import o.C5843cKk;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LolomoMvRxFragment$invalidate$1$1$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ LolomoMvRxFragment e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoMvRxFragment$invalidate$1$1$2(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC8585dra<? super LolomoMvRxFragment$invalidate$1$1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = lolomoMvRxFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoMvRxFragment$invalidate$1$1$2(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoMvRxFragment$invalidate$1$1$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            this.b = 1;
            obj = this.e.as().get().e(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.e.aq().b(new C4054bUn((C5843cKk) obj, true));
        return dpR.c;
    }
}
