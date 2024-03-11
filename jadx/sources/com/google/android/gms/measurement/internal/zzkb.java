package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class zzkb extends zzkc {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkb(zzke zzkeVar) {
        super(zzkeVar);
        this.zza.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaj() {
        return this.zzb;
    }

    protected abstract boolean zze();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzak() {
        if (!zzaj()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzal() {
        if (this.zzb) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zze();
        this.zza.zzp();
        this.zzb = true;
    }
}
