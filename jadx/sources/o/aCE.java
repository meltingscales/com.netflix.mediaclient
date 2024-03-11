package o;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import io.reactivex.Single;
import o.InterfaceC8990hD;
import o.InterfaceC8999hM;

/* loaded from: classes.dex */
public interface aCE {
    <M extends InterfaceC8990hD.b> Single<C8954gU<M>> a(InterfaceC8990hD<M> interfaceC8990hD, M m, boolean z, RequestPriority requestPriority, boolean z2);

    <Q extends InterfaceC8999hM.c> Object a(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra);

    <Q extends InterfaceC8999hM.c> dyS<C8954gU<Q>> a(InterfaceC8999hM<Q> interfaceC8999hM, RequestPriority requestPriority, boolean z);

    <Q extends InterfaceC8999hM.c> dyS<C8954gU<Q>> a(InterfaceC8999hM<Q> interfaceC8999hM, WatchQueryMode watchQueryMode, QueryMode queryMode, RequestPriority requestPriority, boolean z);

    <Q extends InterfaceC8999hM.c> Object b(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra);

    <Q extends InterfaceC8999hM.c> Single<C8954gU<Q>> c(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z);

    <M extends InterfaceC8990hD.b> Object c(InterfaceC8990hD<M> interfaceC8990hD, M m, boolean z, RequestPriority requestPriority, boolean z2, InterfaceC8585dra<? super C8954gU<M>> interfaceC8585dra);

    <Q extends InterfaceC8999hM.c> Object d(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra);

    <Q extends InterfaceC8999hM.c> Single<C8954gU<Q>> e(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z);

    <Q extends InterfaceC8999hM.c> Object e(InterfaceC8999hM<Q> interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra<? super C8954gU<Q>> interfaceC8585dra);

    /* loaded from: classes3.dex */
    public static final class d {
        public static /* synthetic */ Object d(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                QueryMode queryMode2 = queryMode;
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                RequestPriority requestPriority2 = requestPriority;
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.e(interfaceC8999hM, queryMode2, requestPriority2, z, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }

        public static /* synthetic */ Single e(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.c(interfaceC8999hM, queryMode, requestPriority, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxQuery");
        }

        public static /* synthetic */ Object a(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                QueryMode queryMode2 = queryMode;
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                RequestPriority requestPriority2 = requestPriority;
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.d(interfaceC8999hM, queryMode2, requestPriority2, z, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetch");
        }

        public static /* synthetic */ Single d(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.e(interfaceC8999hM, queryMode, requestPriority, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxPrefetch");
        }

        public static /* synthetic */ dyS e(aCE ace, InterfaceC8999hM interfaceC8999hM, RequestPriority requestPriority, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    requestPriority = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                return ace.a(interfaceC8999hM, requestPriority, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryWithCacheFirstThenNetwork");
        }

        public static /* synthetic */ Object c(aCE ace, InterfaceC8990hD interfaceC8990hD, InterfaceC8990hD.b bVar, boolean z, RequestPriority requestPriority, boolean z2, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
            if (obj == null) {
                return ace.c(interfaceC8990hD, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : requestPriority, (i & 16) != 0 ? false : z2, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mutate");
        }

        public static /* synthetic */ Single e(aCE ace, InterfaceC8990hD interfaceC8990hD, InterfaceC8990hD.b bVar, boolean z, RequestPriority requestPriority, boolean z2, int i, Object obj) {
            if (obj == null) {
                InterfaceC8990hD.b bVar2 = (i & 2) != 0 ? null : bVar;
                if ((i & 4) != 0) {
                    z = true;
                }
                boolean z3 = z;
                RequestPriority requestPriority2 = (i & 8) != 0 ? null : requestPriority;
                if ((i & 16) != 0) {
                    z2 = false;
                }
                return ace.a((InterfaceC8990hD<InterfaceC8990hD>) interfaceC8990hD, (InterfaceC8990hD) bVar2, z3, requestPriority2, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxMutate");
        }

        public static /* synthetic */ dyS d(aCE ace, InterfaceC8999hM interfaceC8999hM, WatchQueryMode watchQueryMode, QueryMode queryMode, RequestPriority requestPriority, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    watchQueryMode = WatchQueryMode.d;
                }
                WatchQueryMode watchQueryMode2 = watchQueryMode;
                if ((i & 4) != 0) {
                    queryMode = QueryMode.c;
                }
                QueryMode queryMode2 = queryMode;
                if ((i & 8) != 0) {
                    requestPriority = null;
                }
                RequestPriority requestPriority2 = requestPriority;
                if ((i & 16) != 0) {
                    z = false;
                }
                return ace.a(interfaceC8999hM, watchQueryMode2, queryMode2, requestPriority2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: watch");
        }

        public static /* synthetic */ Object b(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                QueryMode queryMode2 = queryMode;
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                RequestPriority requestPriority2 = requestPriority;
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.b(interfaceC8999hM, queryMode2, requestPriority2, z, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryWithoutDiskCache");
        }

        public static /* synthetic */ Object c(aCE ace, InterfaceC8999hM interfaceC8999hM, QueryMode queryMode, RequestPriority requestPriority, boolean z, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    queryMode = QueryMode.b;
                }
                QueryMode queryMode2 = queryMode;
                if ((i & 4) != 0) {
                    requestPriority = null;
                }
                RequestPriority requestPriority2 = requestPriority;
                if ((i & 8) != 0) {
                    z = false;
                }
                return ace.a(interfaceC8999hM, queryMode2, requestPriority2, z, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryWithoutMemoryCache");
        }
    }
}
