package com.netflix.clcs.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0880Gd;
import o.C8556dpz;
import o.C8586drb;
import o.FJ;
import o.FQ;
import o.FY;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dyD;
import o.dyK;

/* loaded from: classes2.dex */
public final class ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1 extends SuspendLambda implements drX<dyK<? super String>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ FQ b;
    private /* synthetic */ Object d;
    final /* synthetic */ FY e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1(FQ fq, FY fy, InterfaceC8585dra<? super ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = fq;
        this.e = fy;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dyK<? super String> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1 clcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1 = new ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1(this.b, this.e, interfaceC8585dra);
        clcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1.d = obj;
        return clcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.d;
            C0880Gd g = this.b.g();
            if (g != null) {
                this.e.a((drM<? super String, dpR>) new drM<String, dpR>() { // from class: com.netflix.clcs.ui.ClcsPhoneInputKt$ClcsPhoneInput$errorMessageFlow$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(String str) {
                        d(str);
                        return dpR.c;
                    }

                    public final void d(String str) {
                        dyk.d((dyK<String>) str);
                    }
                }, (FJ) g);
            }
            this.a = 1;
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
