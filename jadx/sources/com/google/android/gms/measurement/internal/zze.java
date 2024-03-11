package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class zze extends zzf {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(zzga zzgaVar) {
        super(zzgaVar);
        this.zzx.zza(this);
    }

    protected void zzaa() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzv() {
        return this.zza;
    }

    protected abstract boolean zzz();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzw() {
        if (!zzv()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzz()) {
            return;
        }
        this.zzx.zzaf();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaa();
        this.zzx.zzaf();
        this.zza = true;
    }
}
