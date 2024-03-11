package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzex {
    private static final zzev zza = zzc();
    private static final zzev zzb = new zzeu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzev zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzev zzb() {
        return zzb;
    }

    private static zzev zzc() {
        try {
            return (zzev) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
