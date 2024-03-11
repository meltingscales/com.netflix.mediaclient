package o;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3;
import com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.YA;
import o.ZH;
import o.aCE;

/* renamed from: o.coF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7014coF implements InterfaceC6910cmH {
    private final Map<String, Boolean> a;
    private final Map<String, Boolean> b;
    private final aCG d;

    @Inject
    public C7014coF(aCG acg) {
        C8632dsu.c((Object) acg, "");
        this.d = acg;
        this.a = Collections.synchronizedMap(new LinkedHashMap());
        this.b = Collections.synchronizedMap(new LinkedHashMap());
    }

    @Override // o.InterfaceC6910cmH
    public dyS<InterfaceC5146btJ> c(Map<String, ? extends InterfaceC5146btJ> map) {
        C8632dsu.c((Object) map, "");
        if (map.isEmpty()) {
            return dyR.a(new InterfaceC5146btJ[0]);
        }
        return dyR.a(c(d(map)), a(b(map)));
    }

    @Override // o.InterfaceC6910cmH
    public void d() {
        this.a.clear();
        this.b.clear();
    }

    private final YA d(Map<String, ? extends InterfaceC5146btJ> map) {
        int d2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : map.values()) {
            if (c((InterfaceC5146btJ) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<InterfaceC5146btJ> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!this.a.containsKey(((InterfaceC5146btJ) obj2).g())) {
                arrayList2.add(obj2);
            }
        }
        for (InterfaceC5146btJ interfaceC5146btJ : arrayList2) {
            Map<String, Boolean> map2 = this.a;
            C8632dsu.a(map2, "");
            map2.put(interfaceC5146btJ.g(), Boolean.valueOf(interfaceC5146btJ.m()));
        }
        d2 = C8572dqo.d(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(d2);
        for (InterfaceC5146btJ interfaceC5146btJ2 : arrayList2) {
            arrayList3.add(Integer.valueOf(Integer.parseInt(interfaceC5146btJ2.g())));
        }
        return new YA(arrayList3);
    }

    private final ZH b(Map<String, ? extends InterfaceC5146btJ> map) {
        int d2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : map.values()) {
            if (!c((InterfaceC5146btJ) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<InterfaceC5146btJ> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!this.b.containsKey(((InterfaceC5146btJ) obj2).g())) {
                arrayList2.add(obj2);
            }
        }
        for (InterfaceC5146btJ interfaceC5146btJ : arrayList2) {
            Map<String, Boolean> map2 = this.b;
            C8632dsu.a(map2, "");
            map2.put(interfaceC5146btJ.g(), Boolean.valueOf(interfaceC5146btJ.m()));
        }
        d2 = C8572dqo.d(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(d2);
        for (InterfaceC5146btJ interfaceC5146btJ2 : arrayList2) {
            arrayList3.add(Integer.valueOf(Integer.parseInt(interfaceC5146btJ2.g())));
        }
        return new ZH(arrayList3);
    }

    private final dyS<InterfaceC5146btJ> c(YA ya) {
        dyS<InterfaceC5146btJ> b2;
        if (!ya.g().isEmpty()) {
            b2 = C8801dza.b(new a(new d(aCE.d.d((aCE) this.d, (InterfaceC8999hM) ya, (WatchQueryMode) null, (QueryMode) null, (RequestPriority) null, false, 30, (Object) null))), 0, new MyListWatcherImpl$watchGamesQuery$3(this, null), 1, null);
            return b2;
        }
        return dyR.a(new InterfaceC5146btJ[0]);
    }

    private final dyS<InterfaceC5146btJ> a(ZH zh) {
        dyS<InterfaceC5146btJ> b2;
        if (!zh.h().isEmpty()) {
            b2 = C8801dza.b(new h(new b(aCE.d.d((aCE) this.d, (InterfaceC8999hM) zh, (WatchQueryMode) null, (QueryMode) null, (RequestPriority) null, false, 30, (Object) null))), 0, new MyListWatcherImpl$watchVideosQuery$3(this, null), 1, null);
            return b2;
        }
        return dyR.a(new InterfaceC5146btJ[0]);
    }

    /* renamed from: o.coF$a */
    /* loaded from: classes4.dex */
    public static final class a implements dyS<List<? extends YA.a>> {
        final /* synthetic */ dyS a;

        public a(dyS dys) {
            this.a = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super List<? extends YA.a>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.a.collect(new AnonymousClass3(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coF$a$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ a;

            public AnonymousClass3(dyQ dyq) {
                this.a = dyq;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
                r4 = o.C8576dqs.G(r4);
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r17, o.InterfaceC8585dra r18) {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C7014coF.a.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.coF$b */
    /* loaded from: classes4.dex */
    public static final class b implements dyS<C8954gU<ZH.e>> {
        final /* synthetic */ dyS b;

        public b(dyS dys) {
            this.b = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<ZH.e>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coF$b$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ b;

            public AnonymousClass2(dyQ dyq) {
                this.b = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.b
                    r2 = r5
                    o.gU r2 = (o.C8954gU) r2
                    com.apollographql.apollo3.exception.ApolloException r2 = r2.a
                    if (r2 == 0) goto L41
                    boolean r2 = r2 instanceof com.apollographql.apollo3.exception.ApolloGraphQLException
                    if (r2 == 0) goto L4a
                L41:
                    r0.c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C7014coF.b.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.coF$d */
    /* loaded from: classes4.dex */
    public static final class d implements dyS<C8954gU<YA.c>> {
        final /* synthetic */ dyS b;

        public d(dyS dys) {
            this.b = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<YA.c>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coF$d$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass2(dyQ dyq) {
                this.c = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.c
                    r2 = r5
                    o.gU r2 = (o.C8954gU) r2
                    com.apollographql.apollo3.exception.ApolloException r2 = r2.a
                    if (r2 == 0) goto L41
                    boolean r2 = r2 instanceof com.apollographql.apollo3.exception.ApolloGraphQLException
                    if (r2 == 0) goto L4a
                L41:
                    r0.a = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C7014coF.d.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.coF$h */
    /* loaded from: classes4.dex */
    public static final class h implements dyS<List<? extends ZH.b>> {
        final /* synthetic */ dyS d;

        public h(dyS dys) {
            this.d = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super List<? extends ZH.b>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass2(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coF$h$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass2(dyQ dyq) {
                this.c = dyq;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
                r4 = o.C8576dqs.G(r4);
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r17, o.InterfaceC8585dra r18) {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C7014coF.h.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    private final boolean c(InterfaceC5146btJ interfaceC5146btJ) {
        return (interfaceC5146btJ instanceof InterfaceC5185btw) || ((interfaceC5146btJ instanceof TrailerItem) && ((TrailerItem) interfaceC5146btJ).C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(YA.a aVar) {
        return String.valueOf(aVar.c().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(ZH.b bVar) {
        return String.valueOf(bVar.d().e());
    }

    /* renamed from: o.coF$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5146btJ {
        final /* synthetic */ C7014coF b;
        final /* synthetic */ YA.a c;

        e(YA.a aVar, C7014coF c7014coF) {
            this.c = aVar;
            this.b = c7014coF;
        }

        @Override // o.InterfaceC5146btJ
        public boolean m() {
            Boolean d = this.c.c().d();
            if (d != null) {
                return d.booleanValue();
            }
            return false;
        }

        @Override // o.InterfaceC5146btJ
        public String g() {
            return this.b.d(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5146btJ b(YA.a aVar) {
        return new e(aVar, this);
    }

    /* renamed from: o.coF$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5146btJ {
        final /* synthetic */ C7014coF c;
        final /* synthetic */ ZH.b d;

        c(ZH.b bVar, C7014coF c7014coF) {
            this.d = bVar;
            this.c = c7014coF;
        }

        @Override // o.InterfaceC5146btJ
        public boolean m() {
            Boolean c = this.d.d().c();
            if (c != null) {
                return c.booleanValue();
            }
            return false;
        }

        @Override // o.InterfaceC5146btJ
        public String g() {
            return this.c.a(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5146btJ d(ZH.b bVar) {
        return new c(bVar, this);
    }
}
