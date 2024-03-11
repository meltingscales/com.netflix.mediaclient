package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ BifInfraImpl$startListeningForSeekChanges$1.a.AnonymousClass1 c;
    /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$1$2$1(BifInfraImpl$startListeningForSeekChanges$1.a.AnonymousClass1 anonymousClass1, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
