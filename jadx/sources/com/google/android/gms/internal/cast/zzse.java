package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzse {
    private static final zzse zza = new zzse(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;

    private zzse() {
        this(0, new int[8], new Object[8], true);
    }

    private zzse(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
    }

    public static zzse zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzse zzd(zzse zzseVar, zzse zzseVar2) {
        int i = zzseVar.zzb;
        int i2 = zzseVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzseVar.zzc, 0);
        System.arraycopy(zzseVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzseVar.zzd, 0);
        System.arraycopy(zzseVar2.zzd, 0, copyOf2, 0, 0);
        return new zzse(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzse)) {
            zzse zzseVar = (zzse) obj;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i = this.zze;
        if (i == -1) {
            this.zze = 0;
            return 0;
        }
        return i;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            this.zze = 0;
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(StringBuilder sb, int i) {
    }
}
