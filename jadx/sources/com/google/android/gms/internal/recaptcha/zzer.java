package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzer implements zzez {
    private zzez[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzer(zzez... zzezVarArr) {
        this.zza = zzezVarArr;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzez
    public final boolean zza(Class<?> cls) {
        for (zzez zzezVar : this.zza) {
            if (zzezVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzez
    public final zzew zzb(Class<?> cls) {
        zzez[] zzezVarArr;
        for (zzez zzezVar : this.zza) {
            if (zzezVar.zza(cls)) {
                return zzezVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
