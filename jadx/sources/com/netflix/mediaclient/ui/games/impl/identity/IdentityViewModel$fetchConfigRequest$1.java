package com.netflix.mediaclient.ui.games.impl.identity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IdentityViewModel$fetchConfigRequest$1 extends ContinuationImpl {
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ IdentityViewModel d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel$fetchConfigRequest$1(IdentityViewModel identityViewModel, InterfaceC8585dra<? super IdentityViewModel$fetchConfigRequest$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = identityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        c = this.d.c(this);
        return c;
    }
}
