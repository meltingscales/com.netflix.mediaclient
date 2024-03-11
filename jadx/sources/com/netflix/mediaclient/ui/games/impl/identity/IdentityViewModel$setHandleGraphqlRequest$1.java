package com.netflix.mediaclient.ui.games.impl.identity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IdentityViewModel$setHandleGraphqlRequest$1 extends ContinuationImpl {
    Object a;
    int b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ IdentityViewModel i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel$setHandleGraphqlRequest$1(IdentityViewModel identityViewModel, InterfaceC8585dra<? super IdentityViewModel$setHandleGraphqlRequest$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.i = identityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        a = this.i.a((String) null, this);
        return a;
    }
}
