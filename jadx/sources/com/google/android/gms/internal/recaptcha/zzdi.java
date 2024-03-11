package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzdi {
    private static final zzdh<?> zza = new zzdj();
    private static final zzdh<?> zzb = zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdh<?> zza() {
        return zza;
    }

    private static zzdh<?> zzc() {
        try {
            return (zzdh) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdh<?> zzb() {
        zzdh<?> zzdhVar = zzb;
        if (zzdhVar != null) {
            return zzdhVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
