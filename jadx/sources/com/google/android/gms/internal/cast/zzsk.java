package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzsk extends zzsm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsk(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final void zzc(Object obj, long j, boolean z) {
        if (zzsn.zzb) {
            zzsn.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzsn.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final void zzd(Object obj, long j, byte b) {
        if (zzsn.zzb) {
            zzsn.zzD(obj, j, b);
        } else {
            zzsn.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast.zzsm
    public final boolean zzg(Object obj, long j) {
        if (zzsn.zzb) {
            return zzsn.zzt(obj, j);
        }
        return zzsn.zzu(obj, j);
    }
}
