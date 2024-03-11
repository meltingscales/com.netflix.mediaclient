package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* loaded from: classes5.dex */
final class zzfe implements zzgl {
    private static final zzfe zza = new zzfe();

    private zzfe() {
    }

    public static zzfe zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final boolean zza(Class<?> cls) {
        return zzfd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final zzgm zzb(Class<?> cls) {
        if (!zzfd.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzgm) zzfd.zza((Class<zzfd>) cls.asSubclass(zzfd.class)).zza(zzfd.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
