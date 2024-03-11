package com.netflix.mediaclient.ui.home.impl.lolomo.items;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ drM<String, dpR> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1(drM<? super String, dpR> drm, String str, InterfaceC8585dra<? super GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = drm;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GameCreator$buildGameFeatureEducationBillboard$1$1$1$2$1(this.e, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            this.e.invoke(this.c);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
