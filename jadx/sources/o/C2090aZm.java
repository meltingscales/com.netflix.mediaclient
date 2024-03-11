package o;

import org.json.JSONObject;

/* renamed from: o.aZm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2090aZm {
    public static final C2090aZm d = new C2090aZm();

    private C2090aZm() {
    }

    public final InterfaceC2092aZo b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return b(jSONObject.optString("deviceCommand"));
    }

    public final InterfaceC2092aZo b(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase();
            C8632dsu.a(str2, "");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -934641255) {
                if (hashCode != 0) {
                    if (hashCode != 3127582) {
                        if (hashCode == 108404047 && str2.equals("reset")) {
                            return new C2094aZq();
                        }
                    } else if (str2.equals("exit")) {
                        return new C2091aZn();
                    }
                } else if (str2.equals("")) {
                    return null;
                }
            } else if (str2.equals("reload")) {
                return new C2093aZp();
            }
            return new C2096aZs(str);
        }
        return null;
    }
}
