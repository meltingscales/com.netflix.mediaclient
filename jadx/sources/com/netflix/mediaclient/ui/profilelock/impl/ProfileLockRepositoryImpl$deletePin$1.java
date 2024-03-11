package com.netflix.mediaclient.ui.profilelock.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProfileLockRepositoryImpl$deletePin$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    final /* synthetic */ ProfileLockRepositoryImpl b;
    int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLockRepositoryImpl$deletePin$1(ProfileLockRepositoryImpl profileLockRepositoryImpl, InterfaceC8585dra<? super ProfileLockRepositoryImpl$deletePin$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = profileLockRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
