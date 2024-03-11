package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aNx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1778aNx extends aUI {
    public static final d a = new d(null);
    private final String b;
    private final Map<String, String> e;

    public C1778aNx(String str, Map<String, String> map) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        this.b = str;
        this.e = map;
    }

    /* renamed from: o.aNx$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("FlexLogblob");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a2 = LogBlobType.CompanionMode.a();
        C8632dsu.a(a2, "");
        return a2;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        try {
            JSONObject jSONObject = this.i;
            jSONObject.putOpt("featureTags", "MobileCompanion");
            jSONObject.putOpt("flexName", this.b);
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            a.getLogTag();
        } catch (JSONException unused) {
        }
        return this.i;
    }
}
