package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.WatchQueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1362Yt;
import o.C3701bHl;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.dpR;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getVideoDetails$1$1 extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super C8954gU<C1362Yt.C1368g>>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ WatchQueryMode a;
    private /* synthetic */ Object b;
    int c;
    final /* synthetic */ C1362Yt d;
    final /* synthetic */ C3701bHl e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getVideoDetails$1$1(C3701bHl c3701bHl, C1362Yt c1362Yt, WatchQueryMode watchQueryMode, InterfaceC8585dra<? super DetailsPageRepositoryImpl$getVideoDetails$1$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.e = c3701bHl;
        this.d = c1362Yt;
        this.a = watchQueryMode;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: b */
    public final Object invoke(dyQ<? super C8954gU<C1362Yt.C1368g>> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        DetailsPageRepositoryImpl$getVideoDetails$1$1 detailsPageRepositoryImpl$getVideoDetails$1$1 = new DetailsPageRepositoryImpl$getVideoDetails$1$1(this.e, this.d, this.a, interfaceC8585dra);
        detailsPageRepositoryImpl$getVideoDetails$1$1.b = dyq;
        return detailsPageRepositoryImpl$getVideoDetails$1$1.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e2;
        aCG acg;
        e2 = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            acg = this.e.e;
            dyS b = dyR.b(new e(aCE.d.d((aCE) acg, (InterfaceC8999hM) this.d, this.a, (QueryMode) null, (RequestPriority) null, false, 28, (Object) null)), 1);
            this.c = 1;
            if (dyR.e((dyQ) this.b, b, this) == e2) {
                return e2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* loaded from: classes4.dex */
    public static final class e implements dyS<C8954gU<C1362Yt.C1368g>> {
        final /* synthetic */ dyS e;

        public e(dyS dys) {
            this.e = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C8954gU<C1362Yt.C1368g>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$e$4  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ a;

            public AnonymousClass4(dyQ dyq) {
                this.a = dyq;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
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
                    o.dyQ r6 = r4.a
                    r2 = r5
                    o.gU r2 = (o.C8954gU) r2
                    com.apollographql.apollo3.exception.ApolloException r2 = r2.a
                    if (r2 == 0) goto L41
                    boolean r2 = r2 instanceof com.apollographql.apollo3.exception.CacheMissException
                    if (r2 != 0) goto L4a
                L41:
                    r0.e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1.e.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
