package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public class zzft {
    private static final zzeq zza = zzeq.zza();
    private zzdu zzb;
    private volatile zzgo zzc;
    private volatile zzdu zzd;

    public int hashCode() {
        return 1;
    }

    public final zzgo zza(zzgo zzgoVar) {
        zzgo zzgoVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzgoVar;
        return zzgoVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            zzgo zzgoVar = this.zzc;
            zzgo zzgoVar2 = zzftVar.zzc;
            if (zzgoVar == null && zzgoVar2 == null) {
                return zzc().equals(zzftVar.zzc());
            }
            if (zzgoVar == null || zzgoVar2 == null) {
                if (zzgoVar != null) {
                    return zzgoVar.equals(zzftVar.zzb(zzgoVar.zzbt()));
                }
                return zzb(zzgoVar2.zzbt()).equals(zzgoVar2);
            }
            return zzgoVar.equals(zzgoVar2);
        }
        return false;
    }

    private final zzgo zzb(zzgo zzgoVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzgoVar;
                        this.zzd = zzdu.zza;
                    } catch (zzfo unused) {
                        this.zzc = zzgoVar;
                        this.zzd = zzdu.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbn();
        }
        return 0;
    }

    public final zzdu zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzdu.zza;
            } else {
                this.zzd = this.zzc.zzbh();
            }
            return this.zzd;
        }
    }
}
