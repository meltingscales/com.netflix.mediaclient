package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class zzkc extends zzgr implements zzgt {
    protected final zzke zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkc(zzke zzkeVar) {
        super(zzkeVar.zzs());
        Preconditions.checkNotNull(zzkeVar);
        this.zza = zzkeVar;
    }

    public zzfu zzj() {
        return this.zza.zzc();
    }

    public zzac zzi() {
        return this.zza.zze();
    }

    public zzn e_() {
        return this.zza.zzf();
    }

    public zzki zzg() {
        return this.zza.zzh();
    }
}
