package com.apollographql.apollo3.cache.normalized;

import com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NormalizedCache$watch$1$1$emit$1 extends ContinuationImpl {
    Object a;
    int b;
    final /* synthetic */ NormalizedCache$watch$1.AnonymousClass1<T> c;
    Object d;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NormalizedCache$watch$1$1$emit$1(NormalizedCache$watch$1.AnonymousClass1<? super T> anonymousClass1, InterfaceC8585dra<? super NormalizedCache$watch$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
