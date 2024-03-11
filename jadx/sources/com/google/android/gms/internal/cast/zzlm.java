package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzlm extends zzpt {
    private static final zzlm zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzlm zzlmVar = new zzlm();
        zzb = zzlmVar;
        zzpt.zzA(zzlm.class, zzlmVar);
    }

    private zzlm() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzgp.zza(), "zzg", zzgm.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzll(null);
            } else {
                return new zzlm();
            }
        }
        return (byte) 1;
    }
}
