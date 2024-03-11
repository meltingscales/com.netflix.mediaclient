package com.google.android.gms.internal.cast;

import java.util.List;

/* loaded from: classes2.dex */
final class zzph {
    private final zzpg zza;

    private zzph(zzpg zzpgVar) {
        zzqc.zzf(zzpgVar, "output");
        this.zza = zzpgVar;
        zzpgVar.zza = this;
    }

    public static zzph zza(zzpg zzpgVar) {
        zzph zzphVar = zzpgVar.zza;
        return zzphVar != null ? zzphVar : new zzph(zzpgVar);
    }

    public final void zzB(int i, long j) {
        this.zza.zzr(i, (j + j) ^ (j >> 63));
    }

    public final void zzD(int i, String str) {
        this.zza.zzm(i, str);
    }

    public final void zzE(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzqj)) {
            while (i2 < list.size()) {
                this.zza.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzqj zzqjVar = (zzqj) list;
        while (i2 < list.size()) {
            Object zze = zzqjVar.zze(i2);
            if (zze instanceof String) {
                this.zza.zzm(i, (String) zze);
            } else {
                this.zza.zze(i, (zzoy) zze);
            }
            i2++;
        }
    }

    public final void zzF(int i, int i2) {
        this.zza.zzp(i, i2);
    }

    public final void zzH(int i, long j) {
        this.zza.zzr(i, j);
    }

    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    public final void zzd(int i, zzoy zzoyVar) {
        this.zza.zze(i, zzoyVar);
    }

    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzoy) list.get(i2));
        }
    }

    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void zzh(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    public final void zzj(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    public final void zzl(int i, long j) {
        this.zza.zzh(i, j);
    }

    public final void zzn(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, Object obj, zzrm zzrmVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzo(i, 3);
        zzrmVar.zzi((zzrb) obj, zzpgVar.zza);
        zzpgVar.zzo(i, 4);
    }

    public final void zzq(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    public final void zzs(int i, long j) {
        this.zza.zzr(i, j);
    }

    public final void zzu(int i, Object obj, zzrm zzrmVar) {
        Object obj2 = (zzrb) obj;
        zzpd zzpdVar = (zzpd) this.zza;
        zzpdVar.zzq((i << 3) | 2);
        zzol zzolVar = (zzol) obj2;
        int zzn = zzolVar.zzn();
        if (zzn == -1) {
            zzn = zzrmVar.zza(zzolVar);
            zzolVar.zzp(zzn);
        }
        zzpdVar.zzq(zzn);
        zzrmVar.zzi(obj2, zzpdVar.zza);
    }

    public final void zzv(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    public final void zzx(int i, long j) {
        this.zza.zzh(i, j);
    }

    public final void zzz(int i, int i2) {
        this.zza.zzp(i, (i2 + i2) ^ (i2 >> 31));
    }

    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpg zzpgVar = this.zza;
                int intValue = ((Integer) list.get(i2)).intValue();
                zzpgVar.zzp(i, (intValue + intValue) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zzpg.zzA((intValue2 + intValue2) ^ (intValue2 >> 31));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zzpg zzpgVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzpgVar2.zzq((intValue3 + intValue3) ^ (intValue3 >> 31));
            i2++;
        }
    }

    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpg zzpgVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zzpgVar.zzr(i, (longValue + longValue) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzpg.zzB((longValue2 + longValue2) ^ (longValue2 >> 63));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zzpg zzpgVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzpgVar2.zzs((longValue3 + longValue3) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public final void zzG(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpg.zzA(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpg.zzB(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzi(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpg.zzv(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzr(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpg.zzv(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzt(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpg.zzB(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzw(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void zzo(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
