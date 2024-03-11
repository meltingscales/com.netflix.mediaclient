package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;

/* loaded from: classes2.dex */
final class zzdq implements zzez {
    private static final zzdq zza = new zzdq();

    private zzdq() {
    }

    public static zzdq zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzez
    public final boolean zza(Class<?> cls) {
        return zzds.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzez
    public final zzew zzb(Class<?> cls) {
        if (!zzds.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzew) zzds.zza((Class<zzds>) cls.asSubclass(zzds.class)).zza(zzds.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
