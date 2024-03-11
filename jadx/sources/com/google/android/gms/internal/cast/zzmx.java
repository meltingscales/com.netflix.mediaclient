package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmx extends zzpt {
    private static final zzmx zzb;
    private int zze;
    private long zzf;
    private zzqa zzg = zzpt.zzv();
    private zzqa zzh = zzpt.zzv();

    static {
        zzmx zzmxVar = new zzmx();
        zzb = zzmxVar;
        zzpt.zzA(zzmx.class, zzmxVar);
    }

    private zzmx() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zze", "zzf", "zzg", "zzh"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmw(null);
            } else {
                return new zzmx();
            }
        }
        return (byte) 1;
    }
}
