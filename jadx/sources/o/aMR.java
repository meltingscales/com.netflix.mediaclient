package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
class aMR extends aMQ<MoneyballData> {
    protected AUIApiEndpointRegistry m;
    private String p;
    private String r;
    private List<String> u;
    private final aMX y;

    @Override // o.aMK
    protected List<String> L() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aMR(Context context, aMU amu, aOV aov, String str, String str2, List<String> list, aMX amx) {
        super(context, aov);
        ((aMK) this).d = amu;
        this.r = str;
        this.p = str2;
        this.u = list;
        this.y = amx;
        this.m = amu.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aMK
    /* renamed from: i */
    public MoneyballData j(String str) {
        return aMT.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public void a(MoneyballData moneyballData) {
        aMX amx = this.y;
        if (amx != null) {
            amx.onDataFetched(moneyballData, InterfaceC1078Nw.aJ, ((aMK) this).a);
        }
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        aMX amx = this.y;
        if (amx != null) {
            amx.onDataFetched(null, status, ((aMK) this).a);
        }
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> o() {
        HashMap hashMap = new HashMap();
        UserCookies e = C8284dhV.e(C1815aPg.d(((aMK) this).g).a());
        SignInConfigData W = ((aMK) this).i.W();
        if (W != null) {
            hashMap.put("flwssn", W.flwssn);
        }
        if (e != null && e.isValid()) {
            hashMap.put("netflixId", e.netflixId);
            hashMap.put("secureNetflixId", e.secureNetflixId);
        }
        hashMap.put("installType", ((aMK) this).i.B());
        if (C8168dfL.h(((aMK) this).i.n())) {
            hashMap.put("channelId", ((aMK) this).i.n());
        }
        try {
            hashMap.put("allocations", aRP.d().toJSONObject().toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        C1044Mm.a("nf_moneyball_data", "fetchParams: %s", hashMap.toString());
        return hashMap;
    }

    @Override // o.aMK, o.AbstractC5042brL, com.netflix.android.volley.Request
    public C9864xy<MoneyballData> b(C9858xs c9858xs) {
        String e = C8284dhV.e(c9858xs.d.get("Set-Cookie"));
        if (C8168dfL.h(e)) {
            C8284dhV.f(e);
        }
        return super.b(c9858xs);
    }

    @Override // o.aMK, o.AbstractC5042brL
    public String a(String str) {
        String Q = Q();
        StringBuilder sb = new StringBuilder(str);
        sb.append(C8168dfL.d("method", K(), "?"));
        if (P()) {
            sb.append(C8168dfL.d("materialize", "true", "&"));
        }
        sb.append(Q);
        C8190dfh c8190dfh = (C8190dfh) this.m.f();
        for (String str2 : c8190dfh.keySet()) {
            for (String str3 : c8190dfh.c(str2)) {
                sb.append(C8168dfL.d(str2, URLEncoder.encode(str3), "&"));
            }
        }
        String J2 = J();
        if (C8168dfL.h(J2)) {
            sb.append(J2);
        }
        a(sb);
        String sb2 = sb.toString();
        C1044Mm.d("nf_moneyball_data", "FetchMoneyballModeRequest URL = %s", sb2);
        return sb2;
    }

    @Override // o.aMK, o.AbstractC5042brL
    public String J() {
        StringBuilder sb = new StringBuilder(super.J());
        String str = this.r;
        if (str != null) {
            sb.append(C8168dfL.d("flow", str, "&"));
        }
        String str2 = this.p;
        if (str2 != null) {
            sb.append(C8168dfL.d("mode", str2, "&"));
        }
        return sb.toString();
    }
}
