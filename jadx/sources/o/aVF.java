package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aVF extends aUI {
    private final JSONArray e;

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "hdhelper";
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aVF() {
        JSONArray jSONArray = new JSONArray();
        this.e = jSONArray;
        this.i.put("q", jSONArray);
    }

    public final void d(String str) {
        this.i.put("nettype", str);
    }

    public final void a(int i) {
        this.i.put("minttl", i);
    }

    public final void c(int i) {
        this.i.put("maxttl", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = o.duD.d((java.lang.CharSequence) r1, new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r10, int r11, int r12, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r13) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r10, r0)
            o.C8632dsu.c(r13, r0)
            java.lang.String r0 = "X-TCP-Info"
            java.lang.Object r0 = r13.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L79
            java.lang.Object r0 = o.C8570dqm.d(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L79
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r0 = o.C8684dus.e(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L79
            r1 = 10
            int r1 = o.C8570dqm.a(r0, r1)
            int r1 = o.dqF.a(r1)
            r2 = 16
            int r1 = o.C8653dto.e(r1, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "="
            java.lang.String[] r4 = new java.lang.String[]{r1}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r1 = o.C8684dus.e(r3, r4, r5, r6, r7, r8)
            r3 = 0
            java.lang.Object r3 = o.C8570dqm.a(r1, r3)
            r4 = 1
            java.lang.Object r1 = o.C8570dqm.a(r1, r4)
            kotlin.Pair r1 = o.dpD.a(r3, r1)
            java.lang.Object r3 = r1.d()
            java.lang.Object r1 = r1.a()
            r2.put(r3, r1)
            goto L44
        L79:
            java.util.Map r2 = o.dqF.c()
        L7d:
            org.json.JSONArray r0 = r9.e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "url"
            r1.put(r3, r10)
            java.lang.String r10 = "ttl"
            r1.put(r10, r11)
            java.lang.String r10 = "sc"
            r1.put(r10, r12)
            java.lang.String r10 = "addr"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r11 = "hip"
            r1.put(r11, r10)
            java.lang.String r10 = "port"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r11 = "hport"
            r1.put(r11, r10)
            java.lang.String r10 = "Date"
            java.lang.Object r10 = r13.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lba
            java.lang.Object r10 = o.C8570dqm.d(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto Lbb
        Lba:
            r10 = 0
        Lbb:
            java.lang.String r11 = "hts"
            r1.put(r11, r10)
            r0.put(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aVF.d(java.lang.String, int, int, java.util.Map):void");
    }

    public final void e(String str, Exception exc) {
        C8632dsu.c((Object) str, "");
        JSONArray jSONArray = this.e;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignupConstants.Field.URL, str);
        jSONObject.put("err", (exc == null || (r4 = exc.toString()) == null) ? "unknown" : "unknown");
        jSONArray.put(jSONObject);
    }
}
