package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzhy {
    private static final zzhy zza = new zzhy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public static zzhy zza() {
        return zza;
    }

    public final void zzc() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhy zzb() {
        return new zzhy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhy zza(zzhy zzhyVar, zzhy zzhyVar2) {
        int i = zzhyVar.zzb + zzhyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhyVar.zzc, i);
        System.arraycopy(zzhyVar2.zzc, 0, copyOf, zzhyVar.zzb, zzhyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhyVar.zzd, i);
        System.arraycopy(zzhyVar2.zzd, 0, copyOf2, zzhyVar.zzb, zzhyVar2.zzb);
        return new zzhy(i, copyOf, copyOf2, true);
    }

    private zzhy() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzis zzisVar) {
        if (zzisVar.zza() == zzfd.zze.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzisVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzisVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzb(zzis zzisVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzisVar.zza() == zzfd.zze.zzj) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzisVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzisVar);
        }
    }

    private static void zza(int i, Object obj, zzis zzisVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzisVar.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzisVar.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzisVar.zza(i2, (zzdu) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzisVar.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfo.zzf());
        } else if (zzisVar.zza() == zzfd.zze.zzj) {
            zzisVar.zza(i2);
            ((zzhy) obj).zzb(zzisVar);
            zzisVar.zzb(i2);
        } else {
            zzisVar.zzb(i2);
            ((zzhy) obj).zzb(zzisVar);
            zzisVar.zza(i2);
        }
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzen.zzd(this.zzc[i3] >>> 3, (zzdu) this.zzd[i3]);
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
                zze = zzen.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzen.zzg(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzen.zzc(i5, (zzdu) this.zzd[i3]);
            } else if (i6 == 3) {
                zze = (zzen.zze(i5) << 1) + ((zzhy) this.zzd[i3]).zze();
            } else if (i6 == 5) {
                zze = zzen.zzi(i5, ((Integer) this.zzd[i3]).intValue());
            } else {
                throw new IllegalStateException(zzfo.zzf());
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
        if (obj != null && (obj instanceof zzhy)) {
            zzhy zzhyVar = (zzhy) obj;
            int i = this.zzb;
            if (i == zzhyVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzhyVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzhyVar.zzd;
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
            zzgp.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = Arrays.copyOf(iArr, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr2 = this.zzc;
        int i4 = this.zzb;
        iArr2[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }
}
