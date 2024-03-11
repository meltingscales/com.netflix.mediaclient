package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import io.reactivex.Observable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3526bBc;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aLP;
import o.dAU;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class CollectTasteViewModel$fireCollectTasteInteractionTag$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ aLP d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectTasteViewModel$fireCollectTasteInteractionTag$1(aLP alp, String str, InterfaceC8585dra<? super CollectTasteViewModel$fireCollectTasteInteractionTag$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = alp;
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollectTasteViewModel$fireCollectTasteInteractionTag$1(this.d, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollectTasteViewModel$fireCollectTasteInteractionTag$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            Observable e2 = this.d.e(new C3526bBc(this.a));
            this.e = 1;
            if (dAU.e(e2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
