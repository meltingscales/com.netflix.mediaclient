package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.internal.measurement.zzfd;
import com.netflix.android.org.json.zip.JSONzip;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzgs<T> implements zzhd<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzib.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgo zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzgw zzo;
    private final zzfy zzp;
    private final zzhv<?, ?> zzq;
    private final zzes<?> zzr;
    private final zzgh zzs;

    private zzgs(int[] iArr, Object[] objArr, int i, int i2, zzgo zzgoVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgw zzgwVar, zzfy zzfyVar, zzhv<?, ?> zzhvVar, zzes<?> zzesVar, zzgh zzghVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgoVar instanceof zzfd;
        this.zzj = z;
        this.zzh = zzesVar != null && zzesVar.zza(zzgoVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzgwVar;
        this.zzp = zzfyVar;
        this.zzq = zzhvVar;
        this.zzr = zzesVar;
        this.zzg = zzgoVar;
        this.zzs = zzghVar;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgs<T> zza(Class<T> cls, zzgm zzgmVar, zzgw zzgwVar, zzfy zzfyVar, zzhv<?, ?> zzhvVar, zzes<?> zzesVar, zzgh zzghVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzhb zzhbVar;
        int objectFieldOffset;
        int i18;
        int i19;
        Class<?> cls2;
        String str;
        int i20;
        int i21;
        Field zza2;
        int i22;
        char charAt11;
        int i23;
        Field zza3;
        Field zza4;
        int i24;
        char charAt12;
        int i25;
        char charAt13;
        int i26;
        char charAt14;
        int i27;
        char charAt15;
        char charAt16;
        if (zzgmVar instanceof zzhb) {
            zzhb zzhbVar2 = (zzhb) zzgmVar;
            int i28 = 0;
            boolean z2 = zzhbVar2.zza() == zzfd.zze.zzi;
            String zzd = zzhbVar2.zzd();
            int length = zzd.length();
            int charAt17 = zzd.charAt(0);
            if (charAt17 >= 55296) {
                int i29 = charAt17 & 8191;
                int i30 = 1;
                int i31 = 13;
                while (true) {
                    i = i30 + 1;
                    charAt16 = zzd.charAt(i30);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i29 |= (charAt16 & 8191) << i31;
                    i31 += 13;
                    i30 = i;
                }
                charAt17 = i29 | (charAt16 << i31);
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt18 = zzd.charAt(i);
            if (charAt18 >= 55296) {
                int i33 = charAt18 & 8191;
                int i34 = 13;
                while (true) {
                    i27 = i32 + 1;
                    charAt15 = zzd.charAt(i32);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i33 |= (charAt15 & 8191) << i34;
                    i34 += 13;
                    i32 = i27;
                }
                charAt18 = i33 | (charAt15 << i34);
                i32 = i27;
            }
            if (charAt18 == 0) {
                i6 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
                iArr = zza;
                i3 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt19 = zzd.charAt(i32);
                if (charAt19 >= 55296) {
                    int i36 = charAt19 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        charAt10 = zzd.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i36 |= (charAt10 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    charAt19 = i36 | (charAt10 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int charAt20 = zzd.charAt(i35);
                if (charAt20 >= 55296) {
                    int i39 = charAt20 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        charAt9 = zzd.charAt(i38);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i39 |= (charAt9 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    charAt20 = i39 | (charAt9 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                charAt = zzd.charAt(i38);
                if (charAt >= 55296) {
                    int i42 = charAt & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        charAt8 = zzd.charAt(i41);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i42 |= (charAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    charAt = i42 | (charAt8 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int charAt21 = zzd.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        charAt7 = zzd.charAt(i44);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i45 |= (charAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    charAt21 = i45 | (charAt7 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                charAt2 = zzd.charAt(i44);
                if (charAt2 >= 55296) {
                    int i48 = charAt2 & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        charAt6 = zzd.charAt(i47);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    charAt2 = i48 | (charAt6 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                int charAt22 = zzd.charAt(i47);
                if (charAt22 >= 55296) {
                    int i51 = charAt22 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        charAt5 = zzd.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    charAt22 = i51 | (charAt5 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int charAt23 = zzd.charAt(i50);
                if (charAt23 >= 55296) {
                    int i54 = charAt23 & 8191;
                    int i55 = i53;
                    int i56 = 13;
                    while (true) {
                        i8 = i55 + 1;
                        charAt4 = zzd.charAt(i55);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i56;
                        i56 += 13;
                        i55 = i8;
                    }
                    charAt23 = i54 | (charAt4 << i56);
                    i2 = i8;
                } else {
                    i2 = i53;
                }
                int i57 = i2 + 1;
                int charAt24 = zzd.charAt(i2);
                if (charAt24 >= 55296) {
                    int i58 = charAt24 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        charAt3 = zzd.charAt(i59);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i58 |= (charAt3 & 8191) << i60;
                        i60 += 13;
                        i59 = i7;
                    }
                    charAt24 = i58 | (charAt3 << i60);
                    i57 = i7;
                }
                int i61 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i61;
                i5 = charAt24;
                i28 = charAt19;
                i32 = i57;
                int i62 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i62;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzhbVar2.zze();
            Class<?> cls3 = zzhbVar2.zzc().getClass();
            int i63 = i32;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i64 = i5 + i6;
            int i65 = i5;
            int i66 = i63;
            int i67 = i64;
            int i68 = 0;
            int i69 = 0;
            while (i66 < length) {
                int i70 = i66 + 1;
                int charAt25 = zzd.charAt(i66);
                int i71 = length;
                if (charAt25 >= 55296) {
                    int i72 = charAt25 & 8191;
                    int i73 = i70;
                    int i74 = 13;
                    while (true) {
                        i26 = i73 + 1;
                        charAt14 = zzd.charAt(i73);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i72 |= (charAt14 & 8191) << i74;
                        i74 += 13;
                        i73 = i26;
                        i5 = i15;
                    }
                    charAt25 = i72 | (charAt14 << i74);
                    i16 = i26;
                } else {
                    i15 = i5;
                    i16 = i70;
                }
                int i75 = i16 + 1;
                int charAt26 = zzd.charAt(i16);
                if (charAt26 >= 55296) {
                    int i76 = charAt26 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i25 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i25;
                        z2 = z;
                    }
                    charAt26 = i76 | (charAt13 << i78);
                    i17 = i25;
                } else {
                    z = z2;
                    i17 = i75;
                }
                int i79 = charAt26 & PrivateKeyType.INVALID;
                int i80 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i69] = i68;
                    i69++;
                }
                int i81 = charAt;
                if (i79 >= 51) {
                    int i82 = i17 + 1;
                    int charAt27 = zzd.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i83 = charAt27 & 8191;
                        int i84 = 13;
                        while (true) {
                            i24 = i82 + 1;
                            charAt12 = zzd.charAt(i82);
                            if (charAt12 < c) {
                                break;
                            }
                            i83 |= (charAt12 & 8191) << i84;
                            i84 += 13;
                            i82 = i24;
                            c = 55296;
                        }
                        charAt27 = i83 | (charAt12 << i84);
                        i82 = i24;
                    }
                    int i85 = i79 - 51;
                    int i86 = i82;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i68 / 3) << 1) + 1] = zze[i4];
                        i4++;
                    } else if (i85 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i68 / 3) << 1) + 1] = zze[i4];
                        i4++;
                    }
                    int i87 = charAt27 << 1;
                    Object obj = zze[i87];
                    if (obj instanceof Field) {
                        zza3 = (Field) obj;
                    } else {
                        zza3 = zza(cls3, (String) obj);
                        zze[i87] = zza3;
                    }
                    zzhbVar = zzhbVar2;
                    String str2 = zzd;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                    int i88 = i87 + 1;
                    Object obj2 = zze[i88];
                    if (obj2 instanceof Field) {
                        zza4 = (Field) obj2;
                    } else {
                        zza4 = zza(cls3, (String) obj2);
                        zze[i88] = zza4;
                    }
                    cls2 = cls3;
                    i18 = i4;
                    i17 = i86;
                    str = str2;
                    i21 = 0;
                    i20 = (int) unsafe.objectFieldOffset(zza4);
                    objectFieldOffset = objectFieldOffset2;
                    i19 = i28;
                } else {
                    zzhbVar = zzhbVar2;
                    String str3 = zzd;
                    int i89 = i4 + 1;
                    Field zza5 = zza(cls3, (String) zze[i4]);
                    if (i79 == 9 || i79 == 17) {
                        objArr[((i68 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i79 == 27 || i79 == 49) {
                            i23 = i4 + 2;
                            objArr[((i68 / 3) << 1) + 1] = zze[i89];
                        } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                            if ((charAt17 & 1) == 1) {
                                i23 = i4 + 2;
                                objArr[((i68 / 3) << 1) + 1] = zze[i89];
                            }
                        } else if (i79 == 50) {
                            int i90 = i65 + 1;
                            iArr[i65] = i68;
                            int i91 = (i68 / 3) << 1;
                            int i92 = i4 + 2;
                            objArr[i91] = zze[i89];
                            if ((charAt26 & 2048) != 0) {
                                i89 = i4 + 3;
                                objArr[i91 + 1] = zze[i92];
                                i65 = i90;
                            } else {
                                i65 = i90;
                                i89 = i92;
                            }
                        }
                        i89 = i23;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt17 & 1) != 1) {
                        i18 = i89;
                        i19 = i28;
                        cls2 = cls3;
                        str = str3;
                    } else if (i79 <= 17) {
                        int i93 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i94 = charAt28 & 8191;
                            int i95 = 13;
                            while (true) {
                                i22 = i93 + 1;
                                charAt11 = str.charAt(i93);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i94 |= (charAt11 & 8191) << i95;
                                i95 += 13;
                                i93 = i22;
                            }
                            charAt28 = i94 | (charAt11 << i95);
                            i93 = i22;
                        }
                        int i96 = (i28 << 1) + (charAt28 / 32);
                        Object obj3 = zze[i96];
                        i18 = i89;
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls3, (String) obj3);
                            zze[i96] = zza2;
                        }
                        i19 = i28;
                        cls2 = cls3;
                        i21 = charAt28 % 32;
                        i20 = (int) unsafe.objectFieldOffset(zza2);
                        i17 = i93;
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i67] = objectFieldOffset;
                            i67++;
                        }
                    } else {
                        i18 = i89;
                        i19 = i28;
                        cls2 = cls3;
                        str = str3;
                    }
                    i20 = 0;
                    i21 = 0;
                    if (i79 >= 18) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                }
                iArr2[i68] = charAt25;
                iArr2[i68 + 1] = objectFieldOffset | ((charAt26 & JSONzip.end) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i79 << 20);
                iArr2[i68 + 2] = (i21 << 20) | i20;
                i28 = i19;
                i68 += 3;
                zzd = str;
                i66 = i17;
                cls3 = cls2;
                i3 = i80;
                length = i71;
                i5 = i15;
                z2 = z;
                charAt = i81;
                i4 = i18;
                zzhbVar2 = zzhbVar;
            }
            return new zzgs<>(iArr2, objArr, charAt, i3, zzhbVar2.zzc(), z2, false, iArr, i5, i64, zzgwVar, zzfyVar, zzhvVar, zzesVar, zzghVar);
        }
        ((zzhs) zzgmVar).zza();
        int i97 = zzfd.zze.zzi;
        throw new NoSuchMethodError();
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

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zza(T t, T t2) {
        boolean zza2;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzd = zzd(i);
            long j = zzd & 1048575;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zzc(t, t2, i) && Double.doubleToLongBits(zzib.zze(t, j)) == Double.doubleToLongBits(zzib.zze(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzc(t, t2, i) && Float.floatToIntBits(zzib.zzd(t, j)) == Float.floatToIntBits(zzib.zzd(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzc(t, t2, i) && zzib.zzb(t, j) == zzib.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzc(t, t2, i) && zzib.zzb(t, j) == zzib.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzc(t, t2, i) && zzib.zzb(t, j) == zzib.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzc(t, t2, i) && zzib.zzc(t, j) == zzib.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzc(t, t2, i) && zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzc(t, t2, i) && zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzc(t, t2, i) && zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzc(t, t2, i) && zzib.zzb(t, j) == zzib.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzc(t, t2, i) && zzib.zza(t, j) == zzib.zza(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzc(t, t2, i) && zzib.zzb(t, j) == zzib.zzb(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzc(t, t2, i) && zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j))) {
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
                    zza2 = zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j));
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zza2 = zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j));
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
                    if (zzib.zza(t, zze) == zzib.zza(t2, zze) && zzhf.zza(zzib.zzf(t, j), zzib.zzf(t2, j))) {
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

    @Override // com.google.android.gms.internal.measurement.zzhd
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
                    zza2 = zzff.zza(Double.doubleToLongBits(zzib.zze(t, j)));
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzib.zzd(t, j));
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzb(t, j));
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzb(t, j));
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzb(t, j));
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzc(t, j));
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzib.zzf(t, j)).hashCode();
                    break;
                case 9:
                    Object zzf = zzib.zzf(t, j);
                    if (zzf != null) {
                        zza2 = zzf.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    zza2 = 37;
                    i = i2 * 53;
                case 10:
                    i = i2 * 53;
                    zza2 = zzib.zzf(t, j).hashCode();
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzb(t, j));
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzib.zza(t, j);
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzff.zza(zzib.zzb(t, j));
                    break;
                case 17:
                    Object zzf2 = zzib.zzf(t, j);
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
                    zza2 = zzib.zzf(t, j).hashCode();
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    i = i2 * 53;
                    zza2 = zzib.zzf(t, j).hashCode();
                    break;
                case 51:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(Double.doubleToLongBits(zzb(t, j)));
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zzf(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzib.zzf(t, j)).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzib.zzf(t, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzib.zzf(t, j).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzff.zza(zze(t, j));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zza((zzgs<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzib.zzf(t, j).hashCode();
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

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzb(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza(t, j, zzib.zze(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzd(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzb(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzb(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzb(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza(t, j, zzib.zzc(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza(t, j, zzib.zzf(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza(t, j, zzib.zzf(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzb(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zza(t2, j));
                        zzb((zzgs<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzgs<T>) t2, i)) {
                        zzib.zza((Object) t, j, zzib.zzb(t2, j));
                        zzb((zzgs<T>) t, i);
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
                    zzhf.zza(this.zzs, t, t2, j);
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
                    if (zza((zzgs<T>) t2, i2, i)) {
                        zzib.zza(t, j, zzib.zzf(t2, j));
                        zzb((zzgs<T>) t, i2, i);
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
                    if (zza((zzgs<T>) t2, i2, i)) {
                        zzib.zza(t, j, zzib.zzf(t2, j));
                        zzb((zzgs<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzj) {
            return;
        }
        zzhf.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzhf.zza(this.zzr, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza((zzgs<T>) t2, i)) {
            Object zzf = zzib.zzf(t, zzd);
            Object zzf2 = zzib.zzf(t2, zzd);
            if (zzf != null && zzf2 != null) {
                zzib.zza(t, zzd, zzff.zza(zzf, zzf2));
                zzb((zzgs<T>) t, i);
            } else if (zzf2 != null) {
                zzib.zza(t, zzd, zzf2);
                zzb((zzgs<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza((zzgs<T>) t2, i2, i)) {
            Object zzf = zzib.zzf(t, j);
            Object zzf2 = zzib.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzib.zza(t, j, zzff.zza(zzf, zzf2));
                zzb((zzgs<T>) t, i2, i);
            } else if (zzf2 != null) {
                zzib.zza(t, j, zzf2);
                zzb((zzgs<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zzb(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int zzd;
        int zzb2;
        int zzj;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i5 = 267386880;
        int i6 = 1048575;
        int i7 = 1;
        int i8 = 0;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i9 = 0;
            int i10 = 0;
            while (i9 < this.zzc.length) {
                int zzd2 = zzd(i9);
                int i11 = (zzd2 & i5) >>> 20;
                int i12 = this.zzc[i9];
                long j2 = zzd2 & 1048575;
                int i13 = (i11 < zzex.zza.zza() || i11 > zzex.zzb.zza()) ? 0 : this.zzc[i9 + 2] & 1048575;
                switch (i11) {
                    case 0:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzb(i12, 0.0d);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 1:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzb(i12, 0.0f);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 2:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzd(i12, zzib.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 3:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zze(i12, zzib.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 4:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzf(i12, zzib.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 5:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzg(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 6:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzi(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 7:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzb(i12, true);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 8:
                        if (zza((zzgs<T>) t, i9)) {
                            Object zzf = zzib.zzf(t, j2);
                            if (zzf instanceof zzdu) {
                                zzb3 = zzen.zzc(i12, (zzdu) zzf);
                                break;
                            } else {
                                zzb3 = zzen.zzb(i12, (String) zzf);
                                break;
                            }
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 9:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzhf.zza(i12, zzib.zzf(t, j2), zza(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 10:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzc(i12, (zzdu) zzib.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 11:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzg(i12, zzib.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 12:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzk(i12, zzib.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 13:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzj(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 14:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzh(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 15:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzh(i12, zzib.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 16:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzf(i12, zzib.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 17:
                        if (zza((zzgs<T>) t, i9)) {
                            zzb3 = zzen.zzc(i12, (zzgo) zzib.zzf(t, j2), zza(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 18:
                        zzb3 = zzhf.zzi(i12, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzhf.zzh(i12, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzhf.zza(i12, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzhf.zzb(i12, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzhf.zze(i12, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzhf.zzi(i12, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzhf.zzh(i12, zza(t, j2), false);
                        break;
                    case 25:
                        zzb3 = zzhf.zzj(i12, zza(t, j2), false);
                        break;
                    case 26:
                        zzb3 = zzhf.zza(i12, zza(t, j2));
                        break;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        zzb3 = zzhf.zza(i12, zza(t, j2), zza(i9));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        zzb3 = zzhf.zzb(i12, zza(t, j2));
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        zzb3 = zzhf.zzf(i12, zza(t, j2), false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        zzb3 = zzhf.zzd(i12, zza(t, j2), false);
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        zzb3 = zzhf.zzh(i12, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzhf.zzi(i12, zza(t, j2), false);
                        break;
                    case 33:
                        zzb3 = zzhf.zzg(i12, zza(t, j2), false);
                        break;
                    case 34:
                        zzb3 = zzhf.zzc(i12, zza(t, j2), false);
                        break;
                    case 35:
                        zzi2 = zzhf.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 36:
                        zzi2 = zzhf.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 37:
                        zzi2 = zzhf.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 38:
                        zzi2 = zzhf.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 39:
                        zzi2 = zzhf.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case JSONzip.substringLimit /* 40 */:
                        zzi2 = zzhf.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 41:
                        zzi2 = zzhf.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 42:
                        zzi2 = zzhf.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 43:
                        zzi2 = zzhf.zzf((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 44:
                        zzi2 = zzhf.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 45:
                        zzi2 = zzhf.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 46:
                        zzi2 = zzhf.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 47:
                        zzi2 = zzhf.zzg((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 48:
                        zzi2 = zzhf.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i13, zzi2);
                            }
                            zze2 = zzen.zze(i12);
                            zzg2 = zzen.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 49:
                        zzb3 = zzhf.zzb(i12, (List<zzgo>) zza(t, j2), zza(i9));
                        break;
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        zzb3 = this.zzs.zza(i12, zzib.zzf(t, j2), zzb(i9));
                        break;
                    case 51:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzb(i12, 0.0d);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 52:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzb(i12, 0.0f);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 53:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzd(i12, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 54:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zze(i12, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 55:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzf(i12, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 56:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzg(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 57:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzi(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 58:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzb(i12, true);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 59:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            Object zzf2 = zzib.zzf(t, j2);
                            if (zzf2 instanceof zzdu) {
                                zzb3 = zzen.zzc(i12, (zzdu) zzf2);
                                break;
                            } else {
                                zzb3 = zzen.zzb(i12, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 60:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzhf.zza(i12, zzib.zzf(t, j2), zza(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 61:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzc(i12, (zzdu) zzib.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 62:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzg(i12, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 63:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzk(i12, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 64:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzj(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 65:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzh(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 66:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzh(i12, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 67:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzf(i12, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    case 68:
                        if (zza((zzgs<T>) t, i12, i9)) {
                            zzb3 = zzen.zzc(i12, (zzgo) zzib.zzf(t, j2), zza(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i5 = 267386880;
                        }
                    default:
                        i9 += 3;
                        i5 = 267386880;
                }
                i10 += zzb3;
                i9 += 3;
                i5 = 267386880;
            }
            return i10 + zza((zzhv) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.zzc.length) {
            int zzd3 = zzd(i15);
            int[] iArr = this.zzc;
            int i18 = iArr[i15];
            int i19 = (zzd3 & 267386880) >>> 20;
            if (i19 <= 17) {
                i = iArr[i15 + 2];
                int i20 = i & i6;
                i2 = i7 << (i >>> 20);
                if (i20 != i14) {
                    i17 = unsafe2.getInt(t, i20);
                    i14 = i20;
                }
            } else {
                i = (!this.zzk || i19 < zzex.zza.zza() || i19 > zzex.zzb.zza()) ? 0 : this.zzc[i15 + 2] & i6;
                i2 = 0;
            }
            long j3 = zzd3 & i6;
            switch (i19) {
                case 0:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        i16 += zzen.zzb(i18, 0.0d);
                        continue;
                        i15 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                    }
                    break;
                case 1:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        i16 += zzen.zzb(i18, 0.0f);
                        break;
                    }
                    break;
                case 2:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        zzd = zzen.zzd(i18, unsafe2.getLong(t, j3));
                        i16 += zzd;
                        break;
                    }
                    break;
                case 3:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        zzd = zzen.zze(i18, unsafe2.getLong(t, j3));
                        i16 += zzd;
                        break;
                    }
                    break;
                case 4:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        zzd = zzen.zzf(i18, unsafe2.getInt(t, j3));
                        i16 += zzd;
                        break;
                    }
                    break;
                case 5:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i17 & i2) != 0) {
                        zzd = zzen.zzg(i18, 0L);
                        i16 += zzd;
                        break;
                    }
                    break;
                case 6:
                    i3 = 1;
                    i4 = 0;
                    if ((i17 & i2) != 0) {
                        i16 += zzen.zzi(i18, 0);
                    }
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 7:
                    if ((i17 & i2) != 0) {
                        i3 = 1;
                        i16 += zzen.zzb(i18, true);
                        i4 = 0;
                        j = 0;
                        i15 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 8:
                    if ((i17 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzdu) {
                            zzb2 = zzen.zzc(i18, (zzdu) object);
                        } else {
                            zzb2 = zzen.zzb(i18, (String) object);
                        }
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 9:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzhf.zza(i18, unsafe2.getObject(t, j3), zza(i15));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 10:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzc(i18, (zzdu) unsafe2.getObject(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 11:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzg(i18, unsafe2.getInt(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 12:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzk(i18, unsafe2.getInt(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 13:
                    if ((i17 & i2) != 0) {
                        zzj = zzen.zzj(i18, 0);
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 14:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzh(i18, 0L);
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 15:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzh(i18, unsafe2.getInt(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 16:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzf(i18, unsafe2.getLong(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 17:
                    if ((i17 & i2) != 0) {
                        zzb2 = zzen.zzc(i18, (zzgo) unsafe2.getObject(t, j3), zza(i15));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 18:
                    zzb2 = zzhf.zzi(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 19:
                    i4 = 0;
                    zzh = zzhf.zzh(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 20:
                    i4 = 0;
                    zzh = zzhf.zza(i18, (List<Long>) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 21:
                    i4 = 0;
                    zzh = zzhf.zzb(i18, (List<Long>) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 22:
                    i4 = 0;
                    zzh = zzhf.zze(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 23:
                    i4 = 0;
                    zzh = zzhf.zzi(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 24:
                    i4 = 0;
                    zzh = zzhf.zzh(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 25:
                    i4 = 0;
                    zzh = zzhf.zzj(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 26:
                    zzb2 = zzhf.zza(i18, (List) unsafe2.getObject(t, j3));
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    zzb2 = zzhf.zza(i18, (List<?>) unsafe2.getObject(t, j3), zza(i15));
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    zzb2 = zzhf.zzb(i18, (List) unsafe2.getObject(t, j3));
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    zzb2 = zzhf.zzf(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    i4 = 0;
                    zzh = zzhf.zzd(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    i4 = 0;
                    zzh = zzhf.zzh(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 32:
                    i4 = 0;
                    zzh = zzhf.zzi(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 33:
                    i4 = 0;
                    zzh = zzhf.zzg(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 34:
                    i4 = 0;
                    zzh = zzhf.zzc(i18, (List) unsafe2.getObject(t, j3), false);
                    i16 += zzh;
                    i3 = 1;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 35:
                    zzi = zzhf.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 36:
                    zzi = zzhf.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 37:
                    zzi = zzhf.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 38:
                    zzi = zzhf.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 39:
                    zzi = zzhf.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case JSONzip.substringLimit /* 40 */:
                    zzi = zzhf.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 41:
                    zzi = zzhf.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 42:
                    zzi = zzhf.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 43:
                    zzi = zzhf.zzf((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 44:
                    zzi = zzhf.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 45:
                    zzi = zzhf.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 46:
                    zzi = zzhf.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 47:
                    zzi = zzhf.zzg((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 48:
                    zzi = zzhf.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzen.zze(i18);
                        zzg = zzen.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 49:
                    zzb2 = zzhf.zzb(i18, (List) unsafe2.getObject(t, j3), zza(i15));
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    zzb2 = this.zzs.zza(i18, unsafe2.getObject(t, j3), zzb(i15));
                    i16 += zzb2;
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 51:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzb(i18, 0.0d);
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 52:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzj = zzen.zzb(i18, 0.0f);
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 53:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzd(i18, zze(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 54:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zze(i18, zze(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 55:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzf(i18, zzd(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 56:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzg(i18, 0L);
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 57:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzj = zzen.zzi(i18, 0);
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 58:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzj = zzen.zzb(i18, true);
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 59:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzdu) {
                            zzb2 = zzen.zzc(i18, (zzdu) object2);
                        } else {
                            zzb2 = zzen.zzb(i18, (String) object2);
                        }
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 60:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzhf.zza(i18, unsafe2.getObject(t, j3), zza(i15));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 61:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzc(i18, (zzdu) unsafe2.getObject(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 62:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzg(i18, zzd(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 63:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzk(i18, zzd(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 64:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzj = zzen.zzj(i18, 0);
                        i16 += zzj;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 65:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzh(i18, 0L);
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 66:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzh(i18, zzd(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 67:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzf(i18, zze(t, j3));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                case 68:
                    if (zza((zzgs<T>) t, i18, i15)) {
                        zzb2 = zzen.zzc(i18, (zzgo) unsafe2.getObject(t, j3), zza(i15));
                        i16 += zzb2;
                    }
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
                default:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    i15 += 3;
                    i7 = i3;
                    i8 = i4;
                    i6 = 1048575;
            }
            i15 += 3;
            i7 = i3;
            i8 = i4;
            i6 = 1048575;
        }
        int i21 = i8;
        int zza2 = i16 + zza((zzhv) this.zzq, (Object) t);
        if (this.zzh) {
            zzew<?> zza3 = this.zzr.zza(t);
            for (int i22 = i21; i22 < zza3.zza.zzc(); i22++) {
                Map.Entry<?, Object> zzb4 = zza3.zza.zzb(i22);
                i21 += zzew.zza((zzey) zzb4.getKey(), zzb4.getValue());
            }
            for (Map.Entry<?, Object> entry : zza3.zza.zzd()) {
                i21 += zzew.zza((zzey) entry.getKey(), entry.getValue());
            }
            return zza2 + i21;
        }
        return zza2;
    }

    private static <UT, UB> int zza(zzhv<UT, UB> zzhvVar, T t) {
        return zzhvVar.zzf(zzhvVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzib.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.measurement.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.measurement.zzis r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzis):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r18, com.google.android.gms.internal.measurement.zzis r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zzb(java.lang.Object, com.google.android.gms.internal.measurement.zzis):void");
    }

    private final <K, V> void zza(zzis zzisVar, int i, Object obj, int i2) {
        if (obj != null) {
            zzisVar.zza(i, this.zzs.zzf(zzb(i2)), this.zzs.zzb(obj));
        }
    }

    private static <UT, UB> void zza(zzhv<UT, UB> zzhvVar, T t, zzis zzisVar) {
        zzhvVar.zza((zzhv<UT, UB>) zzhvVar.zzb(t), zzisVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, zzhe zzheVar, zzeq zzeqVar) {
        zzeqVar.getClass();
        zzhv zzhvVar = this.zzq;
        zzes<?> zzesVar = this.zzr;
        zzew<?> zzewVar = null;
        Object obj = null;
        while (true) {
            try {
                int zza2 = zzheVar.zza();
                int zzg = zzg(zza2);
                if (zzg >= 0) {
                    int zzd = zzd(zzg);
                    switch ((267386880 & zzd) >>> 20) {
                        case 0:
                            zzib.zza(t, zzd & 1048575, zzheVar.zzd());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 1:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zze());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 2:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzg());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 3:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzf());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 4:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzh());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 5:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzi());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 6:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzj());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 7:
                            zzib.zza(t, zzd & 1048575, zzheVar.zzk());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 8:
                            zza(t, zzd, zzheVar);
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 9:
                            if (zza((zzgs<T>) t, zzg)) {
                                long j = zzd & 1048575;
                                zzib.zza(t, j, zzff.zza(zzib.zzf(t, j), zzheVar.zza(zza(zzg), zzeqVar)));
                                break;
                            } else {
                                zzib.zza(t, zzd & 1048575, zzheVar.zza(zza(zzg), zzeqVar));
                                zzb((zzgs<T>) t, zzg);
                                continue;
                            }
                        case 10:
                            zzib.zza(t, zzd & 1048575, zzheVar.zzn());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 11:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzo());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 12:
                            int zzp = zzheVar.zzp();
                            zzfk zzc = zzc(zzg);
                            if (zzc != null && !zzc.zza(zzp)) {
                                obj = zzhf.zza(zza2, zzp, obj, zzhvVar);
                                break;
                            }
                            zzib.zza((Object) t, zzd & 1048575, zzp);
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 13:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzq());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 14:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzr());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 15:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzs());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 16:
                            zzib.zza((Object) t, zzd & 1048575, zzheVar.zzt());
                            zzb((zzgs<T>) t, zzg);
                            continue;
                        case 17:
                            if (zza((zzgs<T>) t, zzg)) {
                                long j2 = zzd & 1048575;
                                zzib.zza(t, j2, zzff.zza(zzib.zzf(t, j2), zzheVar.zzb(zza(zzg), zzeqVar)));
                                break;
                            } else {
                                zzib.zza(t, zzd & 1048575, zzheVar.zzb(zza(zzg), zzeqVar));
                                zzb((zzgs<T>) t, zzg);
                                continue;
                            }
                        case 18:
                            zzheVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 19:
                            zzheVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 20:
                            zzheVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 21:
                            zzheVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 22:
                            zzheVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 23:
                            zzheVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 24:
                            zzheVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 25:
                            zzheVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 26:
                            if (zzf(zzd)) {
                                zzheVar.zzj(this.zzp.zza(t, zzd & 1048575));
                                break;
                            } else {
                                zzheVar.zzi(this.zzp.zza(t, zzd & 1048575));
                                continue;
                            }
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            zzheVar.zza(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzeqVar);
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            zzheVar.zzk(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                            zzheVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                            List<Integer> zza3 = this.zzp.zza(t, zzd & 1048575);
                            zzheVar.zzm(zza3);
                            obj = zzhf.zza(zza2, zza3, zzc(zzg), obj, zzhvVar);
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                            zzheVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 32:
                            zzheVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 33:
                            zzheVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 34:
                            zzheVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 35:
                            zzheVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 36:
                            zzheVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 37:
                            zzheVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 38:
                            zzheVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 39:
                            zzheVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case JSONzip.substringLimit /* 40 */:
                            zzheVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 41:
                            zzheVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 42:
                            zzheVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 43:
                            zzheVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza4 = this.zzp.zza(t, zzd & 1048575);
                            zzheVar.zzm(zza4);
                            obj = zzhf.zza(zza2, zza4, zzc(zzg), obj, zzhvVar);
                            continue;
                        case 45:
                            zzheVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 46:
                            zzheVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 47:
                            zzheVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 48:
                            zzheVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 49:
                            zzheVar.zzb(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzeqVar);
                            continue;
                        case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                            Object zzb2 = zzb(zzg);
                            long zzd2 = zzd(zzg) & 1048575;
                            Object zzf = zzib.zzf(t, zzd2);
                            if (zzf == null) {
                                zzf = this.zzs.zze(zzb2);
                                zzib.zza(t, zzd2, zzf);
                            } else if (this.zzs.zzc(zzf)) {
                                Object zze = this.zzs.zze(zzb2);
                                this.zzs.zza(zze, zzf);
                                zzib.zza(t, zzd2, zze);
                                zzf = zze;
                            }
                            zzheVar.zza(this.zzs.zza(zzf), this.zzs.zzf(zzb2), zzeqVar);
                            continue;
                        case 51:
                            zzib.zza(t, zzd & 1048575, Double.valueOf(zzheVar.zzd()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 52:
                            zzib.zza(t, zzd & 1048575, Float.valueOf(zzheVar.zze()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 53:
                            zzib.zza(t, zzd & 1048575, Long.valueOf(zzheVar.zzg()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 54:
                            zzib.zza(t, zzd & 1048575, Long.valueOf(zzheVar.zzf()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 55:
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzheVar.zzh()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 56:
                            zzib.zza(t, zzd & 1048575, Long.valueOf(zzheVar.zzi()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 57:
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzheVar.zzj()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 58:
                            zzib.zza(t, zzd & 1048575, Boolean.valueOf(zzheVar.zzk()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 59:
                            zza(t, zzd, zzheVar);
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 60:
                            if (zza((zzgs<T>) t, zza2, zzg)) {
                                long j3 = zzd & 1048575;
                                zzib.zza(t, j3, zzff.zza(zzib.zzf(t, j3), zzheVar.zza(zza(zzg), zzeqVar)));
                            } else {
                                zzib.zza(t, zzd & 1048575, zzheVar.zza(zza(zzg), zzeqVar));
                                zzb((zzgs<T>) t, zzg);
                            }
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 61:
                            zzib.zza(t, zzd & 1048575, zzheVar.zzn());
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 62:
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzheVar.zzo()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 63:
                            int zzp2 = zzheVar.zzp();
                            zzfk zzc2 = zzc(zzg);
                            if (zzc2 != null && !zzc2.zza(zzp2)) {
                                obj = zzhf.zza(zza2, zzp2, obj, zzhvVar);
                                break;
                            }
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzp2));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 64:
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzheVar.zzq()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 65:
                            zzib.zza(t, zzd & 1048575, Long.valueOf(zzheVar.zzr()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 66:
                            zzib.zza(t, zzd & 1048575, Integer.valueOf(zzheVar.zzs()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 67:
                            zzib.zza(t, zzd & 1048575, Long.valueOf(zzheVar.zzt()));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        case 68:
                            zzib.zza(t, zzd & 1048575, zzheVar.zzb(zza(zzg), zzeqVar));
                            zzb((zzgs<T>) t, zza2, zzg);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzhvVar.zza();
                                } catch (zzfn unused) {
                                    zzhvVar.zza(zzheVar);
                                    if (obj == null) {
                                        obj = zzhvVar.zzc(t);
                                    }
                                    if (!zzhvVar.zza((zzhv) obj, zzheVar)) {
                                        for (int i = this.zzm; i < this.zzn; i++) {
                                            obj = zza((Object) t, this.zzl[i], (int) obj, (zzhv<UT, int>) zzhvVar);
                                        }
                                        if (obj != null) {
                                            zzhvVar.zzb((Object) t, (T) obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzhvVar.zza((zzhv) obj, zzheVar)) {
                                for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                                    obj = zza((Object) t, this.zzl[i2], (int) obj, (zzhv<UT, int>) zzhvVar);
                                }
                                if (obj != null) {
                                    zzhvVar.zzb((Object) t, (T) obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zza2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                        obj = zza((Object) t, this.zzl[i3], (int) obj, (zzhv<UT, int>) zzhvVar);
                    }
                    if (obj != null) {
                        zzhvVar.zzb((Object) t, (T) obj);
                        return;
                    }
                    return;
                } else {
                    Object zza5 = !this.zzh ? null : zzesVar.zza(zzeqVar, this.zzg, zza2);
                    if (zza5 != null) {
                        if (zzewVar == null) {
                            zzewVar = zzesVar.zzb(t);
                        }
                        zzew<?> zzewVar2 = zzewVar;
                        obj = zzesVar.zza(zzheVar, zza5, zzeqVar, zzewVar2, obj, zzhvVar);
                        zzewVar = zzewVar2;
                    } else {
                        zzhvVar.zza(zzheVar);
                        if (obj == null) {
                            obj = zzhvVar.zzc(t);
                        }
                        if (!zzhvVar.zza((zzhv) obj, zzheVar)) {
                            for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                                obj = zza((Object) t, this.zzl[i4], (int) obj, (zzhv<UT, int>) zzhvVar);
                            }
                            if (obj != null) {
                                zzhvVar.zzb((Object) t, (T) obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                    obj = zza((Object) t, this.zzl[i5], (int) obj, (zzhv<UT, int>) zzhvVar);
                }
                if (obj != null) {
                    zzhvVar.zzb((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    private static zzhy zze(Object obj) {
        zzfd zzfdVar = (zzfd) obj;
        zzhy zzhyVar = zzfdVar.zzb;
        if (zzhyVar == zzhy.zza()) {
            zzhy zzb2 = zzhy.zzb();
            zzfdVar.zzb = zzb2;
            return zzb2;
        }
        return zzhyVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzim zzimVar, Class<?> cls, zzdt zzdtVar) {
        switch (zzgr.zza[zzimVar.ordinal()]) {
            case 1:
                int zzb2 = zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = Boolean.valueOf(zzdtVar.zzb != 0);
                return zzb2;
            case 2:
                return zzdq.zze(bArr, i, zzdtVar);
            case 3:
                zzdtVar.zzc = Double.valueOf(zzdq.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdtVar.zzc = Integer.valueOf(zzdq.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdtVar.zzc = Long.valueOf(zzdq.zzb(bArr, i));
                return i + 8;
            case 8:
                zzdtVar.zzc = Float.valueOf(zzdq.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza2 = zzdq.zza(bArr, i, zzdtVar);
                zzdtVar.zzc = Integer.valueOf(zzdtVar.zza);
                return zza2;
            case 12:
            case 13:
                int zzb3 = zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = Long.valueOf(zzdtVar.zzb);
                return zzb3;
            case 14:
                return zzdq.zza(zzgz.zza().zza((Class) cls), bArr, i, i2, zzdtVar);
            case 15:
                int zza3 = zzdq.zza(bArr, i, zzdtVar);
                zzdtVar.zzc = Integer.valueOf(zzeg.zze(zzdtVar.zza));
                return zza3;
            case 16:
                int zzb4 = zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = Long.valueOf(zzeg.zza(zzdtVar.zzb));
                return zzb4;
            case 17:
                return zzdq.zzd(bArr, i, zzdtVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0233 -> B:116:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016b -> B:67:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e5 -> B:96:0x01e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzdt r29) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzdt):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzdt zzdtVar) {
        Unsafe unsafe = zzb;
        Object zzb2 = zzb(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzs.zzc(object)) {
            Object zze = this.zzs.zze(zzb2);
            this.zzs.zza(zze, object);
            unsafe.putObject(t, j, zze);
            object = zze;
        }
        zzgf<?, ?> zzf = this.zzs.zzf(zzb2);
        Map<?, ?> zza2 = this.zzs.zza(object);
        int zza3 = zzdq.zza(bArr, i, zzdtVar);
        int i4 = zzdtVar.zza;
        if (i4 < 0 || i4 > i2 - zza3) {
            throw zzfo.zza();
        }
        int i5 = i4 + zza3;
        Object obj = (K) zzf.zzb;
        Object obj2 = (V) zzf.zzd;
        while (zza3 < i5) {
            int i6 = zza3 + 1;
            int i7 = bArr[zza3];
            if (i7 < 0) {
                i6 = zzdq.zza(i7, bArr, i6, zzdtVar);
                i7 = zzdtVar.zza;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzf.zza.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zza, (Class<?>) null, zzdtVar);
                    obj = (K) zzdtVar.zzc;
                } else {
                    zza3 = zzdq.zza(i7, bArr, i8, i2, zzdtVar);
                }
            } else {
                if (i9 == 2 && i10 == zzf.zzc.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zzc, zzf.zzd.getClass(), zzdtVar);
                    obj2 = zzdtVar.zzc;
                }
                zza3 = zzdq.zza(i7, bArr, i8, i2, zzdtVar);
            }
        }
        if (zza3 != i5) {
            throw zzfo.zzg();
        }
        zza2.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzdt zzdtVar) {
        int zzb2;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzdq.zzc(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzdq.zzd(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb2 = zzdq.zzb(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdtVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb2 = zzdq.zza(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdtVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzdq.zzb(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzdq.zza(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb2 = zzdq.zzb(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzdtVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza2 = zzdq.zza(bArr, i, zzdtVar);
                    int i9 = zzdtVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzie.zza(bArr, zza2, zza2 + i9)) {
                        throw zzfo.zzh();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza2, i9, zzff.zza));
                        zza2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza3 = zzdq.zza(zza(i8), bArr, i, i2, zzdtVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdtVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzff.zza(object, zzdtVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb2 = zzdq.zze(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, zzdtVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzdq.zza(bArr, i, zzdtVar);
                    int i10 = zzdtVar.zza;
                    zzfk zzc = zzc(i8);
                    if (zzc == null || zzc.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb2 = zza4;
                        unsafe.putInt(t, j2, i4);
                        return zzb2;
                    }
                    zze(t).zza(i3, Long.valueOf(i10));
                    return zza4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb2 = zzdq.zza(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzeg.zze(zzdtVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb2 = zzdq.zzb(bArr, i, zzdtVar);
                    unsafe.putObject(t, j, Long.valueOf(zzeg.zza(zzdtVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzdq.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdtVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdtVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzff.zza(object2, zzdtVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzhd zza(int i) {
        int i2 = (i / 3) << 1;
        zzhd zzhdVar = (zzhd) this.zzd[i2];
        if (zzhdVar != null) {
            return zzhdVar;
        }
        zzhd<T> zza2 = zzgz.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzfk zzc(int i) {
        return (zzfk) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x032e, code lost:
        if (r4 == r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0332, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035d, code lost:
        if (r4 == r15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0360, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r1 = r32;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r2 = r18;
        r6 = r19;
        r7 = r26;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043d, code lost:
        if (r6 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x043f, code lost:
        r28.putInt(r14, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0445, code lost:
        r1 = r9.zzm;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x044a, code lost:
        if (r1 >= r9.zzn) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x044c, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzhy) r9.zza((java.lang.Object) r14, r9.zzl[r1], (int) r2, (com.google.android.gms.internal.measurement.zzhv<UT, int>) r9.zzq);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x045b, code lost:
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045d, code lost:
        r9.zzq.zzb((java.lang.Object) r14, (T) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0462, code lost:
        if (r10 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0466, code lost:
        if (r0 != r33) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046d, code lost:
        throw com.google.android.gms.internal.measurement.zzfo.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0470, code lost:
        if (r0 > r33) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0472, code lost:
        if (r3 != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0474, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0479, code lost:
        throw com.google.android.gms.internal.measurement.zzfo.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzdt r35) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzdt):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020d, code lost:
        if (r0 == r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022c, code lost:
        if (r0 == r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022e, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e0, code lost:
        if (r0 == r15) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.zzdt r32) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdt):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzib.zzf(t, zzd);
            if (zzf != null) {
                zzib.zza(t, zzd, this.zzs.zzd(zzf));
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

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzhv<UT, UB> zzhvVar) {
        zzfk zzc;
        int i2 = this.zzc[i];
        Object zzf = zzib.zzf(obj, zzd(i) & 1048575);
        return (zzf == null || (zzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(zzf), zzc, (zzfk) ub, (zzhv<UT, zzfk>) zzhvVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzfk zzfkVar, UB ub, zzhv<UT, UB> zzhvVar) {
        zzgf<?, ?> zzf = this.zzs.zzf(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfkVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzhvVar.zza();
                }
                zzec zzc = zzdu.zzc(zzgg.zza(zzf, next.getKey(), next.getValue()));
                try {
                    zzgg.zza(zzc.zzb(), zzf, next.getKey(), next.getValue());
                    zzhvVar.zza((zzhv<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.zzhd] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.measurement.zzhd] */
    /* JADX WARN: Type inference failed for: r5v22 */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zzd(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzm; i4++) {
            int i5 = this.zzl[i4];
            int i6 = this.zzc[i5];
            int zzd = zzd(i5);
            if (this.zzj) {
                i = 0;
            } else {
                int i7 = this.zzc[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i3 = zzb.getInt(t, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & zzd) != 0 && !zza((zzgs<T>) t, i5, i3, i)) {
                return false;
            }
            int i9 = (267386880 & zzd) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzgs<T>) t, i5, i3, i) && !zza(t, zzd, zza(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzgs<T>) t, i6, i5) && !zza(t, zzd, zza(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzb2 = this.zzs.zzb(zzib.zzf(t, zzd & 1048575));
                            if (zzb2.isEmpty()) {
                                continue;
                            } else if (this.zzs.zzf(zzb(i5)).zzc.zza() == zzip.MESSAGE) {
                                zzhd<T> zzhdVar = 0;
                                for (Object obj : zzb2.values()) {
                                    if (zzhdVar == null) {
                                        zzhdVar = zzgz.zza().zza((Class) obj.getClass());
                                    }
                                    boolean zzd2 = zzhdVar.zzd(obj);
                                    zzhdVar = zzhdVar;
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
                List list = (List) zzib.zzf(t, zzd & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zza2 = zza(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zza2.zzd(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return !this.zzh || this.zzr.zza(t).zzf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzhd zzhdVar) {
        return zzhdVar.zzd(zzib.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzis zzisVar) {
        if (obj instanceof String) {
            zzisVar.zza(i, (String) obj);
        } else {
            zzisVar.zza(i, (zzdu) obj);
        }
    }

    private final void zza(Object obj, int i, zzhe zzheVar) {
        if (zzf(i)) {
            zzib.zza(obj, i & 1048575, zzheVar.zzm());
        } else if (this.zzi) {
            zzib.zza(obj, i & 1048575, zzheVar.zzl());
        } else {
            zzib.zza(obj, i & 1048575, zzheVar.zzn());
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzib.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzib.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzib.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzib.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzib.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzgs<T>) t, i) == zza((zzgs<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzj) {
            return zza((zzgs<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzj) {
            int zzd = zzd(i);
            long j = zzd & 1048575;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    return zzib.zze(t, j) != 0.0d;
                case 1:
                    return zzib.zzd(t, j) != 0.0f;
                case 2:
                    return zzib.zzb(t, j) != 0;
                case 3:
                    return zzib.zzb(t, j) != 0;
                case 4:
                    return zzib.zza(t, j) != 0;
                case 5:
                    return zzib.zzb(t, j) != 0;
                case 6:
                    return zzib.zza(t, j) != 0;
                case 7:
                    return zzib.zzc(t, j);
                case 8:
                    Object zzf = zzib.zzf(t, j);
                    if (zzf instanceof String) {
                        return !((String) zzf).isEmpty();
                    } else if (zzf instanceof zzdu) {
                        return !zzdu.zza.equals(zzf);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzib.zzf(t, j) != null;
                case 10:
                    return !zzdu.zza.equals(zzib.zzf(t, j));
                case 11:
                    return zzib.zza(t, j) != 0;
                case 12:
                    return zzib.zza(t, j) != 0;
                case 13:
                    return zzib.zza(t, j) != 0;
                case 14:
                    return zzib.zzb(t, j) != 0;
                case 15:
                    return zzib.zza(t, j) != 0;
                case 16:
                    return zzib.zzb(t, j) != 0;
                case 17:
                    return zzib.zzf(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zze = zze(i);
        return (zzib.zza(t, (long) (zze & 1048575)) & (1 << (zze >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzj) {
            return;
        }
        int zze = zze(i);
        long j = 1048575 & zze;
        zzib.zza((Object) t, j, (1 << (zze >>> 20)) | zzib.zza(t, j));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzib.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzib.zza((Object) t, zze(i2) & 1048575, i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
