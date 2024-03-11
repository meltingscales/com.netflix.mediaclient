package o;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.ZI;
import o.aCE;

/* renamed from: o.coD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7012coD implements InterfaceC6909cmG {
    private final Map<String, Boolean> b;
    private final aCG e;

    @Inject
    public C7012coD(aCG acg) {
        C8632dsu.c((Object) acg, "");
        this.e = acg;
        this.b = Collections.synchronizedMap(new LinkedHashMap());
    }

    @Override // o.InterfaceC6909cmG
    public dyS<InterfaceC5218buc> b(Map<String, ? extends InterfaceC5218buc> map) {
        C8632dsu.c((Object) map, "");
        if (map.isEmpty()) {
            return dyR.a(new InterfaceC5218buc[0]);
        }
        return d(e(map));
    }

    @Override // o.InterfaceC6909cmG
    public void a() {
        this.b.clear();
    }

    private final ZI e(Map<String, ? extends InterfaceC5218buc> map) {
        int d2;
        ArrayList<InterfaceC5218buc> arrayList = new ArrayList();
        for (Object obj : map.values()) {
            if (!this.b.containsKey(((InterfaceC5218buc) obj).i())) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC5218buc interfaceC5218buc : arrayList) {
            Map<String, Boolean> map2 = this.b;
            C8632dsu.a(map2, "");
            map2.put(interfaceC5218buc.i(), Boolean.valueOf(interfaceC5218buc.A()));
        }
        d2 = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (InterfaceC5218buc interfaceC5218buc2 : arrayList) {
            arrayList2.add(Integer.valueOf(Integer.parseInt(interfaceC5218buc2.i())));
        }
        return new ZI(arrayList2);
    }

    private final dyS<InterfaceC5218buc> d(ZI zi) {
        dyS<InterfaceC5218buc> b;
        if (!zi.j().isEmpty()) {
            b = C8801dza.b(new d(new a(aCE.d.d((aCE) this.e, (InterfaceC8999hM) zi, (WatchQueryMode) null, (QueryMode) null, (RequestPriority) null, false, 30, (Object) null))), 0, new RemindMeWatcherImpl$watchVideosQuery$3(this, null), 1, null);
            return b;
        }
        return dyR.a(new InterfaceC5218buc[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(ZI.b bVar) {
        return String.valueOf(bVar.e().d());
    }

    /* renamed from: o.coD$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5218buc {
        final /* synthetic */ ZI.b c;
        final /* synthetic */ C7012coD e;

        e(ZI.b bVar, C7012coD c7012coD) {
            this.c = bVar;
            this.e = c7012coD;
        }

        @Override // o.InterfaceC5218buc
        public boolean A() {
            Boolean b = this.c.e().b();
            if (b != null) {
                return b.booleanValue();
            }
            return false;
        }

        @Override // o.InterfaceC5218buc
        public String i() {
            return this.e.b(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5218buc a(ZI.b bVar) {
        return new e(bVar, this);
    }

    /* renamed from: o.coD$a */
    /* loaded from: classes4.dex */
    public static final class a implements dyS<C8954gU<ZI.d>> {
        final /* synthetic */ dyS d;

        public a(dyS dys) {
            this.d = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<ZI.d>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass3(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coD$a$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass3(dyQ dyq) {
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
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
                throw new UnsupportedOperationException("Method not decompiled: o.C7012coD.a.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.coD$d */
    /* loaded from: classes4.dex */
    public static final class d implements dyS<List<? extends ZI.b>> {
        final /* synthetic */ dyS e;

        public d(dyS dys) {
            this.e = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super List<? extends ZI.b>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass3(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.coD$d$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass3(dyQ dyq) {
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
                throw new UnsupportedOperationException("Method not decompiled: o.C7012coD.d.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
