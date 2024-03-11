package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmz extends zzpt {
    private static final zzmz zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;

    static {
        zzmz zzmzVar = new zzmz();
        zzb = zzmzVar;
        zzpt.zzA(zzmz.class, zzmzVar);
    }

    private zzmz() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzii.zza(), "zzk", zzii.zza(), "zzl"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmy(null);
            } else {
                return new zzmz();
            }
        }
        return (byte) 1;
    }
}
