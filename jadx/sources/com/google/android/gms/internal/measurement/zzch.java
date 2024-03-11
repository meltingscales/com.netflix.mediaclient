package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzch {
    private final Map<String, Map<String, String>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzch(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.zza.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str3);
            str3 = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        }
        return map.get(str3);
    }
}
