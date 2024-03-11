package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CollectTasteDialogFrag$dismissWithDelay$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ CollectTasteDialogFrag c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectTasteDialogFrag$dismissWithDelay$1(CollectTasteDialogFrag collectTasteDialogFrag, InterfaceC8585dra<? super CollectTasteDialogFrag$dismissWithDelay$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = collectTasteDialogFrag;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollectTasteDialogFrag$dismissWithDelay$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollectTasteDialogFrag$dismissWithDelay$1(this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            this.a = 1;
            if (C8749dxc.b(500L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.c.r();
        this.c.dismissAllowingStateLoss();
        return dpR.c;
    }
}
