package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5989cPw;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class BlockedTitlesViewModel$searchItem$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C5989cPw c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedTitlesViewModel$searchItem$1(C5989cPw c5989cPw, InterfaceC8585dra<? super BlockedTitlesViewModel$searchItem$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c5989cPw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, this);
    }
}