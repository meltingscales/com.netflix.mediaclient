package com.google.android.gms.internal.measurement;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz();
    private final ConcurrentMap<Class<?>, zzhd<?>> zzc = new ConcurrentHashMap();
    private final zzhg zzb = new zzgb();

    public static zzgz zza() {
        return zza;
    }

    public final <T> zzhd<T> zza(Class<T> cls) {
        zzff.zza(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
        zzhd<T> zzhdVar = (zzhd<T>) this.zzc.get(cls);
        if (zzhdVar == null) {
            zzhd<T> zza2 = this.zzb.zza(cls);
            zzff.zza(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
            zzff.zza(zza2, "schema");
            zzhd<T> zzhdVar2 = (zzhd<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzhdVar2 != null ? zzhdVar2 : zza2;
        }
        return zzhdVar;
    }

    public final <T> zzhd<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzgz() {
    }
}
