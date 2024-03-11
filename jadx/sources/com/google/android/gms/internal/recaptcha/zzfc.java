package com.google.android.gms.internal.recaptcha;

import androidx.appcompat.widget.ActivityChooserModel;
import com.netflix.android.org.json.zip.JSONzip;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.chromium.net.ConnectionSubtype;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzfc<T> implements zzfp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgn.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzey zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzfh zzo;
    private final zzei zzp;
    private final zzgh<?, ?> zzq;
    private final zzdh<?> zzr;
    private final zzev zzs;

    private zzfc(int[] iArr, Object[] objArr, int i, int i2, zzey zzeyVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzfh zzfhVar, zzei zzeiVar, zzgh<?, ?> zzghVar, zzdh<?> zzdhVar, zzev zzevVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzeyVar instanceof zzds;
        this.zzj = z;
        this.zzh = zzdhVar != null && zzdhVar.zza(zzeyVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzfhVar;
        this.zzp = zzeiVar;
        this.zzq = zzghVar;
        this.zzr = zzdhVar;
        this.zzg = zzeyVar;
        this.zzs = zzevVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.recaptcha.zzfc<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.recaptcha.zzew r33, com.google.android.gms.internal.recaptcha.zzfh r34, com.google.android.gms.internal.recaptcha.zzei r35, com.google.android.gms.internal.recaptcha.zzgh<?, ?> r36, com.google.android.gms.internal.recaptcha.zzdh<?> r37, com.google.android.gms.internal.recaptcha.zzev r38) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzfc.zza(java.lang.Class, com.google.android.gms.internal.recaptcha.zzew, com.google.android.gms.internal.recaptcha.zzfh, com.google.android.gms.internal.recaptcha.zzei, com.google.android.gms.internal.recaptcha.zzgh, com.google.android.gms.internal.recaptcha.zzdh, com.google.android.gms.internal.recaptcha.zzev):com.google.android.gms.internal.recaptcha.zzfc");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final boolean zza(T t, T t2) {
        boolean zza2;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzd = zzd(i);
            long j = zzd & 1048575;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zzc(t, t2, i) && Double.doubleToLongBits(zzgn.zze(t, j)) == Double.doubleToLongBits(zzgn.zze(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzc(t, t2, i) && Float.floatToIntBits(zzgn.zzd(t, j)) == Float.floatToIntBits(zzgn.zzd(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzc(t, t2, i) && zzgn.zzb(t, j) == zzgn.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzc(t, t2, i) && zzgn.zzb(t, j) == zzgn.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzc(t, t2, i) && zzgn.zzb(t, j) == zzgn.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzc(t, t2, i) && zzgn.zzc(t, j) == zzgn.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzc(t, t2, i) && zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzc(t, t2, i) && zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzc(t, t2, i) && zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzc(t, t2, i) && zzgn.zzb(t, j) == zzgn.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzc(t, t2, i) && zzgn.zza(t, j) == zzgn.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzc(t, t2, i) && zzgn.zzb(t, j) == zzgn.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzc(t, t2, i) && zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case JSONzip.substringLimit /* 40 */:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zza2 = zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j));
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zza2 = zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zze = zze(i) & 1048575;
                    if (zzgn.zza(t, zze) == zzgn.zza(t2, zze) && zzfr.zza(zzgn.zzf(t, j), zzgn.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zza2) {
                return false;
            }
        }
        if (this.zzq.zzb(t).equals(this.zzq.zzb(t2))) {
            if (this.zzh) {
                return this.zzr.zza(t).equals(this.zzr.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final int zza(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzd;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzdv.zza(Double.doubleToLongBits(zzgn.zze(t, j)));
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzgn.zzd(t, j));
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzb(t, j));
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzb(t, j));
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzb(t, j));
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzc(t, j));
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzgn.zzf(t, j)).hashCode();
                    break;
                case 9:
                    Object zzf = zzgn.zzf(t, j);
                    if (zzf != null) {
                        zza2 = zzf.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    zza2 = 37;
                    i = i2 * 53;
                case 10:
                    i = i2 * 53;
                    zza2 = zzgn.zzf(t, j).hashCode();
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzb(t, j));
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzgn.zza(t, j);
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzdv.zza(zzgn.zzb(t, j));
                    break;
                case 17:
                    Object zzf2 = zzgn.zzf(t, j);
                    if (zzf2 != null) {
                        zza2 = zzf2.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    zza2 = 37;
                    i = i2 * 53;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case JSONzip.substringLimit /* 40 */:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzgn.zzf(t, j).hashCode();
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    i = i2 * 53;
                    zza2 = zzgn.zzf(t, j).hashCode();
                    break;
                case 51:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(Double.doubleToLongBits(zzb(t, j)));
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zzf(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzgn.zzf(t, j)).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzgn.zzf(t, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzgn.zzf(t, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzdv.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zza((zzfc<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzgn.zzf(t, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 = i + zza2;
        }
        int hashCode = (i2 * 53) + this.zzq.zzb(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final void zzb(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza(t, j, zzgn.zze(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzd(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzb(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzb(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzb(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza(t, j, zzgn.zzc(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza(t, j, zzgn.zzf(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza(t, j, zzgn.zzf(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzb(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zza(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzfc<T>) t2, i)) {
                        zzgn.zza((Object) t, j, zzgn.zzb(t2, j));
                        zzb((zzfc<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case JSONzip.substringLimit /* 40 */:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t, t2, j);
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzfr.zza(this.zzs, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzfc<T>) t2, i2, i)) {
                        zzgn.zza(t, j, zzgn.zzf(t2, j));
                        zzb((zzfc<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzfc<T>) t2, i2, i)) {
                        zzgn.zza(t, j, zzgn.zzf(t2, j));
                        zzb((zzfc<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzfr.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzfr.zza(this.zzr, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza((zzfc<T>) t2, i)) {
            Object zzf = zzgn.zzf(t, zzd);
            Object zzf2 = zzgn.zzf(t2, zzd);
            if (zzf != null && zzf2 != null) {
                zzgn.zza(t, zzd, zzdv.zza(zzf, zzf2));
                zzb((zzfc<T>) t, i);
            } else if (zzf2 != null) {
                zzgn.zza(t, zzd, zzf2);
                zzb((zzfc<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza((zzfc<T>) t2, i2, i)) {
            Object zzf = zzgn.zzf(t, j);
            Object zzf2 = zzgn.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzgn.zza(t, j, zzdv.zza(zzf, zzf2));
                zzb((zzfc<T>) t, i2, i);
            } else if (zzf2 != null) {
                zzgn.zza(t, j, zzf2);
                zzb((zzfc<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final int zzb(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        long j;
        int zzd;
        int zzb2;
        int zzj;
        int i4;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i5 = 267386880;
        int i6 = 0;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.zzc.length) {
                int zzd2 = zzd(i7);
                int i9 = (zzd2 & i5) >>> 20;
                int i10 = this.zzc[i7];
                long j2 = zzd2 & 1048575;
                int i11 = (i9 < zzdm.zza.zza() || i9 > zzdm.zzb.zza()) ? 0 : this.zzc[i7 + 2] & 1048575;
                switch (i9) {
                    case 0:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzb(i10, 0.0d);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 1:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzb(i10, 0.0f);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 2:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzd(i10, zzgn.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 3:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zze(i10, zzgn.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 4:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzf(i10, zzgn.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 5:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzg(i10, 0L);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 6:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzi(i10, 0);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 7:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzb(i10, true);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 8:
                        if (zza((zzfc<T>) t, i7)) {
                            Object zzf = zzgn.zzf(t, j2);
                            if (zzf instanceof zzch) {
                                zzb3 = zzcy.zzc(i10, (zzch) zzf);
                                break;
                            } else {
                                zzb3 = zzcy.zzb(i10, (String) zzf);
                                break;
                            }
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 9:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzfr.zza(i10, zzgn.zzf(t, j2), zza(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 10:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzc(i10, (zzch) zzgn.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 11:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzg(i10, zzgn.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 12:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzk(i10, zzgn.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 13:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzj(i10, 0);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 14:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzh(i10, 0L);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 15:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzh(i10, zzgn.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 16:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzf(i10, zzgn.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 17:
                        if (zza((zzfc<T>) t, i7)) {
                            zzb3 = zzcy.zzc(i10, (zzey) zzgn.zzf(t, j2), zza(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 18:
                        zzb3 = zzfr.zzi(i10, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzfr.zzh(i10, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzfr.zza(i10, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzfr.zzb(i10, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzfr.zze(i10, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzfr.zzi(i10, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzfr.zzh(i10, zza(t, j2), false);
                        break;
                    case 25:
                        zzb3 = zzfr.zzj(i10, zza(t, j2), false);
                        break;
                    case 26:
                        zzb3 = zzfr.zza(i10, zza(t, j2));
                        break;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        zzb3 = zzfr.zza(i10, zza(t, j2), zza(i7));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        zzb3 = zzfr.zzb(i10, zza(t, j2));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        zzb3 = zzfr.zzf(i10, zza(t, j2), false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        zzb3 = zzfr.zzd(i10, zza(t, j2), false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        zzb3 = zzfr.zzh(i10, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzfr.zzi(i10, zza(t, j2), false);
                        break;
                    case 33:
                        zzb3 = zzfr.zzg(i10, zza(t, j2), false);
                        break;
                    case 34:
                        zzb3 = zzfr.zzc(i10, zza(t, j2), false);
                        break;
                    case 35:
                        zzi2 = zzfr.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 36:
                        zzi2 = zzfr.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 37:
                        zzi2 = zzfr.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 38:
                        zzi2 = zzfr.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 39:
                        zzi2 = zzfr.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case JSONzip.substringLimit /* 40 */:
                        zzi2 = zzfr.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 41:
                        zzi2 = zzfr.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 42:
                        zzi2 = zzfr.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 43:
                        zzi2 = zzfr.zzf((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 44:
                        zzi2 = zzfr.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 45:
                        zzi2 = zzfr.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 46:
                        zzi2 = zzfr.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 47:
                        zzi2 = zzfr.zzg((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 48:
                        zzi2 = zzfr.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i11, zzi2);
                            }
                            zze2 = zzcy.zze(i10);
                            zzg2 = zzcy.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 49:
                        zzb3 = zzfr.zzb(i10, (List<zzey>) zza(t, j2), zza(i7));
                        break;
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        zzb3 = this.zzs.zza(i10, zzgn.zzf(t, j2), zzb(i7));
                        break;
                    case 51:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzb(i10, 0.0d);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 52:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzb(i10, 0.0f);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 53:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzd(i10, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 54:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zze(i10, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 55:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzf(i10, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 56:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzg(i10, 0L);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 57:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzi(i10, 0);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 58:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzb(i10, true);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 59:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            Object zzf2 = zzgn.zzf(t, j2);
                            if (zzf2 instanceof zzch) {
                                zzb3 = zzcy.zzc(i10, (zzch) zzf2);
                                break;
                            } else {
                                zzb3 = zzcy.zzb(i10, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 60:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzfr.zza(i10, zzgn.zzf(t, j2), zza(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 61:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzc(i10, (zzch) zzgn.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 62:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzg(i10, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 63:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzk(i10, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 64:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzj(i10, 0);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 65:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzh(i10, 0L);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 66:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzh(i10, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 67:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzf(i10, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    case 68:
                        if (zza((zzfc<T>) t, i10, i7)) {
                            zzb3 = zzcy.zzc(i10, (zzey) zzgn.zzf(t, j2), zza(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                            i5 = 267386880;
                        }
                    default:
                        i7 += 3;
                        i5 = 267386880;
                }
                i8 += zzb3;
                i7 += 3;
                i5 = 267386880;
            }
            return i8 + zza((zzgh) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.zzc.length) {
            int zzd3 = zzd(i13);
            int[] iArr = this.zzc;
            int i16 = iArr[i13];
            int i17 = (zzd3 & 267386880) >>> 20;
            if (i17 <= 17) {
                i = iArr[i13 + 2];
                int i18 = i & 1048575;
                i2 = 1 << (i >>> 20);
                if (i18 != i12) {
                    i15 = unsafe2.getInt(t, i18);
                    i12 = i18;
                }
            } else {
                i = (!this.zzk || i17 < zzdm.zza.zza() || i17 > zzdm.zzb.zza()) ? 0 : this.zzc[i13 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzd3 & 1048575;
            switch (i17) {
                case 0:
                    i3 = 0;
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        i14 += zzcy.zzb(i16, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    i3 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        z = false;
                        i14 += zzcy.zzb(i16, 0.0f);
                        break;
                    }
                    z = false;
                case 2:
                    i3 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        zzd = zzcy.zzd(i16, unsafe2.getLong(t, j3));
                        i14 += zzd;
                    }
                    z = false;
                    break;
                case 3:
                    i3 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        zzd = zzcy.zze(i16, unsafe2.getLong(t, j3));
                        i14 += zzd;
                    }
                    z = false;
                    break;
                case 4:
                    i3 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        zzd = zzcy.zzf(i16, unsafe2.getInt(t, j3));
                        i14 += zzd;
                    }
                    z = false;
                    break;
                case 5:
                    i3 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        zzd = zzcy.zzg(i16, 0L);
                        i14 += zzd;
                    }
                    z = false;
                    break;
                case 6:
                    if ((i15 & i2) != 0) {
                        i3 = 0;
                        i14 += zzcy.zzi(i16, 0);
                        z = false;
                        j = 0;
                        break;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                case 7:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzb(i16, true);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 8:
                    if ((i15 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzch) {
                            zzb2 = zzcy.zzc(i16, (zzch) object);
                        } else {
                            zzb2 = zzcy.zzb(i16, (String) object);
                        }
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 9:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzfr.zza(i16, unsafe2.getObject(t, j3), zza(i13));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 10:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzc(i16, (zzch) unsafe2.getObject(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 11:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzg(i16, unsafe2.getInt(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 12:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzk(i16, unsafe2.getInt(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 13:
                    if ((i15 & i2) != 0) {
                        zzj = zzcy.zzj(i16, 0);
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 14:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzh(i16, 0L);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 15:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzh(i16, unsafe2.getInt(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 16:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzf(i16, unsafe2.getLong(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 17:
                    if ((i15 & i2) != 0) {
                        zzb2 = zzcy.zzc(i16, (zzey) unsafe2.getObject(t, j3), zza(i13));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 18:
                    zzb2 = zzfr.zzi(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 19:
                    i4 = 0;
                    zzh = zzfr.zzh(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 20:
                    i4 = 0;
                    zzh = zzfr.zza(i16, (List<Long>) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 21:
                    i4 = 0;
                    zzh = zzfr.zzb(i16, (List<Long>) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 22:
                    i4 = 0;
                    zzh = zzfr.zze(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 23:
                    i4 = 0;
                    zzh = zzfr.zzi(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 24:
                    i4 = 0;
                    zzh = zzfr.zzh(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 25:
                    i4 = 0;
                    zzh = zzfr.zzj(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 26:
                    zzb2 = zzfr.zza(i16, (List) unsafe2.getObject(t, j3));
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    zzb2 = zzfr.zza(i16, (List<?>) unsafe2.getObject(t, j3), zza(i13));
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    zzb2 = zzfr.zzb(i16, (List) unsafe2.getObject(t, j3));
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    zzb2 = zzfr.zzf(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    i4 = 0;
                    zzh = zzfr.zzd(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    i4 = 0;
                    zzh = zzfr.zzh(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 32:
                    i4 = 0;
                    zzh = zzfr.zzi(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 33:
                    i4 = 0;
                    zzh = zzfr.zzg(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 34:
                    i4 = 0;
                    zzh = zzfr.zzc(i16, (List) unsafe2.getObject(t, j3), false);
                    i14 += zzh;
                    i3 = i4;
                    z = false;
                    j = 0;
                    break;
                case 35:
                    zzi = zzfr.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 36:
                    zzi = zzfr.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 37:
                    zzi = zzfr.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 38:
                    zzi = zzfr.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 39:
                    zzi = zzfr.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case JSONzip.substringLimit /* 40 */:
                    zzi = zzfr.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 41:
                    zzi = zzfr.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 42:
                    zzi = zzfr.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 43:
                    zzi = zzfr.zzf((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 44:
                    zzi = zzfr.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 45:
                    zzi = zzfr.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 46:
                    zzi = zzfr.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 47:
                    zzi = zzfr.zzg((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 48:
                    zzi = zzfr.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzcy.zze(i16);
                        zzg = zzcy.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 49:
                    zzb2 = zzfr.zzb(i16, (List) unsafe2.getObject(t, j3), zza(i13));
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzb2 = this.zzs.zza(i16, unsafe2.getObject(t, j3), zzb(i13));
                    i14 += zzb2;
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzb(i16, 0.0d);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 52:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzj = zzcy.zzb(i16, 0.0f);
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 53:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzd(i16, zze(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 54:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zze(i16, zze(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 55:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzf(i16, zzd(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 56:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzg(i16, 0L);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 57:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzj = zzcy.zzi(i16, 0);
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 58:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzb(i16, true);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 59:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzch) {
                            zzb2 = zzcy.zzc(i16, (zzch) object2);
                        } else {
                            zzb2 = zzcy.zzb(i16, (String) object2);
                        }
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 60:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzfr.zza(i16, unsafe2.getObject(t, j3), zza(i13));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 61:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzc(i16, (zzch) unsafe2.getObject(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 62:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzg(i16, zzd(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 63:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzk(i16, zzd(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 64:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzj = zzcy.zzj(i16, 0);
                        i14 += zzj;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 65:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzh(i16, 0L);
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 66:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzh(i16, zzd(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 67:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzf(i16, zze(t, j3));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                case 68:
                    if (zza((zzfc<T>) t, i16, i13)) {
                        zzb2 = zzcy.zzc(i16, (zzey) unsafe2.getObject(t, j3), zza(i13));
                        i14 += zzb2;
                    }
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
                default:
                    i3 = 0;
                    z = false;
                    j = 0;
                    break;
            }
            i13 += 3;
            i6 = i3;
        }
        int i19 = i6;
        int zza2 = i14 + zza((zzgh) this.zzq, (Object) t);
        if (this.zzh) {
            zzdl<?> zza3 = this.zzr.zza(t);
            for (int i20 = i19; i20 < zza3.zza.zzc(); i20++) {
                Map.Entry<?, Object> zzb4 = zza3.zza.zzb(i20);
                i19 += zzdl.zza((zzdn) zzb4.getKey(), zzb4.getValue());
            }
            for (Map.Entry<?, Object> entry : zza3.zza.zzd()) {
                i19 += zzdl.zza((zzdn) entry.getKey(), entry.getValue());
            }
            return zza2 + i19;
        }
        return zza2;
    }

    private static <UT, UB> int zza(zzgh<UT, UB> zzghVar, T t) {
        return zzghVar.zzf(zzghVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzgn.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.recaptcha.zzfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.recaptcha.zzhe r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzfc.zza(java.lang.Object, com.google.android.gms.internal.recaptcha.zzhe):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r18, com.google.android.gms.internal.recaptcha.zzhe r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzfc.zzb(java.lang.Object, com.google.android.gms.internal.recaptcha.zzhe):void");
    }

    private final <K, V> void zza(zzhe zzheVar, int i, Object obj, int i2) {
        if (obj != null) {
            zzheVar.zza(i, this.zzs.zzb(zzb(i2)), this.zzs.zzc(obj));
        }
    }

    private static <UT, UB> void zza(zzgh<UT, UB> zzghVar, T t, zzhe zzheVar) {
        zzghVar.zza((zzgh<UT, UB>) zzghVar.zzb(t), zzheVar);
    }

    private final zzfp zza(int i) {
        int i2 = (i / 3) << 1;
        zzfp zzfpVar = (zzfp) this.zzd[i2];
        if (zzfpVar != null) {
            return zzfpVar;
        }
        zzfp<T> zza2 = zzfk.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzgn.zzf(t, zzd);
            if (zzf != null) {
                zzgn.zza(t, zzd, this.zzs.zze(zzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.recaptcha.zzfp] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.recaptcha.zzfp] */
    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final boolean zzd(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzm) {
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzd = zzd(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzd) != 0 && !zza(t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzd) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza(t, i6, i, i2, i10) && !zza(t, zzd, zza(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza((zzfc<T>) t, i7, i6) && !zza(t, zzd, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzc = this.zzs.zzc(zzgn.zzf(t, zzd & 1048575));
                            if (zzc.isEmpty()) {
                                continue;
                            } else if (this.zzs.zzb(zzb(i6)).zzc.zza() == zzhb.MESSAGE) {
                                zzfp<T> zzfpVar = 0;
                                for (Object obj : zzc.values()) {
                                    if (zzfpVar == null) {
                                        zzfpVar = zzfk.zza().zza((Class) obj.getClass());
                                    }
                                    boolean zzd2 = zzfpVar.zzd(obj);
                                    zzfpVar = zzfpVar;
                                    if (!zzd2) {
                                        return false;
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzgn.zzf(t, zzd & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zza2 = zza(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zza2.zzd(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzr.zza(t).zzf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzfp zzfpVar) {
        return zzfpVar.zzd(zzgn.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzhe zzheVar) {
        if (obj instanceof String) {
            zzheVar.zza(i, (String) obj);
        } else {
            zzheVar.zza(i, (zzch) obj);
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzgn.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzgn.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzgn.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzgn.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzgn.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzfc<T>) t, i) == zza((zzfc<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza((zzfc<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int zze = zze(i);
        long j = zze & 1048575;
        if (j != 1048575) {
            return (zzgn.zza(t, j) & (1 << (zze >>> 20))) != 0;
        }
        int zzd = zzd(i);
        long j2 = zzd & 1048575;
        switch ((zzd & 267386880) >>> 20) {
            case 0:
                return zzgn.zze(t, j2) != 0.0d;
            case 1:
                return zzgn.zzd(t, j2) != 0.0f;
            case 2:
                return zzgn.zzb(t, j2) != 0;
            case 3:
                return zzgn.zzb(t, j2) != 0;
            case 4:
                return zzgn.zza(t, j2) != 0;
            case 5:
                return zzgn.zzb(t, j2) != 0;
            case 6:
                return zzgn.zza(t, j2) != 0;
            case 7:
                return zzgn.zzc(t, j2);
            case 8:
                Object zzf = zzgn.zzf(t, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzch) {
                    return !zzch.zza.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgn.zzf(t, j2) != null;
            case 10:
                return !zzch.zza.equals(zzgn.zzf(t, j2));
            case 11:
                return zzgn.zza(t, j2) != 0;
            case 12:
                return zzgn.zza(t, j2) != 0;
            case 13:
                return zzgn.zza(t, j2) != 0;
            case 14:
                return zzgn.zzb(t, j2) != 0;
            case 15:
                return zzgn.zza(t, j2) != 0;
            case 16:
                return zzgn.zzb(t, j2) != 0;
            case 17:
                return zzgn.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzb(T t, int i) {
        int zze = zze(i);
        long j = 1048575 & zze;
        if (j == 1048575) {
            return;
        }
        zzgn.zza((Object) t, j, (1 << (zze >>> 20)) | zzgn.zza(t, j));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzgn.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzgn.zza((Object) t, zze(i2) & 1048575, i);
    }
}
