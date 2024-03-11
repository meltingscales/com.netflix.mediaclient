package com.netflix.mediaclient.ui.home;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class HomeActivityKt$fetchUxConfig$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ HomeActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityKt$fetchUxConfig$1(HomeActivity homeActivity, InterfaceC8585dra<? super HomeActivityKt$fetchUxConfig$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new HomeActivityKt$fetchUxConfig$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HomeActivityKt$fetchUxConfig$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            this.a = 1;
            if (this.d.uxConfig.get().a(false, this) == e) {
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
