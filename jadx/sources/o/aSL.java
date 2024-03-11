package o;

import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aSL {
    private final aSS a;
    private final aSP d;

    public aSL(PublishSubject<dpR> publishSubject, Context context, aOV aov) {
        C8632dsu.c((Object) publishSubject, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        this.d = new aSP(publishSubject, context, aov);
        this.a = new aSS(publishSubject, context);
    }

    public final JSONObject a() {
        int d;
        String d2;
        String d3;
        int d4;
        String d5;
        this.d.c();
        this.a.d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("voipNeeded", this.d.a());
            jSONObject.put("partnerModuleNeed", this.a.a());
            jSONObject.put("voipInstalled", this.d.b());
            jSONObject.put("partnerModuleInstalled", this.a.b());
            aMN amn = (aMN) C1332Xp.b(aMN.class);
            Set<Locale> a = aSN.a(AbstractApplicationC1040Mh.getInstance().i().k());
            C8632dsu.a(a, "");
            Set<String> a2 = amn.a();
            C8632dsu.a(a2, "");
            List<Locale> c = aSN.c(a, a2);
            C8632dsu.a(c, "");
            if (c.isEmpty()) {
                jSONObject.put("languages", true);
            } else {
                jSONObject.put("languages", false);
                Set<Locale> set = a;
                d = C8572dqo.d(set, 10);
                ArrayList arrayList = new ArrayList(d);
                for (Locale locale : set) {
                    arrayList.add(locale.getLanguage());
                }
                d2 = C8576dqs.d(arrayList, null, null, null, 0, null, null, 63, null);
                jSONObject.put("langNeeded", d2);
                d3 = C8576dqs.d(a2, null, null, null, 0, null, null, 63, null);
                jSONObject.put("langInstalled", d3);
                d4 = C8572dqo.d(c, 10);
                ArrayList arrayList2 = new ArrayList(d4);
                for (Locale locale2 : c) {
                    arrayList2.add(locale2.getLanguage());
                }
                d5 = C8576dqs.d(arrayList2, null, null, null, 0, null, null, 63, null);
                jSONObject.put("langMissing", d5);
                if (AbstractApplicationC1040Mh.getInstance().o().h()) {
                    amn.b(c);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
