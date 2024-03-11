package com.netflix.android.widgetry.utils.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9879yM;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class ControlledRunner$cancelPreviousThenRun$1 extends ContinuationImpl {
    final /* synthetic */ C9879yM<T> a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlledRunner$cancelPreviousThenRun$1(C9879yM<T> c9879yM, InterfaceC8585dra<? super ControlledRunner$cancelPreviousThenRun$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c9879yM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.c(null, this);
    }
}
