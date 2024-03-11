package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5989cPw;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class BlockedTitlesViewModel$addTitleProtection$1 extends ContinuationImpl {
    final /* synthetic */ C5989cPw b;
    public int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedTitlesViewModel$addTitleProtection$1(C5989cPw c5989cPw, InterfaceC8585dra<? super BlockedTitlesViewModel$addTitleProtection$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c5989cPw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, this);
    }
}
