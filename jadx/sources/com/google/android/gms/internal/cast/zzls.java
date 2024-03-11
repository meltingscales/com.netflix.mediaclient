package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzls extends zzpt {
    private static final zzls zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzls zzlsVar = new zzls();
        zzb = zzlsVar;
        zzpt.zzA(zzls.class, zzlsVar);
    }

    private zzls() {
    }

    public static zzlr zza() {
        return (zzlr) zzb.zzr();
    }

    public static /* synthetic */ void zzd(zzls zzlsVar, String str) {
        str.getClass();
        zzlsVar.zze |= 1;
        zzlsVar.zzf = str;
    }

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
                return new zzlr(null);
            } else {
                return new zzls();
            }
        }
        return (byte) 1;
    }
}
