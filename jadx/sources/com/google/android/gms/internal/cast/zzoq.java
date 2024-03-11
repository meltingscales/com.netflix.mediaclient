package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzoq implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzoy zzoyVar = (zzoy) obj;
        zzoy zzoyVar2 = (zzoy) obj2;
        zzop zzopVar = new zzop(zzoyVar);
        zzop zzopVar2 = new zzop(zzoyVar2);
        while (zzopVar.hasNext() && zzopVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzopVar.zza() & 255).compareTo(Integer.valueOf(zzopVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzoyVar.zzd()).compareTo(Integer.valueOf(zzoyVar2.zzd()));
    }
}
