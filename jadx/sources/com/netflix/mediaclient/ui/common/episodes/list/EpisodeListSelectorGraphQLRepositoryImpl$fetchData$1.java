package com.netflix.mediaclient.ui.common.episodes.list;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1381Zf;
import o.C2553aiJ;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5195buF;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aEA;
import o.bDU;
import o.bDW;
import o.dpR;
import o.drX;
import o.dyK;
import o.dyQ;
import o.dyS;

/* loaded from: classes4.dex */
public final class EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1 extends SuspendLambda implements drX<dyK<? super bDW>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ String b;
    final /* synthetic */ bDU c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1(String str, bDU bdu, InterfaceC8585dra<? super EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.c = bdu;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dyK<? super bDW> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1 episodeListSelectorGraphQLRepositoryImpl$fetchData$1 = new EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1(this.b, this.c, interfaceC8585dra);
        episodeListSelectorGraphQLRepositoryImpl$fetchData$1.a = obj;
        return episodeListSelectorGraphQLRepositoryImpl$fetchData$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.dyI] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        e = C8586drb.e();
        ?? r1 = this.e;
        try {
        } catch (Exception unused) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
            C8632dsu.a(netflixImmutableStatus, "");
            bDW.c cVar = new bDW.c(netflixImmutableStatus);
            this.a = null;
            this.e = 2;
            if (r1.a(cVar, this) == e) {
                return e;
            }
        }
        if (r1 == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.a;
            C1381Zf c1381Zf = new C1381Zf(Integer.parseInt(this.b));
            acg = this.c.h;
            b bVar = new b(aCE.d.e(acg, c1381Zf, RequestPriority.a, false, 4, null));
            final bDU bdu = this.c;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1.5
                @Override // o.dyQ
                /* renamed from: b */
                public final Object emit(C8954gU<C1381Zf.e> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object d;
                    Object e2;
                    Object e3;
                    Object e4;
                    Object e5;
                    C1381Zf.d b2;
                    List<C1381Zf.b> a = ((C1381Zf.e) aCK.e(c8954gU)).a();
                    if (a == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    C1381Zf.b bVar2 = a.get(0);
                    C2553aiJ c = (bVar2 == null || (b2 = bVar2.b()) == null) ? null : b2.c();
                    if (c == null) {
                        dyK<bDW> dyk2 = dyk;
                        NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ai;
                        C8632dsu.a(netflixImmutableStatus2, "");
                        Object a2 = dyk2.a(new bDW.c(netflixImmutableStatus2), interfaceC8585dra);
                        e5 = C8586drb.e();
                        return a2 == e5 ? a2 : dpR.c;
                    }
                    aEA aea = new aEA(c);
                    List<InterfaceC5195buF> at = aea.at();
                    if (!aea.isAvailableToPlay()) {
                        dyK<bDW> dyk3 = dyk;
                        NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.ai;
                        C8632dsu.a(netflixImmutableStatus3, "");
                        Object a3 = dyk3.a(new bDW.c(netflixImmutableStatus3), interfaceC8585dra);
                        e4 = C8586drb.e();
                        return a3 == e4 ? a3 : dpR.c;
                    } else if (at == null || at.isEmpty()) {
                        d = bdu.d(dyk, aea, interfaceC8585dra);
                        e2 = C8586drb.e();
                        return d == e2 ? d : dpR.c;
                    } else {
                        Object a4 = dyk.a(new bDW.e(aea.bV_(), at), interfaceC8585dra);
                        e3 = C8586drb.e();
                        return a4 == e3 ? a4 : dpR.c;
                    }
                }
            };
            this.a = dyk;
            this.e = 1;
            r1 = dyk;
            if (bVar.collect(dyq, this) == e) {
                return e;
            }
        } else if (r1 != 1) {
            if (r1 == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dyK dyk2 = (dyK) this.a;
            C8556dpz.d(obj);
            r1 = dyk2;
        }
        return dpR.c;
    }

    /* loaded from: classes4.dex */
    public static final class b implements dyS<C8954gU<C1381Zf.e>> {
        final /* synthetic */ dyS a;

        public b(dyS dys) {
            this.a = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<C1381Zf.e>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$b$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ e;

            public AnonymousClass2(dyQ dyq) {
                this.e = dyq;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.e
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.e
                    r2 = r5
                    o.gU r2 = (o.C8954gU) r2
                    com.apollographql.apollo3.exception.ApolloException r2 = r2.a
                    if (r2 != 0) goto L46
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1.b.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
