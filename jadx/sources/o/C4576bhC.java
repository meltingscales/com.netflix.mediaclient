package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.Map;
import org.json.JSONException;

/* renamed from: o.bhC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4576bhC extends aUI {
    private final String b;
    private final boolean e;

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return this.e;
    }

    public C4576bhC(String str, Logblob.Severity severity, boolean z, Object obj) {
        this.b = str;
        this.f = severity;
        this.e = z;
        e(obj);
    }

    private void e(Object obj) {
        JsonElement jsonTree = C8118deO.a().toJsonTree(obj);
        if (!(jsonTree instanceof JsonObject)) {
            C1044Mm.d("nf_playreport", "unable to construct logblob - unable to create json tree");
            return;
        }
        for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonTree).entrySet()) {
            try {
                this.i.put(entry.getKey(), C8123deT.d(entry.getValue()));
            } catch (JSONException e) {
                C1044Mm.b("nf_playreport", e, "unable to construct logblob", new Object[0]);
            }
        }
    }
}
