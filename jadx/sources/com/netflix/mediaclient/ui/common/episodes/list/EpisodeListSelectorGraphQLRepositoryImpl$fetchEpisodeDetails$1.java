package com.netflix.mediaclient.ui.common.episodes.list;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.bDU;
import o.bDW;
import o.dpR;
import o.drX;
import o.dyK;

/* loaded from: classes4.dex */
public final class EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1 extends SuspendLambda implements drX<dyK<? super bDW>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ String b;
    int c;
    final /* synthetic */ bDU d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1(String str, bDU bdu, InterfaceC8585dra<? super EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.d = bdu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1 episodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1 = new EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1(this.b, this.d, interfaceC8585dra);
        episodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1.a = obj;
        return episodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dyK<? super bDW> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.dyI] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodeDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
