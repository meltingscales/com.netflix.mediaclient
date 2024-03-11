package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForSeekChanges$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    int c;
    final /* synthetic */ BifInfraImpl$startListeningForSeekChanges$1.c.AnonymousClass4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BifInfraImpl$startListeningForSeekChanges$1$invokeSuspend$$inlined$map$2$2$1(BifInfraImpl$startListeningForSeekChanges$1.c.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
