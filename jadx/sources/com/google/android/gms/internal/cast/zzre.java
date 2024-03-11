package com.google.android.gms.internal.cast;

import androidx.appcompat.widget.ActivityChooserModel;
import com.netflix.android.org.json.zip.JSONzip;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzre<T> implements zzrm<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsn.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrb zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzqp zzk;
    private final zzsd zzl;
    private final zzpj zzm;
    private final zzrg zzn;
    private final zzqw zzo;

    private zzre(int[] iArr, Object[] objArr, int i, int i2, zzrb zzrbVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzrg zzrgVar, zzqp zzqpVar, zzsd zzsdVar, zzpj zzpjVar, zzqw zzqwVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z;
        this.zzf = zzpjVar != null && zzpjVar.zzc(zzrbVar);
        this.zzh = iArr2;
        this.zzi = i3;
        this.zzj = i4;
        this.zzn = zzrgVar;
        this.zzk = zzqpVar;
        this.zzl = zzsdVar;
        this.zzm = zzpjVar;
        this.zze = zzrbVar;
        this.zzo = zzqwVar;
    }

    private final boolean zzA(Object obj, int i) {
        int zzo = zzo(i);
        long j = zzo & 1048575;
        if (j != 1048575) {
            return (zzsn.zzc(obj, j) & (1 << (zzo >>> 20))) != 0;
        }
        int zzq = zzq(i);
        long j2 = zzq & 1048575;
        switch (zzp(zzq)) {
            case 0:
                return Double.doubleToRawLongBits(zzsn.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsn.zzb(obj, j2)) != 0;
            case 2:
                return zzsn.zzd(obj, j2) != 0;
            case 3:
                return zzsn.zzd(obj, j2) != 0;
            case 4:
                return zzsn.zzc(obj, j2) != 0;
            case 5:
                return zzsn.zzd(obj, j2) != 0;
            case 6:
                return zzsn.zzc(obj, j2) != 0;
            case 7:
                return zzsn.zzw(obj, j2);
            case 8:
                Object zzf = zzsn.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzoy) {
                    return !zzoy.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzsn.zzf(obj, j2) != null;
            case 10:
                return !zzoy.zzb.equals(zzsn.zzf(obj, j2));
            case 11:
                return zzsn.zzc(obj, j2) != 0;
            case 12:
                return zzsn.zzc(obj, j2) != 0;
            case 13:
                return zzsn.zzc(obj, j2) != 0;
            case 14:
                return zzsn.zzd(obj, j2) != 0;
            case 15:
                return zzsn.zzc(obj, j2) != 0;
            case 16:
                return zzsn.zzd(obj, j2) != 0;
            case 17:
                return zzsn.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzB(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzA(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzC(Object obj, int i, zzrm zzrmVar) {
        return zzrmVar.zzf(zzsn.zzf(obj, i & 1048575));
    }

    private final boolean zzD(Object obj, int i, int i2) {
        return zzsn.zzc(obj, (long) (zzo(i2) & 1048575)) == i;
    }

    private static boolean zzE(Object obj, long j) {
        return ((Boolean) zzsn.zzf(obj, j)).booleanValue();
    }

    private final void zzF(Object obj, zzph zzphVar) {
        int i;
        if (!this.zzf) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int zzq = zzq(i4);
                int[] iArr = this.zzc;
                int i6 = iArr[i4];
                int zzp = zzp(zzq);
                if (zzp <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(obj, i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = zzq & i2;
                switch (zzp) {
                    case 0:
                        if ((i5 & i) != 0) {
                            zzphVar.zzf(i6, zzsn.zza(obj, j));
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i5 & i) != 0) {
                            zzphVar.zzn(i6, zzsn.zzb(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i5 & i) != 0) {
                            zzphVar.zzs(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i5 & i) != 0) {
                            zzphVar.zzH(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i5 & i) != 0) {
                            zzphVar.zzq(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i5 & i) != 0) {
                            zzphVar.zzl(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i5 & i) != 0) {
                            zzphVar.zzj(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i5 & i) != 0) {
                            zzphVar.zzb(i6, zzsn.zzw(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i5 & i) != 0) {
                            zzH(i6, unsafe.getObject(obj, j), zzphVar);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i5 & i) != 0) {
                            zzphVar.zzu(i6, unsafe.getObject(obj, j), zzs(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i5 & i) != 0) {
                            zzphVar.zzd(i6, (zzoy) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i5 & i) != 0) {
                            zzphVar.zzF(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i5 & i) != 0) {
                            zzphVar.zzh(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i5 & i) != 0) {
                            zzphVar.zzv(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i5 & i) != 0) {
                            zzphVar.zzx(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i5 & i) != 0) {
                            zzphVar.zzz(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i5 & i) != 0) {
                            zzphVar.zzB(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i5 & i) != 0) {
                            zzphVar.zzp(i6, unsafe.getObject(obj, j), zzs(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                    case 18:
                        zzro.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 19:
                        zzro.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 20:
                        zzro.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 21:
                        zzro.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 22:
                        zzro.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 23:
                        zzro.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 24:
                        zzro.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 25:
                        zzro.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                    case 26:
                        zzro.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar);
                        break;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        zzro.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, zzs(i4));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        zzro.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        zzro.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        zzro.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        zzro.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case 32:
                        zzro.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case 33:
                        zzro.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case 34:
                        zzro.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, false);
                        break;
                    case 35:
                        zzro.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 36:
                        zzro.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 37:
                        zzro.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 38:
                        zzro.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 39:
                        zzro.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case JSONzip.substringLimit /* 40 */:
                        zzro.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 41:
                        zzro.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 42:
                        zzro.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 43:
                        zzro.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 44:
                        zzro.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 45:
                        zzro.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 46:
                        zzro.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 47:
                        zzro.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 48:
                        zzro.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, true);
                        break;
                    case 49:
                        zzro.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzphVar, zzs(i4));
                        break;
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        zzG(zzphVar, i6, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzf(i6, zzj(obj, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzn(i6, zzk(obj, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzs(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzH(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzq(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzl(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzj(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzb(i6, zzE(obj, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzD(obj, i6, i4)) {
                            zzH(i6, unsafe.getObject(obj, j), zzphVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzu(i6, unsafe.getObject(obj, j), zzs(i4));
                            break;
                        }
                        break;
                    case 61:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzd(i6, (zzoy) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzF(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzh(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzv(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzx(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzz(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzB(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzD(obj, i6, i4)) {
                            zzphVar.zzp(i6, unsafe.getObject(obj, j), zzs(i4));
                            break;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            zzsd zzsdVar = this.zzl;
            zzsdVar.zzg(zzsdVar.zzc(obj), zzphVar);
            return;
        }
        this.zzm.zza(obj);
        throw null;
    }

    private final void zzG(zzph zzphVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        zzqu zzquVar = (zzqu) zzt(i2);
        throw null;
    }

    private static final void zzH(int i, Object obj, zzph zzphVar) {
        if (obj instanceof String) {
            zzphVar.zzD(i, (String) obj);
        } else {
            zzphVar.zzd(i, (zzoy) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzre zzg(Class cls, zzqy zzqyVar, zzrg zzrgVar, zzqp zzqpVar, zzsd zzsdVar, zzpj zzpjVar, zzqw zzqwVar) {
        if (zzqyVar instanceof zzrl) {
            return zzh((zzrl) zzqyVar, zzrgVar, zzqpVar, zzsdVar, zzpjVar, zzqwVar);
        }
        zzsa zzsaVar = (zzsa) zzqyVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.cast.zzre zzh(com.google.android.gms.internal.cast.zzrl r34, com.google.android.gms.internal.cast.zzrg r35, com.google.android.gms.internal.cast.zzqp r36, com.google.android.gms.internal.cast.zzsd r37, com.google.android.gms.internal.cast.zzpj r38, com.google.android.gms.internal.cast.zzqw r39) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzre.zzh(com.google.android.gms.internal.cast.zzrl, com.google.android.gms.internal.cast.zzrg, com.google.android.gms.internal.cast.zzqp, com.google.android.gms.internal.cast.zzsd, com.google.android.gms.internal.cast.zzpj, com.google.android.gms.internal.cast.zzqw):com.google.android.gms.internal.cast.zzre");
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzsn.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzsn.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzl(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i2;
        int zzu;
        boolean z;
        int zzd2;
        int zzi;
        int zzz;
        int zzA8;
        int i3;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd3;
        int zzA13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.zzc.length) {
            int zzq = zzq(i7);
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int zzp = zzp(zzq);
            if (zzp <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzq & i5;
            switch (zzp) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzpg.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzpg.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzpg.zzA(i10 << 3);
                        zzB = zzpg.zzB(j2);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzpg.zzA(i10 << 3);
                        zzB = zzpg.zzB(j3);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzpg.zzA(i10 << 3);
                        zzv = zzpg.zzv(i13);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzpg.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzpg.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzpg.zzA(i10 << 3) + 1;
                        i8 += zzA5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzoy) {
                            zzA6 = zzpg.zzA(i10 << 3);
                            zzd = ((zzoy) object).zzd();
                            zzA7 = zzpg.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i8 += i2;
                            break;
                        } else {
                            zzA4 = zzpg.zzA(i10 << 3);
                            zzv = zzpg.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzro.zzo(i10, unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzA5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA6 = zzpg.zzA(i10 << 3);
                        zzd = ((zzoy) unsafe.getObject(obj, j)).zzd();
                        zzA7 = zzpg.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzpg.zzA(i10 << 3);
                        zzv = zzpg.zzA(i14);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzA4 = zzpg.zzA(i10 << 3);
                        zzv = zzpg.zzv(i15);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzpg.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzpg.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzA4 = zzpg.zzA(i10 << 3);
                        zzv = zzpg.zzA((i16 + i16) ^ (i16 >> 31));
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += zzpg.zzA(i10 << 3) + zzpg.zzB((j4 + j4) ^ (j4 >> 63));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzpg.zzu(i10, (zzrb) unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzro.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 19:
                    zzA5 = zzro.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 20:
                    zzA5 = zzro.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 21:
                    zzA5 = zzro.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 22:
                    zzA5 = zzro.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 23:
                    zzA5 = zzro.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 24:
                    zzA5 = zzro.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 25:
                    zzA5 = zzro.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 26:
                    zzu = zzro.zzu(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    zzu = zzro.zzp(i10, (List) unsafe.getObject(obj, j), zzs(i7));
                    i8 += zzu;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    zzu = zzro.zzc(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    zzu = zzro.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzu;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    z = false;
                    zzd2 = zzro.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    z = false;
                    zzd2 = zzro.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 32:
                    z = false;
                    zzd2 = zzro.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 33:
                    z = false;
                    zzd2 = zzro.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 34:
                    z = false;
                    zzd2 = zzro.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 35:
                    zzi = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 36:
                    zzi = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 37:
                    zzi = zzro.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 38:
                    zzi = zzro.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 39:
                    zzi = zzro.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case JSONzip.substringLimit /* 40 */:
                    zzi = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 41:
                    zzi = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 42:
                    zzi = zzro.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 43:
                    zzi = zzro.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 44:
                    zzi = zzro.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 45:
                    zzi = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 46:
                    zzi = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 47:
                    zzi = zzro.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 48:
                    zzi = zzro.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzpg.zzz(i10);
                        zzA8 = zzpg.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 49:
                    zzu = zzro.zzj(i10, (List) unsafe.getObject(obj, j), zzs(i7));
                    i8 += zzu;
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzqw.zza(i10, unsafe.getObject(obj, j), zzt(i7));
                    break;
                case 51:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzpg.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 52:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzpg.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 53:
                    if (zzD(obj, i10, i7)) {
                        long zzr = zzr(obj, j);
                        zzA11 = zzpg.zzA(i10 << 3);
                        zzB2 = zzpg.zzB(zzr);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzD(obj, i10, i7)) {
                        long zzr2 = zzr(obj, j);
                        zzA11 = zzpg.zzA(i10 << 3);
                        zzB2 = zzpg.zzB(zzr2);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzD(obj, i10, i7)) {
                        int zzn = zzn(obj, j);
                        i3 = zzpg.zzA(i10 << 3);
                        zzi = zzpg.zzv(zzn);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzpg.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 57:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzpg.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 58:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzpg.zzA(i10 << 3) + 1;
                        i8 += zzu;
                    }
                    break;
                case 59:
                    if (zzD(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzoy) {
                            zzA12 = zzpg.zzA(i10 << 3);
                            zzd3 = ((zzoy) object2).zzd();
                            zzA13 = zzpg.zzA(zzd3);
                            i4 = zzA12 + zzA13 + zzd3;
                            i8 += i4;
                        } else {
                            i3 = zzpg.zzA(i10 << 3);
                            zzi = zzpg.zzy((String) object2);
                            i4 = i3 + zzi;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzro.zzo(i10, unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzu;
                    }
                    break;
                case 61:
                    if (zzD(obj, i10, i7)) {
                        zzA12 = zzpg.zzA(i10 << 3);
                        zzd3 = ((zzoy) unsafe.getObject(obj, j)).zzd();
                        zzA13 = zzpg.zzA(zzd3);
                        i4 = zzA12 + zzA13 + zzd3;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (zzD(obj, i10, i7)) {
                        int zzn2 = zzn(obj, j);
                        i3 = zzpg.zzA(i10 << 3);
                        zzi = zzpg.zzA(zzn2);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (zzD(obj, i10, i7)) {
                        int zzn3 = zzn(obj, j);
                        i3 = zzpg.zzA(i10 << 3);
                        zzi = zzpg.zzv(zzn3);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzpg.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 65:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzpg.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 66:
                    if (zzD(obj, i10, i7)) {
                        int zzn4 = zzn(obj, j);
                        i3 = zzpg.zzA(i10 << 3);
                        zzi = zzpg.zzA((zzn4 + zzn4) ^ (zzn4 >> 31));
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (zzD(obj, i10, i7)) {
                        long zzr3 = zzr(obj, j);
                        i8 += zzpg.zzA(i10 << 3) + zzpg.zzB((zzr3 + zzr3) ^ (zzr3 >> 63));
                    }
                    break;
                case 68:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzpg.zzu(i10, (zzrb) unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzu;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzsd zzsdVar = this.zzl;
        int zza2 = zzsdVar.zza(zzsdVar.zzc(obj));
        if (this.zzf) {
            this.zzm.zza(obj);
            throw null;
        }
        return i8 + zza2;
    }

    private final int zzm(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzq = zzq(i3);
            int zzp = zzp(zzq);
            int i4 = this.zzc[i3];
            long j = zzq & 1048575;
            if (zzp >= zzpo.zzJ.zza() && zzp <= zzpo.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzp) {
                case 0:
                    if (zzA(obj, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj, i3)) {
                        long zzd2 = zzsn.zzd(obj, j);
                        zzA3 = zzpg.zzA(i4 << 3);
                        zzB = zzpg.zzB(zzd2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj, i3)) {
                        long zzd3 = zzsn.zzd(obj, j);
                        zzA3 = zzpg.zzA(i4 << 3);
                        zzB = zzpg.zzB(zzd3);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj, i3)) {
                        int zzc = zzsn.zzc(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzv(zzc);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj, i3)) {
                        zzA5 = zzpg.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzA(obj, i3)) {
                        break;
                    } else {
                        Object zzf = zzsn.zzf(obj, j);
                        if (zzf instanceof zzoy) {
                            zzA6 = zzpg.zzA(i4 << 3);
                            zzd = ((zzoy) zzf).zzd();
                            zzA7 = zzpg.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzpg.zzA(i4 << 3);
                            zzv = zzpg.zzy((String) zzf);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzA(obj, i3)) {
                        zzo = zzro.zzo(i4, zzsn.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzA(obj, i3)) {
                        zzA6 = zzpg.zzA(i4 << 3);
                        zzd = ((zzoy) zzsn.zzf(obj, j)).zzd();
                        zzA7 = zzpg.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj, i3)) {
                        int zzc2 = zzsn.zzc(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzA(zzc2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj, i3)) {
                        int zzc3 = zzsn.zzc(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzv(zzc3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj, i3)) {
                        int zzc4 = zzsn.zzc(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzA((zzc4 + zzc4) ^ (zzc4 >> 31));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj, i3)) {
                        long zzd4 = zzsn.zzd(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzA(obj, i3)) {
                        zzo = zzpg.zzu(i4, (zzrb) zzsn.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzro.zzh(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzro.zzf(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzro.zzm(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzro.zzx(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzro.zzk(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzro.zzh(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzro.zzf(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzro.zza(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzro.zzu(i4, (List) zzsn.zzf(obj, j));
                    i2 += zzo;
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    zzo = zzro.zzp(i4, (List) zzsn.zzf(obj, j), zzs(i3));
                    i2 += zzo;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    zzo = zzro.zzc(i4, (List) zzsn.zzf(obj, j));
                    i2 += zzo;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    zzo = zzro.zzv(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    zzo = zzro.zzd(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    zzo = zzro.zzf(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzro.zzh(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzro.zzq(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzro.zzs(i4, (List) zzsn.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzv = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzro.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzro.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzro.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case JSONzip.substringLimit /* 40 */:
                    zzv = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzro.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzro.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzro.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzro.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzro.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzro.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzro.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzpg.zzz(i4);
                        zzA8 = zzpg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzro.zzj(i4, (List) zzsn.zzf(obj, j), zzs(i3));
                    i2 += zzo;
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzqw.zza(i4, zzsn.zzf(obj, j), zzt(i3));
                    break;
                case 51:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i4, i3)) {
                        long zzr = zzr(obj, j);
                        zzA3 = zzpg.zzA(i4 << 3);
                        zzB = zzpg.zzB(zzr);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i4, i3)) {
                        long zzr2 = zzr(obj, j);
                        zzA3 = zzpg.zzA(i4 << 3);
                        zzB = zzpg.zzB(zzr2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i4, i3)) {
                        int zzn = zzn(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzv(zzn);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i4, i3)) {
                        zzA5 = zzpg.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzD(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzsn.zzf(obj, j);
                        if (zzf2 instanceof zzoy) {
                            zzA6 = zzpg.zzA(i4 << 3);
                            zzd = ((zzoy) zzf2).zzd();
                            zzA7 = zzpg.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzpg.zzA(i4 << 3);
                            zzv = zzpg.zzy((String) zzf2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzD(obj, i4, i3)) {
                        zzo = zzro.zzo(i4, zzsn.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i4, i3)) {
                        zzA6 = zzpg.zzA(i4 << 3);
                        zzd = ((zzoy) zzsn.zzf(obj, j)).zzd();
                        zzA7 = zzpg.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i4, i3)) {
                        int zzn2 = zzn(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzA(zzn2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i4, i3)) {
                        int zzn3 = zzn(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzv(zzn3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzpg.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzpg.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i4, i3)) {
                        int zzn4 = zzn(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzA((zzn4 + zzn4) ^ (zzn4 >> 31));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i4, i3)) {
                        long zzr3 = zzr(obj, j);
                        zzA4 = zzpg.zzA(i4 << 3);
                        zzv = zzpg.zzB((zzr3 >> 63) ^ (zzr3 + zzr3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i4, i3)) {
                        zzo = zzpg.zzu(i4, (zzrb) zzsn.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzsd zzsdVar = this.zzl;
        return i2 + zzsdVar.zza(zzsdVar.zzc(obj));
    }

    private static int zzn(Object obj, long j) {
        return ((Integer) zzsn.zzf(obj, j)).intValue();
    }

    private final int zzo(int i) {
        return this.zzc[i + 2];
    }

    private static int zzp(int i) {
        return (i >>> 20) & PrivateKeyType.INVALID;
    }

    private final int zzq(int i) {
        return this.zzc[i + 1];
    }

    private static long zzr(Object obj, long j) {
        return ((Long) zzsn.zzf(obj, j)).longValue();
    }

    private final zzrm zzs(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzrm zzrmVar = (zzrm) this.zzd[i3];
        if (zzrmVar != null) {
            return zzrmVar;
        }
        zzrm zzb2 = zzrj.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzt(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzu(Class cls, String str) {
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

    private final void zzv(Object obj, Object obj2, int i) {
        long zzq = zzq(i) & 1048575;
        if (zzA(obj2, i)) {
            Object zzf = zzsn.zzf(obj, zzq);
            Object zzf2 = zzsn.zzf(obj2, zzq);
            if (zzf != null && zzf2 != null) {
                zzsn.zzs(obj, zzq, zzqc.zzg(zzf, zzf2));
                zzx(obj, i);
            } else if (zzf2 != null) {
                zzsn.zzs(obj, zzq, zzf2);
                zzx(obj, i);
            }
        }
    }

    private final void zzw(Object obj, Object obj2, int i) {
        int zzq = zzq(i);
        int i2 = this.zzc[i];
        long j = zzq & 1048575;
        if (zzD(obj2, i2, i)) {
            Object zzf = zzD(obj, i2, i) ? zzsn.zzf(obj, j) : null;
            Object zzf2 = zzsn.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzsn.zzs(obj, j, zzqc.zzg(zzf, zzf2));
                zzy(obj, i2, i);
            } else if (zzf2 != null) {
                zzsn.zzs(obj, j, zzf2);
                zzy(obj, i2, i);
            }
        }
    }

    private final void zzx(Object obj, int i) {
        int zzo = zzo(i);
        long j = 1048575 & zzo;
        if (j == 1048575) {
            return;
        }
        zzsn.zzq(obj, j, (1 << (zzo >>> 20)) | zzsn.zzc(obj, j));
    }

    private final void zzy(Object obj, int i, int i2) {
        zzsn.zzq(obj, zzo(i2) & 1048575, i);
    }

    private final boolean zzz(Object obj, Object obj2, int i) {
        return zzA(obj, i) == zzA(obj2, i);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final int zza(Object obj) {
        return this.zzg ? zzm(obj) : zzl(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzq = zzq(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzq;
            switch (zzp(zzq)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzqc.zzc(Double.doubleToLongBits(zzsn.zza(obj, j)));
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzsn.zzb(obj, j));
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzqc.zzc(zzsn.zzd(obj, j));
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzqc.zzc(zzsn.zzd(obj, j));
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzqc.zzc(zzsn.zzd(obj, j));
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzqc.zza(zzsn.zzw(obj, j));
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzsn.zzf(obj, j)).hashCode();
                    break;
                case 9:
                    Object zzf = zzsn.zzf(obj, j);
                    if (zzf != null) {
                        zzc = zzf.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    zzc = 37;
                    i = i2 * 53;
                case 10:
                    i = i2 * 53;
                    zzc = zzsn.zzf(obj, j).hashCode();
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzqc.zzc(zzsn.zzd(obj, j));
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzsn.zzc(obj, j);
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzqc.zzc(zzsn.zzd(obj, j));
                    break;
                case 17:
                    Object zzf2 = zzsn.zzf(obj, j);
                    if (zzf2 != null) {
                        zzc = zzf2.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    zzc = 37;
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
                    zzc = zzsn.zzf(obj, j).hashCode();
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    i = i2 * 53;
                    zzc = zzsn.zzf(obj, j).hashCode();
                    break;
                case 51:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(Double.doubleToLongBits(zzj(obj, j)));
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzk(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(zzr(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(zzr(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(zzr(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zza(zzE(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzsn.zzf(obj, j)).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzsn.zzf(obj, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzsn.zzf(obj, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(zzr(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzqc.zzc(zzr(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzsn.zzf(obj, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 = i + zzc;
        }
        int hashCode = this.zzl.zzc(obj).hashCode();
        if (this.zzf) {
            this.zzm.zza(obj);
            throw null;
        }
        return (i2 * 53) + hashCode;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzc(Object obj) {
        int i;
        int i2 = this.zzi;
        while (true) {
            i = this.zzj;
            if (i2 >= i) {
                break;
            }
            long zzq = zzq(this.zzh[i2]) & 1048575;
            Object zzf = zzsn.zzf(obj, zzq);
            if (zzf != null) {
                ((zzqv) zzf).zzb();
                zzsn.zzs(obj, zzq, zzf);
            }
            i2++;
        }
        int length = this.zzh.length;
        while (i < length) {
            this.zzk.zza(obj, this.zzh[i]);
            i++;
        }
        this.zzl.zze(obj);
        if (this.zzf) {
            this.zzm.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean zze(Object obj, Object obj2) {
        boolean zzF;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzq = zzq(i);
            long j = zzq & 1048575;
            switch (zzp(zzq)) {
                case 0:
                    if (zzz(obj, obj2, i) && Double.doubleToLongBits(zzsn.zza(obj, j)) == Double.doubleToLongBits(zzsn.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzz(obj, obj2, i) && Float.floatToIntBits(zzsn.zzb(obj, j)) == Float.floatToIntBits(zzsn.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzz(obj, obj2, i) && zzsn.zzd(obj, j) == zzsn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzz(obj, obj2, i) && zzsn.zzd(obj, j) == zzsn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzz(obj, obj2, i) && zzsn.zzd(obj, j) == zzsn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzz(obj, obj2, i) && zzsn.zzw(obj, j) == zzsn.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzz(obj, obj2, i) && zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzz(obj, obj2, i) && zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzz(obj, obj2, i) && zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzz(obj, obj2, i) && zzsn.zzd(obj, j) == zzsn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzz(obj, obj2, i) && zzsn.zzc(obj, j) == zzsn.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzz(obj, obj2, i) && zzsn.zzd(obj, j) == zzsn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzz(obj, obj2, i) && zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j))) {
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
                    zzF = zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j));
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzF = zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j));
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
                    long zzo = zzo(i) & 1048575;
                    if (zzsn.zzc(obj, zzo) == zzsn.zzc(obj2, zzo) && zzro.zzF(zzsn.zzf(obj, j), zzsn.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (this.zzl.zzc(obj).equals(this.zzl.zzc(obj2))) {
            if (this.zzf) {
                this.zzm.zza(obj);
                this.zzm.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean zzf(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzi) {
            int i6 = this.zzh[i5];
            int i7 = this.zzc[i6];
            int zzq = zzq(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzq) != 0 && !zzB(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzp = zzp(zzq);
            if (zzp != 9 && zzp != 17) {
                if (zzp != 27) {
                    if (zzp == 60 || zzp == 68) {
                        if (zzD(obj, i7, i6) && !zzC(obj, zzq, zzs(i6))) {
                            return false;
                        }
                    } else if (zzp != 49) {
                        if (zzp == 50 && !((zzqv) zzsn.zzf(obj, zzq & 1048575)).isEmpty()) {
                            zzqu zzquVar = (zzqu) zzt(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzsn.zzf(obj, zzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzrm zzs = zzs(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzs.zzf(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzB(obj, i6, i, i2, i10) && !zzC(obj, zzq, zzs(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzf) {
            this.zzm.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzi(Object obj, zzph zzphVar) {
        if (!this.zzg) {
            zzF(obj, zzphVar);
        } else if (!this.zzf) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzq = zzq(i);
                int i2 = this.zzc[i];
                switch (zzp(zzq)) {
                    case 0:
                        if (zzA(obj, i)) {
                            zzphVar.zzf(i2, zzsn.zza(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzA(obj, i)) {
                            zzphVar.zzn(i2, zzsn.zzb(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzA(obj, i)) {
                            zzphVar.zzs(i2, zzsn.zzd(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzA(obj, i)) {
                            zzphVar.zzH(i2, zzsn.zzd(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzA(obj, i)) {
                            zzphVar.zzq(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzA(obj, i)) {
                            zzphVar.zzl(i2, zzsn.zzd(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzA(obj, i)) {
                            zzphVar.zzj(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzA(obj, i)) {
                            zzphVar.zzb(i2, zzsn.zzw(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzA(obj, i)) {
                            zzH(i2, zzsn.zzf(obj, zzq & 1048575), zzphVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzA(obj, i)) {
                            zzphVar.zzu(i2, zzsn.zzf(obj, zzq & 1048575), zzs(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzA(obj, i)) {
                            zzphVar.zzd(i2, (zzoy) zzsn.zzf(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzA(obj, i)) {
                            zzphVar.zzF(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzA(obj, i)) {
                            zzphVar.zzh(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzA(obj, i)) {
                            zzphVar.zzv(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzA(obj, i)) {
                            zzphVar.zzx(i2, zzsn.zzd(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzA(obj, i)) {
                            zzphVar.zzz(i2, zzsn.zzc(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzA(obj, i)) {
                            zzphVar.zzB(i2, zzsn.zzd(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzA(obj, i)) {
                            zzphVar.zzp(i2, zzsn.zzf(obj, zzq & 1048575), zzs(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzro.zzJ(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 19:
                        zzro.zzN(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 20:
                        zzro.zzQ(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 21:
                        zzro.zzY(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 22:
                        zzro.zzP(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 23:
                        zzro.zzM(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 24:
                        zzro.zzL(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 25:
                        zzro.zzH(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 26:
                        zzro.zzW(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar);
                        break;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        zzro.zzR(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, zzs(i));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        zzro.zzI(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        zzro.zzX(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        zzro.zzK(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        zzro.zzS(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 32:
                        zzro.zzT(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 33:
                        zzro.zzU(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 34:
                        zzro.zzV(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, false);
                        break;
                    case 35:
                        zzro.zzJ(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 36:
                        zzro.zzN(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 37:
                        zzro.zzQ(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 38:
                        zzro.zzY(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 39:
                        zzro.zzP(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case JSONzip.substringLimit /* 40 */:
                        zzro.zzM(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 41:
                        zzro.zzL(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 42:
                        zzro.zzH(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 43:
                        zzro.zzX(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 44:
                        zzro.zzK(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 45:
                        zzro.zzS(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 46:
                        zzro.zzT(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 47:
                        zzro.zzU(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 48:
                        zzro.zzV(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, true);
                        break;
                    case 49:
                        zzro.zzO(i2, (List) zzsn.zzf(obj, zzq & 1048575), zzphVar, zzs(i));
                        break;
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        zzG(zzphVar, i2, zzsn.zzf(obj, zzq & 1048575), i);
                        break;
                    case 51:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzf(i2, zzj(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzn(i2, zzk(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzs(i2, zzr(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzH(i2, zzr(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzq(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzl(i2, zzr(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzj(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzb(i2, zzE(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzD(obj, i2, i)) {
                            zzH(i2, zzsn.zzf(obj, zzq & 1048575), zzphVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzu(i2, zzsn.zzf(obj, zzq & 1048575), zzs(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzd(i2, (zzoy) zzsn.zzf(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzF(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzh(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzv(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzx(i2, zzr(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzz(i2, zzn(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzB(i2, zzr(obj, zzq & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzD(obj, i2, i)) {
                            zzphVar.zzp(i2, zzsn.zzf(obj, zzq & 1048575), zzs(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzsd zzsdVar = this.zzl;
            zzsdVar.zzg(zzsdVar.zzc(obj), zzphVar);
        } else {
            this.zzm.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzd(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzq = zzq(i);
            long j = 1048575 & zzq;
            int i2 = this.zzc[i];
            switch (zzp(zzq)) {
                case 0:
                    if (zzA(obj2, i)) {
                        zzsn.zzo(obj, j, zzsn.zza(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj2, i)) {
                        zzsn.zzp(obj, j, zzsn.zzb(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj2, i)) {
                        zzsn.zzr(obj, j, zzsn.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj2, i)) {
                        zzsn.zzr(obj, j, zzsn.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj2, i)) {
                        zzsn.zzr(obj, j, zzsn.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj2, i)) {
                        zzsn.zzm(obj, j, zzsn.zzw(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj2, i)) {
                        zzsn.zzs(obj, j, zzsn.zzf(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzv(obj, obj2, i);
                    break;
                case 10:
                    if (zzA(obj2, i)) {
                        zzsn.zzs(obj, j, zzsn.zzf(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj2, i)) {
                        zzsn.zzr(obj, j, zzsn.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj2, i)) {
                        zzsn.zzq(obj, j, zzsn.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj2, i)) {
                        zzsn.zzr(obj, j, zzsn.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzv(obj, obj2, i);
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
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzro.zzG(this.zzo, obj, obj2, j);
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
                    if (zzD(obj2, i2, i)) {
                        zzsn.zzs(obj, j, zzsn.zzf(obj2, j));
                        zzy(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzw(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzD(obj2, i2, i)) {
                        zzsn.zzs(obj, j, zzsn.zzf(obj2, j));
                        zzy(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzw(obj, obj2, i);
                    break;
            }
        }
        zzro.zzD(this.zzl, obj, obj2);
        if (this.zzf) {
            zzro.zzC(this.zzm, obj, obj2);
        }
    }
}
