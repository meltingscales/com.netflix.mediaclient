package com.netflix.mediaclient.ui.games.impl.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3974bRo;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class GamesAssetFetcherImpl$fetchNGamesAsset$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C3974bRo c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesAssetFetcherImpl$fetchNGamesAsset$1(C3974bRo c3974bRo, InterfaceC8585dra<? super GamesAssetFetcherImpl$fetchNGamesAsset$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c3974bRo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
