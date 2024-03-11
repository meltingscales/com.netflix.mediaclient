package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zznv extends zzpt {
    private static final zznv zzb;
    private int zze;
    private String zzf = "";

    static {
        zznv zznvVar = new zznv();
        zzb = zznvVar;
        zzpt.zzA(zznv.class, zznvVar);
    }

    private zznv() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zznu(null);
            } else {
                return new zznv();
            }
        }
        return (byte) 1;
    }
}
