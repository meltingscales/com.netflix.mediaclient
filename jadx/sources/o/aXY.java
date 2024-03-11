package o;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aXY extends AbstractC2063aYm {
    private static String a = "name";
    private static String d = "data";
    private static String e = "message";
    private static String g = "uid";
    private static String i = "options";
    private static String j = "title";
    private e[] f;
    private String h;
    private String m;
    private String n;

    public aXY(JSONObject jSONObject) {
        super("DIALOG_SHOW");
        this.n = jSONObject.getString(g);
        this.m = jSONObject.getString(j);
        this.h = jSONObject.getString(e);
        JSONArray jSONArray = jSONObject.getJSONArray(i);
        this.f = new e[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f[i2] = e.a(jSONArray.getJSONObject(i2));
        }
        this.c = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static class e {
        public String a;
        public String e;

        public e(String str, String str2) {
            this.a = str;
            this.e = str2;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString(aXY.a), jSONObject.getString(aXY.d));
        }
    }
}
