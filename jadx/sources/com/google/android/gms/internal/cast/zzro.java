package com.google.android.gms.internal.cast;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzro {
    private static final Class zza;
    private static final zzsd zzb;
    private static final zzsd zzc;
    private static final zzsd zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzsf();
    }

    public static zzsd zzA() {
        return zzc;
    }

    public static zzsd zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzC(zzpj zzpjVar, Object obj, Object obj2) {
        zzpjVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzD(zzsd zzsdVar, Object obj, Object obj2) {
        zzsdVar.zzf(obj, zzsdVar.zzd(zzsdVar.zzc(obj), zzsdVar.zzc(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzpt.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzF(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzG(zzqw zzqwVar, Object obj, Object obj2, long j) {
        zzqv zzqvVar = (zzqv) zzsn.zzf(obj, j);
        zzqv zzqvVar2 = (zzqv) zzsn.zzf(obj2, j);
        if (!zzqvVar2.isEmpty()) {
            if (!zzqvVar.zzd()) {
                zzqvVar = zzqvVar.zza();
            }
            zzqvVar.zzc(zzqvVar2);
        }
        zzsn.zzs(obj, j, zzqvVar);
    }

    public static void zzH(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzc(i, list, z);
    }

    public static void zzI(int i, List list, zzph zzphVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zze(i, list);
    }

    public static void zzJ(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzg(i, list, z);
    }

    public static void zzK(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzi(i, list, z);
    }

    public static void zzL(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzk(i, list, z);
    }

    public static void zzM(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzm(i, list, z);
    }

    public static void zzN(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzo(i, list, z);
    }

    public static void zzO(int i, List list, zzph zzphVar, zzrm zzrmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzphVar.zzp(i, list.get(i2), zzrmVar);
        }
    }

    public static void zzP(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzr(i, list, z);
    }

    public static void zzQ(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzt(i, list, z);
    }

    public static void zzR(int i, List list, zzph zzphVar, zzrm zzrmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzphVar.zzu(i, list.get(i2), zzrmVar);
        }
    }

    public static void zzS(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzw(i, list, z);
    }

    public static void zzT(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzy(i, list, z);
    }

    public static void zzU(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzA(i, list, z);
    }

    public static void zzV(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzC(i, list, z);
    }

    public static void zzW(int i, List list, zzph zzphVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzE(i, list);
    }

    public static void zzX(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzG(i, list, z);
    }

    public static void zzY(int i, List list, zzph zzphVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzphVar.zzI(i, list, z);
    }

    private static zzsd zzZ(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzsd) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpg.zzA(i << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzpg.zzz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzpg.zzt((zzoy) list.get(i2));
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzpu) {
            zzpu zzpuVar = (zzpu) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzpg.zzv(zzpuVar.zzd(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzpg.zzv(((Integer) list.get(i3)).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpg.zzA(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpg.zzA(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, List list, zzrm zzrmVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzpg.zzu(i, (zzrb) list.get(i3), zzrmVar);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzpu) {
            zzpu zzpuVar = (zzpu) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzpg.zzv(zzpuVar.zzd(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzpg.zzv(((Integer) list.get(i3)).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqq) {
            zzqq zzqqVar = (zzqq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzpg.zzB(zzqqVar.zzd(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzpg.zzB(((Long) list.get(i3)).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, Object obj, zzrm zzrmVar) {
        if (obj instanceof zzqh) {
            int zzA = zzpg.zzA(i << 3);
            int zza2 = ((zzqh) obj).zza();
            return zzA + zzpg.zzA(zza2) + zza2;
        }
        return zzpg.zzA(i << 3) + zzpg.zzx((zzrb) obj, zzrmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List list, zzrm zzrmVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzpg.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzqh) {
                zzx = zzpg.zzw((zzqh) obj);
            } else {
                zzx = zzpg.zzx((zzrb) obj, zzrmVar);
            }
            zzz += zzx;
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzpu) {
            zzpu zzpuVar = (zzpu) list;
            for (int i2 = 0; i2 < size; i2++) {
                int zzd2 = zzpuVar.zzd(i2);
                i += zzpg.zzA((zzd2 + zzd2) ^ (zzd2 >> 31));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i += zzpg.zzA((intValue + intValue) ^ (intValue >> 31));
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqq) {
            zzqq zzqqVar = (zzqq) list;
            for (int i2 = 0; i2 < size; i2++) {
                long zzd2 = zzqqVar.zzd(i2);
                i += zzpg.zzB((zzd2 + zzd2) ^ (zzd2 >> 63));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                long longValue = ((Long) list.get(i3)).longValue();
                i += zzpg.zzB((longValue + longValue) ^ (longValue >> 63));
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzpg.zzz(i) * size;
        if (list instanceof zzqj) {
            zzqj zzqjVar = (zzqj) list;
            while (i2 < size) {
                Object zze = zzqjVar.zze(i2);
                if (zze instanceof zzoy) {
                    zzy2 = zzpg.zzt((zzoy) zze);
                } else {
                    zzy2 = zzpg.zzy((String) zze);
                }
                zzz += zzy2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzoy) {
                    zzy = zzpg.zzt((zzoy) obj);
                } else {
                    zzy = zzpg.zzy((String) obj);
                }
                zzz += zzy;
                i2++;
            }
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzpu) {
            zzpu zzpuVar = (zzpu) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzpg.zzA(zzpuVar.zzd(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzpg.zzA(((Integer) list.get(i3)).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzpg.zzz(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqq) {
            zzqq zzqqVar = (zzqq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzpg.zzB(zzqqVar.zzd(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzpg.zzB(((Long) list.get(i3)).longValue());
            }
        }
        return i;
    }

    public static zzsd zzz() {
        return zzb;
    }
}
