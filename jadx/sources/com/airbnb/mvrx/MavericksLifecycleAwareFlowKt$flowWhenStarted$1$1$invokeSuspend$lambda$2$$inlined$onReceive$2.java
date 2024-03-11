package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8797dyx;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2<T> extends SuspendLambda implements drX<C8797dyx<? extends T>, InterfaceC8585dra<? super Object>, Object> {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ Ref.BooleanRef c;
    final /* synthetic */ drX d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2(drX drx, InterfaceC8585dra interfaceC8585dra, Ref.BooleanRef booleanRef, Object obj) {
        super(2, interfaceC8585dra);
        this.d = drx;
        this.c = booleanRef;
        this.e = obj;
    }

    public final Object b(Object obj, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2) create(C8797dyx.a(obj), interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2(this.d, interfaceC8585dra, this.c, this.e);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2.a = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$2;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return b(((C8797dyx) obj).e(), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                C8556dpz.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C8556dpz.d(obj);
        Object e2 = ((C8797dyx) this.a).e();
        if (!C8797dyx.i(e2)) {
            drX drx = this.d;
            Object b = C8797dyx.b(e2);
            this.b = 1;
            Object invoke = drx.invoke(b, this);
            return invoke == e ? e : invoke;
        }
        this.c.a = true;
        return this.e;
    }
}
