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

/* loaded from: classes2.dex */
final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2 extends SuspendLambda implements drX<Boolean, InterfaceC8585dra<? super Object>, Object> {
    final /* synthetic */ Ref.ObjectRef<Boolean> a;
    /* synthetic */ boolean b;
    final /* synthetic */ Ref.ObjectRef<Object> c;
    final /* synthetic */ Object d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2(Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Object> objectRef2, Object obj, InterfaceC8585dra<? super MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = objectRef;
        this.c = objectRef2;
        this.d = obj;
    }

    public final Object b(boolean z, InterfaceC8585dra<Object> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2) create(Boolean.valueOf(z), interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2(this.a, this.c, this.d, interfaceC8585dra);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2.b = ((Boolean) obj).booleanValue();
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$result$1$2;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(Boolean bool, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return b(bool.booleanValue(), interfaceC8585dra);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            boolean z = this.b;
            this.a.d = C8589dre.e(z);
            return (C8632dsu.c(this.c.d, this.d) || !z) ? this.d : this.c.d;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
