package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.zzk;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class zzv {

    /* loaded from: classes5.dex */
    public static abstract class zza {
        abstract zza zza(int i);

        public abstract zza zza(long j);

        public abstract zza zza(zzaa zzaaVar);

        public abstract zza zza(zzq zzqVar);

        abstract zza zza(String str);

        public abstract zza zza(List<zzt> list);

        public abstract zzv zza();

        public zza zzb(int i) {
            return zza(i);
        }

        public abstract zza zzb(long j);

        public zza zzb(String str) {
            return zza(str);
        }
    }

    public static zza zza() {
        return new zzk.zza().zza(Integer.MIN_VALUE);
    }
}
