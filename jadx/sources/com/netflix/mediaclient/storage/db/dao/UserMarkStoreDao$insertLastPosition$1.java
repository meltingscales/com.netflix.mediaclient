package com.netflix.mediaclient.storage.db.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC5326bwe;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class UserMarkStoreDao$insertLastPosition$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public Object b;
    public int c;
    public Object e;

    public UserMarkStoreDao$insertLastPosition$1(InterfaceC8585dra<? super UserMarkStoreDao$insertLastPosition$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return InterfaceC5326bwe.a.d(null, null, this);
    }
}
