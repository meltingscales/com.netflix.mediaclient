package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8897fQ;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [A] */
/* loaded from: classes2.dex */
public final class MavericksViewModelExtensionsKt$_internal1$2<A> extends SuspendLambda implements drX<C8897fQ<A>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ drX<A, InterfaceC8585dra<? super dpR>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksViewModelExtensionsKt$_internal1$2(drX<? super A, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super MavericksViewModelExtensionsKt$_internal1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksViewModelExtensionsKt$_internal1$2 mavericksViewModelExtensionsKt$_internal1$2 = new MavericksViewModelExtensionsKt$_internal1$2(this.d, interfaceC8585dra);
        mavericksViewModelExtensionsKt$_internal1$2.a = obj;
        return mavericksViewModelExtensionsKt$_internal1$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(C8897fQ<A> c8897fQ, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksViewModelExtensionsKt$_internal1$2) create(c8897fQ, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            Object c = ((C8897fQ) this.a).c();
            this.b = 1;
            if (this.d.invoke(c, this) == e) {
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
