package com.netflix.mediaclient.android.widget;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1202Sp;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class NetflixVisualTimerButton$startTimer$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ C1202Sp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixVisualTimerButton$startTimer$1(C1202Sp c1202Sp, InterfaceC8585dra<? super NetflixVisualTimerButton$startTimer$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c1202Sp;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NetflixVisualTimerButton$startTimer$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new NetflixVisualTimerButton$startTimer$1(this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        int i;
        e = C8586drb.e();
        int i2 = this.b;
        if (i2 == 0) {
            C8556dpz.d(obj);
            i = this.d.c;
            this.b = 1;
            if (C8749dxc.b(i * 1000, this) == e) {
                return e;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.d.a().invoke();
        return dpR.c;
    }
}
