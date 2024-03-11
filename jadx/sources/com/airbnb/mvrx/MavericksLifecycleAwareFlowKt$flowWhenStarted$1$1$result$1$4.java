package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super Object>, Object> {
    int a;
    final /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ Ref.ObjectRef<Boolean> d;
    final /* synthetic */ Ref.ObjectRef<Object> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4(Ref.ObjectRef<Object> objectRef, Ref.ObjectRef<Boolean> objectRef2, Object obj, InterfaceC8585dra<? super MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = objectRef;
        this.d = objectRef2;
        this.b = obj;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(T t, InterfaceC8585dra<Object> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4(this.e, this.d, this.b, interfaceC8585dra);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            T t = (T) this.c;
            this.e.d = t;
            return C8632dsu.c(this.d.d, C8589dre.e(true)) ? t : this.b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
