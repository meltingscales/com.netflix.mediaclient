package com.netflix.mediaclient.util;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8130dea;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
final class CdxProfileSwitchHelper$profileSelect$2$splashScreen$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ InterfaceC5283bvo b;
    final /* synthetic */ C8130dea e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdxProfileSwitchHelper$profileSelect$2$splashScreen$1(C8130dea c8130dea, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super CdxProfileSwitchHelper$profileSelect$2$splashScreen$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c8130dea;
        this.b = interfaceC5283bvo;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CdxProfileSwitchHelper$profileSelect$2$splashScreen$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CdxProfileSwitchHelper$profileSelect$2$splashScreen$1(this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object b;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            C8130dea c8130dea = this.e;
            InterfaceC5283bvo interfaceC5283bvo = this.b;
            this.a = 1;
            b = c8130dea.b(interfaceC5283bvo, this);
            if (b == e) {
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
