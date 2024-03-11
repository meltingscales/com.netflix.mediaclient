package com.netflix.mediaclient.ui.collecttaste.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CollectTasteImpl$prefetchCollectTasteMetadata$1 extends ContinuationImpl {
    final /* synthetic */ CollectTasteImpl b;
    int c;
    Object d;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectTasteImpl$prefetchCollectTasteMetadata$1(CollectTasteImpl collectTasteImpl, InterfaceC8585dra<? super CollectTasteImpl$prefetchCollectTasteMetadata$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = collectTasteImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(0, (String) null, this);
    }
}
