package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aKj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1683aKj {
    public static final b b = new b(null);
    private final List<String> a;
    private final JSONObject d;
    private final Boolean e;

    public final JSONObject b() {
        return this.d;
    }

    public C1683aKj(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.d = jSONObject;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("attestations");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C8632dsu.a(string, "");
            arrayList.add(string);
        }
        this.a = arrayList;
        this.e = Boolean.valueOf(this.d.optBoolean("passed", false));
    }

    public String toString() {
        JSONObject jSONObject = this.d;
        return "DeviceAttestationData" + jSONObject;
    }

    public final boolean a(String str) {
        C8632dsu.c((Object) str, "");
        List<String> list = this.a;
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (C8632dsu.c((Object) str, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.aKj$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
