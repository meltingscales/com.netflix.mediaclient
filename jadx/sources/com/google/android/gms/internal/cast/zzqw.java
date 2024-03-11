package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzqw {
    public static final int zza(int i, Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        zzqu zzquVar = (zzqu) obj2;
        if (zzqvVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzqvVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }
}
