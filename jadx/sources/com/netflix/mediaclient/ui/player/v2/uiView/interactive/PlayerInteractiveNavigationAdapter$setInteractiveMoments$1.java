package com.netflix.mediaclient.ui.player.v2.uiView.interactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.cHZ;

/* loaded from: classes4.dex */
public final class PlayerInteractiveNavigationAdapter$setInteractiveMoments$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    final /* synthetic */ cHZ h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveNavigationAdapter$setInteractiveMoments$1(cHZ chz, InterfaceC8585dra<? super PlayerInteractiveNavigationAdapter$setInteractiveMoments$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.h = chz;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.e |= Integer.MIN_VALUE;
        return this.h.a(null, false, this);
    }
}
