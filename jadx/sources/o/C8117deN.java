package o;

import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.deN  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8117deN {
    public static String c(String str) {
        Map<String, String> f = f(str);
        if (f == null || f.size() <= 0) {
            return null;
        }
        if (!f.containsKey("beacon_code")) {
            C1044Mm.d("nf_install", "Beacon code not found, exit!");
            return null;
        }
        String str2 = f.get("beacon_code");
        if (C8168dfL.g(str2)) {
            C1044Mm.j("nf_install", "Beacon code is empty, exit!");
            return null;
        }
        C1044Mm.a("nf_install", "Beacon code: %s", str2);
        return str2;
    }

    public static String d(String str) {
        Map<String, String> f = f(str);
        if (f == null || f.size() <= 0) {
            return null;
        }
        if (!f.containsKey("token")) {
            C1044Mm.d("nf_install", "Token not found, exit!");
            return null;
        }
        String str2 = f.get("token");
        if (C8168dfL.g(str2)) {
            C1044Mm.j("nf_install", "Token is empty, exit!");
            return null;
        }
        C1044Mm.a("nf_install", "Token: %s, check if it URL encoded or just Base64...", str2);
        if (C8071ddU.a(str2)) {
            C1044Mm.e("nf_install", "Token is Base64 string, we need to URL encode it.");
            return k(str2);
        }
        return str2;
    }

    public static boolean b(String str) {
        Map<String, String> f = f(str);
        return f != null && f.containsKey("oauth_2_via_browser");
    }

    public static String h(String str) {
        Map<String, String> f = f(str);
        if (f == null || f.size() <= 0) {
            return null;
        }
        if (!f.containsKey("channel_id")) {
            C1044Mm.d("nf_install", "ChannelId not found, exit!");
            return null;
        }
        String str2 = f.get("channel_id");
        if (C8168dfL.g(str2)) {
            C1044Mm.j("nf_install", "ChannelId is empty, exit!");
            return null;
        }
        C1044Mm.a("nf_install", "ChannelId: %s, check if it URL encoded or just Base64...", str2);
        if (C8071ddU.a(str2)) {
            C1044Mm.e("nf_install", "ChannelId is Base64 string, we need to URL encode it.");
            return k(str2);
        }
        return str2;
    }

    public static String j(String str) {
        return e(str, "utm_source");
    }

    public static String i(String str) {
        return e(str, "utm_medium");
    }

    public static String e(String str) {
        return e(str, "utm_campaign");
    }

    public static String e(String str, String str2) {
        Map<String, String> f = f(str);
        if (f == null || f.size() <= 0) {
            return null;
        }
        if (!f.containsKey(str2)) {
            C1044Mm.e("nf_install", "%s not found, exit!", str2);
            return null;
        }
        String str3 = f.get(str2);
        if (C8168dfL.g(str3)) {
            C1044Mm.j("nf_install", "%s is empty, exit!", str2);
            return null;
        }
        C1044Mm.a("nf_install", "key, value: %s, %s  check if it URL encoded or just Base64...", str2, str3);
        if (C8071ddU.a(str3)) {
            C1044Mm.a("nf_install", "%s is Base64 string, we need to URL encode it.", str2);
            return k(str3);
        }
        return str3;
    }

    public static boolean a(String str) {
        return C8168dfL.d("play-auto-installs", j(str)) && C8168dfL.d("preload", i(str));
    }

    private static Map<String, String> f(String str) {
        C1044Mm.a("nf_install", "getReferrers referrer: %s", str);
        if (C8168dfL.g(str)) {
            C1044Mm.d("nf_install", "Referrer property is empty in intent, just exit");
            return null;
        }
        if (!g(str)) {
            C1044Mm.e("nf_install", "Referrer is URL encoded, decode...");
            str = m(str);
        } else {
            C1044Mm.e("nf_install", "Referrer was not URL encoded!");
        }
        HashMap hashMap = new HashMap();
        String[] split = str.split("&");
        if (split != null && split.length > 0) {
            for (String str2 : split) {
                String[] split2 = str2.split("(?<!=)=(?!=)");
                if (split2 != null && split2.length >= 2) {
                    hashMap.put(split2[0], split2[1]);
                    C1044Mm.a("nf_install", "Key: %s, value: %s", split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    public static String e(Intent intent) {
        if (!intent.hasExtra("referrer")) {
            C1044Mm.d("nf_install", "Referrer property not found in intent, just exit");
            return null;
        }
        return intent.getStringExtra("referrer");
    }

    public static String d(Intent intent) {
        C1044Mm.e("nf_install", "getChannelId");
        return h(e(intent));
    }

    public static String b(Intent intent) {
        C1044Mm.e("nf_install", "getSource");
        return j(e(intent));
    }

    private static String m(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.b("nf_install", e, "Encoding issue", new Object[0]);
            return null;
        }
    }

    private static String k(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.b("nf_install", e, "Encoding issue", new Object[0]);
            return null;
        }
    }

    private static boolean g(String str) {
        return str.startsWith("token=") || str.startsWith("channel_id=") || str.startsWith("beacon_code=");
    }
}
