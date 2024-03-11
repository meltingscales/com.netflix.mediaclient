package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bPf  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3911bPf implements bNF {
    private final dwQ c;
    private final aDB d;
    private final aCG e;

    @Inject
    public C3911bPf(aCG acg, aDB adb, dwQ dwq) {
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) dwq, "");
        this.e = acg;
        this.d = adb;
        this.c = dwq;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // o.bNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r10, boolean r11, o.InterfaceC8585dra<? super com.netflix.mediaclient.servicemgr.interface_.GameDetails> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$fetchGameDetail$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$fetchGameDetail$1 r0 = (com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$fetchGameDetail$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$fetchGameDetail$1 r0 = new com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$fetchGameDetail$1
            r0.<init>(r9, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r6.a
            o.bPf r10 = (o.C3911bPf) r10
            o.C8556dpz.d(r12)
            goto L6b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            o.C8556dpz.d(r12)
            if (r11 == 0) goto L3e
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r11 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.d
            goto L40
        L3e:
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r11 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.b
        L40:
            r3 = r11
            o.aCG r1 = r9.e
            int r11 = java.lang.Integer.parseInt(r10)
            o.aDB r12 = r9.d
            o.aoD r12 = r12.i()
            o.aDB r4 = r9.d
            o.aoD r4 = r4.j()
            o.Yz r5 = new o.Yz
            r5.<init>(r11, r10, r12, r4)
            r6.a = r9
            r6.b = r2
            r4 = 0
            r10 = 0
            r7 = 12
            r8 = 0
            r2 = r5
            r5 = r10
            java.lang.Object r12 = o.aCE.d.d(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L6a
            return r0
        L6a:
            r10 = r9
        L6b:
            o.gU r12 = (o.C8954gU) r12
            com.netflix.mediaclient.servicemgr.interface_.GameDetails r10 = r10.a(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3911bPf.e(java.lang.String, boolean, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.bNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r11, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r12, int r13, o.InterfaceC8585dra<? super kotlin.Result<? extends com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$1 r0 = (com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$1 r0 = new com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
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
            com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$2 r2 = new com.netflix.mediaclient.ui.games.impl.gdp.GameDetailRepositoryImpl$setThumbRating$2
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.e = r3
            java.lang.Object r14 = o.C8738dws.c(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.c()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3911bPf.b(java.lang.String, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating, int, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r12, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating r13, int r14, o.InterfaceC8585dra<? super com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating> r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3911bPf.a(java.lang.String, com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating, int, o.dra):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.netflix.mediaclient.servicemgr.interface_.GameDetails a(o.C8954gU<o.C1375Yz.c> r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L6
            com.apollographql.apollo3.exception.ApolloException r1 = r5.a
            goto L7
        L6:
            r1 = r0
        L7:
            if (r1 == 0) goto L14
            D extends o.hE$b r1 = r5.d
            if (r1 == 0) goto Le
            goto L14
        Le:
            com.apollographql.apollo3.exception.ApolloException r5 = r5.a
            o.C8632dsu.d(r5)
            throw r5
        L14:
            if (r5 == 0) goto L3e
            r1 = 0
            r2 = 1
            o.hE$b r1 = o.aCK.b(r5, r1, r2, r0)
            o.Yz$c r1 = (o.C1375Yz.c) r1
            if (r1 == 0) goto L3e
            java.util.List r2 = r1.e()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = o.C8570dqm.d(r2)
            o.Yz$g r2 = (o.C1375Yz.g) r2
            if (r2 == 0) goto L3a
            o.aEi r3 = new o.aEi
            r3.<init>(r2, r1)
            r4.e(r3)
            r4.d(r3)
            goto L3b
        L3a:
            r3 = r0
        L3b:
            if (r3 == 0) goto L3e
            return r3
        L3e:
            if (r5 == 0) goto L78
            java.util.List<o.hw> r5 = r5.e
            if (r5 == 0) goto L68
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = o.C8570dqm.a(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r5.next()
            o.hw r1 = (o.C9035hw) r1
            o.aCS r2 = new o.aCS
            r2.<init>(r1)
            r0.add(r2)
            goto L53
        L68:
            if (r0 == 0) goto L78
            java.lang.Object r5 = o.C8570dqm.d(r0)
            o.aCS r5 = (o.aCS) r5
            if (r5 == 0) goto L78
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L7a
        L78:
            java.lang.String r5 = "Error fetching games detail"
        L7a:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3911bPf.a(o.gU):com.netflix.mediaclient.servicemgr.interface_.GameDetails");
    }

    private final void e(GameDetails gameDetails) {
        String title = gameDetails.getTitle();
        if (title == null || title.length() <= 0) {
            throw new IllegalStateException("Game title can't be null or empty".toString());
        }
        if (gameDetails.i() == null) {
            throw new IllegalStateException("Game minSdk can't be null or empty".toString());
        }
    }

    private final void d(GameDetails gameDetails) {
        String d;
        Map c;
        Map k;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        String j = gameDetails.j();
        if (j == null || j.length() <= 0) {
            arrayList.add("HeroImageUrl");
        }
        String boxshotUrl = gameDetails.getBoxshotUrl();
        if (boxshotUrl == null || boxshotUrl.length() <= 0) {
            arrayList.add("BoxShotUrl");
        }
        String B = gameDetails.B();
        if (B == null || B.length() <= 0) {
            arrayList.add("Synopsis");
        }
        String d2 = gameDetails.d();
        if (d2 == null || d2.length() <= 0) {
            arrayList.add("Compatibility");
        }
        if (!arrayList.isEmpty()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            Pair a = dpD.a("game_id", gameDetails.getId());
            d = C8576dqs.d(arrayList, ",", null, null, 0, null, null, 62, null);
            c = dqE.c(a, dpD.a("missing_field", d));
            k = dqE.k(c);
            C1596aHd c1596aHd = new C1596aHd("Game detail data is missing", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
