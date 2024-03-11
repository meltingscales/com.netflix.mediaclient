package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.VisitorDeviceId;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dhV  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8284dhV {
    private static boolean e = false;

    /* renamed from: o.dhV$a */
    /* loaded from: classes.dex */
    public interface a {
        void d(CookieManager cookieManager);
    }

    public static String b(boolean z) {
        return z ? "SecureNetflixIdTest" : "SecureNetflixId";
    }

    public static String c(boolean z) {
        return z ? "NetflixIdTest" : "NetflixId";
    }

    private static String e() {
        CookieManager d = d();
        if (d == null) {
            return null;
        }
        return d.getCookie("https://netflix.com");
    }

    public static UserCookies e(boolean z) {
        String e2 = e();
        return new UserCookies(d(e2, z), e(e2, z));
    }

    public static CookieManager d() {
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                C1044Mm.j("nf_net_cookies", "Bad Chrome installation: " + th.getMessage());
            } else if (!e) {
                e = true;
                InterfaceC1598aHf.a(new C1596aHd("CookieManagerException", th, null, true).e(true));
            }
            return null;
        }
    }

    public static void b(a aVar) {
        CookieManager d = d();
        if (d != null) {
            aVar.d(d);
        }
    }

    public static void a(final boolean z) {
        b(new a() { // from class: o.dic
            @Override // o.C8284dhV.a
            public final void d(CookieManager cookieManager) {
                C8284dhV.c(z, cookieManager);
            }
        });
        C8157dfA.a(AbstractApplicationC1040Mh.d(), "shadowCookieNetflixId", "");
        C8157dfA.a(AbstractApplicationC1040Mh.d(), "shadowCookieSecureNetflixId", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z, CookieManager cookieManager) {
        if (z) {
            b("NetflixIdTest", "", false);
            b("SecureNetflixIdTest", "", true);
        } else {
            b("NetflixId", "", false);
            b("SecureNetflixId", "", true);
        }
        b("flwssn", "", false);
        cookieManager.flush();
        C1044Mm.e("nf_net_cookies", "clearedNetflixCookies: ");
    }

    public static void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        System.currentTimeMillis();
        if (z) {
            b("NetflixIdTest", str, false);
            b("SecureNetflixIdTest", str2, true);
        } else {
            b("NetflixId", str, false);
            b("SecureNetflixId", str2, true);
        }
        Context d = AbstractApplicationC1040Mh.d();
        C8157dfA.a(d, "shadowCookieNetflixId", str);
        C8157dfA.a(d, "shadowCookieSecureNetflixId", str2);
        b(new cVE());
    }

    public static void b(String str, String str2, boolean z) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        if (z) {
            sb.append("; secure ");
        }
        b(new a() { // from class: o.did
            @Override // o.C8284dhV.a
            public final void d(CookieManager cookieManager) {
                C8284dhV.a(sb, cookieManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(StringBuilder sb, CookieManager cookieManager) {
        cookieManager.setCookie("https://.netflix.com", sb.toString());
    }

    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            b("nfvdid", str, false);
        }
        b(new cVE());
        Logger.INSTANCE.startSession(new VisitorDeviceId(str));
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b("flwssn", str, false);
        }
        b(new cVE());
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            b("netflix-mfa-nonce", str, false);
        }
        b(new cVE());
    }

    public static AuthCookieHolder c(String str, String str2) {
        if (str2 != null) {
            String str3 = null;
            String str4 = null;
            for (String str5 : str2.split(";")) {
                String[] split = str5.split("=");
                if (split.length >= 2) {
                    if (c(false).equalsIgnoreCase(split[0].trim()) || c(true).equalsIgnoreCase(split[0].trim())) {
                        str3 = split[1];
                    } else if (b(false).equalsIgnoreCase(split[0].trim()) || b(true).equalsIgnoreCase(split[0].trim())) {
                        str4 = split[1];
                    }
                }
                if (C8168dfL.h(str) && C8168dfL.h(str3) && C8168dfL.h(str4)) {
                    C1044Mm.a("nf_net_cookies", "update cookies for %s: newId %s", str, str3);
                    return new AuthCookieHolder(str, str3, str4);
                }
            }
        }
        return null;
    }

    public static String d(String str) {
        return a("flwssn", str);
    }

    public static String b(String str) {
        return a("netflix-mfa-nonce", str);
    }

    public static String b() {
        return a("flwssn", e());
    }

    public static String c() {
        return a("netflix-mfa-nonce", e());
    }

    public static String a() {
        return a("nfvdid", e());
    }

    private static String a(String str, String str2) {
        if (str2 == null || str == null) {
            return null;
        }
        for (String str3 : str2.split(";")) {
            String[] split = str3.split("=");
            if (split.length >= 2 && str.equalsIgnoreCase(split[0].trim())) {
                return split[1];
            }
        }
        return null;
    }

    private static String d(String str, boolean z) {
        String a2 = a(z ? "NetflixIdTest" : "NetflixId", str);
        return C8168dfL.g(a2) ? C8157dfA.e(AbstractApplicationC1040Mh.d(), "shadowCookieNetflixId", "") : a2;
    }

    private static String e(String str, boolean z) {
        String a2 = a(z ? "SecureNetflixIdTest" : "SecureNetflixId", str);
        return C8168dfL.g(a2) ? C8157dfA.e(AbstractApplicationC1040Mh.d(), "shadowCookieSecureNetflixId", "") : a2;
    }

    public static void b(Context context, ValueCallback<Boolean> valueCallback) {
        if (C8054ddD.f()) {
            c(valueCallback);
        } else {
            b(context);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(Boolean.TRUE);
            }
        }
        C8157dfA.a(context, "shadowCookieNetflixId", "");
        C8157dfA.a(context, "shadowCookieSecureNetflixId", "");
    }

    private static void b(Context context) {
        if (context != null) {
            CookieSyncManager.createInstance(context);
            CookieManager d = d();
            if (d != null) {
                d.removeAllCookie();
            }
        }
    }

    private static void c(final ValueCallback<Boolean> valueCallback) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.dhZ
            @Override // java.lang.Runnable
            public final void run() {
                C8284dhV.e(valueCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(ValueCallback valueCallback) {
        CookieManager d = d();
        if (d != null) {
            d.removeAllCookies(valueCallback);
        }
    }

    public static String c(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if ("set-cookie".equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    private static Map<String, String> h(String str) {
        if (C8168dfL.g(str)) {
            return Collections.emptyMap();
        }
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String[] split2 = str2.split("=");
            if (split2.length == 2) {
                hashMap.put(split2[0], split2[1]);
                C1044Mm.a("nf_net_cookies", "Cookie found: %s=%s", split2[0], split2[1]);
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(Map<String, String> map) {
        try {
            String c = c(map);
            if (c != null) {
                return h(c);
            }
            return Collections.emptyMap();
        } catch (ArrayIndexOutOfBoundsException unused) {
            return Collections.emptyMap();
        }
    }

    public static String e(String str) {
        return a("nfvdid", str);
    }
}
