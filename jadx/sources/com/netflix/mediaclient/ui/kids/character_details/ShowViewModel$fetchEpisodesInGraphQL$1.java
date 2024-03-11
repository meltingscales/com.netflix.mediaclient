package com.netflix.mediaclient.ui.kids.character_details;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.model.leafs.Bookmark;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1356Yn;
import o.C1567aGb;
import o.C2356aeh;
import o.C2364aep;
import o.C2368aet;
import o.C2865aoD;
import o.C8556dpz;
import o.C8572dqo;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5195buF;
import o.InterfaceC5225buj;
import o.InterfaceC5227bul;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.aEN;
import o.bYA;
import o.dpR;
import o.drX;
import o.dyK;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class ShowViewModel$fetchEpisodesInGraphQL$1 extends SuspendLambda implements drX<dyK<? super Pair<? extends List<InterfaceC5227bul>, ? extends Status>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ List<InterfaceC5227bul> a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    int d;
    final /* synthetic */ InterfaceC5195buF e;
    private /* synthetic */ Object f;
    final /* synthetic */ bYA j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowViewModel$fetchEpisodesInGraphQL$1(int i, List<? extends InterfaceC5227bul> list, InterfaceC5195buF interfaceC5195buF, bYA bya, int i2, InterfaceC8585dra<? super ShowViewModel$fetchEpisodesInGraphQL$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = i;
        this.a = list;
        this.e = interfaceC5195buF;
        this.j = bya;
        this.b = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ShowViewModel$fetchEpisodesInGraphQL$1 showViewModel$fetchEpisodesInGraphQL$1 = new ShowViewModel$fetchEpisodesInGraphQL$1(this.c, this.a, this.e, this.j, this.b, interfaceC8585dra);
        showViewModel$fetchEpisodesInGraphQL$1.f = obj;
        return showViewModel$fetchEpisodesInGraphQL$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyK<? super Pair<? extends List<InterfaceC5227bul>, ? extends Status>> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ShowViewModel$fetchEpisodesInGraphQL$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* loaded from: classes4.dex */
    public static final class a implements dyS<C8954gU<C1356Yn.a>> {
        final /* synthetic */ dyS c;

        public a(dyS dys) {
            this.c = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<C1356Yn.a>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$a$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ d;

            public AnonymousClass2(dyQ dyq) {
                this.d = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
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
                    o.dyQ r6 = r4.d
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
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1.a.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements dyS<C8954gU<C1356Yn.a>> {
        final /* synthetic */ dyS c;

        public d(dyS dys) {
            this.c = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<C1356Yn.a>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$d$4  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ e;

            public AnonymousClass4(dyQ dyq) {
                this.e = dyq;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r12, o.InterfaceC8585dra r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1
                    if (r0 == 0) goto L13
                    r0 = r13
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1 r0 = (com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1 r0 = new com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1
                    r0.<init>(r11, r13)
                L18:
                    java.lang.Object r13 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    o.C8556dpz.d(r13)
                    goto Ld5
                L2a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L32:
                    o.C8556dpz.d(r13)
                    o.dyQ r13 = r11.e
                    r2 = r12
                    o.gU r2 = (o.C8954gU) r2
                    o.hE$b r2 = o.aCK.e(r2)
                    o.Yn$a r2 = (o.C1356Yn.a) r2
                    java.util.List r2 = r2.a()
                    java.lang.String r4 = "Required value was null."
                    if (r2 == 0) goto Le2
                    r5 = 0
                    java.lang.Object r2 = r2.get(r5)
                    o.Yn$e r2 = (o.C1356Yn.e) r2
                    r6 = 0
                    if (r2 == 0) goto L69
                    o.aet r2 = r2.c()
                    if (r2 == 0) goto L69
                    o.aet$a r2 = r2.c()
                    if (r2 == 0) goto L69
                    o.aet$e r2 = r2.d()
                    if (r2 == 0) goto L69
                    java.util.List r2 = r2.b()
                    goto L6a
                L69:
                    r2 = r6
                L6a:
                    if (r2 == 0) goto Ld8
                    kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
                    r7.<init>()
                    r7.a = r3
                    java.util.Iterator r2 = r2.iterator()
                L77:
                    boolean r8 = r2.hasNext()
                    if (r8 == 0) goto Lc8
                    java.lang.Object r8 = r2.next()
                    o.aet$c r8 = (o.C2368aet.c) r8
                    if (r8 == 0) goto L8a
                    o.aet$b r9 = r8.b()
                    goto L8b
                L8a:
                    r9 = r6
                L8b:
                    if (r8 == 0) goto L98
                    o.aet$b r8 = r8.b()
                    if (r8 == 0) goto L98
                    o.aeh r8 = r8.e()
                    goto L99
                L98:
                    r8 = r6
                L99:
                    if (r8 == 0) goto Lbe
                    java.lang.Boolean r8 = r8.j()
                    java.lang.Boolean r10 = o.C8589dre.e(r5)
                    boolean r8 = o.C8632dsu.c(r8, r10)
                    if (r8 == 0) goto L77
                    if (r9 == 0) goto L77
                    j$.time.Instant r8 = r9.c()
                    if (r8 == 0) goto L77
                    j$.time.Instant r9 = j$.time.Instant.a()
                    boolean r8 = r8.e(r9)
                    if (r8 != r3) goto L77
                    r7.a = r5
                    goto L77
                Lbe:
                    java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                    java.lang.String r13 = r4.toString()
                    r12.<init>(r13)
                    throw r12
                Lc8:
                    boolean r2 = r7.a
                    if (r2 == 0) goto Ld5
                    r0.b = r3
                    java.lang.Object r12 = r13.emit(r12, r0)
                    if (r12 != r1) goto Ld5
                    return r1
                Ld5:
                    o.dpR r12 = o.dpR.c
                    return r12
                Ld8:
                    java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                    java.lang.String r13 = r4.toString()
                    r12.<init>(r13)
                    throw r12
                Le2:
                    java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                    java.lang.String r13 = r4.toString()
                    r12.<init>(r13)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1.d.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, o.dyI] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyK dyk;
        String str;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aCG acg;
        Object c2;
        List<InterfaceC5227bul> list;
        int d2;
        List n;
        BookmarkStore bookmarkStore;
        C1567aGb c1567aGb;
        C2368aet.b b;
        C2368aet.b b2;
        C2368aet c3;
        C2368aet.a c4;
        C2368aet.e d3;
        e = C8586drb.e();
        ?? r2 = this.d;
        try {
        } catch (Exception unused) {
            Pair pair = new Pair(null, InterfaceC1078Nw.ad);
            this.f = null;
            this.d = 3;
            if (r2.a(pair, this) == e) {
                return e;
            }
        }
        if (r2 == 0) {
            C8556dpz.d(obj);
            dyk = (dyK) this.f;
            if (this.c <= 0 || (list = this.a) == null || list.isEmpty()) {
                str = null;
            } else {
                InterfaceC5227bul interfaceC5227bul = this.a.get(this.c - 1);
                C8632dsu.d(interfaceC5227bul);
                str = ((InterfaceC5225buj) interfaceC5227bul).at();
            }
            String id = this.e.getId();
            C8632dsu.a(id, "");
            int parseInt = Integer.parseInt(id);
            adb = this.j.g;
            adb2 = this.j.g;
            C2865aoD c5 = aDB.c(adb, adb2.d(), null, 2, null);
            int i = this.b;
            int i2 = this.c;
            adb3 = this.j.g;
            adb4 = this.j.g;
            C1356Yn c1356Yn = new C1356Yn(parseInt, c5, str, (i - i2) + 1, aDB.b(adb3, adb4.t(), null, 2, null));
            acg = this.j.i;
            d dVar = new d(new a(aCE.d.e(acg, c1356Yn, RequestPriority.a, false, 4, null)));
            this.f = dyk;
            this.d = 1;
            c2 = dyR.c((dyS) dVar, (InterfaceC8585dra) this);
            if (c2 == e) {
                return e;
            }
        } else if (r2 != 1) {
            if (r2 == 2) {
                dyK dyk2 = (dyK) this.f;
                C8556dpz.d(obj);
            } else if (r2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        } else {
            dyk = (dyK) this.f;
            C8556dpz.d(obj);
            c2 = obj;
        }
        List<C1356Yn.e> a2 = ((C1356Yn.a) aCK.e((C8954gU) c2)).a();
        if (a2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C1356Yn.e eVar = a2.get(0);
        List<C2368aet.c> b3 = (eVar == null || (c3 = eVar.c()) == null || (c4 = c3.c()) == null || (d3 = c4.d()) == null) ? null : d3.b();
        if (b3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        bYA bya = this.j;
        d2 = C8572dqo.d(b3, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (C2368aet.c cVar : b3) {
            C2356aeh e2 = (cVar == null || (b2 = cVar.b()) == null) ? null : b2.e();
            C2364aep a3 = (cVar == null || (b = cVar.b()) == null) ? null : b.a();
            if (e2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            aEN aen = new aEN(e2, a3, cVar.a());
            if (aen.isAvailableToPlay()) {
                bookmarkStore = bya.b;
                String aH_ = aen.aE_().aH_();
                c cVar2 = new c(aen);
                c1567aGb = bya.l;
                bookmarkStore.updateBookmarkIfExists(aH_, cVar2, c1567aGb.a());
            }
            arrayList.add(aen);
        }
        n = C8576dqs.n(arrayList);
        Pair pair2 = new Pair(n, InterfaceC1078Nw.aJ);
        this.f = dyk;
        this.d = 2;
        if (dyk.a(pair2, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* loaded from: classes4.dex */
    public static final class c implements Bookmark {
        private long b;
        private long c;

        @Override // com.netflix.model.leafs.Bookmark
        public long getBookmarkPositionMs() {
            return this.c;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public long getLastModified() {
            return this.b;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public void setBookmarkPositionMs(long j) {
            this.c = j;
        }

        @Override // com.netflix.model.leafs.Bookmark
        public void setLastModified(long j) {
            this.b = j;
        }

        c(aEN aen) {
            this.c = aen.aq_();
            this.b = aen.az();
        }

        @Override // com.netflix.model.leafs.Bookmark
        public Integer getInteractiveProgress() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }
}
