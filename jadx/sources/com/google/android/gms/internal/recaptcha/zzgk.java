package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgk {
    private static final zzgk zza = new zzgk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public static zzgk zza() {
        return zza;
    }

    public final void zzc() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgk zza(zzgk zzgkVar, zzgk zzgkVar2) {
        int i = zzgkVar.zzb + zzgkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgkVar.zzc, i);
        System.arraycopy(zzgkVar2.zzc, 0, copyOf, zzgkVar.zzb, zzgkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgkVar.zzd, i);
        System.arraycopy(zzgkVar2.zzd, 0, copyOf2, zzgkVar.zzb, zzgkVar2.zzb);
        return new zzgk(i, copyOf, copyOf2, true);
    }

    private zzgk() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzhe zzheVar) {
        if (zzheVar.zza() == zzds.zzf.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzheVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzheVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzb(zzhe zzheVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzheVar.zza() == zzds.zzf.zzj) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzheVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzheVar);
        }
    }

    private static void zza(int i, Object obj, zzhe zzheVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzheVar.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzheVar.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzheVar.zza(i2, (zzch) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzheVar.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzdy.zzf());
        } else if (zzheVar.zza() == zzds.zzf.zzj) {
            zzheVar.zza(i2);
            ((zzgk) obj).zzb(zzheVar);
            zzheVar.zzb(i2);
        } else {
            zzheVar.zzb(i2);
            ((zzgk) obj).zzb(zzheVar);
            zzheVar.zza(i2);
        }
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzcy.zzd(this.zzc[i3] >>> 3, (zzch) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int zze() {
        int zze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzcy.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzcy.zzg(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzcy.zzc(i5, (zzch) this.zzd[i3]);
            } else if (i6 == 3) {
                zze = (zzcy.zze(i5) << 1) + ((zzgk) this.zzd[i3]).zze();
            } else if (i6 == 5) {
                zze = zzcy.zzi(i5, ((Integer) this.zzd[i3]).intValue());
            } else {
                throw new IllegalStateException(zzdy.zzf());
            }
            i2 += zze;
        }
        this.zze = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgk)) {
            zzgk zzgkVar = (zzgk) obj;
            int i = this.zzb;
            if (i == zzgkVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgkVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgkVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int[] iArr = this.zzc;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.zzd;
        int i5 = this.zzb;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + 527) * 31) + i3) * 31) + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzfd.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }
}
