package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzhf {
    private static final Class<?> zza = zzd();
    private static final zzhv<?, ?> zzb = zza(false);
    private static final zzhv<?, ?> zzc = zza(true);
    private static final zzhv<?, ?> zzd = new zzhx();

    public static zzhv<?, ?> zza() {
        return zzb;
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzfd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static zzhv<?, ?> zzb() {
        return zzc;
    }

    public static zzhv<?, ?> zzc() {
        return zzd;
    }

    public static void zza(int i, List<Double> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzis zzisVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzis zzisVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list);
    }

    public static void zzb(int i, List<zzdu> list, zzis zzisVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzis zzisVar, zzhd zzhdVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list, zzhdVar);
    }

    public static void zzb(int i, List<?> list, zzis zzisVar, zzhd zzhdVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list, zzhdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgc) {
            zzgc zzgcVar = (zzgc) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzd(zzgcVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzd(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgc) {
            zzgc zzgcVar = (zzgc) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zze(zzgcVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zze(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgc) {
            zzgc zzgcVar = (zzgc) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzf(zzgcVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzf(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfg) {
            zzfg zzfgVar = (zzfg) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzk(zzfgVar.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzk(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfg) {
            zzfg zzfgVar = (zzfg) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzf(zzfgVar.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzf(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfg) {
            zzfg zzfgVar = (zzfg) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzg(zzfgVar.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzg(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfg) {
            zzfg zzfgVar = (zzfg) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzen.zzh(zzfgVar.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzen.zzh(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzen.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.zzi(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.zzg(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.zzb(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list) {
        int zzb2;
        int zzb3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzen.zze(i) * size;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            while (i2 < size) {
                Object zzb4 = zzfvVar.zzb(i2);
                if (zzb4 instanceof zzdu) {
                    zzb3 = zzen.zzb((zzdu) zzb4);
                } else {
                    zzb3 = zzen.zzb((String) zzb4);
                }
                zze += zzb3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdu) {
                    zzb2 = zzen.zzb((zzdu) obj);
                } else {
                    zzb2 = zzen.zzb((String) obj);
                }
                zze += zzb2;
                i2++;
            }
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, Object obj, zzhd zzhdVar) {
        if (obj instanceof zzft) {
            return zzen.zza(i, (zzft) obj);
        }
        return zzen.zzb(i, (zzgo) obj, zzhdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list, zzhd zzhdVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzen.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzft) {
                zza2 = zzen.zza((zzft) obj);
            } else {
                zza2 = zzen.zza((zzgo) obj, zzhdVar);
            }
            zze += zza2;
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzdu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzen.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzen.zzb(list.get(i2));
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzgo> list, zzhd zzhdVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzen.zzc(i, list.get(i3), zzhdVar);
        }
        return i2;
    }

    private static zzhv<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzhv) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzgh zzghVar, T t, T t2, long j) {
        zzib.zza(t, j, zzghVar.zza(zzib.zzf(t, j), zzib.zzf(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzey<FT>> void zza(zzes<FT> zzesVar, T t, T t2) {
        zzew<FT> zza2 = zzesVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzesVar.zzb(t).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzhv<UT, UB> zzhvVar, T t, T t2) {
        zzhvVar.zza(t, zzhvVar.zzc(zzhvVar.zzb(t), zzhvVar.zzb(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzfk zzfkVar, UB ub, zzhv<UT, UB> zzhvVar) {
        if (zzfkVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfkVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzhvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfkVar.zza(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzhvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzhv<UT, UB> zzhvVar) {
        if (ub == null) {
            ub = zzhvVar.zza();
        }
        zzhvVar.zza((zzhv<UT, UB>) ub, i, i2);
        return ub;
    }
}
