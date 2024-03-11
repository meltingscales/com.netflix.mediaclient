package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.bAB;
import o.bSJ;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int d;
    final /* synthetic */ LolomoMvRxFragment e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC8585dra<? super LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = lolomoMvRxFragment;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8812dzl<bAB> a = this.e.aa().get().a();
            final LolomoMvRxFragment lolomoMvRxFragment = this.e;
            dyQ<? super bAB> dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1.3
                @Override // o.dyQ
                /* renamed from: b */
                public final Object emit(bAB bab, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    if (bab instanceof bAB.a) {
                        LolomoMvRxFragment.this.af_().b(bSJ.class, new bSJ.d(((bAB.a) bab).a()));
                    }
                    return dpR.c;
                }
            };
            this.d = 1;
            if (a.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        throw new KotlinNothingValueException();
    }
}
