package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8797dyx;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyJ;

/* loaded from: classes2.dex */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1 extends SuspendLambda implements drX<C8797dyx<? extends Boolean>, InterfaceC8585dra<? super Object>, Object> {
    final /* synthetic */ drX a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ dyJ d;
    final /* synthetic */ Ref.BooleanRef e;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1(drX drx, InterfaceC8585dra interfaceC8585dra, dyJ dyj, Ref.BooleanRef booleanRef, Object obj) {
        super(2, interfaceC8585dra);
        this.a = drx;
        this.d = dyj;
        this.e = booleanRef;
        this.c = obj;
    }

    public final Object b(Object obj, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1) create(C8797dyx.a(obj), interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1(this.a, interfaceC8585dra, this.d, this.e, this.c);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1.b = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda$2$$inlined$onReceive$1;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(C8797dyx<? extends Boolean> c8797dyx, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return b(c8797dyx.e(), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                C8556dpz.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C8556dpz.d(obj);
        Object e2 = ((C8797dyx) this.b).e();
        if (!C8797dyx.i(e2)) {
            drX drx = this.a;
            Object b = C8797dyx.b(e2);
            this.h = 1;
            Object invoke = drx.invoke(b, this);
            return invoke == e ? e : invoke;
        }
        dyJ.d.e(this.d, null, 1, null);
        this.e.a = true;
        return this.c;
    }
}
