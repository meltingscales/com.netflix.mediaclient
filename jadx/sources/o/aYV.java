package o;

import android.content.Context;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONObject;
import com.netflix.mediaclient.repository.SecureStoreProvider;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.msl.util.MslContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public class aYV extends aYY {
    private MslContext m;

    public aYV(Context context, UserAgent userAgent, AbstractC8399dkd abstractC8399dkd) {
        super(context, userAgent, abstractC8399dkd);
    }

    public void b(MslContext mslContext, boolean z) {
        synchronized (this) {
            if (mslContext == null) {
                throw new IllegalArgumentException("MSL Context can not be null!");
            }
            this.m = mslContext;
            if (z) {
                C1044Mm.e("nf_msl_store_full", "init:: force clear MSL store started.");
                e();
                j();
                C1044Mm.e("nf_msl_store_full", "init:: force clear MSL store done.");
            } else {
                C1044Mm.e("nf_msl_store_full", "load:: started.");
                m();
                o();
                C1044Mm.e("nf_msl_store_full", "load:: done.");
            }
        }
    }

    public void b() {
        synchronized (this) {
            C1044Mm.e("nf_msl_store_full", "init:: force clear cookies...");
            this.f.clear();
            j();
        }
    }

    private void m() {
        int i;
        String str;
        String str2;
        String e = C8157dfA.e(this.b, "nf_msl_store_json", (String) null);
        if (C8168dfL.g(e)) {
            C1044Mm.e("nf_msl_store_full", "loadMslStore:: MSL store not found...");
            return;
        }
        int i2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(e);
            JSONArray optJSONArray = jSONObject.optJSONArray("cryptoContexts");
            if (optJSONArray != null) {
                try {
                    C1044Mm.a("nf_msl_store_full", "loadMslStore::Crypto contexts map found, size: %d", Integer.valueOf(optJSONArray.length()));
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                        this.a.put(new dkO(this.m, c(jSONObject2.getString("masterToken"))), C2085aZh.b(this.m, jSONObject2.getJSONObject("cryptoContext")));
                    }
                } catch (Throwable th) {
                    th = th;
                    i = 0;
                    C1044Mm.b("nf_msl_store_full", th, "loadMslStore:: Failed to load MSL store: try restore...", new Object[i]);
                    h(e);
                    return;
                }
            } else {
                C1044Mm.e("nf_msl_store_full", "loadMslStore::Crypto contexts map not found!");
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("userIdTokens");
            String str3 = "mtSerialNumber";
            if (optJSONArray2 != null) {
                C1044Mm.a("nf_msl_store_full", "loadMslStore:: UserId tokens map found, size: %d", Integer.valueOf(optJSONArray2.length()));
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i4);
                    this.n.put(jSONObject3.optString("userId", null), new dkU(this.m, c(jSONObject3.getString("userIdToken")), e(jSONObject3.getLong("mtSerialNumber"))));
                }
            } else {
                C1044Mm.e("nf_msl_store_full", "loadMslStore:: UserId tokens map not found!");
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("nonReplayableIds");
            if (optJSONArray3 != null) {
                C1044Mm.a("nf_msl_store_full", "loadMslStore:: NonReplayableId map found, size: %d", Integer.valueOf(optJSONArray3.length()));
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    JSONObject jSONObject4 = optJSONArray3.getJSONObject(i5);
                    this.g.put(Long.valueOf(jSONObject4.getLong("mtSerialNumber")), Long.valueOf(jSONObject4.getLong("nonReplayableId")));
                }
            } else {
                C1044Mm.e("nf_msl_store_full", "loadMslStore:: NonReplayableId map not found!");
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("unboundServiceTokens");
            if (optJSONArray4 != null) {
                for (int i6 = 0; i6 < optJSONArray4.length(); i6++) {
                    this.i.add(new dkQ(this.m, c(optJSONArray4.getString(i6)), (dkO) null, (dkU) null, (AbstractC8393djy) null));
                }
            } else {
                C1044Mm.e("nf_msl_store_full", "loadMslStore:: UnboundServiceTokens set not found!");
            }
            JSONArray optJSONArray5 = jSONObject.optJSONArray("mtServiceTokens");
            ArrayList arrayList = new ArrayList();
            String str4 = "serviceTokenSet";
            String str5 = "uitSerialNumber";
            if (optJSONArray5 != null) {
                C1044Mm.a("nf_msl_store_full", "loadMslStore:: MasterTokenServiceToken map found, size: %d", Integer.valueOf(optJSONArray5.length()));
                int i7 = 0;
                while (i7 < optJSONArray5.length()) {
                    JSONObject jSONObject5 = optJSONArray5.getJSONObject(i7);
                    Long valueOf = Long.valueOf(jSONObject5.getLong(str3));
                    JSONArray optJSONArray6 = jSONObject5.optJSONArray(str4);
                    HashSet hashSet = new HashSet(optJSONArray6.length());
                    this.j.put(valueOf, hashSet);
                    int i8 = i2;
                    while (i8 < optJSONArray6.length()) {
                        JSONObject jSONObject6 = optJSONArray6.getJSONObject(i8);
                        String str6 = str3;
                        JSONArray jSONArray = optJSONArray5;
                        String str7 = str4;
                        String str8 = str5;
                        dkQ dkq = new dkQ(this.m, c(jSONObject6.getString("serviceToken")), e(valueOf.longValue()), c(jSONObject6.optLong(str5, -1L)), (AbstractC8393djy) null);
                        hashSet.add(dkq);
                        if (dkq.c() && dkq.f()) {
                            arrayList.add(dkq);
                        }
                        i8++;
                        str3 = str6;
                        optJSONArray5 = jSONArray;
                        str4 = str7;
                        str5 = str8;
                    }
                    i7++;
                    i2 = 0;
                }
                str = str4;
                str2 = str5;
            } else {
                str = "serviceTokenSet";
                str2 = "uitSerialNumber";
                C1044Mm.e("nf_msl_store_full", "loadMslStore:: MasterTokenServiceToken map not found!");
            }
            JSONArray optJSONArray7 = jSONObject.optJSONArray("uitServiceTokens");
            if (optJSONArray7 != null) {
                C1044Mm.a("nf_msl_store_full", "loadMslStore:: UserIdsServiceToken map found, size: %d", Integer.valueOf(optJSONArray7.length()));
                int i9 = 0;
                while (i9 < optJSONArray7.length()) {
                    JSONObject jSONObject7 = optJSONArray7.getJSONObject(i9);
                    String str9 = str2;
                    Long valueOf2 = Long.valueOf(jSONObject7.getLong(str9));
                    String str10 = str;
                    JSONArray optJSONArray8 = jSONObject7.optJSONArray(str10);
                    HashSet hashSet2 = new HashSet(optJSONArray8.length());
                    this.h.put(valueOf2, hashSet2);
                    for (int i10 = 0; i10 < optJSONArray8.length(); i10++) {
                        dkQ e2 = e(arrayList, valueOf2.longValue(), optJSONArray8.getJSONObject(i10));
                        if (e2 != null) {
                            hashSet2.add(e2);
                        }
                    }
                    i9++;
                    str2 = str9;
                    str = str10;
                }
            } else {
                C1044Mm.e("nf_msl_store_full", "loadMslStore:: UserIdsServiceToken map not found!");
            }
            C1044Mm.e("nf_msl_store_full", "loadMslStore:: loaded.");
            h();
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    private void o() {
        String l = l();
        if (C8168dfL.g(l)) {
            C1044Mm.e("nf_msl_store_full", "loadCookies:: Cookies not found...");
            return;
        }
        try {
            C1044Mm.a("nf_msl_store_full", "loadCookies:: MSL store found: %s", l);
            JSONArray jSONArray = new JSONArray(l);
            C1044Mm.a("nf_msl_store_full", "loadCookies:: User authorization tokens map found, size: %d", Integer.valueOf(jSONArray.length()));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    b(jSONObject.getString("userId"), jSONObject.getString("netflixID"), jSONObject.getString("secureNetflixID"));
                }
            }
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_store_full", th, "loadCookies:: Failed to load cookies...", new Object[0]);
        }
    }

    private void b(String str, String str2, String str3) {
        C1044Mm.a("nf_msl_store_full", "load:: UserId %s, netflixID %s, Secure Netflix ID: %s", str, str2, str3);
        if (C8168dfL.g(str)) {
            C1044Mm.j("nf_msl_store_full", "UserID is empty! It should NOT happen!");
        } else if (C8168dfL.g(str2)) {
            C1044Mm.j("nf_msl_store_full", "NetflixID is empty! It should NOT happen!");
        } else if (C8168dfL.g(str2)) {
            C1044Mm.j("nf_msl_store_full", "NetflixID is empty! It should NOT happen!");
        } else {
            this.f.put(str, new AuthCookieHolder(str, str2, str3));
        }
    }

    private void h(String str) {
        dkU dku = null;
        String e = C8157dfA.e(this.b, "useragent_current_profile_id", (String) null);
        if (C8168dfL.g(e)) {
            C1044Mm.e("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure::No profile ID, user is not logged in, do NOT try to recover.");
            return;
        }
        C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure::Current profile ID: %s, user is logged in, try to recover", e);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("cryptoContexts");
            if (optJSONArray != null) {
                C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure::Crypto contexts map found, size: %d", Integer.valueOf(optJSONArray.length()));
                dkO dko = null;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    dkO dko2 = new dkO(this.m, c(optJSONArray.getJSONObject(i).getString("masterToken")));
                    if (dko == null || dko2.d(dko)) {
                        dko = dko2;
                    }
                }
                if (dko == null) {
                    C1044Mm.d("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure::Master token NOT found, can not complete restore path! Log user out!");
                    return;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("userIdTokens");
                if (optJSONArray2 == null) {
                    C1044Mm.e("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure:: UserId tokens map not found! Unable to recover, log user out!");
                    return;
                }
                C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure:: UserId tokens map found, size: %d", Integer.valueOf(optJSONArray2.length()));
                int i2 = 0;
                while (true) {
                    if (i2 >= optJSONArray2.length()) {
                        break;
                    }
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    String string = jSONObject2.getString("userId");
                    C8401dkf c = c(jSONObject2.getString("userIdToken"));
                    long j = jSONObject2.getLong("mtSerialNumber");
                    if (dko.c() != j) {
                        C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure:: master token serial number %d != than one found in user id token! ", Long.valueOf(dko.c()), Long.valueOf(j));
                    } else if (e.equals(string)) {
                        dku = new dkU(this.m, c, dko);
                        C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure:: user id token found for profile %s, we should be able to attempt recovery! ", e);
                        break;
                    }
                    i2++;
                }
                if (dku != null) {
                    C1044Mm.a("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure:: recovery data found, we will attempt recoveryfor %s ", e);
                    this.c = new C8378djj(e, dko, dku);
                    return;
                }
                return;
            }
            C1044Mm.e("nf_msl_store_full", "recoverLastProfileCredentialsOnMslStoreLoadFailure::Crypto contexts map not found, can not complete restore path! Log user out!");
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_store_full", th, "recoverLastProfileCredentialsOnMslStoreLoadFailure:: Failed to recover authorization data from MSL store: log user out!!!", new Object[0]);
        }
    }

    private dkO e(long j) {
        for (dkO dko : this.a.keySet()) {
            if (dko != null && dko.c() == j) {
                return dko;
            }
        }
        return null;
    }

    private dkU c(long j) {
        for (dkU dku : this.n.values()) {
            if (dku != null && dku.a() == j) {
                return dku;
            }
        }
        return null;
    }

    private dkQ e(List<dkQ> list, long j, JSONObject jSONObject) {
        long optLong = jSONObject.optLong("mtSerialNumber", -1L);
        C1044Mm.a("nf_msl_store_full", "Check if service token exist for given userIdToken serial number: %d and master token serial number: %d", Long.valueOf(j), Long.valueOf(optLong));
        dkQ dkq = new dkQ(this.m, c(jSONObject.getString("serviceToken")), e(optLong), c(j), (AbstractC8393djy) null);
        for (dkQ dkq2 : list) {
            if (dkq2.equals(dkq)) {
                C1044Mm.j("nf_msl_store_full", "Double bound service token found, use it!");
                return dkq2;
            }
        }
        C1044Mm.j("nf_msl_store_full", "Double bound service token not found, this should not happen! Use newly created service token!");
        return dkq;
    }

    private C8401dkf c(String str) {
        return this.e.c(C8071ddU.d(str));
    }

    private String l() {
        try {
            return SecureStoreProvider.INSTANCE.d().c("cookies");
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_store_full", th, "Failed to load MSL store from secure store", new Object[0]);
            return null;
        }
    }
}
