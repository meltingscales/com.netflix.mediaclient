package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmr extends zzpt {
    private static final zzmr zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzmr zzmrVar = new zzmr();
        zzb = zzmrVar;
        zzpt.zzA(zzmr.class, zzmrVar);
    }

    private zzmr() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmq(null);
            } else {
                return new zzmr();
            }
        }
        return (byte) 1;
    }
}
