package com.google.android.gms.internal.tflite;

import android.content.SharedPreferences;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzt {
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        synchronized (zzt.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzt) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }
}
