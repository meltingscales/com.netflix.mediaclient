package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzel implements zzhe {
    private final zzeg zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public static zzel zza(zzeg zzegVar) {
        zzel zzelVar = zzegVar.zzc;
        return zzelVar != null ? zzelVar : new zzel(zzegVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzb() {
        return this.zzb;
    }

    private zzel(zzeg zzegVar) {
        zzeg zzegVar2 = (zzeg) zzff.zza(zzegVar, "input");
        this.zza = zzegVar2;
        zzegVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zza() {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zza();
        }
        int i2 = this.zzb;
        if (i2 == 0 || i2 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final boolean zzc() {
        int i;
        if (this.zza.zzt() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzb(i);
    }

    private final void zza(int i) {
        if ((this.zzb & 7) != i) {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final double zzd() {
        zza(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final float zze() {
        zza(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzf() {
        zza(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzg() {
        zza(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzh() {
        zza(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzi() {
        zza(1);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzj() {
        zza(5);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final boolean zzk() {
        zza(0);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final String zzl() {
        zza(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final String zzm() {
        zza(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> T zza(zzhd<T> zzhdVar, zzeq zzeqVar) {
        zza(2);
        return (T) zzc(zzhdVar, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> T zzb(zzhd<T> zzhdVar, zzeq zzeqVar) {
        zza(3);
        return (T) zzd(zzhdVar, zzeqVar);
    }

    private final <T> T zzc(zzhd<T> zzhdVar, zzeq zzeqVar) {
        zzeg zzegVar;
        int zzm = this.zza.zzm();
        zzeg zzegVar2 = this.zza;
        if (zzegVar2.zza >= zzegVar2.zzb) {
            throw new zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzc = zzegVar2.zzc(zzm);
        T zza = zzhdVar.zza();
        this.zza.zza++;
        zzhdVar.zza(zza, this, zzeqVar);
        zzhdVar.zzc(zza);
        this.zza.zza(0);
        zzegVar.zza--;
        this.zza.zzd(zzc);
        return zza;
    }

    private final <T> T zzd(zzhd<T> zzhdVar, zzeq zzeqVar) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T zza = zzhdVar.zza();
            zzhdVar.zza(zza, this, zzeqVar);
            zzhdVar.zzc(zza);
            if (this.zzb == this.zzc) {
                return zza;
            }
            throw zzfo.zzg();
        } finally {
            this.zzc = i;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final zzdu zzn() {
        zza(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzo() {
        zza(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzp() {
        zza(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzq() {
        zza(5);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzr() {
        zza(1);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzs() {
        zza(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzt() {
        zza(0);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zza(List<Double> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzeo)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzeo zzeoVar = (zzeo) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzeoVar.zza(this.zza.zzb());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzeoVar.zza(this.zza.zzb());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzb(List<Float> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfc)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else if (i != 5) {
                throw zzfo.zzf();
            } else {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfc zzfcVar = (zzfc) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzfcVar.zza(this.zza.zzc());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else if (i2 != 5) {
            throw zzfo.zzf();
        } else {
            do {
                zzfcVar.zza(this.zza.zzc());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzc(List<Long> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzgc)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzd()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzgc zzgcVar = (zzgc) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgcVar.zza(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzgcVar.zza(this.zza.zzd());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzd(List<Long> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzgc)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zze()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zze()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzgc zzgcVar = (zzgc) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgcVar.zza(this.zza.zze());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzgcVar.zza(this.zza.zze());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zze(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzfgVar.zzd(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzfgVar.zzd(this.zza.zzf());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzf(List<Long> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzgc)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzg()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Long.valueOf(this.zza.zzg()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzgc zzgcVar = (zzgc) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzgcVar.zza(this.zza.zzg());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzgcVar.zza(this.zza.zzg());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzg(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else if (i != 5) {
                throw zzfo.zzf();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzfgVar.zzd(this.zza.zzh());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else if (i2 != 5) {
            throw zzfo.zzf();
        } else {
            do {
                zzfgVar.zzd(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzh(List<Boolean> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzds)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzi()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzi()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzds zzdsVar = (zzds) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzdsVar.zza(this.zza.zzi());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzdsVar.zza(this.zza.zzi());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzi(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzj(List<String> list) {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) {
        int zza;
        int zza2;
        if ((this.zzb & 7) != 2) {
            throw zzfo.zzf();
        }
        if (!(list instanceof zzfv) || z) {
            do {
                list.add(z ? zzm() : zzl());
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        do {
            zzfvVar.zza(zzn());
            if (this.zza.zzt()) {
                return;
            }
            zza2 = this.zza.zza();
        } while (zza2 == this.zzb);
        this.zzd = zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> void zza(List<T> list, zzhd<T> zzhdVar, zzeq zzeqVar) {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzfo.zzf();
        }
        do {
            list.add(zzc(zzhdVar, zzeqVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> void zzb(List<T> list, zzhd<T> zzhdVar, zzeq zzeqVar) {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzfo.zzf();
        }
        do {
            list.add(zzd(zzhdVar, zzeqVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzk(List<zzdu> list) {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw zzfo.zzf();
        }
        do {
            list.add(zzn());
            if (this.zza.zzt()) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzl(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzfgVar.zzd(this.zza.zzm());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzfgVar.zzd(this.zza.zzm());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzm(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzfgVar.zzd(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzfgVar.zzd(this.zza.zzn());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzn(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Integer.valueOf(this.zza.zzo()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else if (i != 5) {
                throw zzfo.zzf();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzo()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzfgVar.zzd(this.zza.zzo());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else if (i2 != 5) {
            throw zzfo.zzf();
        } else {
            do {
                zzfgVar.zzd(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzo(List<Long> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzgc)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzu() < zzu + zzm);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzgc zzgcVar = (zzgc) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzgcVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu();
            do {
                zzgcVar.zza(this.zza.zzp());
            } while (this.zza.zzu() < zzu2 + zzm2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzp(List<Integer> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzfg)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzq()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzq()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzfg zzfgVar = (zzfg) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzfgVar.zzd(this.zza.zzq());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzfgVar.zzd(this.zza.zzq());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzq(List<Long> list) {
        int zza;
        int zza2;
        if (!(list instanceof zzgc)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzr()));
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzr()));
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzfo.zzf();
            }
        }
        zzgc zzgcVar = (zzgc) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgcVar.zza(this.zza.zzr());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                zzgcVar.zza(this.zza.zzr());
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzfo.zzf();
        }
    }

    private static void zzb(int i) {
        if ((i & 7) != 0) {
            throw zzfo.zzg();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzgf<K, V> r9, com.google.android.gms.internal.measurement.zzeq r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zza(r0)
            com.google.android.gms.internal.measurement.zzeg r1 = r7.zza
            int r1 = r1.zzm()
            com.google.android.gms.internal.measurement.zzeg r2 = r7.zza
            int r1 = r2.zzc(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zza()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.measurement.zzeg r5 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzc()     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzfo r4 = new com.google.android.gms.internal.measurement.zzfo     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.measurement.zzim r4 = r9.zzc     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzd     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.measurement.zzim r4 = r9.zza     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.measurement.zzfn -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.zzfo r8 = new com.google.android.gms.internal.measurement.zzfo     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.measurement.zzeg r8 = r7.zza
            r8.zzd(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzeg r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzel.zza(java.util.Map, com.google.android.gms.internal.measurement.zzgf, com.google.android.gms.internal.measurement.zzeq):void");
    }

    private final Object zza(zzim zzimVar, Class<?> cls, zzeq zzeqVar) {
        switch (zzek.zza[zzimVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(zzp());
            case 5:
                return Integer.valueOf(zzj());
            case 6:
                return Long.valueOf(zzi());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(zzh());
            case 9:
                return Long.valueOf(zzg());
            case 10:
                zza(2);
                return zzc(zzgz.zza().zza((Class) cls), zzeqVar);
            case 11:
                return Integer.valueOf(zzq());
            case 12:
                return Long.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Long.valueOf(zzt());
            case 15:
                return zzm();
            case 16:
                return Integer.valueOf(zzo());
            case 17:
                return Long.valueOf(zzf());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzc(int i) {
        if ((i & 3) != 0) {
            throw zzfo.zzg();
        }
    }

    private final void zzd(int i) {
        if (this.zza.zzu() != i) {
            throw zzfo.zza();
        }
    }
}
