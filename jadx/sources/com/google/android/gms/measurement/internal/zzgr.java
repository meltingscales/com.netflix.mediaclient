package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class zzgr implements zzgt {
    protected final zzga zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgr(zzga zzgaVar) {
        Preconditions.checkNotNull(zzgaVar);
        this.zzx = zzgaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public zzw zzu() {
        return this.zzx.zzu();
    }

    public zzx zzt() {
        return this.zzx.zzb();
    }

    public zzff zzs() {
        return this.zzx.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public zzew zzr() {
        return this.zzx.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public zzft zzq() {
        return this.zzx.zzq();
    }

    public zzkm zzp() {
        return this.zzx.zzi();
    }

    public zzeu zzo() {
        return this.zzx.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public Context zzn() {
        return this.zzx.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public Clock zzm() {
        return this.zzx.zzm();
    }

    public zzah zzl() {
        return this.zzx.zzx();
    }

    public void zzd() {
        this.zzx.zzq().zzd();
    }

    public void zzc() {
        this.zzx.zzq().zzc();
    }

    public void zzb() {
        this.zzx.zzad();
    }

    public void zza() {
        this.zzx.zzae();
    }
}
