package o;

import com.netflix.android.org.json.HTTP;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetStateEvent;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aYs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2069aYs {
    public static String a = "regpairrequest";
    public static String c = "session";
    public static String d = "pairingrequest";
    public static String e = "mdxping";

    /* renamed from: o.aYs$e */
    /* loaded from: classes3.dex */
    public static class e {
        private final TargetStateEvent a = TargetStateEvent.PingSucceed;
        private final JSONObject b;

        public TargetStateEvent d() {
            return this.a;
        }

        e(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        public boolean e() {
            return this.b.optInt("responseheaders.X-MDX-Registered") > 0;
        }
    }

    public static String a(C2022aWz c2022aWz) {
        return C8168dfL.m(c2022aWz.c().toString());
    }

    public static String b(C2021aWy c2021aWy) {
        return C8168dfL.m(c2021aWy.c().toString());
    }

    public static String a(String str, String str2) {
        String h = AbstractC2065aYo.h();
        return "action=pingsearch" + HTTP.CRLF + "id=" + str + HTTP.CRLF + "fromurl=" + str2 + HTTP.CRLF + "fromuuid=" + h + HTTP.CRLF + "servicetype=urn:mdx-netflix-com:service:target" + HTTP.CRLF;
    }

    public static e b(JSONObject jSONObject) {
        if (C8168dfL.d(jSONObject.optString(SignupConstants.Error.DEBUG_INFO_ACTION), "pingresponse")) {
            return new e(jSONObject);
        }
        return null;
    }

    public static JSONObject a(String str) {
        String[] split;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : str.split(HTTP.CRLF)) {
            String[] split2 = str2.split("=", 2);
            if (split2.length == 2 && C8168dfL.h(split2[0])) {
                if (!e(split2[0], split2[1], jSONObject2)) {
                    jSONObject.putOpt(split2[0], split2[1]);
                }
            } else {
                C1044Mm.j("MdxTargetMessage", "ignore %s", str2);
            }
        }
        if (jSONObject2.length() > 0) {
            jSONObject.put("appBody", jSONObject2);
        }
        return jSONObject;
    }

    private static boolean e(String str, String str2, JSONObject jSONObject) {
        if (str.startsWith("appBody.")) {
            String replace = str.replace("appBody.", "");
            String[] split = replace.split("\\.");
            if (split.length > 3 || split.length == 0) {
                C1044Mm.j("MdxTargetMessage", "can not parse %s", str);
                return false;
            }
            if (split.length == 1) {
                jSONObject.put(replace, str2);
            } else if (split.length == 2) {
                String[] c2 = c(split[0]);
                if (c2 == null) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(split[0]);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(split[0], optJSONObject);
                    }
                    optJSONObject.put(split[1], str2);
                } else {
                    String str3 = c2[0];
                    int intValue = Integer.valueOf(c2[1]).intValue();
                    JSONArray optJSONArray = jSONObject.optJSONArray(str3);
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                        jSONObject.put(str3, optJSONArray);
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(intValue);
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                    }
                    optJSONObject2.put(split[1], str2);
                    optJSONArray.put(intValue, optJSONObject2);
                }
            } else {
                JSONObject optJSONObject3 = jSONObject.optJSONObject(split[0]);
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                    jSONObject.put(split[0], optJSONObject3);
                }
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject(split[1]);
                if (optJSONObject4 == null) {
                    optJSONObject4 = new JSONObject();
                    optJSONObject3.put(split[1], optJSONObject4);
                }
                optJSONObject4.put(split[2], str2);
            }
            return true;
        }
        return false;
    }

    private static String[] c(String str) {
        if (str.contains("[") && str.endsWith("]")) {
            return str.replace("[", ".").replace("]", ".").split("\\.");
        }
        return null;
    }
}
