package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzi {
    private static final Set zza = new HashSet(Arrays.asList("app_update", "review"));
    private static final Set zzb = new HashSet(Arrays.asList("native", "unity"));
    private static final Map zzc = new HashMap();
    private static final zzm zzd = new zzm("PlayCoreVersion");

    public static Map zza(String str) {
        Map map;
        synchronized (zzi.class) {
            Map map2 = zzc;
            if (!map2.containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11004);
                map2.put("app_update", hashMap);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }
}
