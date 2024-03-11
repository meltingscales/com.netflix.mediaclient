package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import androidx.core.content.ContextCompat;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1030Lx;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.bAK;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CollectTasteDialogFrag$animateSkipButtonTextColor$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ bAK a;
    final /* synthetic */ CollectTasteDialogFrag d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectTasteDialogFrag$animateSkipButtonTextColor$1(bAK bak, CollectTasteDialogFrag collectTasteDialogFrag, InterfaceC8585dra<? super CollectTasteDialogFrag$animateSkipButtonTextColor$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = bak;
        this.d = collectTasteDialogFrag;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollectTasteDialogFrag$animateSkipButtonTextColor$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollectTasteDialogFrag$animateSkipButtonTextColor$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            this.e = 1;
            if (C8749dxc.b(200L, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.a.l.setTextColor(ContextCompat.getColor(this.d.requireContext(), C1030Lx.d.d));
        return dpR.c;
    }
}
