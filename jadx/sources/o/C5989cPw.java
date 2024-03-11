package o;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.List;
import o.C2569aiZ;
import o.C8569dql;
import o.C8632dsu;
import o.cPA;

/* renamed from: o.cPw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5989cPw extends AbstractC8899fS<cPA> {
    private final InterfaceC5984cPr a;
    public static final c e = new c(null);
    public static final int b = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C5989cPw(@Assisted cPA cpa, InterfaceC5984cPr interfaceC5984cPr) {
        super(cpa, null, 2, null);
        C8632dsu.c((Object) cpa, "");
        C8632dsu.c((Object) interfaceC5984cPr, "");
        this.a = interfaceC5984cPr;
    }

    /* renamed from: o.cPw$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp implements InterfaceC8906fZ<C5989cPw, cPA> {
        private final /* synthetic */ C1644aIy<C5989cPw, cPA> c;

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public C5989cPw create(AbstractC8979gt abstractC8979gt, cPA cpa) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) cpa, "");
            return this.c.create(abstractC8979gt, cpa);
        }

        private c() {
            super("BlockedTitlesViewModel");
            this.c = new C1644aIy<>(C5989cPw.class);
        }

        /* renamed from: initialState */
        public cPA m3174initialState(AbstractC8979gt abstractC8979gt) {
            List i;
            List i2;
            C8632dsu.c((Object) abstractC8979gt, "");
            i = C8569dql.i();
            i2 = C8569dql.i();
            return new cPA(i, i2, false);
        }
    }

    public final void d(C9935zP c9935zP) {
        C8632dsu.c((Object) c9935zP, "");
        this.a.e(c9935zP);
    }

    public final void e(InterfaceC5280bvl interfaceC5280bvl) {
        C8632dsu.c((Object) interfaceC5280bvl, "");
        final List<InterfaceC5278bvj> resultsVideos = interfaceC5280bvl.getSearchSections().get(0).getResultsVideos();
        if (resultsVideos != null) {
            b(new drM<cPA, cPA>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$updateSearchResults$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final cPA invoke(cPA cpa) {
                    C8632dsu.c((Object) cpa, "");
                    return cPA.copy$default(cpa, null, resultsVideos, false, 5, null);
                }
            });
        }
    }

    public final void f() {
        b(new drM<cPA, cPA>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$clearSearchResults$1
            @Override // o.drM
            /* renamed from: c */
            public final cPA invoke(cPA cpa) {
                List i;
                C8632dsu.c((Object) cpa, "");
                i = C8569dql.i();
                return cPA.copy$default(cpa, null, i, false, 5, null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r5, io.reactivex.Observable<o.dpR> r6, android.content.Context r7, o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$searchItem$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$searchItem$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$searchItem$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$searchItem$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$searchItem$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.d
            o.cPw r5 = (o.C5989cPw) r5
            o.C8556dpz.d(r8)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r8)
            o.cPr r8 = r4.a
            r0.d = r4
            r0.e = r3
            java.lang.Object r8 = r8.c(r5, r6, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            o.cTd r8 = (o.AbstractC6078cTd) r8
            boolean r6 = r8 instanceof o.AbstractC6078cTd.C
            if (r6 == 0) goto L56
            o.cTd$C r8 = (o.AbstractC6078cTd.C) r8
            o.bvl r6 = r8.d()
            r5.e(r6)
            goto L6c
        L56:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Search event unknown: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = "BlockedTitlesScreen"
            java.lang.String r5 = r5.toString()
            o.C1044Mm.e(r6, r5)
        L6c:
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5989cPw.d(java.lang.String, io.reactivex.Observable, android.content.Context, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$1
            if (r0 == 0) goto L13
            r0 = r6
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.b
            o.cPw r5 = (o.C5989cPw) r5
            o.C8556dpz.d(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r6)
            o.cPr r6 = r4.a
            r0.b = r4
            r0.d = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            o.aiZ r6 = (o.C2569aiZ) r6
            java.util.List r6 = r5.d(r6)
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$2 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$fetchBlockedTitles$2
            r0.<init>()
            r5.b(r0)
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5989cPw.c(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, final o.InterfaceC5278bvj r7, o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r8)
            goto L61
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            o.C8556dpz.d(r8)
            java.lang.String r8 = r7.aO_()
            java.lang.String r2 = ""
            o.C8632dsu.a(r8, r2)
            java.lang.Integer r8 = o.C8684dus.e(r8)
            if (r8 == 0) goto L6e
            int r8 = r8.intValue()
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$2 r4 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$addTitleProtection$2
            r4.<init>()
            r5.b(r4)
            o.cPr r8 = r5.a
            java.lang.String r7 = r7.aO_()
            o.C8632dsu.a(r7, r2)
            r0.c = r3
            java.lang.Object r8 = r8.a(r6, r7, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            o.cPw$c r6 = o.C5989cPw.e
            r6.getLogTag()
            o.dpR r6 = o.dpR.c
            return r6
        L6e:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5989cPw.d(java.lang.String, o.bvj, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, final java.lang.String r6, o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$1
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            o.C8556dpz.d(r7)
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$2 r7 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.BlockedTitlesViewModel$removeTitleProtection$2
            r7.<init>()
            r4.b(r7)
            o.cPr r7 = r4.a
            r0.e = r3
            java.lang.Object r7 = r7.c(r5, r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            o.cPw$c r5 = o.C5989cPw.e
            r5.getLogTag()
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5989cPw.b(java.lang.String, java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.cPu] */
    private final List<C5987cPu> d(C2569aiZ c2569aiZ) {
        List<C5987cPu> i;
        C2569aiZ.a j;
        List<C2569aiZ.b> a;
        C2316adu b2;
        C2316adu b3;
        if (c2569aiZ == null || (j = c2569aiZ.j()) == null || (a = j.a()) == null) {
            i = C8569dql.i();
            return i;
        }
        ArrayList arrayList = new ArrayList();
        for (C2569aiZ.b bVar : a) {
            C2569aiZ.c c2 = bVar.c();
            String str = null;
            Integer valueOf = (c2 == null || (b3 = c2.b()) == null) ? null : Integer.valueOf(b3.b());
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                C2569aiZ.c c3 = bVar.c();
                if (c3 != null && (b2 = c3.b()) != null) {
                    str = b2.d();
                }
                str = new C5987cPu(intValue, str);
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
