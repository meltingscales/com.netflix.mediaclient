package com.netflix.android.widgetry.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C9869yC;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class TimeoutBottomToastKt$waitForAnimationToEnd$1 extends ContinuationImpl {
    public long a;
    public int b;
    public long c;
    public Object d;
    public /* synthetic */ Object e;

    public TimeoutBottomToastKt$waitForAnimationToEnd$1(InterfaceC8585dra<? super TimeoutBottomToastKt$waitForAnimationToEnd$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        a = C9869yC.a(null, 0L, 0L, this);
        return a;
    }
}
