package com.netflix.mediaclient.ui.mylist.impl.video;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7052cot;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C7052cot.a.AnonymousClass4 b;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1(C7052cot.a.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
