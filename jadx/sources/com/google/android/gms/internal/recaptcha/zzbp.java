package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;

/* loaded from: classes5.dex */
public final class zzbp extends zzds<zzbp, zza> {
    private static final zzbp zze;
    private static volatile zzfi<zzbp> zzf;
    private int zzc;
    private String zzd = "";

    private zzbp() {
    }

    /* loaded from: classes5.dex */
    public static final class zza extends zzds.zza<zzbp, zza> {
        private zza() {
            super(zzbp.zze);
        }

        /* synthetic */ zza(zzbr zzbrVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.zzds
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbr.zza[i - 1]) {
            case 1:
                return new zzbp();
            case 2:
                return new zza(null);
            case 3:
                return zzds.zza(zze, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 4:
                return zze;
            case 5:
                zzfi<zzbp> zzfiVar = zzf;
                if (zzfiVar == null) {
                    synchronized (zzbp.class) {
                        zzfiVar = zzf;
                        if (zzfiVar == null) {
                            zzfiVar = new zzds.zzc<>(zze);
                            zzf = zzfiVar;
                        }
                    }
                }
                return zzfiVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzbp zzbpVar = new zzbp();
        zze = zzbpVar;
        zzds.zza(zzbp.class, zzbpVar);
    }
}
