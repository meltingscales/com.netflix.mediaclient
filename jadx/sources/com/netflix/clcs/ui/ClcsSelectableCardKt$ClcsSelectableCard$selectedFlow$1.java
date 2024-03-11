package com.netflix.clcs.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0880Gd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.FV;
import o.FY;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dyD;
import o.dyK;

/* loaded from: classes2.dex */
public final class ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1 extends SuspendLambda implements drX<dyK<? super Boolean>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FY a;
    private /* synthetic */ Object b;
    int d;
    final /* synthetic */ FV e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1(FV fv, FY fy, InterfaceC8585dra<? super ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = fv;
        this.a = fy;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyK<? super Boolean> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1 clcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1 = new ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1(this.e, this.a, interfaceC8585dra);
        clcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1.b = obj;
        return clcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.b;
            C0880Gd e2 = this.e.e();
            if (e2 != null) {
                FY fy = this.a;
                final FV fv = this.e;
                fy.d(new drM<Object, dpR>() { // from class: com.netflix.clcs.ui.ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Object obj2) {
                        c(obj2);
                        return dpR.c;
                    }

                    public final void c(Object obj2) {
                        dyk.d((dyK<Boolean>) Boolean.valueOf(C8632dsu.c(obj2, (Object) fv.j())));
                    }
                }, e2);
            }
            this.d = 1;
            if (dyD.d(dyk, null, this, 1, null) == e) {
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
