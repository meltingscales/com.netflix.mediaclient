package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzgd implements zzgl {
    private zzgl[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgl... zzglVarArr) {
        this.zza = zzglVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final boolean zza(Class<?> cls) {
        for (zzgl zzglVar : this.zza) {
            if (zzglVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final zzgm zzb(Class<?> cls) {
        zzgl[] zzglVarArr;
        for (zzgl zzglVar : this.zza) {
            if (zzglVar.zza(cls)) {
                return zzglVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
