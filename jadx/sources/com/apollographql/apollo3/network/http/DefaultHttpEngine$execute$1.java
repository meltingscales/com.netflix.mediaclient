package com.apollographql.apollo3.network.http;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9100jH;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class DefaultHttpEngine$execute$1 extends ContinuationImpl {
    final /* synthetic */ C9100jH a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHttpEngine$execute$1(C9100jH c9100jH, InterfaceC8585dra<? super DefaultHttpEngine$execute$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c9100jH;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.a.c(null, this);
    }
}
