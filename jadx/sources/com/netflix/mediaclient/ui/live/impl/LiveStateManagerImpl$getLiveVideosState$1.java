package com.netflix.mediaclient.ui.live.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bZM;

/* loaded from: classes4.dex */
public final class LiveStateManagerImpl$getLiveVideosState$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public /* synthetic */ Object l;
    final /* synthetic */ bZM n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStateManagerImpl$getLiveVideosState$1(bZM bzm, InterfaceC8585dra<? super LiveStateManagerImpl$getLiveVideosState$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.n = bzm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.l = obj;
        this.g |= Integer.MIN_VALUE;
        d = this.n.d(null, null, this);
        return d;
    }
}
