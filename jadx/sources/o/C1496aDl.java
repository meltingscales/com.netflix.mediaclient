package o;

import java.nio.charset.Charset;

/* renamed from: o.aDl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1496aDl implements InterfaceC9103jK {
    private final boolean d;
    private final InterfaceC1471aCn e;

    public C1496aDl(InterfaceC1471aCn interfaceC1471aCn) {
        C8632dsu.c((Object) interfaceC1471aCn, "");
        this.e = interfaceC1471aCn;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    @Override // o.InterfaceC9103jK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(o.C9008hV r9, o.InterfaceC9102jJ r10, o.InterfaceC8585dra<? super o.C9009hW> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.netflix.mediaclient.graphqlrepo.impl.client.network.http.LoggingHttpInterceptor$intercept$1
            if (r0 == 0) goto L13
            r0 = r11
            com.netflix.mediaclient.graphqlrepo.impl.client.network.http.LoggingHttpInterceptor$intercept$1 r0 = (com.netflix.mediaclient.graphqlrepo.impl.client.network.http.LoggingHttpInterceptor$intercept$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.mediaclient.graphqlrepo.impl.client.network.http.LoggingHttpInterceptor$intercept$1 r0 = new com.netflix.mediaclient.graphqlrepo.impl.client.network.http.LoggingHttpInterceptor$intercept$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.a
            o.hV r10 = (o.C9008hV) r10
            java.lang.Object r0 = r0.d
            o.aDl r0 = (o.C1496aDl) r0
            o.C8556dpz.d(r11)
            goto L89
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            o.C8556dpz.d(r11)
            java.util.List r11 = r9.b()
            java.util.Iterator r11 = r11.iterator()
        L48:
            boolean r2 = r11.hasNext()
            r4 = 0
            if (r2 == 0) goto L63
            java.lang.Object r2 = r11.next()
            r5 = r2
            o.hT r5 = (o.C9006hT) r5
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "X-Netflix.tracing.cl.userActionId"
            boolean r5 = o.C8632dsu.c(r5, r6)
            if (r5 == 0) goto L48
            goto L64
        L63:
            r2 = r4
        L64:
            o.hT r2 = (o.C9006hT) r2
            if (r2 == 0) goto L6d
            java.lang.String r11 = r2.a()
            goto L6e
        L6d:
            r11 = r4
        L6e:
            if (r11 == 0) goto L75
            o.aCn r2 = r8.e
            r2.e(r11)
        L75:
            r0.d = r8
            r0.a = r9
            r0.c = r11
            r0.b = r3
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto L84
            return r1
        L84:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L89:
            o.hW r11 = (o.C9009hW) r11
            if (r9 == 0) goto L97
            o.aCn r1 = r0.e
            r1.b(r9)
            o.aCn r1 = r0.e
            r1.a(r9)
        L97:
            boolean r9 = r0.d
            if (r9 == 0) goto L9e
            r0.b(r10)
        L9e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1496aDl.e(o.hV, o.jJ, o.dra):java.lang.Object");
    }

    private final void b(C9008hV c9008hV) {
        if (this.d) {
            try {
                InterfaceC9002hP d = c9008hV.d();
                if (d == null) {
                    return;
                }
                C7872dIo c7872dIo = new C7872dIo();
                d.d(c7872dIo);
                Charset defaultCharset = Charset.defaultCharset();
                C8632dsu.a(defaultCharset, "");
                String a = c7872dIo.a(defaultCharset);
                C1044Mm.c("GQLBODY:", "body=" + a);
            } catch (Exception unused) {
            }
        }
    }
}
