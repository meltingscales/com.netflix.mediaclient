package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.zzy;

/* loaded from: classes5.dex */
final class zzn extends zzy {
    private final zzy.zzc zza;
    private final zzy.zzb zzb;

    /* synthetic */ zzn(zzy.zzc zzcVar, zzy.zzb zzbVar, zzm zzmVar) {
        this.zza = zzcVar;
        this.zzb = zzbVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzy) {
            zzy.zzc zzcVar = this.zza;
            if (zzcVar != null ? zzcVar.equals(((zzn) obj).zza) : ((zzn) obj).zza == null) {
                zzy.zzb zzbVar = this.zzb;
                if (zzbVar == null) {
                    if (((zzn) obj).zzb == null) {
                        return true;
                    }
                } else if (zzbVar.equals(((zzn) obj).zzb)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        zzy.zzc zzcVar = this.zza;
        int hashCode = zzcVar == null ? 0 : zzcVar.hashCode();
        zzy.zzb zzbVar = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (zzbVar != null ? zzbVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.zza + ", mobileSubtype=" + this.zzb + "}";
    }

    public zzy.zzb zzb() {
        return this.zzb;
    }

    public zzy.zzc zzc() {
        return this.zza;
    }

    /* loaded from: classes5.dex */
    static final class zza extends zzy.zza {
        private zzy.zzc zza;
        private zzy.zzb zzb;

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public zzy.zza zza(zzy.zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public zzy.zza zza(zzy.zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public zzy zza() {
            return new zzn(this.zza, this.zzb, null);
        }
    }
}
