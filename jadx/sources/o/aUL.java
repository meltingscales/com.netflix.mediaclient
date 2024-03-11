package o;

import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUL {
    public static String a(List<Logblob> list) {
        JSONArray jSONArray = new JSONArray();
        for (Logblob logblob : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientEpoch", logblob.z_());
            jSONObject.put("clientJson", logblob.c());
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    public static List<Logblob> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new a(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            C1044Mm.e("nf_logblob", "Unable to create JSON array from payload " + str, e);
        }
        return arrayList;
    }

    /* loaded from: classes3.dex */
    static class a implements Logblob {
        private long b;
        private JSONObject c;

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public JSONObject c() {
            return this.c;
        }

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public long z_() {
            return this.b;
        }

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalStateException("Payload can not be empty");
            }
            this.c = jSONObject.getJSONObject("clientJson");
            this.b = jSONObject.getLong("clientEpoch");
        }

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public String a() {
            throw new IllegalAccessError("Method not implemented");
        }

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public boolean e() {
            throw new IllegalAccessError("Method not implemented");
        }
    }
}
