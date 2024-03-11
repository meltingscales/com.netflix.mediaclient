package o;

import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchMoreEntitiesInSection$1;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchSearchEntity$1;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1;
import io.reactivex.Observable;

/* renamed from: o.cTu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6098cTu extends C6096cTs {
    public static final d b = new d(null);
    private final aLP a;
    private final aDB d;
    private final aCN e;
    private final aCG f;
    private final C1567aGb j;

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i, int i2) {
        return (i2 - i) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e(int i, int i2) {
        return (i2 - i) + 1;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return c(this, interfaceC8585dra);
    }

    /* renamed from: o.cTu$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6098cTu(aLP alp, aCG acg, C1567aGb c1567aGb, aCN acn, aDB adb) {
        super(alp, acg, adb);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) acn, "");
        C8632dsu.c((Object) adb, "");
        this.a = alp;
        this.f = acg;
        this.j = c1567aGb;
        this.e = acn;
        this.d = adb;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> b(String str, String str2, long j, TaskMode taskMode, Context context) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) context, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchOption5RepositoryImpl$fetchSearchEntity$1(context, this, str, j, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d(String str, Context context, C6087cTj c6087cTj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1(c6087cTj, this, str, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d(Context context, C6087cTj c6087cTj) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchOption5RepositoryImpl$fetchMoreEntitiesInSection$1(c6087cTj, this, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> b(String str, Context context, C6087cTj c6087cTj, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1(context, this, c6087cTj, str, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(o.C6098cTu r7, o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$clearSearchResults$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$clearSearchResults$1 r0 = (com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$clearSearchResults$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$clearSearchResults$1 r0 = new com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$clearSearchResults$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o.C8556dpz.d(r8)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.c
            o.bvo r7 = (o.InterfaceC5283bvo) r7
            java.lang.Object r2 = r0.d
            o.cTu r2 = (o.C6098cTu) r2
            o.C8556dpz.d(r8)
            r8 = r7
            r7 = r2
            goto L77
        L43:
            o.C8556dpz.d(r8)
            o.Mh r8 = o.AbstractApplicationC1040Mh.getInstance()
            o.Mw r8 = r8.i()
            com.netflix.mediaclient.service.user.UserAgent r8 = r8.k()
            if (r8 == 0) goto L5f
            o.aGb r2 = r7.j
            java.lang.String r2 = r2.a()
            o.bvo r8 = r8.b(r2)
            goto L60
        L5f:
            r8 = r5
        L60:
            if (r8 == 0) goto L8f
            o.aCN r2 = r7.e
            java.lang.String r6 = "pinotQuerySearchPage%"
            io.reactivex.Completable r2 = r2.b(r8, r6)
            r0.d = r7
            r0.c = r8
            r0.e = r4
            java.lang.Object r2 = o.dAU.b(r2, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            o.aCN r7 = r7.e
            java.lang.String r2 = "pinotEntitySearchPage%"
            io.reactivex.Completable r7 = r7.b(r8, r2)
            r0.d = r5
            r0.c = r5
            r0.e = r3
            java.lang.Object r7 = o.dAU.b(r7, r0)
            if (r7 != r1) goto L8c
            return r1
        L8c:
            o.dpR r7 = o.dpR.c
            return r7
        L8f:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6098cTu.c(o.cTu, o.dra):java.lang.Object");
    }
}
