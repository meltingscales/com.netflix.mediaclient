package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzeu implements zzev {
    @Override // com.google.android.gms.internal.recaptcha.zzev
    public final zzet<?, ?> zzb(Object obj) {
        zzeq zzeqVar = (zzeq) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.recaptcha.zzev
    public final Map<?, ?> zzc(Object obj) {
        return (zzes) obj;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzev
    public final Object zze(Object obj) {
        ((zzes) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzev
    public final Object zza(Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        zzes zzesVar2 = (zzes) obj2;
        if (!zzesVar2.isEmpty()) {
            if (!zzesVar.zzd()) {
                zzesVar = zzesVar.zzb();
            }
            zzesVar.zza(zzesVar2);
        }
        return zzesVar;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzev
    public final int zza(int i, Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        zzeq zzeqVar = (zzeq) obj2;
        if (zzesVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzesVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
