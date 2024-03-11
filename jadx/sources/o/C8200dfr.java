package o;

import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.dfr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8200dfr {
    private static final Map<String, String> a = new HashMap();

    public static void c(Map<String, String> map, String str, boolean z) {
        d(map, "router", str, true, z);
    }

    public static void b(Map<String, String> map, String str) {
        d(map, "router", str, true, true);
    }

    public static void d(Map<String, String> map, String str, String str2, boolean z, boolean z2) {
        e(map, str2, z);
        map.put("X-Netflix.Request.Routing", b(str2, str, z2));
    }

    public static void e(Map<String, String> map, String str, boolean z) {
        map.put("content-type", "application/json");
        if (z) {
            map.put("Content-Encoding", "msl_v1");
        }
        map.put("X-Netflix.client.request.name", str);
    }

    private static String b(String str, String str2, boolean z) {
        Map<String, String> map = a;
        String str3 = map.get(str + str2);
        if (str3 == null) {
            str3 = b(str2, z);
            map.put(str + str2, str3);
        }
        C1044Mm.a("NodeQuarkUtils", "%s %s", str, str3);
        return str3;
    }

    public static void e(Map<String, String> map) {
        map.remove("x-netflix.nq-shadow.id");
        map.remove("x-netflix.nq-shadow");
    }

    private static String b(String str, boolean z) {
        String str2;
        String str3 = z ? "/nq/android/playback/~1.0.0" : "/nq/android/api/~7.1.0";
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "router";
        }
        try {
            if (str3.endsWith("/")) {
                str2 = str3 + str;
            } else {
                str2 = str3 + "/" + str;
            }
            jSONObject.putOpt(Ease.ANIMATION_EASE_TYPE.PATH, str2);
        } catch (JSONException e) {
            C1044Mm.e("NodeQuarkUtils", "unable to build NqRoutingHeader", e);
        }
        return jSONObject.toString();
    }
}
