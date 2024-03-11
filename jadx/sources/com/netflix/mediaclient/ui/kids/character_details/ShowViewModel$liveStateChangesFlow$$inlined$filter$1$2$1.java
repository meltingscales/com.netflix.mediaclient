package com.netflix.mediaclient.ui.kids.character_details;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bYA;

/* loaded from: classes6.dex */
public final class ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 extends ContinuationImpl {
    final /* synthetic */ bYA.e.AnonymousClass2 b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1(bYA.e.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
