package com.netflix.mediaclient.ui.common.episodes.list;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC5195buF;
import o.InterfaceC8585dra;
import o.bDU;
import o.bDW;
import o.dpR;
import o.drX;
import o.dyK;

/* loaded from: classes4.dex */
public final class EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1 extends SuspendLambda implements drX<dyK<? super bDW>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ InterfaceC5195buF c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    int f;
    final /* synthetic */ String g;
    long h;
    int i;
    int j;
    final /* synthetic */ bDU k;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ Object f13267o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1(InterfaceC5195buF interfaceC5195buF, String str, bDU bdu, String str2, int i, int i2, long j, InterfaceC8585dra<? super EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = interfaceC5195buF;
        this.g = str;
        this.k = bdu;
        this.a = str2;
        this.b = i;
        this.e = i2;
        this.d = j;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyK<? super bDW> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1 episodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1 = new EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1(this.c, this.g, this.k, this.a, this.b, this.e, this.d, interfaceC8585dra);
        episodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1.f13267o = obj;
        return episodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE  (r28 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:16:0x0046 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004a: MOVE  (r29 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:16:0x0046 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199 A[Catch: Exception -> 0x01a6, TryCatch #2 {Exception -> 0x01a6, blocks: (B:73:0x0187, B:77:0x0199, B:78:0x01a5), top: B:92:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.dyI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchEpisodesList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
