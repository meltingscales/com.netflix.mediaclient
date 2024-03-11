package com.netflix.mediaclient.ui.games.impl.identity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IdentityViewModel$checkHandleGraphqlRequest$1 extends ContinuationImpl {
    int a;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ IdentityViewModel e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel$checkHandleGraphqlRequest$1(IdentityViewModel identityViewModel, InterfaceC8585dra<? super IdentityViewModel$checkHandleGraphqlRequest$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = identityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        c = this.e.c((String) null, this);
        return c;
    }
}
