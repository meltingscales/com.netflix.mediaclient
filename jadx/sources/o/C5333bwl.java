package o;

import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* renamed from: o.bwl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5333bwl {
    @SerializedName("t")
    public String b;
    @SerializedName("c")
    public int c;
    @SerializedName("n")
    public int d;

    public C5333bwl(int i, String str, int i2) {
        this.d = i;
        this.b = str;
        this.c = i2;
    }

    public static C5333bwl a(JSONObject jSONObject) {
        return new C5333bwl(jSONObject.getInt("n"), jSONObject.getString("t"), jSONObject.optInt("c"));
    }
}
