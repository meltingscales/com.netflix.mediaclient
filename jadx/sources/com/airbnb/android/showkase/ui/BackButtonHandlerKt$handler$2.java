package com.airbnb.android.showkase.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.L;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class BackButtonHandlerKt$handler$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ L a;
    int c;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackButtonHandlerKt$handler$2(L l, boolean z, InterfaceC8585dra<? super BackButtonHandlerKt$handler$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = l;
        this.e = z;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BackButtonHandlerKt$handler$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new BackButtonHandlerKt$handler$2(this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.a.setEnabled(this.e);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
