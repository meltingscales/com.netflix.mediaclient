package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class aJM {
    public static final aJM e = new aJM();

    private aJM() {
    }

    public static final Map<String, String> e(Map<String, String> map, String str, String str2) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        map.put("X-Netflix.esnPrefix", str);
        map.put("X-Netflix.appVer", str2);
        map.put("X-Netflix.clientType", "samurai");
        map.put("X-Netflix.androidApi", String.valueOf(C8054ddD.c()));
        map.put("X-Netflix.deviceFormFactor", C8151dev.f() ? "TABLET" : "PHONE");
        String c = C8120deQ.c();
        C8632dsu.a(c, "");
        map.put("X-Netflix.deviceMemoryLevel", c);
        return map;
    }
}
