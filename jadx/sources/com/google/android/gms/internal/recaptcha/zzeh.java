package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
public class zzeh {
    private static final zzdf zza = zzdf.zza();
    private zzch zzb;
    private volatile zzey zzc;
    private volatile zzch zzd;

    public int hashCode() {
        return 1;
    }

    public final zzey zza(zzey zzeyVar) {
        zzey zzeyVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzeyVar;
        return zzeyVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeh) {
            zzeh zzehVar = (zzeh) obj;
            zzey zzeyVar = this.zzc;
            zzey zzeyVar2 = zzehVar.zzc;
            if (zzeyVar == null && zzeyVar2 == null) {
                return zzc().equals(zzehVar.zzc());
            }
            if (zzeyVar == null || zzeyVar2 == null) {
                if (zzeyVar != null) {
                    return zzeyVar.equals(zzehVar.zzb(zzeyVar.zzh()));
                }
                return zzb(zzeyVar2.zzh()).equals(zzeyVar2);
            }
            return zzeyVar.equals(zzeyVar2);
        }
        return false;
    }

    private final zzey zzb(zzey zzeyVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzeyVar;
                        this.zzd = zzch.zza;
                    } catch (zzdy unused) {
                        this.zzc = zzeyVar;
                        this.zzd = zzch.zza;
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
            return this.zzc.zzk();
        }
        return 0;
    }

    public final zzch zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzch.zza;
            } else {
                this.zzd = this.zzc.zzb();
            }
            return this.zzd;
        }
    }
}
