package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1;
import io.reactivex.Completable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import o.C1384Zi;

/* renamed from: o.cBk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5600cBk implements InterfaceC5602cBm {
    public static final a b = new a(null);
    private final C8191dfi a;
    private final aDB c;
    private final aCG d;
    private final dwU e;

    @Inject
    public C5600cBk(aCG acg, aDB adb, C8191dfi c8191dfi, dwU dwu) {
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c8191dfi, "");
        C8632dsu.c((Object) dwu, "");
        this.d = acg;
        this.c = adb;
        this.a = c8191dfi;
        this.e = dwu;
    }

    /* renamed from: o.cBk$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    private final Completable e() {
        return AbstractApplicationC1040Mh.getInstance().i().t();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[ORIG_RETURN, RETURN] */
    @Override // o.InterfaceC5602cBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.util.List<java.lang.Integer> r5, o.InterfaceC8585dra<? super kotlin.Result<? extends com.netflix.mediaclient.android.app.Status>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForPlayer$1
            if (r0 == 0) goto L13
            r0 = r6
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForPlayer$1 r0 = (com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForPlayer$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForPlayer$1 r0 = new com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchForPlayer$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.c
            o.cBk r5 = (o.C5600cBk) r5
            o.C8556dpz.d(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r6)
            o.Zi r5 = r4.e(r5)
            r0.c = r4
            r0.e = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            o.gU r6 = (o.C8954gU) r6
            if (r6 == 0) goto L51
            kotlin.Result r5 = r5.d(r6)
            goto L52
        L51:
            r5 = 0
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5600cBk.d(java.util.List, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC5602cBm
    public void d(String str) {
        C8632dsu.c((Object) str, "");
        C8737dwr.c(this.e, null, null, new PlayerPrefetchRepositoryImpl$prefetchForEpisodeList$1(this, d(Integer.parseInt(str)), null), 3, null);
    }

    private final C1384Zi e(List<Integer> list) {
        aDB adb = this.c;
        return new C1384Zi(list, aDB.b(adb, adb.t(), null, 2, null));
    }

    private final C1359Yq d(int i) {
        aDB adb = this.c;
        C2865aoD b2 = aDB.b(adb, adb.t(), null, 2, null);
        aDB adb2 = this.c;
        return new C1359Yq(i, b2, aDB.c(adb2, adb2.d(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8 
      PHI: (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0067, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(o.C1359Yq r7, o.InterfaceC8585dra<? super o.C8954gU<o.C1359Yq.e>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1 r0 = (com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1 r0 = new com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.e
            o.Yq r7 = (o.C1359Yq) r7
            java.lang.Object r2 = r0.d
            o.cBk r2 = (o.C5600cBk) r2
            o.C8556dpz.d(r8)
            goto L55
        L40:
            o.C8556dpz.d(r8)
            io.reactivex.Completable r8 = r6.e()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = o.dAU.b(r8, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            o.dfi r8 = r2.a
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$2 r4 = new com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchEpisodeList$2
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r8 = r8.b(r7, r4, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5600cBk.d(o.Yq, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8 
      PHI: (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0067, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.C1384Zi r7, o.InterfaceC8585dra<? super o.C8954gU<o.C1384Zi.e>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$1 r0 = (com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$1 r0 = new com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.d
            o.Zi r7 = (o.C1384Zi) r7
            java.lang.Object r2 = r0.e
            o.cBk r2 = (o.C5600cBk) r2
            o.C8556dpz.d(r8)
            goto L55
        L40:
            o.C8556dpz.d(r8)
            io.reactivex.Completable r8 = r6.e()
            r0.e = r6
            r0.d = r7
            r0.a = r4
            java.lang.Object r8 = o.dAU.b(r8, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            o.dfi r8 = r2.a
            com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$2 r4 = new com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepositoryImpl$prefetchPlayer$2
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.e = r5
            r0.d = r5
            r0.a = r3
            java.lang.Object r8 = r8.b(r7, r4, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5600cBk.b(o.Zi, o.dra):java.lang.Object");
    }

    private final Result<Status> d(C8954gU<C1384Zi.e> c8954gU) {
        List<C1384Zi.j> b2;
        Object x;
        C1384Zi.e eVar = c8954gU.d;
        if (eVar != null && (b2 = eVar.b()) != null) {
            x = C8576dqs.x(b2);
            if (((C1384Zi.j) x) != null) {
                Result.c cVar = Result.e;
                return Result.b(Result.e(InterfaceC1078Nw.aJ));
            }
        }
        return null;
    }
}
