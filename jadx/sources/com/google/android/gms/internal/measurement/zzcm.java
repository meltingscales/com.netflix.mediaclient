package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes5.dex */
public final class zzcm {
    private static final ArrayMap<String, Uri> zza = new ArrayMap<>();

    public static Uri zza(String str) {
        Uri uri;
        synchronized (zzcm.class) {
            ArrayMap<String, Uri> arrayMap = zza;
            uri = arrayMap.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap.put(str, uri);
            }
        }
        return uri;
    }
}
