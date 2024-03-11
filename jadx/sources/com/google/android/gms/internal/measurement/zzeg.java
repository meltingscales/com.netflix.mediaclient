package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public abstract class zzeg {
    int zza;
    int zzb;
    zzel zzc;
    private int zzd;
    private boolean zze;

    public static long zza(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeg zza(byte[] bArr, int i, int i2, boolean z) {
        zzei zzeiVar = new zzei(bArr, 0, i2, false);
        try {
            zzeiVar.zzc(i2);
            return zzeiVar;
        } catch (zzfo e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zze(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract int zza();

    public abstract void zza(int i);

    public abstract double zzb();

    public abstract boolean zzb(int i);

    public abstract float zzc();

    public abstract int zzc(int i);

    public abstract long zzd();

    public abstract void zzd(int i);

    public abstract long zze();

    public abstract int zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract boolean zzi();

    public abstract String zzj();

    public abstract String zzk();

    public abstract zzdu zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract int zzo();

    public abstract long zzp();

    public abstract int zzq();

    public abstract long zzr();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long zzs();

    public abstract boolean zzt();

    public abstract int zzu();

    private zzeg() {
        this.zzb = 100;
        this.zzd = Integer.MAX_VALUE;
        this.zze = false;
    }
}
