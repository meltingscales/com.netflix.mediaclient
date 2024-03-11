package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzkt extends zzpq {
    private zzkt() {
        super(zzku.zzc());
    }

    public final zzkt zza(Iterable iterable) {
        if (this.zzb) {
            zzt();
            this.zzb = false;
        }
        zzku.zze((zzku) this.zza, iterable);
        return this;
    }

    public final zzkt zzb(zzla zzlaVar) {
        if (this.zzb) {
            zzt();
            this.zzb = false;
        }
        zzku.zzd((zzku) this.zza, zzlaVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkt(zzko zzkoVar) {
        super(zzku.zzc());
    }
}
