package o;

import android.database.sqlite.SQLiteException;
import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.cache.normalized.FetchPolicy;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloGraphQLException;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$customRxSingle$1;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$customRxSingle$2;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchWatch$1;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchWatch$2;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$rxMutate$1;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$rxPrefetch$1;
import com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$rxQuery$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.NoWhenBranchMatchedException;
import o.C1596aHd;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1730aMc;
import o.InterfaceC8990hD;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;
import o.aCO;
import o.dpR;

/* loaded from: classes3.dex */
public abstract class aCO implements aCE {
    public static final e c = new e(null);
    private final InterfaceC1474aCq a;
    private final InterfaceC1471aCn b;
    private final aCW d;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[QueryMode.values().length];
            try {
                iArr[QueryMode.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QueryMode.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QueryMode.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
            int[] iArr2 = new int[WatchQueryMode.values().length];
            try {
                iArr2[WatchQueryMode.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WatchQueryMode.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WatchQueryMode.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WatchQueryMode.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
        }
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Object a(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        return b(this, interfaceC8999hM, queryMode, requestPriority, z, interfaceC8585dra);
    }

    public final aCW a() {
        return this.d;
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Object b(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        return e(this, interfaceC8999hM, queryMode, requestPriority, z, interfaceC8585dra);
    }

    @Override // o.aCE
    public <M extends InterfaceC8990hD.b> Object c(InterfaceC8990hD<M> interfaceC8990hD, M m, boolean z, RequestPriority requestPriority, boolean z2, InterfaceC8585dra<? super C8954gU<M>> interfaceC8585dra) {
        return a(this, interfaceC8990hD, m, z, requestPriority, z2, interfaceC8585dra);
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Object d(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        return c(this, interfaceC8999hM, queryMode, requestPriority, z, interfaceC8585dra);
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Object e(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        return d(this, interfaceC8999hM, queryMode, requestPriority, z, interfaceC8585dra);
    }

    public aCO(InterfaceC1474aCq interfaceC1474aCq, aCW acw, InterfaceC1471aCn interfaceC1471aCn) {
        C8632dsu.c((Object) interfaceC1474aCq, "");
        C8632dsu.c((Object) acw, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
        this.a = interfaceC1474aCq;
        this.d = acw;
        this.b = interfaceC1471aCn;
        C9137js.c(new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                boolean d;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                d = aCO.c.d(th);
                if (!d || InterfaceC1730aMc.c.e(1)) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    C1596aHd c1596aHd = new C1596aHd("ApolloExceptionHandler handled an exception", th, ErrorType.l, false, null, false, false, 120, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            }
        });
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GraphQLRepositoryApisImpl");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(Throwable th) {
            return aCP.a(th) || aCP.c(th) || (th instanceof SQLiteException);
        }
    }

    static /* synthetic */ <Q extends InterfaceC8999hM.c> Object d(aCO aco, InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        String name = queryMode.name();
        aco.c(logTag + ": query: " + f + ", queryMode: " + name);
        return aco.a((C8942gI) C9083ir.c((InterfaceC9038hz<Object>) aco.d.c().d(interfaceC8999hM), true), queryMode, requestPriority, z, interfaceC8585dra);
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Single<C8954gU<Q>> c(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z) {
        C8632dsu.c((Object) interfaceC8999hM, "");
        C8632dsu.c((Object) queryMode, "");
        return b(new GraphQLRepositoryApisImpl$rxQuery$1(this, interfaceC8999hM, queryMode, requestPriority, z, null));
    }

    static /* synthetic */ <Q extends InterfaceC8999hM.c> Object c(aCO aco, InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        String name = queryMode.name();
        aco.c(logTag + ": prefetch: " + f + ", queryMode: " + name);
        return aco.a((C8942gI) C9083ir.c((InterfaceC9038hz<Object>) aco.d.c().d(interfaceC8999hM), false), queryMode, requestPriority, z, interfaceC8585dra);
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> Single<C8954gU<Q>> e(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z) {
        C8632dsu.c((Object) interfaceC8999hM, "");
        C8632dsu.c((Object) queryMode, "");
        return b(new GraphQLRepositoryApisImpl$rxPrefetch$1(this, interfaceC8999hM, queryMode, requestPriority, z, null));
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> dyS<C8954gU<Q>> a(InterfaceC8999hM<Q> interfaceC8999hM, RequestPriority requestPriority, boolean z) {
        C8632dsu.c((Object) interfaceC8999hM, "");
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        c(logTag + ": queryWithCacheFirstThenNetwork: " + f);
        C8942gI c8942gI = (C8942gI) C9083ir.c((InterfaceC9038hz<Object>) this.d.c().d(interfaceC8999hM), true);
        String a = a(c8942gI, requestPriority, z);
        this.b.e(a, "FROM_CACHE_THEN_NETWORK");
        this.a.c();
        return dyR.a(((C8942gI) C9083ir.d(c8942gI, FetchPolicy.e)).i(), (drX) new GraphQLRepositoryApisImpl$queryWithCacheFirstThenNetwork$1(this, c8942gI, a, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <M extends o.InterfaceC8990hD.b> java.lang.Object a(o.aCO r6, o.InterfaceC8990hD<M> r7, M r8, boolean r9, com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority r10, boolean r11, o.InterfaceC8585dra<? super o.C8954gU<M>> r12) {
        /*
            boolean r0 = r12 instanceof com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$mutate$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$mutate$1 r0 = (com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$mutate$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$mutate$1 r0 = new com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$mutate$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.a
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.e
            o.gI r7 = (o.C8942gI) r7
            java.lang.Object r8 = r0.b
            o.aCO r8 = (o.aCO) r8
            o.C8556dpz.d(r12)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L8e
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            o.C8556dpz.d(r12)
            o.aCO$e r12 = o.aCO.c
            java.lang.String r12 = r12.getLogTag()
            java.lang.String r2 = r7.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r12 = ": mutate: "
            r4.append(r12)
            r4.append(r2)
            java.lang.String r12 = r4.toString()
            r6.c(r12)
            o.aCW r12 = r6.d
            o.gK r12 = r12.c()
            o.gI r7 = r12.c(r7)
            if (r8 == 0) goto L73
            o.C9083ir.b(r7, r8)
        L73:
            o.C9083ir.c(r7, r9)
            java.lang.String r8 = r6.a(r7, r10, r11)
            o.aCq r9 = r6.a
            r9.c()
            r0.b = r6
            r0.e = r7
            r0.a = r8
            r0.c = r3
            java.lang.Object r12 = r7.e(r0)
            if (r12 != r1) goto L8e
            return r1
        L8e:
            r9 = r12
            o.gU r9 = (o.C8954gU) r9
            o.aCn r6 = r6.b
            r6.b(r7, r9, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aCO.a(o.aCO, o.hD, o.hD$b, boolean, com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority, boolean, o.dra):java.lang.Object");
    }

    @Override // o.aCE
    public <M extends InterfaceC8990hD.b> Single<C8954gU<M>> a(InterfaceC8990hD<M> interfaceC8990hD, M m, boolean z, RequestPriority requestPriority, boolean z2) {
        C8632dsu.c((Object) interfaceC8990hD, "");
        return b(new GraphQLRepositoryApisImpl$rxMutate$1(this, interfaceC8990hD, m, z, requestPriority, z2, null));
    }

    @Override // o.aCE
    public <Q extends InterfaceC8999hM.c> dyS<C8954gU<Q>> a(InterfaceC8999hM<Q> interfaceC8999hM, WatchQueryMode watchQueryMode, QueryMode queryMode, RequestPriority requestPriority, boolean z) {
        C8632dsu.c((Object) interfaceC8999hM, "");
        C8632dsu.c((Object) watchQueryMode, "");
        C8632dsu.c((Object) queryMode, "");
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        String name = watchQueryMode.name();
        String name2 = queryMode.name();
        c(logTag + ": watch: " + f + ", queryMode: " + name + ", requeryMode: " + name2);
        return a((C8942gI) C9083ir.c((InterfaceC9038hz<Object>) this.d.c().d(interfaceC8999hM), true), watchQueryMode, queryMode, requestPriority, z);
    }

    static /* synthetic */ <Q extends InterfaceC8999hM.c> Object e(aCO aco, InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        String name = queryMode.name();
        aco.c(logTag + ": queryWithoutDiskCache: " + f + ", queryMode: " + name);
        return aco.a(C1492aDh.a.d((C8942gI) C9083ir.c((InterfaceC9038hz<Object>) aco.d.c().d(interfaceC8999hM), true)), queryMode, requestPriority, z, interfaceC8585dra);
    }

    static /* synthetic */ <Q extends InterfaceC8999hM.c> Object b(aCO aco, InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra) {
        String logTag = c.getLogTag();
        String f = interfaceC8999hM.f();
        String name = queryMode.name();
        aco.c(logTag + ": queryWithoutMemoryCache: " + f + ", queryMode: " + name);
        return aco.a(C1492aDh.a.c((C8942gI) C9083ir.c((InterfaceC9038hz<Object>) aco.d.c().d(interfaceC8999hM), true)), queryMode, requestPriority, z, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <Q extends o.InterfaceC8999hM.c> java.lang.Object a(o.C8942gI<Q> r7, com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r8, com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority r9, boolean r10, o.InterfaceC8585dra<? super o.C8954gU<Q>> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchQuery$1
            if (r0 == 0) goto L13
            r0 = r11
            com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchQuery$1 r0 = (com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchQuery$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchQuery$1 r0 = new com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$launchQuery$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.d
            o.gI r8 = (o.C8942gI) r8
            java.lang.Object r9 = r0.a
            o.aCO r9 = (o.aCO) r9
            o.C8556dpz.d(r11)
            r5 = r9
            r9 = r7
            r7 = r8
            r8 = r5
            goto Laa
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.d
            o.gI r8 = (o.C8942gI) r8
            java.lang.Object r9 = r0.a
            o.aCO r9 = (o.aCO) r9
            o.C8556dpz.d(r11)
            r5 = r9
            r9 = r7
            r7 = r8
            r8 = r5
            goto L8b
        L59:
            o.C8556dpz.d(r11)
            java.lang.String r9 = r6.a(r7, r9, r10)
            o.aCn r10 = r6.b
            java.lang.String r11 = r8.name()
            r10.e(r9, r11)
            o.aCq r10 = r6.a
            r10.c()
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r10 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.b
            if (r8 != r10) goto L93
            o.aCq r8 = r6.a
            r8.a()
            o.aCq r8 = r6.a
            o.aCn r10 = r6.b
            r0.a = r6
            r0.d = r7
            r0.b = r9
            r0.e = r4
            java.lang.Object r11 = o.aCT.d(r7, r9, r8, r10, r0)
            if (r11 != r1) goto L8a
            return r1
        L8a:
            r8 = r6
        L8b:
            o.gU r11 = (o.C8954gU) r11
            o.aCn r8 = r8.b
            r8.b(r7, r11, r9)
            goto Lb1
        L93:
            com.apollographql.apollo3.cache.normalized.FetchPolicy r8 = r6.b(r8)
            o.C9083ir.d(r7, r8)
            r0.a = r6
            r0.d = r7
            r0.b = r9
            r0.e = r3
            java.lang.Object r11 = r7.e(r0)
            if (r11 != r1) goto La9
            return r1
        La9:
            r8 = r6
        Laa:
            o.gU r11 = (o.C8954gU) r11
            o.aCn r8 = r8.b
            r8.b(r7, r11, r9)
        Lb1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aCO.a(o.gI, com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode, com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority, boolean, o.dra):java.lang.Object");
    }

    private final <Q extends InterfaceC8999hM.c> dyS<C8954gU<Q>> a(C8942gI<Q> c8942gI, WatchQueryMode watchQueryMode, QueryMode queryMode, RequestPriority requestPriority, boolean z) {
        String a = a(c8942gI, requestPriority, z);
        this.b.e(a, watchQueryMode.name());
        this.a.c();
        if (watchQueryMode == WatchQueryMode.c) {
            this.a.a();
            return dyR.a(aCT.c((C8942gI) C9083ir.a(c8942gI, b(queryMode)), a, this.a, this.b), (drX) new GraphQLRepositoryApisImpl$launchWatch$1(this, c8942gI, a, null));
        }
        C9083ir.a((InterfaceC9038hz) C9083ir.d(c8942gI, d(watchQueryMode)), b(queryMode));
        return dyR.a(C9083ir.b(c8942gI), (drX) new GraphQLRepositoryApisImpl$launchWatch$2(this, c8942gI, a, null));
    }

    private final <O extends InterfaceC8991hE.b> Single<C8954gU<O>> b(drM<? super InterfaceC8585dra<? super C8954gU<O>>, ? extends Object> drm) {
        Single cache = C7680dBj.a(this.d.e(), new GraphQLRepositoryApisImpl$customRxSingle$1(drm, null)).cache();
        final GraphQLRepositoryApisImpl$customRxSingle$2 graphQLRepositoryApisImpl$customRxSingle$2 = new drM<C8954gU<O>, SingleSource<? extends C8954gU<O>>>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.GraphQLRepositoryApisImpl$customRxSingle$2
            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends C8954gU<O>> invoke(C8954gU<O> c8954gU) {
                C8632dsu.c((Object) c8954gU, "");
                ApolloException apolloException = c8954gU.a;
                if (apolloException != null && !(apolloException instanceof ApolloGraphQLException)) {
                    return Single.error(apolloException);
                }
                return Single.just(c8954gU);
            }
        };
        Single<C8954gU<O>> flatMap = cache.flatMap(new Function() { // from class: o.aCV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource b;
                b = aCO.b(drM.this, obj);
                return b;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    private final <O extends InterfaceC8991hE.b> String a(C8942gI<O> c8942gI, RequestPriority requestPriority, boolean z) {
        String c2 = this.b.c(c8942gI);
        c8942gI.e("X-Netflix-Internal-Volley-Priority", String.valueOf(requestPriority)).c(HttpMethod.a);
        if (c2 != null) {
            c8942gI.e("X-Netflix.tracing.cl.userActionId", c2).e("X-Netflix.request.toplevel.uuid", c2);
        }
        if (z) {
            InterfaceC1477aCt.d.e((C8942gI<?>) c8942gI);
        }
        return c2;
    }

    private final FetchPolicy b(QueryMode queryMode) {
        int i = c.b[queryMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return FetchPolicy.d;
                }
                throw new NoWhenBranchMatchedException();
            }
            return FetchPolicy.c;
        }
        return FetchPolicy.c;
    }

    private final FetchPolicy d(WatchQueryMode watchQueryMode) {
        int i = c.a[watchQueryMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return b(QueryMode.d);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return b(QueryMode.b);
            }
            return b(QueryMode.c);
        }
        return FetchPolicy.e;
    }

    private final void c(String str) {
        boolean d;
        d = duD.d((CharSequence) str, (CharSequence) "LiveVideoData", false, 2, (Object) null);
        if (d) {
            return;
        }
        InterfaceC1593aHa.c.a(str);
    }
}
