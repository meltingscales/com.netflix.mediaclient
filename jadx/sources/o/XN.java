package o;

import com.netflix.mediaclient.features.api.FeatureExperience;
import com.netflix.mediaclient.features.api.FeatureProfileType;
import o.XI;
import o.XR;

/* loaded from: classes3.dex */
public final class XN extends C1045Mp {
    private static final InterfaceC8554dpx b;
    public static final XN c = new XN();
    private static final InterfaceC8554dpx e;

    private XN() {
        super("FeatureConfigParser");
    }

    static {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        b2 = dpB.b(new drO<XR>() { // from class: com.netflix.mediaclient.features.impl.FeatureConfigParser$loggedInParsedFeatureConfig$2

            /* loaded from: classes3.dex */
            public static final class c implements XI {
                private final boolean b = true;
                private final FeatureExperience c = FeatureExperience.d;
                private final FeatureProfileType d = FeatureProfileType.c;

                @Override // o.XI
                public boolean a() {
                    return this.b;
                }

                @Override // o.XI
                public FeatureProfileType c() {
                    return this.d;
                }

                @Override // o.XI
                public FeatureExperience d() {
                    return this.c;
                }

                c() {
                }
            }

            @Override // o.drO
            /* renamed from: d */
            public final XR invoke() {
                c cVar = new c();
                return new XR(cVar, cVar, cVar, cVar, cVar, cVar);
            }
        });
        e = b2;
        b3 = dpB.b(new drO<XR>() { // from class: com.netflix.mediaclient.features.impl.FeatureConfigParser$loggedOutParsedFeatureConfig$2

            /* loaded from: classes3.dex */
            public static final class a implements XI {
                private final boolean c;
                private final FeatureExperience d = FeatureExperience.d;
                private final FeatureProfileType b = FeatureProfileType.d;

                @Override // o.XI
                public boolean a() {
                    return this.c;
                }

                @Override // o.XI
                public FeatureProfileType c() {
                    return this.b;
                }

                @Override // o.XI
                public FeatureExperience d() {
                    return this.d;
                }

                a() {
                }
            }

            @Override // o.drO
            /* renamed from: b */
            public final XR invoke() {
                a aVar = new a();
                return new XR(aVar, aVar, aVar, aVar, aVar, aVar);
            }
        });
        b = b3;
    }

    private final XR e() {
        return (XR) e.getValue();
    }

    private final XR c() {
        return (XR) b.getValue();
    }

    public final XR d(boolean z) {
        if (z) {
            return e();
        }
        return c();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(o.XO r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.XN.a(o.XO, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.XR d(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            r8.getLogTag()
            r0 = 0
            if (r9 == 0) goto L1a
            boolean r1 = o.C8684dus.a(r9)
            if (r1 == 0) goto Ld
            goto L1a
        Ld:
            com.google.gson.Gson r1 = o.C8118deO.a()
            java.lang.Class<o.XO> r2 = o.XO.class
            java.lang.Object r9 = r1.fromJson(r9, r2)
            o.XO r9 = (o.XO) r9
            goto L1b
        L1a:
            r9 = r0
        L1b:
            boolean r10 = r8.a(r9, r10)
            if (r10 == 0) goto Lca
            if (r9 == 0) goto L2f
            o.XO$c r10 = r9.c()
            if (r10 == 0) goto L2f
            o.XO$c$a r10 = r10.c()
            r2 = r10
            goto L30
        L2f:
            r2 = r0
        L30:
            java.lang.String r10 = "Required value was null."
            if (r2 == 0) goto Lc0
            if (r9 == 0) goto L42
            o.XO$c r1 = r9.c()
            if (r1 == 0) goto L42
            o.XO$c$a r1 = r1.b()
            r3 = r1
            goto L43
        L42:
            r3 = r0
        L43:
            if (r3 == 0) goto Lb6
            if (r9 == 0) goto L53
            o.XO$c r1 = r9.c()
            if (r1 == 0) goto L53
            o.XO$c$a r1 = r1.d()
            r4 = r1
            goto L54
        L53:
            r4 = r0
        L54:
            if (r4 == 0) goto Lac
            if (r9 == 0) goto L64
            o.XO$c r1 = r9.c()
            if (r1 == 0) goto L64
            o.XO$c$a r1 = r1.a()
            r5 = r1
            goto L65
        L64:
            r5 = r0
        L65:
            if (r5 == 0) goto La2
            if (r9 == 0) goto L75
            o.XO$c r1 = r9.c()
            if (r1 == 0) goto L75
            o.XO$c$a r1 = r1.f()
            r6 = r1
            goto L76
        L75:
            r6 = r0
        L76:
            if (r6 == 0) goto L98
            if (r9 == 0) goto L84
            o.XO$c r9 = r9.c()
            if (r9 == 0) goto L84
            o.XO$c$a r0 = r9.e()
        L84:
            r7 = r0
            if (r7 == 0) goto L8e
            o.XR r0 = new o.XR
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto Lca
        L8e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L98:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        La2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lac:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lb6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lc0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.XN.d(java.lang.String, boolean):o.XR");
    }
}
