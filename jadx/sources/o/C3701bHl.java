package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$3;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$prefetchInternal$2;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import o.C1362Yt;

/* renamed from: o.bHl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3701bHl implements InterfaceC3663bGe {
    private final C3705bHp a;
    private final C8191dfi b;
    private final dwQ c;
    private final aCG e;

    /* renamed from: o.bHl$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    @Inject
    public C3701bHl(aCG acg, dwQ dwq, C3705bHp c3705bHp, C8191dfi c8191dfi) {
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) c3705bHp, "");
        C8632dsu.c((Object) c8191dfi, "");
        this.e = acg;
        this.c = dwq;
        this.a = c3705bHp;
        this.b = c8191dfi;
    }

    @Override // o.InterfaceC3663bGe
    public dyS<Result<InterfaceC5198buI>> e(String str) {
        C8632dsu.c((Object) str, "");
        Observable<ImageResolutionClass> observable = b().toObservable();
        C8632dsu.a(observable, "");
        return dyR.a(dyR.e(new c(dyR.e(dyR.c(C7672dBb.d(observable), (InterfaceC8612dsa) new DetailsPageRepositoryImpl$getVideoDetails$$inlined$flatMapLatest$1(null, this, str))), this), new DetailsPageRepositoryImpl$getVideoDetails$3(null)), this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1362Yt e(String str, ImageResolutionClass imageResolutionClass) {
        List e2;
        e2 = C8566dqi.e(Integer.valueOf(Integer.parseInt(str)));
        return new C1362Yt(e2, str, e(imageResolutionClass), c(imageResolutionClass), b(imageResolutionClass), a(imageResolutionClass), d(imageResolutionClass));
    }

    /* renamed from: o.bHl$c */
    /* loaded from: classes4.dex */
    public static final class c implements dyS<Result<? extends InterfaceC5198buI>> {
        final /* synthetic */ dyS c;
        final /* synthetic */ C3701bHl d;

        public c(dyS dys, C3701bHl c3701bHl) {
            this.c = dys;
            this.d = c3701bHl;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Result<? extends InterfaceC5198buI>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass2(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.bHl$c$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ dyQ d;
            final /* synthetic */ C3701bHl e;

            public AnonymousClass2(dyQ dyq, C3701bHl c3701bHl) {
                this.d = dyq;
                this.e = c3701bHl;
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
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.d
                    o.gU r5 = (o.C8954gU) r5
                    o.bHl r2 = r4.e
                    java.lang.Object r5 = o.C3701bHl.d(r2, r5)
                    kotlin.Result r5 = kotlin.Result.b(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.c.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    private final Single<ImageResolutionClass> b() {
        return new cQF().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(C8954gU<C1362Yt.C1368g> c8954gU) {
        List<C1362Yt.G> j;
        Object x;
        C1362Yt.C1368g c1368g = c8954gU.d;
        if (c1368g != null && (j = c1368g.j()) != null) {
            x = C8576dqs.x(j);
            C1362Yt.G g = (C1362Yt.G) x;
            if (g != null) {
                C1362Yt.C1368g c1368g2 = c8954gU.d;
                C1362Yt.n d = c1368g2 != null ? c1368g2.d() : null;
                C1362Yt.C1368g c1368g3 = c8954gU.d;
                int e2 = c1368g3 != null ? c1368g3.e() : -1;
                C1362Yt.C1368g c1368g4 = c8954gU.d;
                int a = c1368g4 != null ? c1368g4.a() : -1;
                C1362Yt.C1368g c1368g5 = c8954gU.d;
                int b = c1368g5 != null ? c1368g5.b() : -1;
                C1362Yt.C1368g c1368g6 = c8954gU.d;
                int c2 = c1368g6 != null ? c1368g6.c() : -1;
                C1362Yt.C1368g c1368g7 = c8954gU.d;
                r1 = new C1513aEb(g, new C1512aEa(d, e2, a, b, c2, c1368g7 != null ? c1368g7.i() : -1));
            }
        }
        if (r1 != null) {
            Result.c cVar = Result.e;
            return Result.e(r1);
        }
        Result.c cVar2 = Result.e;
        return Result.e(C8556dpz.a(new IllegalArgumentException("Response is invalid, can't parse data")));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3663bGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r11, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r12, int r13, o.InterfaceC8585dra<? super kotlin.Result<? extends com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r14)
            o.dwQ r14 = r10.c
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$2 r2 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRating$2
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r14 = o.C8738dws.c(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.c()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.a(java.lang.String, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating, int, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r11, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r12, int r13, o.InterfaceC8585dra<? super kotlin.Result<? extends com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRatingInternal$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRatingInternal$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRatingInternal$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRatingInternal$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setThumbRatingInternal$1
            r0.<init>(r10, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.a
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r14)
            goto L57
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r14)
            o.aCG r1 = r10.e
            o.aFc r14 = o.C1541aFc.d
            com.netflix.mediaclient.graphql.models.type.ThumbRating r12 = r14.e(r12)
            o.ZE r14 = new o.ZE
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r14.<init>(r11, r12, r13)
            r7.d = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            r2 = r14
            java.lang.Object r14 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L57
            return r0
        L57:
            o.gU r14 = (o.C8954gU) r14
            boolean r11 = r14.a()
            if (r11 == 0) goto L82
            kotlin.Result$c r11 = kotlin.Result.e
            java.util.List<o.hw> r0 = r14.e
            if (r0 == 0) goto L73
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            r8 = 0
            java.lang.String r11 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L74
        L73:
            r11 = 0
        L74:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            java.lang.Object r11 = o.C8556dpz.a(r12)
            java.lang.Object r11 = kotlin.Result.e(r11)
            goto La4
        L82:
            kotlin.Result$c r11 = kotlin.Result.e
            o.aFc r11 = o.C1541aFc.d
            o.hE$b r12 = o.aCK.e(r14)
            o.ZE$d r12 = (o.ZE.d) r12
            o.ZE$b r12 = r12.d()
            if (r12 == 0) goto L9e
            com.netflix.mediaclient.graphql.models.type.ThumbRating r12 = r12.a()
            if (r12 == 0) goto L9e
            com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r11 = r11.d(r12)
            if (r11 != 0) goto La0
        L9e:
            com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r11 = com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.b
        La0:
            java.lang.Object r11 = kotlin.Result.e(r11)
        La4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.d(java.lang.String, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating, int, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3663bGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r11, com.netflix.mediaclient.clutils.TrackingInfoHolder r12, boolean r13, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r14)
            o.dwQ r14 = r10.c
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$2 r2 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInMyListQueue$2
            r9 = 0
            r4 = r2
            r5 = r13
            r6 = r10
            r7 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r3
            java.lang.Object r14 = o.C8738dws.c(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.c()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.c(java.lang.String, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r11, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeMyList$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeMyList$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeMyList$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeMyList$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeMyList$1
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r12)
            goto L4d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r12)
            o.aCG r1 = r10.e
            o.Zn r12 = new o.Zn
            r12.<init>(r11)
            r7.c = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            r2 = r12
            java.lang.Object r12 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L4d
            return r0
        L4d:
            o.gU r12 = (o.C8954gU) r12
            boolean r11 = r12.a()
            if (r11 == 0) goto L78
            kotlin.Result$c r11 = kotlin.Result.e
            java.util.List<o.hw> r0 = r12.e
            if (r0 == 0) goto L69
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            r8 = 0
            java.lang.String r11 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L6a
        L69:
            r11 = 0
        L6a:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            java.lang.Object r11 = o.C8556dpz.a(r12)
            java.lang.Object r11 = kotlin.Result.e(r11)
            goto La6
        L78:
            kotlin.Result$c r11 = kotlin.Result.e
            D extends o.hE$b r11 = r12.d
            o.Zn$a r11 = (o.C1389Zn.a) r11
            if (r11 == 0) goto L9d
            o.Zn$b r11 = r11.e()
            if (r11 == 0) goto L9d
            o.Zn$c r11 = r11.c()
            if (r11 == 0) goto L9d
            o.Zn$e r11 = r11.a()
            if (r11 == 0) goto L9d
            java.lang.Boolean r11 = r11.d()
            if (r11 == 0) goto L9d
            boolean r11 = r11.booleanValue()
            goto L9e
        L9d:
            r11 = 0
        L9e:
            java.lang.Boolean r11 = o.C8589dre.e(r11)
            java.lang.Object r11 = kotlin.Result.e(r11)
        La6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.d(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r11, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addToMyList$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addToMyList$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addToMyList$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addToMyList$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addToMyList$1
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.a
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r12)
            goto L4d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r12)
            o.aCG r1 = r10.e
            o.XW r12 = new o.XW
            r12.<init>(r11)
            r7.d = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            r2 = r12
            java.lang.Object r12 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L4d
            return r0
        L4d:
            o.gU r12 = (o.C8954gU) r12
            boolean r11 = r12.a()
            if (r11 == 0) goto L78
            kotlin.Result$c r11 = kotlin.Result.e
            java.util.List<o.hw> r0 = r12.e
            if (r0 == 0) goto L69
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            r8 = 0
            java.lang.String r11 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L6a
        L69:
            r11 = 0
        L6a:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            java.lang.Object r11 = o.C8556dpz.a(r12)
            java.lang.Object r11 = kotlin.Result.e(r11)
            goto La6
        L78:
            kotlin.Result$c r11 = kotlin.Result.e
            D extends o.hE$b r11 = r12.d
            o.XW$d r11 = (o.XW.d) r11
            if (r11 == 0) goto L9d
            o.XW$b r11 = r11.e()
            if (r11 == 0) goto L9d
            o.XW$a r11 = r11.d()
            if (r11 == 0) goto L9d
            o.XW$e r11 = r11.b()
            if (r11 == 0) goto L9d
            java.lang.Boolean r11 = r11.a()
            if (r11 == 0) goto L9d
            boolean r11 = r11.booleanValue()
            goto L9e
        L9d:
            r11 = 0
        L9e:
            java.lang.Boolean r11 = o.C8589dre.e(r11)
            java.lang.Object r11 = kotlin.Result.e(r11)
        La6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.c(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3663bGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r11, com.netflix.mediaclient.clutils.TrackingInfoHolder r12, boolean r13, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r14)
            o.dwQ r14 = r10.c
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$2 r2 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$setInRemindMeQueue$2
            r9 = 0
            r4 = r2
            r5 = r13
            r6 = r10
            r7 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r14 = o.C8738dws.c(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.c()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.a(java.lang.String, com.netflix.mediaclient.clutils.TrackingInfoHolder, boolean, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Object obj, boolean z, Long l) {
        if (Result.h(obj)) {
            if (C8632dsu.c(Result.a(obj) ? null : obj, Boolean.valueOf(z))) {
                Logger.INSTANCE.endSession(l);
                return;
            }
        }
        if (Result.a(obj)) {
            ExtLogger extLogger = ExtLogger.INSTANCE;
            Throwable d = Result.d(obj);
            extLogger.failedAction(l, d != null ? d.getMessage() : null);
            return;
        }
        ExtLogger.INSTANCE.failedAction(l, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r11, com.netflix.mediaclient.clutils.TrackingInfoHolder r12, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeRemindMe$1
            if (r0 == 0) goto L13
            r0 = r13
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeRemindMe$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeRemindMe$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeRemindMe$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$removeRemindMe$1
            r0.<init>(r10, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.b
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r13)
            goto L55
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r13)
            o.aCG r1 = r10.e
            int r12 = r12.a()
            o.Zs r13 = new o.Zs
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.<init>(r11, r12)
            r7.a = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            r2 = r13
            java.lang.Object r13 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L55
            return r0
        L55:
            o.gU r13 = (o.C8954gU) r13
            boolean r11 = r13.a()
            if (r11 == 0) goto L80
            kotlin.Result$c r11 = kotlin.Result.e
            java.util.List<o.hw> r0 = r13.e
            if (r0 == 0) goto L71
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            r8 = 0
            java.lang.String r11 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L72
        L71:
            r11 = 0
        L72:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            java.lang.Object r11 = o.C8556dpz.a(r12)
            java.lang.Object r11 = kotlin.Result.e(r11)
            goto La2
        L80:
            kotlin.Result$c r11 = kotlin.Result.e
            D extends o.hE$b r11 = r13.d
            o.Zs$b r11 = (o.C1394Zs.b) r11
            if (r11 == 0) goto L99
            o.Zs$d r11 = r11.d()
            if (r11 == 0) goto L99
            java.lang.Boolean r11 = r11.a()
            if (r11 == 0) goto L99
            boolean r11 = r11.booleanValue()
            goto L9a
        L99:
            r11 = 0
        L9a:
            java.lang.Boolean r11 = o.C8589dre.e(r11)
            java.lang.Object r11 = kotlin.Result.e(r11)
        La2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.e(java.lang.String, com.netflix.mediaclient.clutils.TrackingInfoHolder, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, com.netflix.mediaclient.clutils.TrackingInfoHolder r12, o.InterfaceC8585dra<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addRemindMe$1
            if (r0 == 0) goto L13
            r0 = r13
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addRemindMe$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addRemindMe$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addRemindMe$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$addRemindMe$1
            r0.<init>(r10, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.b
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r13)
            goto L55
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r13)
            o.aCG r1 = r10.e
            int r12 = r12.a()
            o.XU r13 = new o.XU
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.<init>(r11, r12)
            r7.a = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            r2 = r13
            java.lang.Object r13 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L55
            return r0
        L55:
            o.gU r13 = (o.C8954gU) r13
            boolean r11 = r13.a()
            if (r11 == 0) goto L80
            kotlin.Result$c r11 = kotlin.Result.e
            java.util.List<o.hw> r0 = r13.e
            if (r0 == 0) goto L71
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            r8 = 0
            java.lang.String r11 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L72
        L71:
            r11 = 0
        L72:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            java.lang.Object r11 = o.C8556dpz.a(r12)
            java.lang.Object r11 = kotlin.Result.e(r11)
            goto La2
        L80:
            kotlin.Result$c r11 = kotlin.Result.e
            D extends o.hE$b r11 = r13.d
            o.XU$d r11 = (o.XU.d) r11
            if (r11 == 0) goto L99
            o.XU$e r11 = r11.d()
            if (r11 == 0) goto L99
            java.lang.Boolean r11 = r11.e()
            if (r11 == 0) goto L99
            boolean r11 = r11.booleanValue()
            goto L9a
        L99:
            r11 = 0
        L9a:
            java.lang.Boolean r11 = o.C8589dre.e(r11)
            java.lang.Object r11 = kotlin.Result.e(r11)
        La2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.a(java.lang.String, com.netflix.mediaclient.clutils.TrackingInfoHolder, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[ORIG_RETURN, RETURN] */
    @Override // o.InterfaceC3663bGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r7, o.C5239bux r8, o.InterfaceC8585dra<? super kotlin.Result<? extends o.InterfaceC5233bur>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1
            if (r0 == 0) goto L13
            r0 = r9
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1 r0 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1 r0 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            o.C8556dpz.d(r9)     // Catch: java.lang.Exception -> L32
            kotlin.Result r9 = (kotlin.Result) r9     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = r9.c()     // Catch: java.lang.Exception -> L32
            goto L8a
        L32:
            r7 = move-exception
            goto L8b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.c
            r8 = r7
            o.bux r8 = (o.C5239bux) r8
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.d
            o.bHl r2 = (o.C3701bHl) r2
            o.C8556dpz.d(r9)
            goto L64
        L4d:
            o.C8556dpz.d(r9)
            io.reactivex.Single r9 = r6.b()
            r0.d = r6
            r0.a = r7
            r0.c = r8
            r0.e = r4
            java.lang.Object r9 = o.dAU.d(r9, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r2 = r6
        L64:
            com.netflix.mediaclient.service.configuration.ImageResolutionClass r9 = (com.netflix.mediaclient.service.configuration.ImageResolutionClass) r9
            int r4 = java.lang.Integer.parseInt(r7)
            java.lang.String r8 = r8.b()
            o.C8632dsu.d(r9)
            int r9 = r2.c(r9)
            o.Ys r5 = new o.Ys
            r5.<init>(r4, r8, r9)
            r8 = 0
            r0.d = r8     // Catch: java.lang.Exception -> L32
            r0.a = r8     // Catch: java.lang.Exception -> L32
            r0.c = r8     // Catch: java.lang.Exception -> L32
            r0.e = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = r2.a(r5, r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r1) goto L8a
            return r1
        L8a:
            return r7
        L8b:
            kotlin.Result$c r8 = kotlin.Result.e
            java.lang.Object r7 = o.C8556dpz.a(r7)
            java.lang.Object r7 = kotlin.Result.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.e(java.lang.String, o.bux, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o.C1361Ys r18, java.lang.String r19, o.InterfaceC8585dra<? super kotlin.Result<? extends o.InterfaceC5233bur>> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2
            if (r3 == 0) goto L19
            r3 = r2
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2 r3 = (com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 + r5
            r3.d = r4
            goto L1e
        L19:
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2 r3 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.e
            java.lang.Object r4 = o.C8588drd.c()
            int r5 = r3.d
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            java.lang.Object r1 = r3.b
            java.lang.String r1 = (java.lang.String) r1
            o.C8556dpz.d(r2)
            goto L54
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            o.C8556dpz.d(r2)
            o.dfi r2 = r0.b
            com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1 r5 = new com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1
            r5.<init>(r0, r1, r7)
            r8 = r19
            r3.b = r8
            r3.d = r6
            java.lang.Object r2 = r2.b(r1, r5, r3)
            if (r2 != r4) goto L53
            return r4
        L53:
            r1 = r8
        L54:
            o.gU r2 = (o.C8954gU) r2
            boolean r3 = r2.a()
            if (r3 == 0) goto L7e
            kotlin.Result$c r1 = kotlin.Result.e
            java.util.List<o.hw> r8 = r2.e
            if (r8 == 0) goto L70
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 63
            r16 = 0
            java.lang.String r7 = o.C8570dqm.c(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L70:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            java.lang.Object r1 = o.C8556dpz.a(r1)
            java.lang.Object r1 = kotlin.Result.e(r1)
            goto Lce
        L7e:
            D extends o.hE$b r3 = r2.d
            o.Ys$a r3 = (o.C1361Ys.a) r3
            if (r3 == 0) goto Lae
            java.util.List r3 = r3.d()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = o.C8570dqm.d(r3)
            o.Ys$d r3 = (o.C1361Ys.d) r3
            if (r3 == 0) goto Lae
            o.Ys$e r3 = r3.a()
            if (r3 == 0) goto Lae
            o.Ys$c r3 = r3.b()
            if (r3 == 0) goto Lae
            kotlin.Result$c r2 = kotlin.Result.e
            o.aDQ r2 = new o.aDQ
            o.aeF r3 = r3.a()
            r2.<init>(r1, r3)
            java.lang.Object r1 = kotlin.Result.e(r2)
            goto Lce
        Lae:
            kotlin.Result$c r1 = kotlin.Result.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Wrong response: doesn't have episodes page info. Resp: "
            r1.append(r3)
            r1.append(r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Object r1 = o.C8556dpz.a(r2)
            java.lang.Object r1 = kotlin.Result.e(r1)
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3701bHl.a(o.Ys, java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(C1362Yt c1362Yt, InterfaceC8585dra<? super C8954gU<C1362Yt.C1368g>> interfaceC8585dra) {
        return this.b.b(c1362Yt, new DetailsPageRepositoryImpl$prefetchInternal$2(this, c1362Yt, null), interfaceC8585dra);
    }

    private final int e(ImageResolutionClass imageResolutionClass) {
        if (C8151dev.f()) {
            if (e.c[imageResolutionClass.ordinal()] == 1) {
                return 1088;
            }
        } else {
            int i = e.c[imageResolutionClass.ordinal()];
            if (i != 1) {
                return i != 2 ? 300 : 450;
            }
        }
        return 600;
    }

    private final int c(ImageResolutionClass imageResolutionClass) {
        int i = e.c[imageResolutionClass.ordinal()];
        if (i != 1) {
            return i != 2 ? 180 : 260;
        }
        return 342;
    }

    private final int b(ImageResolutionClass imageResolutionClass) {
        int i = e.c[imageResolutionClass.ordinal()];
        if (i != 1) {
            return i != 2 ? 110 : 150;
        }
        return 200;
    }

    private final int a(ImageResolutionClass imageResolutionClass) {
        int i = e.c[imageResolutionClass.ordinal()];
        if (i != 1) {
            return i != 2 ? 342 : 608;
        }
        return 912;
    }

    private final int d(ImageResolutionClass imageResolutionClass) {
        int i = e.c[imageResolutionClass.ordinal()];
        if (i != 1) {
            return i != 2 ? 20 : 35;
        }
        return 50;
    }
}
