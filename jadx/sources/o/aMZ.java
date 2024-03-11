package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class aMZ extends aMQ<MoneyballData> {
    private MoneyballCallData m;
    private final List<String> p;
    private final aMX r;

    @Override // o.aMK, o.AbstractC5042brL
    public String K() {
        return "call";
    }

    @Override // o.aMK
    protected List<String> L() {
        return this.p;
    }

    @Override // o.aMQ, o.AbstractC5042brL
    public /* bridge */ /* synthetic */ void a(ApiEndpointRegistry apiEndpointRegistry) {
        super.a(apiEndpointRegistry);
    }

    @Override // o.aMQ, com.netflix.android.volley.Request
    public /* bridge */ /* synthetic */ Object y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aMZ(Context context, aMU amu, aOV aov, MoneyballCallData moneyballCallData, aMX amx) {
        super(context, aov, 1);
        ((aMK) this).d = amu;
        this.r = amx;
        this.m = moneyballCallData;
        this.p = Arrays.asList("[\"" + aMQ.l + "\", \"moneyball\", \"next\"]", "[\"" + aMQ.l + "\", \"requestContext\"]");
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
        String a = ((aMK) this).d.a();
        if (C8168dfL.h(a)) {
            hashMap.put("authURL", a);
        }
        C1044Mm.a("nf_moneyball_data", "nextParams: %s", hashMap.toString());
        C1044Mm.a("nf_moneyball_data", "nextKeys: %s", this.m.getFieldValueMap().keySet().toString());
        hashMap.put("param", this.m.toJsonString());
        try {
            hashMap.put("allocations", aRP.d().toJSONObject().toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    @Override // o.aMK, o.AbstractC5042brL
    public String J() {
        String str;
        StringBuilder sb = new StringBuilder(super.J());
        sb.append(C8168dfL.d("flow", this.m.flow, "&"));
        if (C8168dfL.h(this.m.moneyBallActionModeOverride)) {
            str = this.m.moneyBallActionModeOverride;
        } else {
            str = this.m.mode;
        }
        sb.append(C8168dfL.d("mode", str, "&"));
        for (Map.Entry<String, String> entry : this.m.extraRequestArgs.entrySet()) {
            sb.append(C8168dfL.d(entry.getKey(), entry.getValue(), "&"));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aMK
    /* renamed from: h */
    public MoneyballData j(String str) {
        return aMT.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public void a(MoneyballData moneyballData) {
        aMX amx = this.r;
        if (amx != null) {
            amx.onDataFetched(moneyballData, InterfaceC1078Nw.aJ, ((aMK) this).a);
        }
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        aMX amx = this.r;
        if (amx != null) {
            amx.onDataFetched(null, status, ((aMK) this).a);
        }
    }
}
