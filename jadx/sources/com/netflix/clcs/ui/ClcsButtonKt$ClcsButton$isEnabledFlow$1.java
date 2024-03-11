package com.netflix.clcs.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.FA;
import o.FE;
import o.FY;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dyD;
import o.dyK;

/* loaded from: classes2.dex */
public final class ClcsButtonKt$ClcsButton$isEnabledFlow$1 extends SuspendLambda implements drX<dyK<? super Boolean>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ FA b;
    private /* synthetic */ Object c;
    final /* synthetic */ FY d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClcsButtonKt$ClcsButton$isEnabledFlow$1(FA fa, FY fy, InterfaceC8585dra<? super ClcsButtonKt$ClcsButton$isEnabledFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = fa;
        this.d = fy;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyK<? super Boolean> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClcsButtonKt$ClcsButton$isEnabledFlow$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ClcsButtonKt$ClcsButton$isEnabledFlow$1 clcsButtonKt$ClcsButton$isEnabledFlow$1 = new ClcsButtonKt$ClcsButton$isEnabledFlow$1(this.b, this.d, interfaceC8585dra);
        clcsButtonKt$ClcsButton$isEnabledFlow$1.c = obj;
        return clcsButtonKt$ClcsButton$isEnabledFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.c;
            FE a = this.b.a();
            if (a != null) {
                this.d.a(new drM<Boolean, dpR>() { // from class: com.netflix.clcs.ui.ClcsButtonKt$ClcsButton$isEnabledFlow$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        a(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void a(boolean z) {
                        dyk.d((dyK<Boolean>) Boolean.valueOf(z));
                    }
                }, a);
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
