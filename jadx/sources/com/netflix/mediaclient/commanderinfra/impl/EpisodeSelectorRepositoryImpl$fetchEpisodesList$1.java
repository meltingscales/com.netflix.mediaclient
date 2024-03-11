package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1304Wn;
import o.InterfaceC1300Wj;
import o.InterfaceC8585dra;
import o.bDW;
import o.dpR;
import o.drX;
import o.dyK;

/* loaded from: classes3.dex */
public final class EpisodeSelectorRepositoryImpl$fetchEpisodesList$1 extends SuspendLambda implements drX<dyK<? super bDW>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1304Wn a;
    private /* synthetic */ Object b;
    int c;
    final /* synthetic */ InterfaceC1300Wj.d d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeSelectorRepositoryImpl$fetchEpisodesList$1(InterfaceC1300Wj.d dVar, C1304Wn c1304Wn, InterfaceC8585dra<? super EpisodeSelectorRepositoryImpl$fetchEpisodesList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dVar;
        this.a = c1304Wn;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyK<? super bDW> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodeSelectorRepositoryImpl$fetchEpisodesList$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        EpisodeSelectorRepositoryImpl$fetchEpisodesList$1 episodeSelectorRepositoryImpl$fetchEpisodesList$1 = new EpisodeSelectorRepositoryImpl$fetchEpisodesList$1(this.d, this.a, interfaceC8585dra);
        episodeSelectorRepositoryImpl$fetchEpisodesList$1.b = obj;
        return episodeSelectorRepositoryImpl$fetchEpisodesList$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a A[Catch: Exception -> 0x0185, TryCatch #1 {Exception -> 0x0185, blocks: (B:23:0x00af, B:27:0x00c0, B:29:0x00c8, B:31:0x00ce, B:33:0x00d4, B:35:0x00da, B:37:0x00e0, B:38:0x00e9, B:40:0x00ef, B:42:0x00fb, B:44:0x0104, B:46:0x0108, B:48:0x010e, B:53:0x011d, B:55:0x0126, B:56:0x0133, B:57:0x013c, B:58:0x013d, B:59:0x0146, B:61:0x0148, B:63:0x014c, B:65:0x0155, B:68:0x017a, B:69:0x0183), top: B:80:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.Wj$d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.dyI] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [o.dyI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchEpisodesList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
