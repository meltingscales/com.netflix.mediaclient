package com.apollographql.apollo3.internal;

import com.apollographql.apollo3.internal.FlowsKt$transformWhile$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 extends ContinuationImpl {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ FlowsKt$transformWhile$1.a c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1(FlowsKt$transformWhile$1.a aVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
