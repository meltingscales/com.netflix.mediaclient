package o;

import fi.iki.elonen.NanoHTTPD;

/* renamed from: o.aWf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2002aWf extends NanoHTTPD {
    public static final b b = new b(null);
    public static int e = 9080;
    private final C2038aXo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002aWf(C2038aXo c2038aXo) {
        super(e);
        C8632dsu.c((Object) c2038aXo, "");
        this.c = c2038aXo;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public void b() {
        super.b();
        int h = h();
        e = h;
        C1044Mm.c("MdxHTTPD", "MDX Web server started on port: %d", Integer.valueOf(h));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: JSONException -> 0x0080, TryCatch #2 {JSONException -> 0x0080, blocks: (B:11:0x003e, B:13:0x0048, B:15:0x0056, B:17:0x005c, B:19:0x006d, B:14:0x0052), top: B:31:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: JSONException -> 0x0080, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0080, blocks: (B:11:0x003e, B:13:0x0048, B:15:0x0056, B:17:0x005c, B:19:0x006d, B:14:0x0052), top: B:31:0x003e }] */
    @Override // fi.iki.elonen.NanoHTTPD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fi.iki.elonen.NanoHTTPD.Response d(fi.iki.elonen.NanoHTTPD.l r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MDXGUARD: INVALID MDX MESSAGE"
            java.lang.String r1 = ""
            o.C8632dsu.c(r9, r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            fi.iki.elonen.NanoHTTPD$Method r3 = r9.c()
            fi.iki.elonen.NanoHTTPD$Method r4 = fi.iki.elonen.NanoHTTPD.Method.PUT
            java.lang.String r5 = "Error: %s"
            java.lang.String r6 = "text/plain"
            java.lang.String r7 = "MdxHTTPD"
            if (r4 == r3) goto L1e
            fi.iki.elonen.NanoHTTPD$Method r4 = fi.iki.elonen.NanoHTTPD.Method.POST
            if (r4 != r3) goto L21
        L1e:
            r9.b(r2)     // Catch: fi.iki.elonen.NanoHTTPD.ResponseException -> La4 java.io.IOException -> Lc0
        L21:
            java.lang.String r3 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "PostData: %s"
            o.C1044Mm.c(r7, r4, r3)
            java.lang.String r3 = "postData"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L98
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L52
            java.lang.String r9 = r9.h()     // Catch: org.json.JSONException -> L80
            boolean r9 = r8.a(r9)     // Catch: org.json.JSONException -> L80
            if (r9 == 0) goto L52
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L80
            java.lang.String r2 = o.C8168dfL.n(r2)     // Catch: org.json.JSONException -> L80
            r9.<init>(r2)     // Catch: org.json.JSONException -> L80
            goto L56
        L52:
            org.json.JSONObject r9 = o.C2069aYs.a(r2)     // Catch: org.json.JSONException -> L80
        L56:
            boolean r2 = o.C1997aWa.b(r9)     // Catch: org.json.JSONException -> L80
            if (r2 == 0) goto L6d
            o.aXo r0 = r8.c     // Catch: org.json.JSONException -> L80
            r0.a(r9)     // Catch: org.json.JSONException -> L80
            fi.iki.elonen.NanoHTTPD$Response$Status r9 = fi.iki.elonen.NanoHTTPD.Response.Status.OK     // Catch: org.json.JSONException -> L80
            java.lang.String r0 = "status=ok"
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r9, r6, r0)     // Catch: org.json.JSONException -> L80
            o.C8632dsu.a(r9, r1)     // Catch: org.json.JSONException -> L80
            return r9
        L6d:
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> L80
            r2 = 0
            r9[r2] = r0     // Catch: org.json.JSONException -> L80
            o.C1044Mm.j(r7, r5, r9)     // Catch: org.json.JSONException -> L80
            fi.iki.elonen.NanoHTTPD$Response$Status r9 = fi.iki.elonen.NanoHTTPD.Response.Status.NO_CONTENT     // Catch: org.json.JSONException -> L80
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r9, r6, r0)     // Catch: org.json.JSONException -> L80
            o.C8632dsu.a(r9, r1)     // Catch: org.json.JSONException -> L80
            return r9
        L80:
            java.lang.String r9 = "Error parsing MDX message"
            o.C1044Mm.a(r7, r9)
            java.lang.String r9 = "MDXGUARD: INVALID JSON"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            o.C1044Mm.j(r7, r5, r0)
            fi.iki.elonen.NanoHTTPD$Response$Status r0 = fi.iki.elonen.NanoHTTPD.Response.Status.NO_CONTENT
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r0, r6, r9)
            o.C8632dsu.a(r9, r1)
            return r9
        L98:
            fi.iki.elonen.NanoHTTPD$Response$Status r9 = fi.iki.elonen.NanoHTTPD.Response.Status.NO_CONTENT
            java.lang.String r0 = "POST BODY MISSING"
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r9, r6, r0)
            o.C8632dsu.a(r9, r1)
            return r9
        La4:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            o.C1044Mm.j(r7, r5, r0)
            fi.iki.elonen.NanoHTTPD$Response$Status r0 = r9.d()
            java.lang.String r9 = r9.getMessage()
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r0, r6, r9)
            o.C8632dsu.a(r9, r1)
            return r9
        Lc0:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            o.C1044Mm.j(r7, r5, r0)
            fi.iki.elonen.NanoHTTPD$Response$Status r0 = fi.iki.elonen.NanoHTTPD.Response.Status.INTERNAL_ERROR
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SERVER INTERNAL ERROR: IOException: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            fi.iki.elonen.NanoHTTPD$Response r9 = fi.iki.elonen.NanoHTTPD.e(r0, r6, r9)
            o.C8632dsu.a(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2002aWf.d(fi.iki.elonen.NanoHTTPD$l):fi.iki.elonen.NanoHTTPD$Response");
    }

    private final boolean a(String str) {
        boolean d;
        if (str != null) {
            d = duD.d((CharSequence) str, (CharSequence) "/ddr", false, 2, (Object) null);
            return d;
        }
        return false;
    }

    /* renamed from: o.aWf$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
