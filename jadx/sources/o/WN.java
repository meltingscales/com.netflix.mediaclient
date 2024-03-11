package o;

import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class WN extends aUI {
    public static final e b = new e(null);
    private final CommanderFlexEventType a;
    private final Map<String, String> d;
    private final String e;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public WN(String str, CommanderFlexEventType commanderFlexEventType, Map<String, String> map) {
        C8632dsu.c((Object) commanderFlexEventType, "");
        C8632dsu.c((Object) map, "");
        this.e = str;
        this.a = commanderFlexEventType;
        this.d = map;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CommanderLogblob");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.CompanionMode.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        try {
            JSONObject jSONObject = this.i;
            jSONObject.putOpt("featureTags", "MobileCompanion");
            String str = this.e;
            if (str != null) {
                jSONObject.putOpt("companionSessionId", str);
            }
            jSONObject.putOpt("flexName", this.a.c());
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            b.getLogTag();
        } catch (JSONException unused) {
        }
        return this.i;
    }
}
