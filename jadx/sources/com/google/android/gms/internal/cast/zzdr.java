package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzdr {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzb = zzdt.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                zzb = zzdt.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IndexOutOfBoundsException(zzb);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zze(i, i2, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    private static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzdt.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return zzdt.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void zzd(int i, int i2, int i3) {
        String zze;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zze = zze(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                zze = zze(i2, i3, "end index");
            } else {
                zze = zzdt.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zze);
        }
    }
}
