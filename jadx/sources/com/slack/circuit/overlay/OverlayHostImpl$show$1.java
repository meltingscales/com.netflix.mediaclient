package com.slack.circuit.overlay;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dmU;

/* loaded from: classes5.dex */
public final class OverlayHostImpl$show$1<T> extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    final /* synthetic */ dmU g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayHostImpl$show$1(dmU dmu, InterfaceC8585dra<? super OverlayHostImpl$show$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.g = dmu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}
