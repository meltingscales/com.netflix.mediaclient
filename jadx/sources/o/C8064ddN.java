package o;

import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Map;

/* renamed from: o.ddN  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8064ddN {
    public static AuthCookieHolder d(C8380djl c8380djl, Map<String, String> map) {
        C1044Mm.e("nf_auth_credentials", "Looking for credentials as cookies in HTTP response headers...");
        Map<String, String> a = C8284dhV.a(map);
        C1044Mm.a("nf_auth_credentials", "Cookies found %d", Integer.valueOf(a.size()));
        AuthCookieHolder b = b("TEMP_PROFILE_ID", a);
        if (b != null) {
            C1044Mm.a("nf_auth_credentials", "Credentials found in HTTP response headers: %s", b);
        } else {
            C1044Mm.e("nf_auth_credentials", "Credentials NOT found in HTTP response headers, try MSL headers...");
            b = b("TEMP_PROFILE_ID", c8380djl.b());
            if (b != null) {
                C1044Mm.a("nf_auth_credentials", "Credentials found in MSL headers and NOT in HTTP response as expected: %s", b);
            } else {
                C1044Mm.d("nf_auth_credentials", "Credentials NOT found in MSL headers or in HTTP response!");
            }
        }
        return b;
    }

    public static AuthCookieHolder b(String str, Map<String, String> map) {
        if (map != null) {
            boolean z = true;
            if (map.size() >= 1) {
                String str2 = map.get(C8284dhV.c(false));
                if (C8168dfL.g(str2)) {
                    str2 = map.get(C8284dhV.c(true));
                } else {
                    z = false;
                }
                String str3 = map.get(C8284dhV.b(z));
                if (C8168dfL.h(str2) && C8168dfL.h(str3)) {
                    C1044Mm.a("nf_auth_credentials", "Update cookies for user %s: newId %s", str, str2);
                    return new AuthCookieHolder(str, str2, str3);
                }
                return null;
            }
        }
        C1044Mm.d("nf_auth_credentials", "Headers not found!");
        return null;
    }
}
