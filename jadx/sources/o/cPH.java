package o;

import android.annotation.SuppressLint;
import android.content.Context;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import o.AbstractC6078cTd;
import o.AbstractC6094cTq;

/* loaded from: classes4.dex */
public final class cPH implements InterfaceC5984cPr {
    private final long a;
    private final aCG c;
    private C9935zP d;
    private final InterfaceC6083cTf g;
    private InterfaceC6086cTi j;
    public static final e e = new e(null);
    public static final int b = 8;

    @Inject
    public cPH(aCG acg, InterfaceC6083cTf interfaceC6083cTf) {
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) interfaceC6083cTf, "");
        this.c = acg;
        this.g = interfaceC6083cTf;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ViewingRestrictionsRepository");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[Catch: ApolloException -> 0x0058, TRY_LEAVE, TryCatch #0 {ApolloException -> 0x0058, blocks: (B:11:0x0027, B:19:0x004c, B:21:0x0054, B:16:0x0036), top: B:24:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC5984cPr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(o.InterfaceC8585dra<? super java.util.List<o.C1343Ya.a>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchAllMaturityRatings$1
            if (r0 == 0) goto L13
            r0 = r11
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchAllMaturityRatings$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchAllMaturityRatings$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchAllMaturityRatings$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchAllMaturityRatings$1
            r0.<init>(r10, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.b
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            o.C8556dpz.d(r11)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            goto L4c
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            o.C8556dpz.d(r11)
            o.aCG r1 = r10.c     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            o.Ya r11 = new o.Ya     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            r11.<init>(r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            r6.b = r2     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r11
            java.lang.Object r11 = o.aCE.d.d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            if (r11 != r0) goto L4c
            return r0
        L4c:
            o.gU r11 = (o.C8954gU) r11     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            D extends o.hE$b r11 = r11.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            o.Ya$e r11 = (o.C1343Ya.e) r11     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
            if (r11 == 0) goto L58
            java.util.List r9 = r11.d()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L58
        L58:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPH.a(o.dra):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(2:15|17)|19))|27|6|7|(0)(0)|11|(3:13|15|17)|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.InterfaceC5984cPr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r8, o.InterfaceC8585dra<? super o.C2569aiZ> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1
            if (r0 == 0) goto L13
            r0 = r9
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchBlockedTitles$1
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            goto L4b
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            o.C8556dpz.d(r9)
            o.aCG r1 = r7.c     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            o.Yh r9 = new o.Yh     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            r9.<init>(r8)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode r3 = com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority r4 = com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            r6.b = r2     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            r5 = 1
            r2 = r9
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            if (r9 != r0) goto L4b
            return r0
        L4b:
            o.gU r9 = (o.C8954gU) r9     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            D extends o.hE$b r8 = r9.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            o.Yh$d r8 = (o.C1350Yh.d) r8     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            if (r8 == 0) goto L5e
            o.Yh$a r8 = r8.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            if (r8 == 0) goto L5e
            o.aiZ r8 = r8.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L5e
            goto L5f
        L5e:
            r8 = 0
        L5f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPH.a(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(1:15)|21|17|18))|29|6|7|(0)(0)|11|(2:13|15)|21|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r12.b() != true) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.InterfaceC5984cPr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r12, java.lang.String r13, o.InterfaceC8585dra<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$addProfileTitleProtection$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$addProfileTitleProtection$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$addProfileTitleProtection$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$addProfileTitleProtection$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$addProfileTitleProtection$1
            r0.<init>(r11, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.b
            r10 = 1
            if (r1 == 0) goto L32
            if (r1 != r10) goto L2a
            o.C8556dpz.d(r14)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            goto L57
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            o.C8556dpz.d(r14)
            o.aCG r1 = r11.c     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.XV r2 = new o.XV     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.aox r14 = new o.aox     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.hK$c r3 = o.AbstractC8997hK.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.hK$b r12 = r3.e(r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r14.<init>(r13, r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r2.<init>(r14)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r7.b = r10     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            java.lang.Object r14 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r14 != r0) goto L57
            return r0
        L57:
            o.gU r14 = (o.C8954gU) r14     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            D extends o.hE$b r12 = r14.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.XV$c r12 = (o.XV.c) r12     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 == 0) goto L6c
            o.XV$b r12 = r12.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 == 0) goto L6c
            boolean r12 = r12.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 != r10) goto L6c
            goto L6d
        L6c:
            r10 = 0
        L6d:
            java.lang.Boolean r12 = o.C8589dre.e(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPH.a(java.lang.String, java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(1:15)|21|17|18))|29|6|7|(0)(0)|11|(2:13|15)|21|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r12.a() != true) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.InterfaceC5984cPr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r12, java.lang.String r13, o.InterfaceC8585dra<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$removeProfileTitleProtection$1
            r0.<init>(r11, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.c
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.d
            r10 = 1
            if (r1 == 0) goto L32
            if (r1 != r10) goto L2a
            o.C8556dpz.d(r14)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            goto L57
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            o.C8556dpz.d(r14)
            o.aCG r1 = r11.c     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.Zu r2 = new o.Zu     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.auh r14 = new o.auh     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.hK$c r3 = o.AbstractC8997hK.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.hK$b r12 = r3.e(r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r14.<init>(r13, r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r2.<init>(r14)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r7.d = r10     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 30
            r9 = 0
            java.lang.Object r14 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r14 != r0) goto L57
            return r0
        L57:
            o.gU r14 = (o.C8954gU) r14     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            D extends o.hE$b r12 = r14.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            o.Zu$e r12 = (o.C1396Zu.e) r12     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 == 0) goto L6c
            o.Zu$d r12 = r12.c()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 == 0) goto L6c
            boolean r12 = r12.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6c
            if (r12 != r10) goto L6c
            goto L6d
        L6c:
            r10 = 0
        L6d:
            java.lang.Boolean r12 = o.C8589dre.e(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPH.c(java.lang.String, java.lang.String, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC5984cPr
    public void e(C9935zP c9935zP) {
        C8632dsu.c((Object) c9935zP, "");
        this.j = this.g.b(c9935zP.d());
        this.d = c9935zP;
    }

    @Override // o.InterfaceC5984cPr
    @SuppressLint({"CheckResult"})
    public Object c(String str, Observable<dpR> observable, Context context, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        Observable<AbstractC6078cTd> b2;
        InterfaceC6086cTi interfaceC6086cTi = this.j;
        if (interfaceC6086cTi == null || (b2 = interfaceC6086cTi.b(str, context, new C6087cTj(this.a, 0, 0, 0, 15, new C6089cTl(new ArrayList(), false, new LinkedHashMap(), new LinkedHashMap(), null, new LinkedHashMap(), null, str, AbstractC6094cTq.a.e, null, this.a, 528, null)), true)) == null) {
            return null;
        }
        return dAU.d(b2, new drO<AbstractC6078cTd>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsRepositoryImpl$fetchSearchResult$2
            @Override // o.drO
            /* renamed from: d */
            public final AbstractC6078cTd invoke() {
                return AbstractC6078cTd.C6079a.c;
            }
        }, interfaceC8585dra);
    }
}
