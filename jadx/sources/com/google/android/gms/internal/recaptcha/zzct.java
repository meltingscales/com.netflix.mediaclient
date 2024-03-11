package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
public abstract class zzct {
    int zzb;
    int zzc;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzct zza(byte[] bArr, int i, int i2, boolean z) {
        zzcv zzcvVar = new zzcv(bArr, 0, i2, false);
        try {
            zzcvVar.zzc(i2);
            return zzcvVar;
        } catch (zzdy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzc(int i);

    public abstract int zzu();

    private zzct() {
        this.zzb = 100;
        this.zzc = Integer.MAX_VALUE;
        this.zze = false;
    }
}
