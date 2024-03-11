package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8893fM;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* loaded from: classes2.dex */
public final class MavericksViewModelExtensionsKt$_internal3$2<A, B, C> extends SuspendLambda implements drX<C8893fM<A, B, C>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8613dsb<A, B, C, InterfaceC8585dra<? super dpR>, Object> a;
    /* synthetic */ Object b;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MavericksViewModelExtensionsKt$_internal3$2(InterfaceC8613dsb<? super A, ? super B, ? super C, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8613dsb, InterfaceC8585dra<? super MavericksViewModelExtensionsKt$_internal3$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC8613dsb;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(C8893fM<A, B, C> c8893fM, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MavericksViewModelExtensionsKt$_internal3$2) create(c8893fM, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MavericksViewModelExtensionsKt$_internal3$2 mavericksViewModelExtensionsKt$_internal3$2 = new MavericksViewModelExtensionsKt$_internal3$2(this.a, interfaceC8585dra);
        mavericksViewModelExtensionsKt$_internal3$2.b = obj;
        return mavericksViewModelExtensionsKt$_internal3$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            C8893fM c8893fM = (C8893fM) this.b;
            Object b = c8893fM.b();
            Object d = c8893fM.d();
            Object c = c8893fM.c();
            this.d = 1;
            if (this.a.invoke(b, d, c, this) == e) {
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
