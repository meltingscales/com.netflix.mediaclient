package com.apollographql.apollo3.cache.normalized.internal;

import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9028hp;
import o.C9044iE;
import o.C9053iN;
import o.C9063iX;
import o.InterfaceC8585dra;
import o.InterfaceC8991hE;
import o.InterfaceC8991hE.b;

/* loaded from: classes2.dex */
public final class DefaultApolloStore$writeOperationWithRecords$1<D extends InterfaceC8991hE.b> extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    final /* synthetic */ C9063iX d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultApolloStore$writeOperationWithRecords$1(C9063iX c9063iX, InterfaceC8585dra<? super DefaultApolloStore$writeOperationWithRecords$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = c9063iX;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.d((InterfaceC8991hE<InterfaceC8991hE<D>>) null, (InterfaceC8991hE<D>) null, (C9044iE) null, false, (C9028hp) null, (InterfaceC8585dra<? super Pair<? extends Set<C9053iN>, ? extends Set<String>>>) this);
    }
}
