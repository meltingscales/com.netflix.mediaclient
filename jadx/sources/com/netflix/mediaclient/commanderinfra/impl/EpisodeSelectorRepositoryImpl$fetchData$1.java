package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1304Wn;
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
import o.bDW;
import o.dpR;
import o.drX;
import o.dyK;
import o.dyQ;
import o.dyS;

/* loaded from: classes3.dex */
public final class EpisodeSelectorRepositoryImpl$fetchData$1 extends SuspendLambda implements drX<dyK<? super bDW>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ String b;
    int d;
    final /* synthetic */ C1304Wn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeSelectorRepositoryImpl$fetchData$1(String str, C1304Wn c1304Wn, InterfaceC8585dra<? super EpisodeSelectorRepositoryImpl$fetchData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.e = c1304Wn;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dyK<? super bDW> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodeSelectorRepositoryImpl$fetchData$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        EpisodeSelectorRepositoryImpl$fetchData$1 episodeSelectorRepositoryImpl$fetchData$1 = new EpisodeSelectorRepositoryImpl$fetchData$1(this.b, this.e, interfaceC8585dra);
        episodeSelectorRepositoryImpl$fetchData$1.a = obj;
        return episodeSelectorRepositoryImpl$fetchData$1;
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
        aCG c;
        e = C8586drb.e();
        ?? r1 = this.d;
        try {
        } catch (Exception unused) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
            C8632dsu.a(netflixImmutableStatus, "");
            bDW.c cVar = new bDW.c(netflixImmutableStatus);
            this.a = null;
            this.d = 2;
            if (r1.a(cVar, this) == e) {
                return e;
            }
        }
        if (r1 == 0) {
            C8556dpz.d(obj);
            final dyK dyk = (dyK) this.a;
            C1381Zf c1381Zf = new C1381Zf(Integer.parseInt(this.b));
            c = this.e.c();
            d dVar = new d(aCE.d.e(c, c1381Zf, RequestPriority.a, false, 4, null));
            final C1304Wn c1304Wn = this.e;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1.2
                @Override // o.dyQ
                /* renamed from: c */
                public final Object emit(C8954gU<C1381Zf.e> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e2;
                    Object e3;
                    Object e4;
                    Object e5;
                    Object e6;
                    C1381Zf.d b;
                    List<C1381Zf.b> a = ((C1381Zf.e) aCK.e(c8954gU)).a();
                    if (a == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    C1381Zf.b bVar = a.get(0);
                    C2553aiJ c2 = (bVar == null || (b = bVar.b()) == null) ? null : b.c();
                    if (c2 == null) {
                        dyK<bDW> dyk2 = dyk;
                        NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ai;
                        C8632dsu.a(netflixImmutableStatus2, "");
                        Object a2 = dyk2.a(new bDW.c(netflixImmutableStatus2), interfaceC8585dra);
                        e6 = C8586drb.e();
                        return a2 == e6 ? a2 : dpR.c;
                    }
                    aEA aea = new aEA(c2);
                    List<InterfaceC5195buF> at = aea.at();
                    if (!aea.isAvailableToPlay()) {
                        dyK<bDW> dyk3 = dyk;
                        NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.ai;
                        C8632dsu.a(netflixImmutableStatus3, "");
                        Object a3 = dyk3.a(new bDW.c(netflixImmutableStatus3), interfaceC8585dra);
                        e5 = C8586drb.e();
                        return a3 == e5 ? a3 : dpR.c;
                    } else if (at == null || at.isEmpty()) {
                        e2 = c1304Wn.e(dyk, aea, interfaceC8585dra);
                        e3 = C8586drb.e();
                        return e2 == e3 ? e2 : dpR.c;
                    } else {
                        Object a4 = dyk.a(new bDW.e(aea.bV_(), at), interfaceC8585dra);
                        e4 = C8586drb.e();
                        return a4 == e4 ? a4 : dpR.c;
                    }
                }
            };
            this.a = dyk;
            this.d = 1;
            r1 = dyk;
            if (dVar.collect(dyq, this) == e) {
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

    /* loaded from: classes3.dex */
    public static final class d implements dyS<C8954gU<C1381Zf.e>> {
        final /* synthetic */ dyS b;

        public d(dyS dys) {
            this.b = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<C1381Zf.e>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass5(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$d$5  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass5<T> implements dyQ {
            final /* synthetic */ dyQ e;

            public AnonymousClass5(dyQ dyq) {
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.e
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
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
                    r0.c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1.d.AnonymousClass5.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
