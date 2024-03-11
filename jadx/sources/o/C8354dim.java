package o;

import android.content.Context;
import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceLevel;
import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceResolution;
import com.netflix.mediaclient.graphql.models.type.UXConfigPinotSectionKind;
import com.netflix.mediaclient.graphql.models.type.UXConfigPinotUnifiedEntityKind;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.AbstractC8997hK;

/* renamed from: o.dim  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8354dim implements InterfaceC8351dij {
    public static final e d = new e(null);
    private final dwU a;
    private final InterfaceC1469aCl b;
    private final aCG c;
    private final Context e;
    private final C1567aGb g;

    /* renamed from: o.dim$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    @Inject
    public C8354dim(@ApplicationContext Context context, aCG acg, InterfaceC1469aCl interfaceC1469aCl, C1567aGb c1567aGb, dwU dwu) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) interfaceC1469aCl, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) dwu, "");
        this.e = context;
        this.c = acg;
        this.b = interfaceC1469aCl;
        this.g = c1567aGb;
        this.a = dwu;
    }

    /* renamed from: o.dim$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("UxConfigClientCapabilitiesImpl");
        }
    }

    private final boolean p() {
        return System.currentTimeMillis() - C8157dfA.b(this.e, s(), 0L) > TimeUnit.DAYS.toMillis(1L);
    }

    private final String s() {
        String a = this.g.a();
        return "uxConfigTimestamp" + a;
    }

    private final String n() {
        String a = this.g.a();
        return "uxConfig" + a;
    }

    private final C3293awJ q() {
        return new C3293awJ(e(b(), j()), AbstractC8997hK.d.e(Boolean.valueOf(aQE.d.a().d())));
    }

    private final C3236avF r() {
        UXConfigDeviceResolution uXConfigDeviceResolution;
        UXConfigDeviceLevel uXConfigDeviceLevel;
        ImageResolutionClass e2 = this.b.e();
        int i = e2 == null ? -1 : d.d[e2.ordinal()];
        if (i == 1) {
            uXConfigDeviceResolution = UXConfigDeviceResolution.b;
        } else if (i == 2) {
            uXConfigDeviceResolution = UXConfigDeviceResolution.c;
        } else if (i == 3) {
            uXConfigDeviceResolution = UXConfigDeviceResolution.e;
        } else {
            uXConfigDeviceResolution = UXConfigDeviceResolution.e;
        }
        if (C8120deQ.a()) {
            uXConfigDeviceLevel = UXConfigDeviceLevel.a;
        } else {
            uXConfigDeviceLevel = UXConfigDeviceLevel.b;
        }
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3236avF(cVar.e(uXConfigDeviceResolution), cVar.e(uXConfigDeviceLevel), null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // o.InterfaceC8351dij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(boolean r24, o.InterfaceC8585dra<? super java.lang.String> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.netflix.mediaclient.uxconfigclientcapabilities.impl.UxConfigClientCapabilitiesImpl$fetchUxConfigId$1
            if (r2 == 0) goto L17
            r2 = r1
            com.netflix.mediaclient.uxconfigclientcapabilities.impl.UxConfigClientCapabilitiesImpl$fetchUxConfigId$1 r2 = (com.netflix.mediaclient.uxconfigclientcapabilities.impl.UxConfigClientCapabilitiesImpl$fetchUxConfigId$1) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 + r4
            r2.d = r3
            goto L1c
        L17:
            com.netflix.mediaclient.uxconfigclientcapabilities.impl.UxConfigClientCapabilitiesImpl$fetchUxConfigId$1 r2 = new com.netflix.mediaclient.uxconfigclientcapabilities.impl.UxConfigClientCapabilitiesImpl$fetchUxConfigId$1
            r2.<init>(r0, r1)
        L1c:
            r9 = r2
            java.lang.Object r1 = r9.c
            java.lang.Object r2 = o.C8588drd.c()
            int r3 = r9.d
            r12 = 0
            java.lang.String r13 = ""
            r14 = 1
            if (r3 == 0) goto L3d
            if (r3 != r14) goto L35
            java.lang.Object r2 = r9.a
            o.dim r2 = (o.C8354dim) r2
            o.C8556dpz.d(r1)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            goto L99
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            o.C8556dpz.d(r1)
            if (r24 != 0) goto L57
            boolean r1 = r23.p()
            if (r1 != 0) goto L57
            android.content.Context r1 = r0.e
            java.lang.String r2 = r23.n()
            java.lang.String r1 = o.C8157dfA.e(r1, r2, r13)
            if (r1 != 0) goto L55
            goto Lb3
        L55:
            r13 = r1
            goto Lb3
        L57:
            o.hK$c r1 = o.AbstractC8997hK.d
            java.lang.Boolean r3 = o.C8589dre.e(r12)
            o.hK$b r16 = r1.e(r3)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r3 = 1
            long r3 = r1.toSeconds(r3)
            int r1 = (int) r3
            o.avw r20 = r23.o()
            o.awV r3 = new o.awV
            r17 = 0
            r19 = 0
            r21 = 10
            r22 = 0
            r15 = r3
            r18 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            o.aCG r1 = r0.c     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            o.ZF r4 = new o.ZF     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r4.<init>(r3)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r9.a = r0     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r9.d = r14     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 30
            r11 = 0
            r3 = r1
            java.lang.Object r1 = o.aCE.d.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            if (r1 != r2) goto L98
            return r2
        L98:
            r2 = r0
        L99:
            o.gU r1 = (o.C8954gU) r1     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            o.dim$e r3 = o.C8354dim.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r3.getLogTag()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r3 = 0
            o.hE$b r1 = o.aCK.b(r1, r12, r14, r3)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            o.ZF$a r1 = (o.ZF.a) r1     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            o.ZF$b r1 = r1.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            java.lang.String r1 = r1.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            r2.d(r1)     // Catch: com.apollographql.apollo3.exception.ApolloException -> Lb3
            goto L55
        Lb3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8354dim.a(boolean, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC8351dij
    public String e() {
        return C8157dfA.e(this.e, n(), "");
    }

    private final void d(String str) {
        C8157dfA.a(this.e, n(), str);
        C8157dfA.e(this.e, s(), System.currentTimeMillis());
    }

    private final C3279avw o() {
        if (C1867aRe.a.c().e()) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            return new C3279avw(cVar.e(r()), null, cVar.e(d()), null, null, 26, null);
        }
        C3293awJ q = q();
        AbstractC8997hK.c cVar2 = AbstractC8997hK.d;
        return new C3279avw(cVar2.e(r()), null, null, null, cVar2.e(q), 14, null);
    }

    private final C3274avr d() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3274avr(cVar.e(new C3308awY(cVar.e(g()))), cVar.e(new C3309awZ(cVar.e(g()))), cVar.e(new C3233avC(cVar.e(g()))), null, null, 24, null);
    }

    private final C3263avg g() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3263avg(null, cVar.e(new C3273avq(cVar.e(h()), cVar.e(f()), cVar.e(k()), null, 8, null)), 1, null);
    }

    private final C3323awn k() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3323awn(cVar.e(new C3261ave(cVar.e(l()))));
    }

    private final C3237avG f() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3237avG(cVar.e(new C3261ave(cVar.e(m()))));
    }

    private final C3278avv h() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3278avv(cVar.e(new C3261ave(cVar.e(i()))));
    }

    private final C3281avy a() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3281avy(cVar.e(new C3267avk(cVar.e(c()))));
    }

    private final C3272avp m() {
        List<String> e2;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        e2 = C8566dqi.e(C3023arC.b.c().b());
        return new C3272avp(cVar.e(c(e2)), null, null, null, null, null, null, null, cVar.e(a()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -258, 3, null);
    }

    private final C3272avp i() {
        List<String> j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        j = C8569dql.j(C3023arC.b.c().b(), C3068arv.e.a().b());
        return new C3272avp(cVar.e(c(j)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
    }

    private final C3272avp l() {
        List<String> j;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        j = C8569dql.j(C3095asV.a.e().b(), C3023arC.b.c().b(), C3177aty.a.e().b());
        return new C3272avp(cVar.e(c(j)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
    }

    private final C3271avo c() {
        List e2;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        e2 = C8566dqi.e(UXConfigPinotUnifiedEntityKind.n);
        return new C3271avo(null, null, null, null, cVar.e(new C3270avn(cVar.e(new C3262avf(cVar.e(e2))))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 8388607, null);
    }

    private final AbstractC8997hK<C3238avH> e(List<String> list) {
        C3238avH c3238avH;
        List e2;
        if (list.contains(C3095asV.a.e().b())) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            e2 = C8566dqi.e(UXConfigPinotUnifiedEntityKind.n);
            c3238avH = new C3238avH(cVar.e(new C3262avf(cVar.e(e2))));
        } else {
            c3238avH = null;
        }
        return AbstractC8997hK.d.e(c3238avH);
    }

    private final AbstractC8997hK<C3259avc> a(List<String> list) {
        C3259avc c3259avc;
        List e2;
        if (list.contains(C3068arv.e.a().b())) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            e2 = C8566dqi.e(UXConfigPinotUnifiedEntityKind.e);
            c3259avc = new C3259avc(cVar.e(new C3262avf(cVar.e(e2))));
        } else {
            c3259avc = null;
        }
        return AbstractC8997hK.d.e(c3259avc);
    }

    private final AbstractC8997hK<C3270avn> d(List<String> list) {
        C3270avn c3270avn;
        List j;
        if (list.contains(C3023arC.b.c().b())) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            j = C8569dql.j(UXConfigPinotUnifiedEntityKind.n, UXConfigPinotUnifiedEntityKind.h, UXConfigPinotUnifiedEntityKind.i);
            c3270avn = new C3270avn(cVar.e(new C3262avf(cVar.e(j))));
        } else {
            c3270avn = null;
        }
        return AbstractC8997hK.d.e(c3270avn);
    }

    private final AbstractC8997hK<C3367axe> b(List<String> list) {
        C3367axe c3367axe;
        List j;
        if (list.contains(C3177aty.a.e().b())) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            j = C8569dql.j(UXConfigPinotUnifiedEntityKind.n, UXConfigPinotUnifiedEntityKind.h, UXConfigPinotUnifiedEntityKind.i);
            c3367axe = new C3367axe(cVar.e(new C3262avf(cVar.e(j))));
        } else {
            c3367axe = null;
        }
        return AbstractC8997hK.d.e(c3367axe);
    }

    private final C3364axb c(List<String> list) {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3364axb(cVar.e(new C3267avk(cVar.e(new C3271avo(a(list), null, null, null, d(list), null, null, null, null, null, null, e(list), null, null, null, null, b(list), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67602, 8388607, null)))), null, 2, null);
    }

    private final C3294awK a(UXConfigPinotSectionKind uXConfigPinotSectionKind, List<? extends UXConfigPinotUnifiedEntityKind> list) {
        return new C3294awK(uXConfigPinotSectionKind, list);
    }

    private final List<UXConfigPinotSectionKind> j() {
        List<UXConfigPinotSectionKind> j;
        j = C8569dql.j(UXConfigPinotSectionKind.j, UXConfigPinotSectionKind.c, UXConfigPinotSectionKind.d);
        return j;
    }

    private final List<UXConfigPinotUnifiedEntityKind> b() {
        List<UXConfigPinotUnifiedEntityKind> e2;
        e2 = C8566dqi.e(UXConfigPinotUnifiedEntityKind.n);
        return e2;
    }

    private final List<C3294awK> e(List<? extends UXConfigPinotUnifiedEntityKind> list, List<? extends UXConfigPinotSectionKind> list2) {
        int d2;
        d2 = C8572dqo.d(list2, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (UXConfigPinotSectionKind uXConfigPinotSectionKind : list2) {
            arrayList.add(a(uXConfigPinotSectionKind, list));
        }
        return arrayList;
    }
}
