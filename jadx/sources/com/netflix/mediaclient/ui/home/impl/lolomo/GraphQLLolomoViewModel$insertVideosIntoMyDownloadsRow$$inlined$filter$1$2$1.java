package com.netflix.mediaclient.ui.home.impl.lolomo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bTF;

/* loaded from: classes6.dex */
public final class GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int b;
    final /* synthetic */ bTF.b.AnonymousClass4 d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1(bTF.b.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
