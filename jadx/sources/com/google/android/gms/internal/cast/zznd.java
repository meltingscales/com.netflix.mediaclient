package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zznd extends zzpt {
    private static final zznd zzb;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zznd zzndVar = new zznd();
        zzb = zzndVar;
        zzpt.zzA(zznd.class, zzndVar);
    }

    private zznd() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zznc(null);
            } else {
                return new zznd();
            }
        }
        return (byte) 1;
    }
}
