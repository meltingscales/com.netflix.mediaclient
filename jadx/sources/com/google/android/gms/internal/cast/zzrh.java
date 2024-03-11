package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzrh {
    private static final zzrg zza;
    private static final zzrg zzb;

    static {
        zzrg zzrgVar;
        try {
            zzrgVar = (zzrg) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzrgVar = null;
        }
        zza = zzrgVar;
        zzb = new zzrg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzrg zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzrg zzb() {
        return zzb;
    }
}
