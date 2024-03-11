package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmt extends zzpt {
    private static final zzmt zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;

    static {
        zzmt zzmtVar = new zzmt();
        zzb = zzmtVar;
        zzpt.zzA(zzmt.class, zzmtVar);
    }

    private zzmt() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", zzic.zza(), "zzg", "zzh", zzfx.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzms(null);
            } else {
                return new zzmt();
            }
        }
        return (byte) 1;
    }
}
