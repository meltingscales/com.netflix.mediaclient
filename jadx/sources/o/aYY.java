package o;

import android.content.Context;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONObject;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.repository.SecureStoreProvider;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class aYY implements InterfaceC8429dlg, InterfaceC5170bth {
    protected Context b;
    protected C8378djj c;
    protected UserAgent d;
    protected AbstractC8399dkd e;
    protected final Map<dkO, AbstractC8393djy> a = new ConcurrentHashMap();
    protected final Map<String, dkU> n = new ConcurrentHashMap();
    protected final Map<Long, Long> g = new HashMap();
    protected final Set<dkQ> i = b();
    protected final Map<Long, Set<dkQ>> j = new HashMap();
    protected final Map<Long, Set<dkQ>> h = new HashMap();
    protected final Map<String, AuthCookieHolder> f = new HashMap();

    public aYY(Context context, UserAgent userAgent, AbstractC8399dkd abstractC8399dkd) {
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null!");
        }
        if (userAgent == null) {
            throw new IllegalArgumentException("User can not be null!");
        }
        this.b = context;
        this.d = userAgent;
        this.e = abstractC8399dkd;
    }

    @Override // o.InterfaceC8429dlg
    public void e(dkO dko, AbstractC8393djy abstractC8393djy) {
        synchronized (this) {
            C1044Mm.e("nf_msl_store", "setCryptoContex:: starts...");
            if (abstractC8393djy == null) {
                b(dko);
            } else {
                this.a.put(dko, abstractC8393djy);
                n();
            }
            C1044Mm.e("nf_msl_store", "setCryptoContex:: done.");
        }
    }

    @Override // o.InterfaceC8429dlg
    public dkO i() {
        dkO dko;
        synchronized (this) {
            dko = null;
            for (dkO dko2 : this.a.keySet()) {
                if (dko == null || dko2.d(dko)) {
                    dko = dko2;
                }
            }
        }
        return dko;
    }

    @Override // o.InterfaceC8429dlg
    public void b(dkO dko) {
        synchronized (this) {
            e(dko);
            n();
        }
    }

    private void e(dkO dko) {
        k();
        AbstractC8393djy remove = this.a.remove(dko);
        if (remove != null) {
            if (remove instanceof C2085aZh) {
                ((C2085aZh) remove).d();
                long c = dko.c();
                Iterator<dkO> it = this.a.keySet().iterator();
                while (it.hasNext()) {
                    if (it.next().c() == c) {
                        return;
                    }
                }
                this.g.remove(Long.valueOf(c));
                for (dkU dku : this.n.values()) {
                    if (dku.d(dko)) {
                        d(dku);
                    }
                }
                try {
                    b(null, dko, null);
                    return;
                } catch (MslException e) {
                    throw new MslInternalException("Unexpected exception while removing master token bound service tokens.", e);
                }
            }
            C1044Mm.d("nf_msl_store", "NOT Widevine crypto session! This should NOT happen!");
            throw new IllegalStateException("Not Widevine crypto context: " + remove);
        }
        C1044Mm.e("nf_msl_store", "Crypto context not found for %s", dko);
        InterfaceC1598aHf.a("Crypto context not found for master token!");
    }

    @Override // o.InterfaceC8429dlg
    public long c(dkO dko) {
        long d;
        synchronized (this) {
            long c = dko.c();
            d = d(this.g.containsKey(Long.valueOf(c)) ? this.g.get(Long.valueOf(c)).longValue() : 0L);
            this.g.put(Long.valueOf(c), Long.valueOf(d));
            n();
        }
        return d;
    }

    @Override // o.InterfaceC8429dlg
    public AbstractC8393djy d(dkO dko) {
        AbstractC8393djy abstractC8393djy;
        synchronized (this) {
            abstractC8393djy = this.a.get(dko);
        }
        return abstractC8393djy;
    }

    @Override // o.InterfaceC5170bth
    public AuthCookieHolder e(String str) {
        AuthCookieHolder authCookieHolder;
        synchronized (this.f) {
            authCookieHolder = this.f.get(str);
        }
        return authCookieHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 != false) goto L8;
     */
    @Override // o.InterfaceC5170bth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r4, com.netflix.mediaclient.util.net.AuthCookieHolder r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, com.netflix.mediaclient.util.net.AuthCookieHolder> r0 = r3.f
            monitor-enter(r0)
            if (r5 != 0) goto Le
            java.util.Map<java.lang.String, com.netflix.mediaclient.util.net.AuthCookieHolder> r5 = r3.f     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r5.remove(r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L29
            goto L26
        Le:
            java.util.Map<java.lang.String, com.netflix.mediaclient.util.net.AuthCookieHolder> r1 = r3.f     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2b
            com.netflix.mediaclient.util.net.AuthCookieHolder r1 = (com.netflix.mediaclient.util.net.AuthCookieHolder) r1     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 != 0) goto L1a
            goto L1f
        L1a:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L2b
            r2 = r2 ^ r1
        L1f:
            java.util.Map<java.lang.String, com.netflix.mediaclient.util.net.AuthCookieHolder> r1 = r3.f     // Catch: java.lang.Throwable -> L2b
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L29
        L26:
            r3.j()     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYY.a(java.lang.String, com.netflix.mediaclient.util.net.AuthCookieHolder):void");
    }

    private String b(InterfaceC8400dke interfaceC8400dke) {
        return C8071ddU.b(interfaceC8400dke.c(this.e, C8404dki.b));
    }

    void n() {
        synchronized (this) {
            C1044Mm.e("nf_msl_store", "saveSecureStore:: started.");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("cryptoContexts", jSONArray);
            for (InterfaceC8400dke interfaceC8400dke : this.a.keySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("masterToken", b(interfaceC8400dke));
                jSONObject2.put("cryptoContext", ((C2085aZh) this.a.get(interfaceC8400dke)).e());
                jSONArray.put(jSONObject2);
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put("userIdTokens", jSONArray2);
            for (String str : this.n.keySet()) {
                JSONObject jSONObject3 = new JSONObject();
                dkU dku = this.n.get(str);
                jSONObject3.put("userId", str);
                jSONObject3.put("userIdToken", b(dku));
                jSONObject3.put("mtSerialNumber", dku.b());
                jSONArray2.put(jSONObject3);
            }
            JSONArray jSONArray3 = new JSONArray();
            jSONObject.put("nonReplayableIds", jSONArray3);
            for (Long l : this.g.keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("mtSerialNumber", l);
                jSONObject4.put("nonReplayableId", this.g.get(l));
                jSONArray3.put(jSONObject4);
            }
            JSONArray jSONArray4 = new JSONArray();
            jSONObject.put("unboundServiceTokens", jSONArray4);
            for (InterfaceC8400dke interfaceC8400dke2 : this.i) {
                jSONArray4.put(b(interfaceC8400dke2));
            }
            JSONArray jSONArray5 = new JSONArray();
            jSONObject.put("mtServiceTokens", jSONArray5);
            for (Object obj : this.j.keySet()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONArray5.put(jSONObject5);
                jSONObject5.put("mtSerialNumber", obj);
                JSONArray jSONArray6 = new JSONArray();
                jSONObject5.put("serviceTokenSet", jSONArray6);
                Set<dkQ> set = this.j.get(obj);
                if (set != null) {
                    for (dkQ dkq : set) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONArray6.put(jSONObject6);
                        if (dkq.f()) {
                            jSONObject6.put("uitSerialNumber", dkq.e());
                        }
                        jSONObject6.put("serviceToken", b(dkq));
                    }
                }
            }
            JSONArray jSONArray7 = new JSONArray();
            jSONObject.put("uitServiceTokens", jSONArray7);
            for (Object obj2 : this.h.keySet()) {
                JSONObject jSONObject7 = new JSONObject();
                jSONArray7.put(jSONObject7);
                jSONObject7.put("uitSerialNumber", obj2);
                JSONArray jSONArray8 = new JSONArray();
                jSONObject7.put("serviceTokenSet", jSONArray8);
                Set<dkQ> set2 = this.h.get(obj2);
                if (set2 != null) {
                    for (dkQ dkq2 : set2) {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONArray8.put(jSONObject8);
                        if (dkq2.c()) {
                            jSONObject8.put("mtSerialNumber", dkq2.b());
                        }
                        jSONObject8.put("serviceToken", b(dkq2));
                    }
                }
            }
            C8157dfA.a(this.b, "nf_msl_store_json", jSONObject.toString());
            C1044Mm.e("nf_msl_store", "saveSecureStore:: done.");
        }
    }

    public void e() {
        synchronized (this) {
            C1044Mm.e("nf_msl_store", "clearCryptoContexts::");
            this.a.clear();
            this.g.clear();
            this.n.clear();
            this.h.clear();
            this.j.clear();
            n();
        }
    }

    @Override // o.InterfaceC8429dlg
    public void e(String str, dkU dku) {
        synchronized (this) {
            C1044Mm.a("nf_msl_store", "addUserIdToken:: userId: %s", str);
            for (dkO dko : this.a.keySet()) {
                if (dku.d(dko)) {
                    dkU dku2 = this.n.get(str);
                    this.n.put(str, dku);
                    if (dku2 != null && dku2.equals(dku)) {
                        C1044Mm.e("nf_msl_store", "UserIDToken is NOT changed, do NOT saveSecureStore MSL store");
                    } else {
                        C1044Mm.e("nf_msl_store", "UserIDToken is changed, saveSecureStore MSL store");
                        n();
                    }
                }
            }
            C8373dje c8373dje = C8373dje.cT;
            throw new MslException(c8373dje, "uit mtserialnumber " + dku.b());
        }
    }

    public void e(String str, String str2) {
        synchronized (this) {
            if (str == null) {
                throw new MslException(C8373dje.cQ, "Old userId can not be null");
            }
            if (str2 == null) {
                throw new MslException(C8373dje.cQ, "New userId can not be null");
            }
            dkU remove = this.n.remove(str);
            if (remove == null) {
                C1044Mm.e("nf_msl_store", "UserIdToken not found for old user ID %s, check if somehow new user id has binding", str);
                if (this.n.get(str2) != null) {
                    C1044Mm.j("nf_msl_store", "UserIdToken found for new user ID %s, timing issue. Just return back", str2);
                } else {
                    C1044Mm.d("nf_msl_store", "UserIdToken not found for both old user ID and for new user ID!");
                    InterfaceC1598aHf.a(new C1596aHd("UserIdToken not found for both old user ID and for new user ID!").b(ErrorType.p).b(false).e("userid_tokens_size", String.valueOf(this.n.size())));
                    throw new MslException(C8373dje.cR, "UserIdToken not found for both old user ID and for new user ID!");
                }
            } else {
                this.n.put(str2, remove);
                n();
            }
        }
    }

    @Override // o.InterfaceC8429dlg
    public dkU a(String str) {
        C1044Mm.a("nf_msl_store", "getUserIdToken:: userId: %s", str);
        if (str != null) {
            return this.n.get(str);
        }
        return null;
    }

    @Override // o.InterfaceC8429dlg
    public void e(dkU dku) {
        synchronized (this) {
            d(dku);
            n();
        }
    }

    private void d(dkU dku) {
        dkO dko;
        Iterator<dkO> it = this.a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                dko = null;
                break;
            }
            dko = it.next();
            if (dku.d(dko)) {
                break;
            }
        }
        for (Map.Entry<String, dkU> entry : this.n.entrySet()) {
            if (entry.getValue().equals(dku)) {
                this.n.remove(entry.getKey());
                try {
                    b(null, dko, dku);
                    return;
                } catch (MslException e) {
                    throw new MslInternalException("Unexpected exception while removing user ID token bound service tokens.", e);
                }
            }
        }
    }

    @Override // o.InterfaceC8429dlg
    public void e(String str, dkO dko, dkU dku) {
        synchronized (this) {
            if (b(str, dko, dku)) {
                n();
            }
        }
    }

    private boolean d(String str, dkO dko) {
        Set<dkQ> set = this.j.get(Long.valueOf(dko.c()));
        boolean z = false;
        if (set != null) {
            Iterator<dkQ> it = set.iterator();
            while (it.hasNext()) {
                dkQ next = it.next();
                if (str == null || next.d().equals(str)) {
                    it.remove();
                    z = true;
                }
            }
        }
        for (Map.Entry<Long, Set<dkQ>> entry : this.h.entrySet()) {
            Long key = entry.getKey();
            Set<dkQ> value = entry.getValue();
            Iterator<dkQ> it2 = value.iterator();
            while (it2.hasNext()) {
                dkQ next2 = it2.next();
                if (str == null || next2.d().equals(str)) {
                    if (next2.c(dko)) {
                        it2.remove();
                        z = true;
                    }
                }
            }
            if (value.size() > 0) {
                this.h.put(key, value);
            } else {
                this.h.remove(key);
            }
        }
        return z;
    }

    private boolean c(String str, dkO dko, dkU dku) {
        Set<dkQ> set = this.h.get(Long.valueOf(dku.a()));
        boolean z = false;
        if (set != null) {
            Iterator<dkQ> it = set.iterator();
            while (it.hasNext()) {
                dkQ next = it.next();
                if (str == null || next.d().equals(str)) {
                    if (dko == null || next.c(dko)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (set.size() > 0) {
                this.h.put(Long.valueOf(dku.a()), set);
            } else {
                this.h.remove(Long.valueOf(dku.a()));
            }
        }
        Set<dkQ> set2 = this.j.get(Long.valueOf(dku.b()));
        if (set2 != null) {
            Iterator<dkQ> it2 = set2.iterator();
            while (it2.hasNext()) {
                dkQ next2 = it2.next();
                if (str == null || next2.d().equals(str)) {
                    if (dko == null || next2.c(dko)) {
                        if (next2.b(dku)) {
                            it2.remove();
                            z = true;
                        }
                    }
                }
            }
            if (set2.size() > 0) {
                this.j.put(Long.valueOf(dku.b()), set2);
            } else {
                this.j.remove(Long.valueOf(dku.b()));
            }
        }
        return z;
    }

    public void d(String str) {
        c(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.Object[] r0 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r1 = "nf_msl_store"
            java.lang.String r2 = "Checking unbounded service tokens for %s"
            o.C1044Mm.a(r1, r2, r0)     // Catch: java.lang.Throwable -> Lcf
            java.util.Set<o.dkQ> r0 = r12.i     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = o.C2080aZc.e(r13, r0)     // Catch: java.lang.Throwable -> Lcf
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lcf
            r3 = 0
            r2[r3] = r13     // Catch: java.lang.Throwable -> Lcf
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lcf
            r5 = 1
            r2[r5] = r4     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = "nf_msl_store"
            java.lang.String r6 = "Unbounded service tokens for %s founded %b"
            o.C1044Mm.a(r4, r6, r2)     // Catch: java.lang.Throwable -> Lcf
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r2 = r12.j     // Catch: java.lang.Throwable -> Lcf
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lcf
        L30:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lcf
            r6 = 3
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lcf
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r7 = r4.getKey()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lcf
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lcf
            boolean r8 = o.C2080aZc.e(r13, r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lcf
            r6[r3] = r13     // Catch: java.lang.Throwable -> Lcf
            r6[r5] = r7     // Catch: java.lang.Throwable -> Lcf
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> Lcf
            r6[r1] = r9     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r9 = "nf_msl_store"
            java.lang.String r10 = "Service tokens for %s bounded to master token %d founded %b"
            o.C1044Mm.a(r9, r10, r6)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto L67
            if (r8 == 0) goto L65
            goto L67
        L65:
            r0 = r3
            goto L68
        L67:
            r0 = r5
        L68:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> Lcf
            if (r6 <= 0) goto L74
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r6 = r12.j     // Catch: java.lang.Throwable -> Lcf
            r6.put(r7, r4)     // Catch: java.lang.Throwable -> Lcf
            goto L30
        L74:
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r4 = r12.j     // Catch: java.lang.Throwable -> Lcf
            r4.remove(r7)     // Catch: java.lang.Throwable -> Lcf
            goto L30
        L7a:
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r2 = r12.h     // Catch: java.lang.Throwable -> Lcf
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lcf
        L84:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lcf
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r7 = r4.getKey()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lcf
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lcf
            boolean r8 = o.C2080aZc.e(r13, r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lcf
            r9[r3] = r13     // Catch: java.lang.Throwable -> Lcf
            r9[r5] = r7     // Catch: java.lang.Throwable -> Lcf
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> Lcf
            r9[r1] = r10     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r10 = "nf_msl_store"
            java.lang.String r11 = "Service tokens for %s bounded to user token %d founded %b"
            o.C1044Mm.a(r10, r11, r9)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lba
            if (r8 == 0) goto Lb8
            goto Lba
        Lb8:
            r0 = r3
            goto Lbb
        Lba:
            r0 = r5
        Lbb:
            int r8 = r4.size()     // Catch: java.lang.Throwable -> Lcf
            if (r8 <= 0) goto Lc7
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r8 = r12.h     // Catch: java.lang.Throwable -> Lcf
            r8.put(r7, r4)     // Catch: java.lang.Throwable -> Lcf
            goto L84
        Lc7:
            java.util.Map<java.lang.Long, java.util.Set<o.dkQ>> r4 = r12.h     // Catch: java.lang.Throwable -> Lcf
            r4.remove(r7)     // Catch: java.lang.Throwable -> Lcf
            goto L84
        Lcd:
            monitor-exit(r12)
            return r0
        Lcf:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYY.c(java.lang.String):boolean");
    }

    private boolean b(String str, dkO dko, dkU dku) {
        if (dku != null && dko != null && !dku.d(dko)) {
            C8373dje c8373dje = C8373dje.cW;
            throw new MslException(c8373dje, "uit mtserialnumber " + dku.b() + "; mt " + dko.c());
        } else if (str != null && dko == null && dku == null) {
            return c(str);
        } else {
            if (dko == null || dku != null) {
                if (dku != null) {
                    return c(str, dko, dku);
                }
                C1044Mm.j("nf_msl_store", "doRemoveServiceToken:: service token %s was not removed", str);
                return false;
            }
            return d(str, dko);
        }
    }

    public void a() {
        synchronized (this) {
            this.i.clear();
            this.j.clear();
            this.h.clear();
            n();
        }
    }

    public void c() {
        synchronized (this) {
            C1044Mm.e("nf_msl_store", "clearUserIdTokens::");
            ArrayList<dkU> arrayList = new ArrayList();
            arrayList.addAll(this.n.values());
            for (dkU dku : arrayList) {
                d(dku);
            }
            if (this.n.size() > 0) {
                C1044Mm.j("nf_msl_store", "Failed to remove all user IDs!");
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        C1044Mm.e("nf_msl_store", "saveCookies:: started.");
        synchronized (this.f) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jSONObject.put("userId", str);
                AuthCookieHolder authCookieHolder = this.f.get(str);
                jSONObject.put("netflixID", authCookieHolder.netflixId);
                jSONObject.put("secureNetflixID", authCookieHolder.secureNetflixId);
            }
            h(jSONArray.toString());
        }
        C1044Mm.e("nf_msl_store", "saveCookies:: done.");
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {all -> 0x000d, blocks: (B:5:0x0005, B:11:0x0010, B:15:0x0023, B:17:0x002b, B:19:0x0031, B:24:0x0059, B:25:0x005d), top: B:30:0x0005 }] */
    @Override // o.InterfaceC8429dlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.util.Set<o.dkQ> r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Lf
            int r2 = r8.size()     // Catch: java.lang.Throwable -> Ld
            if (r2 <= 0) goto Lf
            r2 = r0
            goto L10
        Ld:
            r8 = move-exception
            goto L66
        Lf:
            r2 = r1
        L10:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Ld
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Ld
            r3[r1] = r4     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "nf_msl_store"
            java.lang.String r5 = "addServiceTokens:: %b"
            o.C1044Mm.a(r4, r5, r3)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L23
            monitor-exit(r7)
            return
        L23:
            r7.b(r8)     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ld
        L2a:
            r2 = r1
        L2b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L57
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> Ld
            o.dkQ r3 = (o.dkQ) r3     // Catch: java.lang.Throwable -> Ld
            boolean r4 = r7.a(r3)     // Catch: java.lang.Throwable -> Ld
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> Ld
            r5[r1] = r3     // Catch: java.lang.Throwable -> Ld
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> Ld
            r5[r0] = r3     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "nf_msl_store"
            java.lang.String r6 = "Service token %s added %b"
            o.C1044Mm.a(r3, r6, r5)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L55
            if (r4 == 0) goto L2a
        L55:
            r2 = r0
            goto L2b
        L57:
            if (r2 == 0) goto L5d
            r7.n()     // Catch: java.lang.Throwable -> Ld
            goto L64
        L5d:
            java.lang.String r8 = "nf_msl_store"
            java.lang.String r0 = "No changes with service tokens, no need to saveSecureStore."
            o.C1044Mm.e(r8, r0)     // Catch: java.lang.Throwable -> Ld
        L64:
            monitor-exit(r7)
            return
        L66:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYY.e(java.util.Set):void");
    }

    private boolean a(dkQ dkq) {
        boolean z;
        if (dkq.h()) {
            return e(this.i, dkq);
        }
        if (dkq.c()) {
            Set<dkQ> set = this.j.get(Long.valueOf(dkq.b()));
            if (set == null) {
                set = b();
                this.j.put(Long.valueOf(dkq.b()), set);
            }
            z = e(set, dkq);
            C1044Mm.a("nf_msl_store", "Added %b master bound: %s", Boolean.valueOf(z), dkq.d());
        } else {
            z = false;
        }
        if (dkq.f()) {
            Set<dkQ> set2 = this.h.get(Long.valueOf(dkq.e()));
            if (set2 == null) {
                set2 = b();
                this.h.put(Long.valueOf(dkq.e()), set2);
            }
            boolean e = e(set2, dkq);
            C1044Mm.a("nf_msl_store", "Added %b user bound: %s", Boolean.valueOf(e), dkq.d());
            return e;
        }
        return z;
    }

    private boolean e(Set<dkQ> set, dkQ dkq) {
        C1044Mm.a("nf_msl_store", "New token service: %s'", dkq.d());
        set.remove(dkq);
        return set.add(dkq);
    }

    @Override // o.InterfaceC8429dlg
    public Set<dkQ> e(dkO dko, dkU dku) {
        Set<dkQ> b;
        Set<dkQ> set;
        Set<dkQ> set2;
        synchronized (this) {
            if (dku != null) {
                if (dko == null) {
                    throw new MslException(C8373dje.cU);
                }
                if (!dku.d(dko)) {
                    C8373dje c8373dje = C8373dje.cW;
                    throw new MslException(c8373dje, "uit mtserialnumber " + dku.b() + "; mt " + dko.c());
                }
            }
            b = b();
            b.addAll(this.i);
            if (dko != null && (set2 = this.j.get(Long.valueOf(dko.c()))) != null) {
                for (dkQ dkq : set2) {
                    if (!dkq.f()) {
                        b.add(dkq);
                    }
                }
            }
            if (dku != null && (set = this.h.get(Long.valueOf(dku.a()))) != null) {
                for (dkQ dkq2 : set) {
                    if (dkq2.c(dko)) {
                        b.add(dkq2);
                    }
                }
            }
        }
        return b;
    }

    public boolean b(String str) {
        synchronized (this) {
            if (i() == null) {
                return false;
            }
            dkU a = a(this.d.f().d());
            if (a == null) {
                C1044Mm.j("nf_msl_store", "User is not logged in");
            }
            try {
                Set<dkQ> e = e(i(), a);
                if (e.isEmpty()) {
                    return false;
                }
                for (dkQ dkq : e) {
                    if (dkq != null) {
                        if (str.equalsIgnoreCase(dkq.d())) {
                            C1044Mm.a("nf_msl_store", "Service token %s is available", str);
                            return true;
                        }
                        C1044Mm.a("nf_msl_store", "Service token %s is found", dkq.d());
                    }
                }
                return false;
            } catch (MslException e2) {
                C1044Mm.b("nf_msl_store", e2, "Failed to get service tokens!", new Object[0]);
                return false;
            }
        }
    }

    private static long d(long j) {
        int i;
        if (j >= 0 && j <= 9007199254740992L) {
            if (i == 0) {
                return 0L;
            }
            return 1 + j;
        }
        throw new MslInternalException("Non-replayable ID " + j + " is outside the valid range.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.Set<o.dkQ> r5) {
        /*
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r5.next()
            o.dkQ r0 = (o.dkQ) r0
            boolean r1 = r0.c()
            if (r1 == 0) goto L50
            java.util.Map<o.dkO, o.djy> r1 = r4.a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            o.dkO r2 = (o.dkO) r2
            boolean r2 = r0.c(r2)
            if (r2 == 0) goto L20
            goto L50
        L33:
            o.dje r5 = o.C8373dje.bE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "st mtserialnumber "
            r1.append(r2)
            long r2 = r0.b()
            r1.append(r2)
            com.netflix.msl.MslException r0 = new com.netflix.msl.MslException
            java.lang.String r1 = r1.toString()
            r0.<init>(r5, r1)
            throw r0
        L50:
            boolean r1 = r0.f()
            if (r1 == 0) goto L4
            java.util.Map<java.lang.String, o.dkU> r1 = r4.n
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()
            o.dkU r2 = (o.dkU) r2
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L60
            goto L4
        L73:
            o.dje r5 = o.C8373dje.bO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "st uitserialnumber "
            r1.append(r2)
            long r2 = r0.e()
            r1.append(r2)
            com.netflix.msl.MslException r0 = new com.netflix.msl.MslException
            java.lang.String r1 = r1.toString()
            r0.<init>(r5, r1)
            throw r0
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYY.b(java.util.Set):void");
    }

    private void k() {
        synchronized (this) {
            String g = this.d.g();
            String d = this.d.f().d();
            if (g != null && g.equals(d)) {
                C1044Mm.a("nf_msl_store", "Last known profile %s", g);
            } else {
                C1044Mm.a("nf_msl_store", "Last known profile %s is not in sync in user agent %s", d, g);
            }
            dkU a = a(d);
            if (a != null) {
                this.c = new C8378djj(d, i(), a);
            } else {
                C1044Mm.d("nf_msl_store", "Unable to find userID token for last known profile ID. This should NOT happen! Check if we already have renew data!");
                if (this.c != null) {
                    C1044Mm.j("nf_msl_store", "Unable to find userID token for last known profile ID, but LastProfileCredentials does exist. Continue.");
                } else if (this.d.v()) {
                    C1044Mm.d("nf_msl_store", "MSL logout: reason MSL. Unable to find userID token for last known profile ID AND LastProfileCredentials does NOT exist! This should NOT happen!");
                    InterfaceC1598aHf.a(new C1596aHd("MSL logout: reason MSL. Unable to find userID token for last known profile ID AND LastProfileCredentials does NOT exist! This should NOT happen!").b(ErrorType.p).b(false));
                    this.d.a(SignOutReason.msl);
                }
            }
        }
    }

    public C8378djj g() {
        C8378djj c8378djj;
        synchronized (this) {
            c8378djj = this.c;
        }
        return c8378djj;
    }

    public void d() {
        synchronized (this) {
            this.c = null;
        }
    }

    private void h(String str) {
        try {
            SecureStoreProvider.INSTANCE.d().b("cookies", str);
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_store", th, "Failed to saveSecureStore MSL store to secure store", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        String e = C8157dfA.e(this.b, "useragent_current_profile_id", (String) null);
        if (C8168dfL.g(e)) {
            C1044Mm.e("nf_msl_store", "saveLastProfileCredentialsOnMslStoreLoadSuccess::No profile ID, user is not logged in, do NOT try to recover.");
            return;
        }
        C1044Mm.a("nf_msl_store", "saveLastProfileCredentialsOnMslStoreLoadSuccess::Current profile ID: %s, user is logged in, try to recover", e);
        dkO i = i();
        dkU a = a(e);
        if (i == null || a == null) {
            C1044Mm.j("nf_msl_store", "saveLastProfileCredentialsOnMslStoreLoadSuccess:: Missing master token/user Id token for profile %s", e);
            return;
        }
        C1044Mm.a("nf_msl_store", "saveLastProfileCredentialsOnMslStoreLoadSuccess:: recovery data found, we will attempt recoveryfor %s ", e);
        this.c = new C8378djj(e, i, a);
    }

    private Set<dkQ> b() {
        return new HashSet();
    }
}
