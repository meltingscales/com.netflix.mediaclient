package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import o.C4484bfQ;
import org.json.JSONObject;

/* renamed from: o.bgo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4561bgo {
    @SerializedName("rel")
    public abstract String a();

    @SerializedName("href")
    public abstract String d();

    public static AbstractC4561bgo d(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("href")) {
            return null;
        }
        return new C4484bfQ(jSONObject.optString("href"), jSONObject.optString("rel"));
    }

    public static TypeAdapter<AbstractC4561bgo> c(Gson gson) {
        return new C4484bfQ.d(gson);
    }
}
