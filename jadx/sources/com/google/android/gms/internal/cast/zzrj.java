package com.google.android.gms.internal.cast;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrj {
    private static final zzrj zza = new zzrj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzrn zzb = new zzqt();

    private zzrj() {
    }

    public static zzrj zza() {
        return zza;
    }

    public final zzrm zzb(Class cls) {
        zzqc.zzf(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
        zzrm zzrmVar = (zzrm) this.zzc.get(cls);
        if (zzrmVar == null) {
            zzrmVar = this.zzb.zza(cls);
            zzqc.zzf(cls, Payload.PARAM_RENO_MESSAGE_TYPE);
            zzqc.zzf(zzrmVar, "schema");
            zzrm zzrmVar2 = (zzrm) this.zzc.putIfAbsent(cls, zzrmVar);
            if (zzrmVar2 != null) {
                return zzrmVar2;
            }
        }
        return zzrmVar;
    }
}
