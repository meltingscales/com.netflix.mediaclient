package com.netflix.mediaclient.hendrixconfig.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.aFO;

/* loaded from: classes3.dex */
public final class JsonDataStore$updateData$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public Object c;
    public int d;
    public Object e;
    final /* synthetic */ aFO<T> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDataStore$updateData$1(aFO<T> afo, InterfaceC8585dra<? super JsonDataStore$updateData$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.j = afo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
