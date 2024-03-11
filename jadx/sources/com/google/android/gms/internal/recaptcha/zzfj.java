package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzfj {
    private static final zzfh zza = zzc();
    private static final zzfh zzb = new zzfg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfh zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfh zzb() {
        return zzb;
    }

    private static zzfh zzc() {
        try {
            return (zzfh) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
