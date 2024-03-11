package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyK;
import o.dyQ;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1<T> extends SuspendLambda implements drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ dyS<T> d;
    private /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1(dyS<? extends T> dys, InterfaceC8585dra<? super MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1(this.d, interfaceC8585dra);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1.e = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.e;
            dyS<T> dys = this.d;
            dyQ<? super T> dyq = new dyQ() { // from class: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1.4
                @Override // o.dyQ
                public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e2;
                    Object a = dyk.a(t, interfaceC8585dra);
                    e2 = C8586drb.e();
                    return a == e2 ? a : dpR.c;
                }
            };
            this.a = 1;
            if (dys.collect(dyq, this) == e) {
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
