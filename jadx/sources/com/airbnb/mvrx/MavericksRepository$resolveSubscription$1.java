package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8782dyi;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyR;
import o.dyS;

/* loaded from: classes2.dex */
public final class MavericksRepository$resolveSubscription$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ drX<T, InterfaceC8585dra<? super dpR>, Object> b;
    final /* synthetic */ dyS<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksRepository$resolveSubscription$1(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super MavericksRepository$resolveSubscription$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = dys;
        this.b = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MavericksRepository$resolveSubscription$1(this.e, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksRepository$resolveSubscription$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            this.a = 1;
            if (C8782dyi.b(this) == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        dyS<T> dys = this.e;
        drX<T, InterfaceC8585dra<? super dpR>, Object> drx = this.b;
        this.a = 2;
        if (dyR.d(dys, drx, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
