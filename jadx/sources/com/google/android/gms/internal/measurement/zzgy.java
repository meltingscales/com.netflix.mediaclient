package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzgy {
    private static final zzgw zza = zzc();
    private static final zzgw zzb = new zzgv();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgw zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgw zzb() {
        return zzb;
    }

    private static zzgw zzc() {
        try {
            return (zzgw) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
