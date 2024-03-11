package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dfW  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8179dfW {
    public static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.j("UriUtils", "Could not encoded param ", e);
            return URLEncoder.encode(str);
        }
    }

    public static String e(String str, String str2) {
        return "&" + str + "=" + str2;
    }

    public static void e(Context context, String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(872415232);
            context.startActivity(intent);
            return;
        }
        C1044Mm.d("UriUtils", "URI is missing! Can not open to browser!");
    }

    public static Map<String, String> e(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
