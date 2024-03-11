package o;

import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$fetchSearchEntity$1;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$fetchSearchResults$1;
import io.reactivex.Observable;

/* renamed from: o.cTv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6099cTv extends C6095cTr {
    public static final e e = new e(null);
    private final aCN a;
    private final aDB b;
    private final aLP d;
    private final aCG h;
    private final C1567aGb i;

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(int i, int i2) {
        return (i2 - i) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i, int i2) {
        return (i2 - i) + 1;
    }

    /* renamed from: o.cTv$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6099cTv(aLP alp, aCG acg, C1567aGb c1567aGb, aCN acn, aDB adb) {
        super(alp, acg, adb);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) acn, "");
        C8632dsu.c((Object) adb, "");
        this.d = alp;
        this.h = acg;
        this.i = c1567aGb;
        this.a = acn;
        this.b = adb;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> b(String str, String str2, long j, TaskMode taskMode, Context context) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) context, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchRepositoryImpl$fetchSearchEntity$1(context, this, str, j, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d(String str, Context context, C6087cTj c6087cTj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1(c6087cTj, this, str, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> b(String str, Context context, C6087cTj c6087cTj, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLSearchRepositoryImpl$fetchSearchResults$1(context, this, c6087cTj, str, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    @Override // o.C6062cSo, o.InterfaceC6086cTi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$clearSearchResults$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$clearSearchResults$1 r0 = (com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$clearSearchResults$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$clearSearchResults$1 r0 = new com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$clearSearchResults$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o.C8556dpz.d(r8)
            goto L8c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.e
            o.bvo r2 = (o.InterfaceC5283bvo) r2
            java.lang.Object r4 = r0.d
            o.cTv r4 = (o.C6099cTv) r4
            o.C8556dpz.d(r8)
            goto L77
        L41:
            o.C8556dpz.d(r8)
            o.Mh r8 = o.AbstractApplicationC1040Mh.getInstance()
            o.Mw r8 = r8.i()
            com.netflix.mediaclient.service.user.UserAgent r8 = r8.k()
            if (r8 == 0) goto L5e
            o.aGb r2 = r7.i
            java.lang.String r2 = r2.a()
            o.bvo r8 = r8.b(r2)
            r2 = r8
            goto L5f
        L5e:
            r2 = r5
        L5f:
            if (r2 == 0) goto L8f
            o.aCN r8 = r7.a
            java.lang.String r6 = "pinotQuerySearchPage%"
            io.reactivex.Completable r8 = r8.b(r2, r6)
            r0.d = r7
            r0.e = r2
            r0.b = r4
            java.lang.Object r8 = o.dAU.b(r8, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            r4 = r7
        L77:
            o.aCN r8 = r4.a
            java.lang.String r4 = "pinotEntitySearchPage%"
            io.reactivex.Completable r8 = r8.b(r2, r4)
            r0.d = r5
            r0.e = r5
            r0.b = r3
            java.lang.Object r8 = o.dAU.b(r8, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            o.dpR r8 = o.dpR.c
            return r8
        L8f:
            o.dpR r8 = o.dpR.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6099cTv.c(o.dra):java.lang.Object");
    }
}
