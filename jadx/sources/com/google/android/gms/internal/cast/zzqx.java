package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzqx {
    private static final zzqw zza;
    private static final zzqw zzb;

    static {
        zzqw zzqwVar;
        try {
            zzqwVar = (zzqw) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzqwVar = null;
        }
        zza = zzqwVar;
        zzb = new zzqw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzqw zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzqw zzb() {
        return zzb;
    }
}
