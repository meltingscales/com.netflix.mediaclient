package o;

/* loaded from: classes.dex */
public final class aGL {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final o.cYC b(android.content.Context r11, o.InterfaceC5283bvo r12) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r11, r0)
            o.C8632dsu.c(r12, r0)
            java.lang.String r0 = r12.getProfileGuid()
            if (r0 == 0) goto L14
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto Lb2
        L14:
            o.aHe$d r0 = o.InterfaceC1597aHe.b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r6 = o.dqF.d(r0)
            o.aHd r0 = new o.aHd
            java.lang.String r2 = "SPY-35060 - User profile has a null or blank profile GUID"
            r3 = 0
            r4 = 0
            r5 = 1
            r7 = 0
            r8 = 0
            r9 = 96
            r10 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.netflix.mediaclient.api.logging.error.ErrorType r1 = r0.a
            if (r1 == 0) goto L5f
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.e
            java.lang.String r3 = "errorType"
            java.lang.String r4 = r1.c()
            r2.put(r3, r4)
            java.lang.String r2 = r0.b()
            if (r2 == 0) goto L5f
            java.lang.String r1 = r1.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.a(r1)
        L5f:
            java.lang.String r1 = r0.b()
            if (r1 == 0) goto L75
            java.lang.Throwable r1 = r0.i
            if (r1 == 0) goto L75
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = r0.b()
            java.lang.Throwable r3 = r0.i
            r1.<init>(r2, r3)
            goto L9f
        L75:
            java.lang.String r1 = r0.b()
            if (r1 == 0) goto L85
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = r0.b()
            r1.<init>(r2)
            goto L9f
        L85:
            java.lang.Throwable r1 = r0.i
            if (r1 == 0) goto L98
            if (r1 == 0) goto L8c
            goto L9f
        L8c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L98:
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Handled exception with no message"
            r1.<init>(r2)
        L9f:
            o.aHi$d r2 = o.InterfaceC1601aHi.c
            o.aHe r3 = r2.c()
            if (r3 == 0) goto Lab
            r3.d(r0, r1)
            goto Lb2
        Lab:
            o.aHb r2 = r2.e()
            r2.b(r0, r1)
        Lb2:
            o.aGb$e r0 = o.C1567aGb.a
            o.aGb r12 = r0.e(r12)
            o.aFY$b r0 = o.aFY.b
            o.aFY r11 = r0.e(r11)
            o.aFU r11 = r11.e(r12)
            java.lang.Class<o.aGr> r12 = o.InterfaceC1583aGr.class
            java.lang.Object r11 = dagger.hilt.EntryPoints.get(r11, r12)
            o.aGr r11 = (o.InterfaceC1583aGr) r11
            o.cYC r11 = r11.t()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aGL.b(android.content.Context, o.bvo):o.cYC");
    }
}
