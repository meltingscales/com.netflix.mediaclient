package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aSR extends aUI {
    private final List<Locale> a;
    private final List<String> e;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return false;
    }

    public aSR(List<Locale> list, List<String> list2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.a = list;
        this.e = list2;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.SignupLanguage.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        int d;
        String d2;
        String d3;
        JSONObject jSONObject = this.i;
        List<Locale> list = this.a;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (Locale locale : list) {
            arrayList.add(locale.getLanguage());
        }
        d2 = C8576dqs.d(arrayList, null, null, null, 0, null, null, 63, null);
        jSONObject.put("missingLocales", d2);
        JSONObject jSONObject2 = this.i;
        d3 = C8576dqs.d(this.e, null, null, null, 0, null, null, 63, null);
        jSONObject2.put("nrmLocales", d3);
        JSONObject jSONObject3 = this.i;
        C8632dsu.a(jSONObject3, "");
        return jSONObject3;
    }
}
