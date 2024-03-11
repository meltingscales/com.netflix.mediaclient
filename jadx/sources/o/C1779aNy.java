package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;

/* renamed from: o.aNy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1779aNy extends aUI {
    public static final b b = new b(null);
    private final String a;
    private final String d;
    private final long e;
    private final String g;
    private final String j;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public C1779aNy(long j, String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = j;
        this.g = str;
        this.d = str2;
        this.a = str3;
        this.j = str4;
    }

    /* renamed from: o.aNy$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_CdxLatencyLogblob");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.CdxLatency.a();
        C8632dsu.a(a, "");
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: JSONException -> 0x004c, TryCatch #0 {JSONException -> 0x004c, blocks: (B:3:0x0002, B:5:0x0008, B:14:0x0021, B:16:0x0040, B:18:0x0047, B:8:0x0015, B:10:0x0019), top: B:22:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: JSONException -> 0x004c, TRY_LEAVE, TryCatch #0 {JSONException -> 0x004c, blocks: (B:3:0x0002, B:5:0x0008, B:14:0x0021, B:16:0x0040, B:18:0x0047, B:8:0x0015, B:10:0x0019), top: B:22:0x0002 }] */
    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject c() {
        /*
            r7 = this;
            java.lang.String r0 = "wifi"
            java.lang.String r1 = r7.a     // Catch: org.json.JSONException -> L4c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.String r4 = "mobile"
            r5 = 0
            r6 = 2
            boolean r1 = o.C8684dus.c(r1, r4, r5, r6, r2)     // Catch: org.json.JSONException -> L4c
            if (r1 != r3) goto L15
            java.lang.String r0 = "cellular"
            goto L21
        L15:
            java.lang.String r1 = r7.a     // Catch: org.json.JSONException -> L4c
            if (r1 == 0) goto L20
            boolean r1 = o.C8684dus.d(r1, r0, r3)     // Catch: org.json.JSONException -> L4c
            if (r1 != r3) goto L20
            goto L21
        L20:
            r0 = r2
        L21:
            org.json.JSONObject r1 = r7.i     // Catch: org.json.JSONException -> L4c
            long r2 = r7.e     // Catch: org.json.JSONException -> L4c
            java.lang.String r4 = "avgpll"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L4c
            r1.putOpt(r4, r2)     // Catch: org.json.JSONException -> L4c
            java.lang.String r2 = r7.g     // Catch: org.json.JSONException -> L4c
            java.lang.String r3 = "targetEsn"
            r1.putOpt(r3, r2)     // Catch: org.json.JSONException -> L4c
            java.lang.String r2 = r7.d     // Catch: org.json.JSONException -> L4c
            java.lang.String r3 = "controllerEsn"
            r1.putOpt(r3, r2)     // Catch: org.json.JSONException -> L4c
            java.lang.String r2 = r7.j     // Catch: org.json.JSONException -> L4c
            if (r2 == 0) goto L45
            java.lang.String r3 = "companionSessionId"
            r1.putOpt(r3, r2)     // Catch: org.json.JSONException -> L4c
        L45:
            if (r0 == 0) goto L4c
            java.lang.String r2 = "networkType"
            r1.putOpt(r2, r0)     // Catch: org.json.JSONException -> L4c
        L4c:
            o.aNy$b r0 = o.C1779aNy.b
            r0.getLogTag()
            org.json.JSONObject r0 = r7.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1779aNy.c():org.json.JSONObject");
    }
}
