package com.google.android.gms.internal.recaptcha;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfk {
    private static final zzfk zza = new zzfk();
    private final ConcurrentMap<Class<?>, zzfp<?>> zzc = new ConcurrentHashMap();
    private final zzfo zzb = new zzep();

    public static zzfk zza() {
        return zza;
    }

    public final <T> zzfp<T> zza(Class<T> cls) {
        zzdv.zza(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
        zzfp<T> zzfpVar = (zzfp<T>) this.zzc.get(cls);
        if (zzfpVar == null) {
            zzfp<T> zza2 = this.zzb.zza(cls);
            zzdv.zza(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
            zzdv.zza(zza2, "schema");
            zzfp<T> zzfpVar2 = (zzfp<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzfpVar2 != null ? zzfpVar2 : zza2;
        }
        return zzfpVar;
    }

    public final <T> zzfp<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzfk() {
    }
}
