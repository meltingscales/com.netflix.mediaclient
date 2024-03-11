package com.google.android.gms.internal.tflite;

import android.content.ContentResolver;
import androidx.collection.ArrayMap;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzo {
    private final ContentResolver zzc;
    private static final Map zzb = new ArrayMap();
    public static final String[] zza = {SignupConstants.Error.DEBUG_FIELD_KEY, "value"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        synchronized (zzo.class) {
            Map map = zzb;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                ContentResolver contentResolver = ((zzo) it.next()).zzc;
                throw null;
            }
            map.clear();
        }
    }
}
