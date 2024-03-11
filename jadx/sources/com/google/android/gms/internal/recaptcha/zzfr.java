package com.google.android.gms.internal.recaptcha;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfr {
    private static final Class<?> zza = zzd();
    private static final zzgh<?, ?> zzb = zza(false);
    private static final zzgh<?, ?> zzc = zza(true);
    private static final zzgh<?, ?> zzd = new zzgj();

    public static zzgh<?, ?> zza() {
        return zzb;
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzds.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static zzgh<?, ?> zzb() {
        return zzc;
    }

    public static zzgh<?, ?> zzc() {
        return zzd;
    }

    public static void zza(int i, List<Double> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzhe zzheVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzhe zzheVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zza(i, list);
    }

    public static void zzb(int i, List<zzch> list, zzhe zzheVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzhe zzheVar, zzfp zzfpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zza(i, list, zzfpVar);
    }

    public static void zzb(int i, List<?> list, zzhe zzheVar, zzfp zzfpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzheVar.zzb(i, list, zzfpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzem) {
            zzem zzemVar = (zzem) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzd(zzemVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzd(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzem) {
            zzem zzemVar = (zzem) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zze(zzemVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zze(list.get(i3).longValue());
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
        return zzb(list) + (size * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzem) {
            zzem zzemVar = (zzem) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzf(zzemVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzf(list.get(i3).longValue());
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
        return zzc(list) + (size * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzk(zzdtVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzk(list.get(i3).intValue());
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
        return zzd(list) + (size * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzf(zzdtVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzf(list.get(i3).intValue());
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
        return zze(list) + (size * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzg(zzdtVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzg(list.get(i3).intValue());
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
        return zzf(list) + (size * zzcy.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzcy.zzh(zzdtVar.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzcy.zzh(list.get(i3).intValue());
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
        return zzg(list) + (size * zzcy.zze(i));
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
        return size * zzcy.zzi(i, 0);
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
        return size * zzcy.zzg(i, 0L);
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
        return size * zzcy.zzb(i, true);
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
        int zze = zzcy.zze(i) * size;
        if (list instanceof zzej) {
            zzej zzejVar = (zzej) list;
            while (i2 < size) {
                Object zzb4 = zzejVar.zzb(i2);
                if (zzb4 instanceof zzch) {
                    zzb3 = zzcy.zzb((zzch) zzb4);
                } else {
                    zzb3 = zzcy.zzb((String) zzb4);
                }
                zze += zzb3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzch) {
                    zzb2 = zzcy.zzb((zzch) obj);
                } else {
                    zzb2 = zzcy.zzb((String) obj);
                }
                zze += zzb2;
                i2++;
            }
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, Object obj, zzfp zzfpVar) {
        if (obj instanceof zzeh) {
            return zzcy.zza(i, (zzeh) obj);
        }
        return zzcy.zzb(i, (zzey) obj, zzfpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list, zzfp zzfpVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzcy.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzeh) {
                zza2 = zzcy.zza((zzeh) obj);
            } else {
                zza2 = zzcy.zza((zzey) obj, zzfpVar);
            }
            zze += zza2;
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzch> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzcy.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzcy.zzb(list.get(i2));
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzey> list, zzfp zzfpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzcy.zzc(i, list.get(i3), zzfpVar);
        }
        return i2;
    }

    private static zzgh<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzgh) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
    public static <T> void zza(zzev zzevVar, T t, T t2, long j) {
        zzgn.zza(t, j, zzevVar.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzdn<FT>> void zza(zzdh<FT> zzdhVar, T t, T t2) {
        zzdl<FT> zza2 = zzdhVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzdhVar.zzb(t).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzgh<UT, UB> zzghVar, T t, T t2) {
        zzghVar.zza(t, zzghVar.zzc(zzghVar.zzb(t), zzghVar.zzb(t2)));
    }
}
